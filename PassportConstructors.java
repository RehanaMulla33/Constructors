package com.xworkz.Constructors;

import java.util.Date;

public class PassportConstructors {

	int passport_No;
	String citizenship;
	String name;
	Character sex;
	int date_of_issue;
	int date_of_expiry;
	int dob;

	public PassportConstructors() {
		System.out.println(" Constructors Without Parameters");
	}

	public PassportConstructors(int passport_No, String citizenship, String name, Character sex, int date_of_issue,
			int date_of_expiry, int dob) {
		System.out.println(" passport Constructor with all parameters");

		this.passport_No=passport_No;
		this.citizenship=citizenship;
		this.name=name;
		this.sex=sex;
		this.date_of_issue=date_of_issue;
		this.date_of_expiry=date_of_expiry;
		this.dob=dob;
	}

	public PassportConstructors(int passport_No, String name, int dob) {
		System.out.println(" passport Constructor with few parameters");
		this.passport_No=passport_No;
		this.name=name;
		this.dob=dob;
	}

	public void latest_News() {
		System.out.println("Due to pandamic mantain social distance");
	}

	public void registartion() {
		System.out.println("Click here for new user registration");
	}

	public void ex_login() {
		System.out.println("Click here for exisisting  user login");
	}

	public void appointment() {
		System.out.println("Appointment is held on 23.09.2021");
	}

	public void status() {
		System.out.println("Application status-Verified at  first level");
	}
}
