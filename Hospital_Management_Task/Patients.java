package com.wipro.hospital_management;

public class Patients extends Base {
	private String[] medHistory = new String[10];
    private String[] appointments = new String[10];
    private int historyCount = 0;
    private int appointmentCount = 0;

    public Patients(String name, String att_name, String phone) {
        super(name, att_name, phone);
    }

    public void bookAppointment(String doctorName) {
        if (appointmentCount < appointments.length) {
            appointments[appointmentCount++] = doctorName;
            System.out.println("Appointment booked with Dr. " + doctorName);
        } else {
            System.out.println("No more appointments can be booked.");
        }
    }

    public void viewMedHistory() {
        System.out.println("Medical History of " + name + ":");
        if (historyCount == 0) {
            System.out.println("No medical records found.");
        } else {
            for (int i = 0; i < historyCount; i++) {
                System.out.println("- " + medHistory[i]);
            }
        }
    }

    public void addMedicalRecord(String record) {
        if (historyCount < medHistory.length) {
            medHistory[historyCount++] = record;
        } else {
            System.out.println("Cannot add more medical records.");
        }
    }
}
