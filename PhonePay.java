package com.xworkz.Constructors;

public class PhonePay {
	String name;
	long phone_no;
	String place;
	long adhar_no;
	String PAN_NO;

	public PhonePay(String name, long phone_no, String place) {
		System.out.println("Three parameters  constructors Invoked");
		this.name = name;
		this.phone_no = phone_no;
		this.place = place;

	}
	public PhonePay(long adhar_no,String name,String PAN_NO,String place) {
		System.out.println("All parameters  constructors Invoked");
		this.adhar_no=adhar_no;
		this.name = name;
		this.PAN_NO=PAN_NO;
		this.place = place;

	}
	public PhonePay(String name, long phone_no, String place,long adhar_no,String PAN_NO) {
		System.out.println("All parameters  constructors Invoked");
		this.name = name;
		this.phone_no = phone_no;
		this.place = place;
		this.adhar_no=adhar_no;
		this.PAN_NO=PAN_NO;
}
	public void display() {
		System.out.println(this.name);
		System.out.println(this.phone_no);
		System.out.println(this.place);
		System.out.println(this.adhar_no);
		System.out.println(this.PAN_NO);
	}

	public void login() {
		System.out.println("Enter the details to login");
	}
	public void logOut() {
		System.out.println("You can logout now");
	}
	public void recharge() {
		System.out.println("Mobile Recharge Successfully done");
	}
	public void transferMoney() {
		System.out.println("Money transferred Successfully");
	}
	
}
