package com.bridgelabz.oops;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.OopsUtility;

public class Search {

	public static List<Doctor> searchByName() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.doctorFile);
		try {
			CliniqueManager.listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
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
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}

	public static List<Doctor> searchById() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.doctorFile);
		try {
			CliniqueManager.listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter the doctor's id to be searched");
			int id = OopsUtility.userInt();
			for (Doctor doctor : CliniqueManager.listOfDoctor) {
				if (id == doctor.getId()) {
					list.add(doctor);

				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}

	public static List<Doctor> searchBySpecialization() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.doctorFile);
		try {
			CliniqueManager.listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter the doctor's name to be searched");
			String specialization = OopsUtility.userString();
			for (Doctor doctor : CliniqueManager.listOfDoctor) {
				if (specialization.equals(doctor.getSpecialization())) {
					list.add(doctor);
				}
			}

			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}

	public static List<Doctor> searchByAvailability() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.doctorFile);
		try {
			CliniqueManager.listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
			List<Doctor> list = new ArrayList<>();
			System.out.println("Enter when you need the doctor (eg: am/pm)");
			String availability = OopsUtility.userString();
			for (Doctor doctor : CliniqueManager.listOfDoctor) {
				if (availability.equals(doctor.getAvailability())) {
					list.add(doctor);
				}
			}
			return list;
		} catch (Exception e) {
			System.out.println("File is empty!");
			return null;
		}

	}

	public static Patient searchByPatientId() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.patientFile);
		CliniqueManager.listOfPatients = OopsUtility.userReadValue(string, Patient.class);
		System.out.println("Enter the patient's id to be searched");
		int id = OopsUtility.userInt();
		for (Patient patient : CliniqueManager.listOfPatients) {
			if (id == patient.getId()) {
				return patient;
			}
		}
		return null;
	}

	public static Patient searchByPhoneNo() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.patientFile);
		CliniqueManager.listOfPatients = OopsUtility.userReadValue(string, Patient.class);
		System.out.println("Enter the patient's phone number to search");
		long phoneNo = OopsUtility.userLong();

		for (Patient patient : CliniqueManager.listOfPatients) {
			if (phoneNo == patient.getPhoneNo()) {
				return patient;
			}
		}
		return null;
	}

}
