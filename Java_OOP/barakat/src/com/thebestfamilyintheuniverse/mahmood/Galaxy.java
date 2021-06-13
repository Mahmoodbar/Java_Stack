package com.thebestfamilyintheuniverse.mahmood;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
		String s = " Galaxy" + getVersionNumber() + "" + "Says" + getRingTone() ;
				return s; 
        // your code here
    }
    @Override
    public void unlock() {
    	System.out.println("unlock using finger print");
    }
    @Override
    public String displayInfo() {
        String t =  " Galaxy" + getVersionNumber() + "" + "form" + getCarrier() ;   
        return t; 
    }
}