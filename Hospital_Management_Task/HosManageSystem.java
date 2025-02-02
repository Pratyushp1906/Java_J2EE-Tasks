package com.wipro.hospital_management;

public class HosManageSystem {
	public static void main(String[] args) {
       
        Patients pat1 = new Patients("Pratyush", "Piyush", "8634748320");
        Doctor doc1 = new Doctor("Ashok", "Vijay", "7367673735", "Neurology");
        Admin adm1 = new Admin("Nitin", "Nikhil", "6536232763");

       
        adm1.addUser(pat1);
        adm1.addUser(doc1);

        
        pat1.bookAppointment(doc1.getName());
        pat1.addMedicalRecord("Minor brain injury");

       
        doc1.addAppointment(pat1.getName());
        doc1.viewAppointments();

       
        doc1.accessPatientRecords(pat1);

   
        adm1.generateReport();
    }
}
