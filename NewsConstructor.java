package com.xworkz.Constructors;

public class NewsConstructor {

		String news_paperName;
		int price;
		int pages;
		String state;
		int print_date;
		String city_Name;
		
		public NewsConstructor() {
			System.out.println("Default Constructor Invoked");
		}
		
		public NewsConstructor(String news_paperName,int price,int pages,String state) {
			System.out.println("Parameterized Constructor Invoked");
			System.out.println("Start Printing");
			this.news_paperName=news_paperName;
			this.price=price;
			this.pages=pages;
			this.state=state;
		}

		public void start() {
			System.out.println("Stop Printing");
		}

		public void national_internationalNews() {
			System.out.println("Read natioanal and international news ");
		}

		public void advertisement_sec() {
			System.out.println("Here you can go throgh advertisement ");
		}

		public void puzzle_crosswords() {
			System.out.println("Can you sove this puzzle");
		}

		public void sports() {
			System.out.println("Read Sports news");
		}

		public void entertainment() {
			System.out.println("The latest movie released on this friday ");
		}

		public void business_finance() {
			System.out.println("Stock market news ");
		}

		public void stop() {
			System.out.println("Stop Printing");
		}

}


	


