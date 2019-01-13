package com.bridgelabz.oops;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgelabz.util.OopsUtility;

public class DoctorManagement {
	static List<Doctor> listOfDoctor = new ArrayList<Doctor>();
	static ObjectMapper objectMapper1 = new ObjectMapper();
	static String doctorFile = "E:\\BridgeLabz\\JavaPrograms\\src\\com\\bridgelabz\\oops\\Doctor.json";

	public static void addDoctor() throws IOException {
		String string = OopsUtility.readJsonFile(doctorFile);
		try {

			listOfDoctor = objectMapper1.readValue(string, new TypeReference<List<Doctor>>() {
			});
			System.out.println("File is not empty!");

		} catch (Exception e) {
			System.out.println("File is empty!");
		}
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
		String json = objectMapper1.writeValueAsString(listOfDoctor);
		OopsUtility.writeFile(json, doctorFile);
	}

	public static void searchDooctor() {
		System.out.println("Enter the choice of property based on which you want to search");
		System.out.println("1:Search by ID  2:Search By Name  3:Search By Specialization  4:Search By Availability");
		int choice = OopsUtility.userInt();
		switch (choice) {
		case 1:
			System.out.println("Searching by id");
			List<Doctor> doctor1 = searchById();
			if (!doctor1.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");

		case 2:
			System.out.println("Searching by name");
			List<Doctor> doctor2 = searchByName();
			if (!doctor2.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		case 3:
			List<Doctor> doctor3 = searchBySpecialization();
			if (!doctor3.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;
		case 4:
			List<Doctor> doctor4 = searchBySpecialization();
			if (!doctor4.isEmpty())
				System.out.println("Doctor is present");
			else
				System.out.println("Doctor is not present");
			break;

		}
	}

	public static List<Doctor> searchByName() {
		List<Doctor> list = new ArrayList<>();
		System.out.println("Enter the doctor's name to be searched");
		String userDoc = OopsUtility.userString();
		for (Doctor doctor : listOfDoctor) {
			if (userDoc.equals(doctor.getName())) {
				list.add(doctor);
			}
		}
		return list;

	}

	public static List<Doctor> searchById() {
		List<Doctor> list = new ArrayList<>();
		System.out.println("Enter the doctor's name to be searched");
		int userDoc = OopsUtility.userInt();
		for (Doctor doctor : listOfDoctor) {
			if (userDoc == doctor.getId()) {
				list.add(doctor);

			}
		}
		return list;
	}

	public static List<Doctor> searchBySpecialization() {
		List<Doctor> list = new ArrayList<>();
		System.out.println("Enter the doctor's name to be searched");
		String userDoc = OopsUtility.userString();
		for (Doctor doctor : listOfDoctor) {
			if (userDoc.equals(doctor.getSpecialization())) {
				list.add(doctor);
			}
		}

		return list;
	}

	public static List<Doctor> searchByAvailability() {
		List<Doctor> list = new ArrayList<>();
		System.out.println("Enter when you need the doctor (eg: am/pm)");
		String userDoc = OopsUtility.userString();
		for (Doctor doctor : listOfDoctor) {
			if (userDoc.equals(doctor.getAvailability())) {
				list.add(doctor);
			}
		}
		return list;
	}

	public static void displayDoctor() {
		for (Doctor doctor : listOfDoctor) {
			System.out.println("Doctor ID: " + doctor.getId());
			System.out.println("Doctor Name: " + doctor.getName());
			System.out.println("Doctor Specialization: " + doctor.getSpecialization());
			System.out.println("Doctor Availability: " + doctor.getAvailability());
			System.out.println("----------------------------------------------------");
		}
	}
}
