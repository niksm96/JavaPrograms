package com.bridgelabz.oops;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.OopsUtility;

public class Search {

	public static List<Doctor> searchByName() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.doctorFile);
		CliniqueManager.listOfDoctor=OopsUtility.userReadValue(string, Doctor.class);
		List<Doctor> list = new ArrayList<>();
		System.out.println("Enter the doctor's name to be searched");
		String name = OopsUtility.userString();
		System.out.println(name);
		for (Doctor doctor : CliniqueManager.listOfDoctor) {
			if (name.equals(doctor.getName())) {
				list.add(doctor);
			}
		}
		return list;

	}

	public static List<Doctor> searchById() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.doctorFile);
		CliniqueManager.listOfDoctor=OopsUtility.userReadValue(string, Doctor.class);
		List<Doctor> list = new ArrayList<>();
		System.out.println("Enter the doctor's id to be searched");
		int id = OopsUtility.userInt();
		for (Doctor doctor : CliniqueManager.listOfDoctor) {
			if (id == doctor.getId()) {
				list.add(doctor);

			}
		}
		return list;
	}

	public static List<Doctor> searchBySpecialization() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.doctorFile);
		CliniqueManager.listOfDoctor=OopsUtility.userReadValue(string, Doctor.class);
		List<Doctor> list = new ArrayList<>();
		System.out.println("Enter the doctor's name to be searched");
		String specialization = OopsUtility.userString();
		for (Doctor doctor : CliniqueManager.listOfDoctor) {
			if (specialization.equals(doctor.getSpecialization())) {
				list.add(doctor);
			}
		}

		return list;
	}

	public static List<Doctor> searchByAvailability() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.doctorFile);
		CliniqueManager.listOfDoctor=OopsUtility.userReadValue(string, Doctor.class);
		List<Doctor> list = new ArrayList<>();
		System.out.println("Enter when you need the doctor (eg: am/pm)");
		String availability = OopsUtility.userString();
		for (Doctor doctor : CliniqueManager.listOfDoctor) {
			if (availability.equals(doctor.getAvailability())) {
				list.add(doctor);
			}
		}
		return list;
	}


	public static void searchByPatientId() {
		System.out.println("Enter the patient's id to be searched");
		int userPatient = OopsUtility.userInt();
		try {
			for (Patient patient : CliniqueManager.listOfPatients) {
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
			for (Patient patient : CliniqueManager.listOfPatients) {
				if (userPatient == patient.getPhoneNo()) {
					System.out.println("Patient of phone number " + userPatient + " is present");
				}
			}
		} catch (Exception e) {
			System.out.println("Patient of phone number " + userPatient + " is not present");
		}
	}

}
