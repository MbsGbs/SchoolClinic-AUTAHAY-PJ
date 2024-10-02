
package medicineapp;

import java.time.LocalDateTime;
import java.util.Scanner;

public class MedicalRecord {
    private String diagnosis;
    private String treatment;
    private String medication;
    private String dosage;
    private String duration;
    private String visitDate;
    private String healthcareProvider;

    // Constructor
    public MedicalRecord(String diagnosis, String treatment, String medication, String dosage, String duration, String healthcareProvider) {
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.medication = medication;
        this.dosage = dosage;
        this.duration = duration;
        this.healthcareProvider = healthcareProvider;
        this.visitDate = LocalDateTime.now().toString();  // Automatically timestamping
    }

    // Method to get user input for medical record
    public static MedicalRecord getMedicalRecordFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Diagnosis: ");
        String diagnosis = scanner.nextLine();

        System.out.print("Enter Treatment: ");
        String treatment = scanner.nextLine();

        System.out.print("Enter Medication: ");
        String medication = scanner.nextLine();

        System.out.print("Enter Dosage: ");
        String dosage = scanner.nextLine();

        System.out.print("Enter Duration: ");
        String duration = scanner.nextLine();

        System.out.print("Enter Healthcare Provider: ");
        String healthcareProvider = scanner.nextLine();

        return new MedicalRecord(diagnosis, treatment, medication, dosage, duration, healthcareProvider);
    }

    // Method to update medical record
    public void updateMedicalRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter new Diagnosis: ");
        this.diagnosis = scanner.nextLine();

        System.out.print("Enter new Treatment: ");
        this.treatment = scanner.nextLine();

        System.out.print("Enter new Medication: ");
        this.medication = scanner.nextLine();

        System.out.print("Enter new Dosage: ");
        this.dosage = scanner.nextLine();

        System.out.print("Enter new Duration: ");
        this.duration = scanner.nextLine();

        System.out.print("Enter new Healthcare Provider: ");
        this.healthcareProvider = scanner.nextLine();

        this.visitDate = LocalDateTime.now().toString();  // Update the timestamp
    }

    // Method to print medical record
    public void printMedicalRecord() {
        System.out.println("\n--- Medical Record ---");
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Treatment: " + treatment);
        System.out.println("Medication: " + medication);
        System.out.println("Dosage: " + dosage);
        System.out.println("Duration: " + duration);
        System.out.println("Healthcare Provider: " + healthcareProvider);
        System.out.println("Visit Date: " + visitDate);
    }
}
