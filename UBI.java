package com.xworkz.Constructors;

import java.util.Date;

public class UBI {

	String name;
	Date dob;
	int uid_no;
	String standard;
	char sec;
	
	public UBI () {
		System.out.println("Default constuctor invoked");
	}
	
	public UBI (int uid_no,String name,char sec) {
		System.out.println("Selected Parameter constuctor invoked");
		this.uid_no=uid_no;
		this.name=name;
		this.sec=sec;
	}
	
	public UBI (int uid_no,String name,char sec,Date dob,String standard) {
		System.out.println("Selected Parameter constuctor invoked");
		this.uid_no=uid_no;
		this.name=name;
		this.sec=sec;
		this.dob=dob;
		this.standard=standard;
	}
	
	public void displayUbi() {
		System.out.println(this.name);
		System.out.println(this.sec);
		System.out.println(this.standard);
		System.out.println(this.uid_no);
		System.out.println(this.dob);
	}
	public void ubi_login() {
		System.out.println("enter UID and DOB to login");
	}

	public void fee_collection() {
		System.out.println("click here for online fee collection");
	}

	public void online_challan() {
		System.out.println("click here for online challan generation");
	}

	public void print_receipt() {
		System.out.println("click here for generate challan and print receipt");
	}

	public void status() {
		System.out.println(" First quarter payment has been done and transaction id is...");
	}

	public void reminder() {
		System.out.println(" Due to late paymnet.. the admission has been canceled of student uid no- 12389756 ");
	}

	public void latest_News() {
		System.out.println(
				"The second quarter payemnt has to be done before december 25th.. this is for your kind information");
	}
	}


