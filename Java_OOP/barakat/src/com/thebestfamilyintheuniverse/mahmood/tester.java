package com.thebestfamilyintheuniverse.mahmood;

public class tester {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy ( "s9" , 99 , "Verizon" , " Ring Ring Ring ");
		IPhone Iphone11 = new IPhone ("X" , 100 , "AT&T" , "Zing Zing Zing ");
		
		System.out.println(s9.ring());
		s9.unlock();
		System.out.println(s9.displayInfo());
		
		System.out.println(Iphone11.ring());
		Iphone11.unlock();
		System.out.println(Iphone11.displayInfo());
		
		
		

	}

}
