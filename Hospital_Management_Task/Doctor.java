package com.wipro.hospital_management;

public class Doctor extends Base {
	    private String domain;
	    private String[] appointments = new String[10];
	    private int appointmentCount = 0;

	    public Doctor(String name, String att_name, String phoneNumber, String specialization) {
	        super(name, att_name, phoneNumber);
	        this.domain = specialization;
	    }

	    public String getSpecialization() {
	        return domain;
	    }

	    public void addAppointment(String patientName) {
	        if (appointmentCount < appointments.length) {
	            appointments[appointmentCount++] = patientName;
	        } else {
	            System.out.println("Cannot add more appointments.");
	        }
	    }

	    public void viewAppointments() {
	        System.out.println("Appointments for Dr. " + name + ":");
	        if (appointmentCount == 0) {
	            System.out.println("No appointments.");
	        } else {
	            for (int i = 0; i < appointmentCount; i++) {
	                System.out.println("- " + appointments[i]);
	            }
	        }
	    }

	    public void accessPatientRecords(Patients patient) {
	        System.out.println("Accessing medical records for patient: " + patient.getName());
	        patient.viewMedHistory();
	    }
}
