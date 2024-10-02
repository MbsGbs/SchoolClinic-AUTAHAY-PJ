package medicineapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicineApp {

    private static List<Patient> patients = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("\n--- Patient Record System ---");
                System.out.println("1. Create Patient Record");
                System.out.println("2. Read Patient Record");
                System.out.println("3. Update Patient Record");
                System.out.println("4. Delete Patient Record");
                System.out.println("5. Exit");
                System.out.print("Select an option: ");
                int option = Integer.parseInt(scanner.nextLine());

                switch (option) {
                    case 1:
                        createPatient();
                        break;
                    case 2:
                        readPatient();
                        break;
                    case 3:
                        updatePatient();
                        break;
                    case 4:
                        deletePatient();
                        break;
                    case 5:
                        System.out.println("Exiting system.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }

    private static void createPatient() {
        try {
            System.out.print("How many patients would you like to add? ");
            int numberOfPatients = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < numberOfPatients; i++) {
                System.out.println("\nEntering details for patient " + (i + 1));
                Patient patient = Patient.getPatientInfoFromUser();
                MedicalRecord record = MedicalRecord.getMedicalRecordFromUser();
                patient.setMedicalRecord(record);
                patients.add(patient);
                System.out.println("Patient " + (i + 1) + " record created successfully.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please try again.");
        } catch (Exception e) {
            System.out.println("Error creating patient record: " + e.getMessage());
        }
    }

    private static void readPatient() {
        System.out.print("Enter Patient ID to view: ");
        int patientID = Integer.parseInt(scanner.nextLine());
        for (Patient patient : patients) {
            if (patient.getPatientID() == patientID) {
                patient.printPatientInfo();
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    private static void updatePatient() {
        System.out.print("Enter Patient ID to update: ");
        int patientID = Integer.parseInt(scanner.nextLine());
        for (Patient patient : patients) {
            if (patient.getPatientID() == patientID) {
                System.out.println("1. Update Patient Information");
                System.out.println("2. Update Medical Record");
                System.out.print("Select an option: ");
                int choice = Integer.parseInt(scanner.nextLine());

                if (choice == 1) {
                    patient.updatePatientInfo();
                } else if (choice == 2) {
                    patient.getMedicalRecord().updateMedicalRecord();
                } else {
                    System.out.println("Invalid choice.");
                }
                System.out.println("Record updated successfully.");
                return;
            }
        }
        System.out.println("Patient not found.");
    }

    private static void deletePatient() {
        System.out.print("Enter Patient ID to delete: ");
        int patientID = Integer.parseInt(scanner.nextLine());
        patients.removeIf(patient -> patient.getPatientID() == patientID);
        System.out.println("Patient record deleted successfully.");
    }
}
