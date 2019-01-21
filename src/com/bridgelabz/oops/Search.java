/******************************************************************************
 *  Compilation:  javac -d bin Search.java
 *  Execution:    java -cp bin com.bridgelabz.oops.Search.java n
 *  
 *  Purpose: This class contains search methods for the Clinic Management Application
 *
 *  @author  Nikitha Mundargi
 *  @version 1.0
 *  @since   12-01-2018
 *
 ******************************************************************************/

package com.bridgelabz.oops;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.OopsUtility;

public class Search {

	/**
	 * Static function to search doctor by name
	 * 
	 * @return list of doctors of the same name
	 * 
	 * @throws IOException
	 */
	public static List<Doctor> searchByName() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.DOCTOR_FILE);
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

	/**
	 * Static function to search doctor by id
	 * 
	 * @return list of doctors of the same id
	 * 
	 * @throws IOException
	 */
	public static Doctor searchById() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.DOCTOR_FILE);
		CliniqueManager.listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
		System.out.println("Enter the doctor's id to be searched");
		int id = OopsUtility.userInt();
		for (Doctor doctor : CliniqueManager.listOfDoctor) {
			if (id == doctor.getId()) {
				return doctor;

			}
		}
		return null;
	}

	/**
	 * Static function to search doctor by specialization
	 * 
	 * @return list of doctors of the same specialization
	 * 
	 * @throws IOException
	 */
	public static List<Doctor> searchBySpecialization() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.DOCTOR_FILE);
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

	/**
	 * Static function to search doctor by availability
	 * 
	 * @return list of doctors of the same availability
	 * 
	 * @throws IOException
	 */
	public static List<Doctor> searchByAvailability() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.DOCTOR_FILE);
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

	/**
	 * Static function to search patient by id
	 * 
	 * @return object of patient
	 * 
	 * @throws IOException
	 */
	public static Patient searchByPatientId() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.PATIENT_FILE);
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

	/**
	 * Static function to search patient by phone number
	 * 
	 * @return object of patient
	 * 
	 * @throws IOException
	 */
	public static Patient searchByPhoneNo() throws IOException {
		String string = OopsUtility.readJsonFile(CliniqueManager.PATIENT_FILE);
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
