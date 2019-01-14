package com.bridgelabz.oops;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bridgelabz.util.OopsUtility;

public class CliniqueManager {
	static List<Doctor> listOfDoctor = new ArrayList<Doctor>();
	static String doctorFile = "E:\\BridgeLabz\\JavaPrograms\\src\\com\\bridgelabz\\oops\\Doctor.json";
	static List<Patient> listOfPatients = new ArrayList<Patient>();
	static String patientFile = "E:\\BridgeLabz\\JavaPrograms\\src\\com\\bridgelabz\\oops\\Patient.json";
	static List<Appointment> listOfAppointments = new ArrayList<>();
	static String appointmentFile = "E:\\BridgeLabz\\JavaPrograms\\src\\com\\bridgelabz\\oops\\Appointment.json";

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
		try {
			listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
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
		String json = OopsUtility.userWriteValueAsString(listOfDoctor);
		OopsUtility.writeFile(json, doctorFile);
	}

	public static void addPatient() throws IOException {
		String string = OopsUtility.readJsonFile(patientFile);
		try {
			listOfPatients = OopsUtility.userReadValue(string, Patient.class);
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

	public static void searchPatient() throws IOException {
		System.out.println("Enter the choice of property based on which you want to search");
		System.out.println("1:Search by ID  2:Search By Phone Number");
		int choice = OopsUtility.userInt();
		switch (choice) {
		case 1:
			System.out.println("Searching by id");
			Patient patient1 = Search.searchByPatientId();
			if (patient1 != null)
				System.out.println("Patient is present");
			else
				System.out.println("Patient is not present");
			break;
		case 2:
			System.out.println("Searching by Phone Number");
			Patient patient2 = Search.searchByPhoneNo();
			if (patient2 != null)
				System.out.println("Patient is present");
			else
				System.out.println("Patient is not present");
			break;
		}
	}

	public static void search() throws JsonParseException, JsonMappingException, IOException {
		System.out.println("Enter choice: 1:Search Doctor  2:Search Patient");
		int choice = OopsUtility.userInt();
		switch (choice) {
		case 1:
			searchDoctor();
			break;
		case 2:
			searchPatient();
			break;
		}
	}

	public static void takeAppointment() throws IOException {
		String string = OopsUtility.readJsonFile(appointmentFile);
		try {
			listOfAppointments = OopsUtility.userReadValue(string, Appointment.class);
			System.out.println("File is not empty");

		} catch (Exception e) {
			System.out.println("File is empty");
		}
		Patient patient = Search.searchByPhoneNo();
		if (patient != null) {
			operation(patient);
		} else {
			CliniqueManager.addPatient();
			Patient patient2=Search.searchByPhoneNo();
			operation(patient2);
		}
		String json = OopsUtility.userWriteValueAsString(listOfAppointments);
		OopsUtility.writeFile(json, appointmentFile);

	}

	public static void displayList(List<Doctor> docList) {
		for (Doctor doctor : docList) {
			System.out.println("Doctor's ID: " + doctor.getId());
			System.out.println("Doctor's name: " + doctor.getName());
			System.out.println("Doctor's specialization: " + doctor.getSpecialization());
			System.out.println("Doctor's availability: " + doctor.getAvailability());
		}
	}

	public static void searchDoc(List<Doctor> doctorList, Patient patient) {
		System.out.println("Enter id");
		int id = OopsUtility.userInt();
		try {
			for (Doctor doctor : doctorList) {
				if (id == doctor.getId()) {
					for (Appointment appointment : listOfAppointments) {
						if (doctor.getName().equals(appointment.getDocName())) {
							List<Patient> patientAppointmentList = appointment.getListOfPatients();
							if (patientAppointmentList.size() < 5) {
								patientAppointmentList.add(patient);
								appointment.setListOfPatients(patientAppointmentList);
								listOfAppointments.add(appointment);
								System.out.println("Appointment is set");
								break;
							} else {
								System.out.println("Appointment is full");
								break;
							}
						} 
						else {
							Appointment newAppointment = new Appointment();
							newAppointment.setDocName(doctor.getName());
							List<Patient> newPatientAppointmentList = new ArrayList<>();
							newPatientAppointmentList.add(patient);
							newAppointment.setListOfPatients(newPatientAppointmentList);
							listOfAppointments.add(newAppointment);
							System.out.println("Appointment is set");
							break;
						}
					}
					if (listOfAppointments.size() == 0) {
						Appointment appointment2 = new Appointment();
						List<Patient> patientList1 = new ArrayList<Patient>();
						patientList1.add(patient);
						appointment2.setDocName(doctor.getName());
						appointment2.setListOfPatients(patientList1);
						listOfAppointments.add(appointment2);
						System.out.println("Appointment is set");
					}

				}
			}

		} catch (Exception e) {
			System.out.println("Enter the correct id");
		}
	}

	public static void operation(Patient patient) throws IOException {
		System.out.println("Search doctor by- 1:Name 2:Speciality 3:Availability");
		int choice = OopsUtility.userInt();
		switch (choice) {
		case 1:
			List<Doctor> doctorList = Search.searchByName();
			displayList(doctorList);
			searchDoc(doctorList, patient);
			break;
		case 2:
			List<Doctor> doctorList1 = Search.searchBySpecialization();
			displayList(doctorList1);
			searchDoc(doctorList1, patient);
			break;
		case 3:
			List<Doctor> doctorList2 = Search.searchByAvailability();
			displayList(doctorList2);
			searchDoc(doctorList2, patient);
			break;
		}
	}

	public static void famousDoctor() throws IOException {
		String string = OopsUtility.readJsonFile(appointmentFile);
		Map<String, Integer> map = new HashMap<>();
		try {
			listOfAppointments = OopsUtility.userReadValue(string, Appointment.class);
			for (int i = 0; i < listOfAppointments.size(); i++) {
				Appointment appointment = listOfAppointments.get(i);
				String doctorName = appointment.getDocName();
				Integer numberOfAppointments = appointment.getListOfPatients().size();
				map.put(doctorName, numberOfAppointments);
			}
			int maxValue = Collections.max(map.values());
			for (Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getValue() == maxValue) {
					System.out.println(
							
							"Famous Doctor Name: " + entry.getKey() + " ---> No of appointments: " + entry.getValue());
				}
			}
		} catch (Exception e) {
			System.out.println("No list of appointments! Can't search for famous doctors");
		}
	}

	public static void famousSpecialist() throws IOException {
		String string = OopsUtility.readJsonFile(doctorFile);
		List<String> list = new ArrayList<>();
		try {
			listOfDoctor = OopsUtility.userReadValue(string, Doctor.class);
			for (Doctor doctor : listOfDoctor) {
				for (Doctor doctor1 : listOfDoctor) {
					if (doctor.getSpecialization().equals(doctor1.getSpecialization())) {
						list.add(doctor.getSpecialization());
					}
				}
			}
			int max = 0;
			int curr = 0;
			String currKey = null;
			Set<String> unique = new HashSet<String>(list);
			for (String key : unique) {
				curr = Collections.frequency(list, key);
				if (max < curr) {
					max = curr;
					currKey = key;
				}
			}
			System.out.println("Specialization  "+ currKey +" is famours");
		} catch (Exception e) {
			System.out.println("There are no doctors in the system");
		}
	}
}
