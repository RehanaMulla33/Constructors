package com.xworkz.Constructors;

import java.util.Date;

public class AgriCultural {

	String plants;
	String seeds;
	String fertilizer;
	String machine_tools;
	Date opening_date;
	Date closing_Date;
	
	public AgriCultural(String plants,String seeds,String ferilizer) {
		this.plants=plants;
		this.seeds=seeds;
		this.fertilizer=fertilizer;
	}
	
	public void dispalyInfo() {
		System.out.println(this.plants);
		System.out.println(this.seeds);
		System.out.println(this.machine_tools);
		System.out.println(this.opening_date);
		System.out.println(this.closing_Date);
	}
		

	public void open_date() {
		System.out.println("The inauguration date of Agricucltural fair is on-01/10/2021");
	}

	public void ehibitor_list() {
		System.out.println("Here the different types of exibitors list");
	}

	public void reservation() {
		System.out.println("");
	}

	public void online_ticket() {
		System.out.println("click here for online ticket booking");
	}

	public void entry() {
		System.out.println("Welcome to Agricultural Exhibition Fair..Plz enter via valid id prrof ");
	}

	public void seed() {
		System.out.println("Right now more than 250 different types of seeds are avilable in the fair");
	}

	public void tool_machine() {
		System.out.println(" The avialble machine part is avilabe-select to pay");
	}

	public void close_date() {
		System.out.println("The closing date of Agricucltural fair is on-10/10/2021");
	}


	}

