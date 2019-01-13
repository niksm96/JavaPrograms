package com.bridgelabz.oops;

import java.io.IOException;
import com.bridgelabz.util.OopsUtility;

public class CliniqueManagement {
	public static void main(String[] args) throws IOException {
		boolean isRunning = true;
		while (isRunning) {
			System.out.println("Enter the choice");
			System.out.println("1:Add  2:Search  3:Display  4:Take Appointment");
			int choice = OopsUtility.userInt();
			switch (choice) {
			case 1:
				System.out.println("Enter: 1:To Add Doctor  2:To Add Patient");
				int ch = OopsUtility.userInt();
				switch (ch) {
				case 1:
					DoctorManagement.addDoctor();
					break;
				case 2:
					PatientManagement.addPatient();
					break;
				}
				isRunning = true;
				break;
			case 2:
				System.out.println("Enter: 1:To Search Doctor  2:To Search Patient");
				int choose = OopsUtility.userInt();
				switch (choose) {
				case 1:
					DoctorManagement.searchDooctor();
					break;
				case 2:
					PatientManagement.searchPatient();
					break;
				}
				isRunning = true;
				break;
			case 3:
				System.out.println("Enter: 1:To Display Doctor  2:To Display Patient");
				int chose = OopsUtility.userInt();
				switch (chose) {
				case 1:
					DoctorManagement.displayDoctor();
					;
					break;
				case 2:
					PatientManagement.displayPatient();
					;
					break;
				}
				break;
//			case 4: 
//				appointment.takeAppointment();
//				isRunning=true;
//				break;
			default:
				System.out.println("Invalid choice");
				isRunning = false;
				break;
			}
		}
	}
}
