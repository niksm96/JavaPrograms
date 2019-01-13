package com.bridgelabz.oops;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.OopsUtility;

public class CliniqueManager {
	static List<Doctor> listOfDoctor = new ArrayList<Doctor>();
	static String doctorFile = "E:\\BridgeLabz\\JavaPrograms\\src\\com\\bridgelabz\\oops\\Doctor.json";
	static List<Patient> listOfPatients = new ArrayList<Patient>();
	static String patientFile = "E:\\BridgeLabz\\JavaPrograms\\src\\com\\bridgelabz\\oops\\Patient.json";

	public static void add() throws IOException {
		System.out.println("Enter choice- 1:To Add Doctor 2:To Add Patient");
		int choice = OopsUtility.userInt();
		switch (choice) {
		case 1:
			addDoctor();
			break;
		case 2:
			addPatient();
			break;
		}
	}

	public static void addDoctor() throws IOException {
		String string = OopsUtility.readJsonFile(doctorFile);
		listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
		Doctor doctor = new Doctor();
		System.out.println("Setting id");
		doctor.setId(listOfDoctor.size() + 1);
		System.out.println("Id set");
		System.out.println("Enter the doctor's name");
		doctor.setName(OopsUtility.userString());
		System.out.println("Enter the specialization");
		doctor.setSpecialization(OopsUtility.userString());
		System.out.println("Enter the availability");
		doctor.setAvailability(OopsUtility.userString());
		listOfDoctor.add(doctor);
		System.out.println("Doctor added successfully");
		String json = OopsUtility.userWriteValueAsString(listOfDoctor);
		OopsUtility.writeFile(json, doctorFile);
	}

	public static void addPatient() throws IOException {
		String string = OopsUtility.readJsonFile(patientFile);
		listOfPatients = OopsUtility.userReadValue(string, Patient.class);
		Patient patient = new Patient();
		System.out.println("Setting id");
		patient.setId(listOfPatients.size() + 1);
		System.out.println("Id set");
		System.out.println("Enter the patient's name");
		patient.setName(OopsUtility.userString());
		System.out.println("Enter the age");
		patient.setAge(OopsUtility.userInt());
		System.out.println("Enter the phone number");
		patient.setPhoneNo(OopsUtility.userLong());
		listOfPatients.add(patient);
		System.out.println("Patient added successfully");
		String json = OopsUtility.userWriteValueAsString(listOfPatients);
		OopsUtility.writeFile(json, patientFile);
	}

	public static void searchDoctor() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter the choice of property based on which you want to search");
		System.out.println("1:Search by ID  2:Search By Name  3:Search By Specialization  4:Search By Availability");
		int choice = OopsUtility.userInt();
		switch (choice) {
		case 1:
			System.out.println("Searching by id");
			List<Doctor> doctor1 = Search.searchById();
			if (!doctor1.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;

		case 2:
			System.out.println("Searching by name");
			List<Doctor> doctor2 = Search.searchByName();
			if (!doctor2.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		case 3:
			List<Doctor> doctor3 = Search.searchBySpecialization();
			if (!doctor3.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		case 4:
			List<Doctor> doctor4 = Search.searchBySpecialization();
			if (!doctor4.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;

		}
	}

	public static void searchPatient() {
		System.out.println("Enter the choice of property based on which you want to search");
		System.out.println("1:Search by ID  2:Search By Phone Number");
		int choice = OopsUtility.userInt();
		switch (choice) {
		case 1:
			System.out.println("Searching by id");
			Search.searchByPatientId();
			break;
		case 2:
			System.out.println("Searching by Phone Number");
			Search.searchByPhoneNo();
			break;
		}
	}
	
	public static void search() throws JsonParseException, JsonMappingException, IOException{
		System.out.println("Enter choice: 1:Search Doctor  2:Search Patient");
		int choice=OopsUtility.userInt();
		switch(choice){
		case 1: searchDoctor();
				break;
		case 2: searchPatient();
				break;
		}
	}
}
