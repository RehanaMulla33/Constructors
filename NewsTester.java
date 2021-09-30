package com.xworkz.Constructors;

public class NewsTester {

	public static void main(String[] args) {
		NewsConstructor nc=new NewsConstructor();
		NewsConstructor nc1=new NewsConstructor("VK",5,10,"Karnataka");
		{
			System.out.println(nc1.news_paperName);
			System.out.println(nc1.price);
			System.out.println(nc1.pages);
			System.out.println(nc1.state);
		}
			
		}
	}


 
