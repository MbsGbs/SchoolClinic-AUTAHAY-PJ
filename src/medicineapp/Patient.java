package medicineapp;

import java.util.Scanner;

public class Patient {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String contactNumber;
    private int patientID;
    private MedicalRecord medicalRecord;

    // Constructor
    public Patient(String firstName, String lastName, int age, String address, String contactNumber, int patientID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.contactNumber = contactNumber;
        this.patientID = patientID;
    }

    public int getPatientID() {
        return patientID;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    // Method to get user input for patient info
    public static Patient getPatientInfoFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Contact Number: ");
        String contactNumber = scanner.nextLine();

        System.out.print("Enter Patient ID: ");
        int patientID = Integer.parseInt(scanner.nextLine());

        return new Patient(firstName, lastName, age, address, contactNumber, patientID);
    }

    // Method to update patient info
    public void updatePatientInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter new First Name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter new Last Name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter new Age: ");
        this.age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter new Address: ");
        this.address = scanner.nextLine();

        System.out.print("Enter new Contact Number: ");
        this.contactNumber = scanner.nextLine();
    }

    // Method to print patient info
    public void printPatientInfo() {
        System.out.println("\n--- Patient Information ---");
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Contact Number: " + contactNumber);
        if (medicalRecord != null) {
            medicalRecord.printMedicalRecord();
        }
    }
}
