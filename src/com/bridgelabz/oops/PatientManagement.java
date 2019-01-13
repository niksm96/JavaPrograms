package com.bridgelabz.oops;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.util.OopsUtility;

public class PatientManagement {
	static List<Patient> listOfPatients = new ArrayList<Patient>();
	static ObjectMapper objectMapper = new ObjectMapper();
	static String patientFile = "E:\\BridgeLabz\\JavaPrograms\\src\\com\\bridgelabz\\oops\\Patient.json";

	public static void addPatient() throws IOException {
		String string = OopsUtility.readJsonFile(patientFile);
		try {
			listOfPatients = objectMapper.readValue(string, new TypeReference<List<Patient>>() {
			});
			System.out.println("File is not empty!");

		} catch (Exception e) {
			System.out.println("File is empty!");
		}
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
		String json = objectMapper.writeValueAsString(listOfPatients);
		OopsUtility.writeFile(json, patientFile);
	}

	public static void searchPatient() {
		System.out.println("Enter the choice of property based on which you want to search");
		System.out.println("1:Search by ID  2:Search By Phone Number");
		int choice = OopsUtility.userInt();
		switch (choice) {
		case 1:
			System.out.println("Searching by id");
			searchById();
			break;
		case 2:
			System.out.println("Searching by Phone Number");
			searchByPhoneNo();
			break;
		}
	}

	public static void searchById() {
		System.out.println("Enter the patient's id to be searched");
		int userPatient = OopsUtility.userInt();
		try {
			for (Patient patient : listOfPatients) {
				if (userPatient == patient.getId()) {
					System.out.println("Patient of id " + patient.getName() + " is present");
				}
			}
		} catch (Exception e) {
			System.out.println("Patient of that id is not present");
		}
	}

	public static void searchByPhoneNo() {
		System.out.println("Enter the patient's phone number to search");
		long userPatient = OopsUtility.userLong();
		try {
			for (Patient patient : listOfPatients) {
				if (userPatient == patient.getPhoneNo()) {
					System.out.println("Patient of phone number " + userPatient + " is present");
				}
			}
		} catch (Exception e) {
			System.out.println("Patient of phone number " + userPatient + " is not present");
		}
	}

	public static void displayPatient() {
		for (Patient patient : listOfPatients) {
			System.out.println("Patient ID: " + patient.getId());
			System.out.println("Patient Name: " + patient.getName());
			System.out.println("Patient Age: " + patient.getAge());
			System.out.println("Patient Phone Number: " + patient.getPhoneNo());
			System.out.println("----------------------------------------------------");
		}
	}

}
