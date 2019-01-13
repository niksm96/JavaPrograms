package com.bridgelabz.oops;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.util.OopsUtility;

public class AppointmentManagement {

	static List<Appointment> listOfAppointments=new ArrayList<>();
	static ObjectMapper objectMapper2 = new ObjectMapper();

	static String appointmentFile="E:\\BridgeLabz\\JavaPrograms\\src\\com\\bridgelabz\\oops\\Appointment.json";
	
	public void takeAppointment() throws IOException {
		System.out.println("Enter your phone number");
		long phoneNo = OopsUtility.userLong();
		for (Patient patient : PatientManagement.listOfPatients) {
			if (phoneNo == patient.getPhoneNo()) {
				System.out.println("Search Doctor by-- 1:Name  2:Speciality  3:Availability");
				int choice = OopsUtility.userInt();
				switch (choice) {
				case 1:
					
				}
			} else {
				PatientManagement.addPatient();
			}
		}

	}

	public void searchDoctorName() throws IOException {
		List<Doctor> list = DoctorManagement.searchByName();
		String string=OopsUtility.readJsonFile(appointmentFile);
		if (list.size() > 1) {
			for (Doctor doctor : list) {
				System.out.println("Doctor id: "+doctor.getId());
				System.out.println("Doctor name: "+doctor.getName());
				System.out.println("Doctor speciality: "+doctor.getSpecialization());
				System.out.println("Doctor availability: "+doctor.getAvailability());
			}
			System.out.println("Enter the name of your choice");
			String name=OopsUtility.userString();
			for (Doctor doctor : list) {
				if(name.equals(doctor.getName())){
					try{
						listOfAppointments=objectMapper2.readValue(string, new TypeReference<List<Appointment>>() {
						});
					}catch(Exception e){
						
					}
				}
			}
		}
		else{
			
		}
	}

	// ObjectMapper objectMapper = new ObjectMapper();
	// List<Patient> listOfPatients = new ArrayList<Patient>();
	// DoctorManagement doctorManage = new DoctorManagement();
	// List<Appointment> listOfAppointments = new ArrayList<Appointment>();
	// String appointmentFile =
	// "E:\\BridgeLabz\\JavaPrograms\\src\\com\\bridgelabz\\oops\\Appointment.json";
	// int count = 0;
	//
	// public void takeAppointment() throws IOException {
	// System.out.println("Have you visited before?");
	// System.out.println("If yes then type 1 else 2");
	// int choice = OopsUtility.userInt();
	// switch (choice) {
	// case 1:
	// visitedPatient();
	// break;
	//
	// }
	// }
	//
	// public void visitedPatient() throws IOException {
	// System.out.println("Please provide your phone number");
	// long phoneNo = OopsUtility.userLong();
	// for (Patient patient : listOfPatients) {
	// if (phoneNo == patient.getPhoneNo()) {
	// System.out.println("Yes you are there in our system");
	// System.out.println("For what would you like to take an appointment?");
	// System.out.println("Enter 1:By Name 2:By Specialization 3:By Availability
	// ");
	// int choose = OopsUtility.userInt();
	// switch (choose) {
	// case 1:
	// Doctor doctor = doctorManage.searchByName();
	// if (doctor != null) {
	// String appointmentString = OopsUtility.readJsonFile(appointmentFile);
	// try {
	// listOfAppointments = objectMapper.readValue(appointmentString,
	// new TypeReference<List<Appointment>>() {
	// });
	// for (int i = 0; i < listOfAppointments.size(); i++) {
	// Appointment appointment = listOfAppointments.get(i);
	// System.out.println("Doctor name: " + appointment.getDocName());
	// for (int j = 0; j < appointment.getListOfPatients().size(); j++) {
	// if (appointment.getListOfPatients().size() < 5) {
	// List<Patient> list=appointment.getListOfPatients();
	// list.add(patient);
	// } else
	// System.out.println("Sorry, your choice of doctor is not available");
	// }
	// }
	// } catch (Exception e) {
	// for(Appointment appointment:listOfAppointments){
	// appointment.setDocName(doctor.getName());
	// List<Patient> list=appointment.getListOfPatients();
	// list.add(patient);
	// listOfAppointments.add(appointment);
	// }
	// }
	// }
	// System.out.println("Sorry, doctor of that name don't work here");
	// }
	// }
	// }
	// }
}
