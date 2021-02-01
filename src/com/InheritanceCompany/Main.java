package com.InheritanceCompany;

public class Main {

    public static void main(String[] args) {
	Samsung s = new Samsung();
	s.setColor("Black");
	s.setCost(3000);
	s.setRAM("4GB");
	s.setAndriod_version("Android Pie");
        System.out.println("Samsung mobile details" );
        System.out.println("cost: "+s.getCost());
        System.out.println("Color: "+s.getColor());
        System.out.println("Ram: "+s.getRAM());
        System.out.println("Android version: "+s.getAndroid_version());
    }
}
