package com.xworkz.Constructors;
import java.util.Date;

public class PassportTester {

	public static void main(String[] args) {
		PassportConstructors passport = new PassportConstructors();
		PassportConstructors passport1 = new PassportConstructors(12988, "daniel", 123);
		{
			System.out.println(passport1.passport_No);
			System.out.println(passport1.name);
			System.out.println(passport1.dob);
		}
		PassportConstructors passport2 = new PassportConstructors(123478,"Indian", "Malini", 'F',2016, 2026, 1995); {

			System.out.println(passport2.passport_No);
			System.out.println(passport2.citizenship);
			System.out.println(passport2.name);
			System.out.println(passport2.sex);
			System.out.println(passport2.date_of_issue);
			System.out.println(passport2.date_of_expiry);
			System.out.println(passport2.dob);
		}

	}

}
