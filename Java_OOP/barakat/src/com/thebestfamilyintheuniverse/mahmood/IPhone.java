package com.thebestfamilyintheuniverse.mahmood;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
	@Override
    public String ring() {
		String s = " Iphone" + getVersionNumber() + "" + "Says" + getRingTone() ;
		return s; 
        // your code here
    }
 
	@Override
    public void unlock() {
		System.out.println("unlock using facial recognition");
       
    }
    @Override
    public String displayInfo() {
    	String t =  " Iphone" + getVersionNumber() + "" + "form" + getCarrier() ;   
        return t;         
    }
}