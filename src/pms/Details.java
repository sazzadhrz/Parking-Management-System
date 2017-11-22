package pms;

import java.io.Serializable;

public class Details implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String vehicleType;
	String regNumber;
	String model;
	String color;
	String selfDriven;
	
	String name;
	String age;
	String gender;
	String DL;
	String address;
	
	String time;
	
	public Details(String time, String vehicleType, String regNumber, String model, String color, String selfDriven, String name, String age, String gender, String DL, String address){
		this.time = time;
		this.vehicleType = vehicleType;
		this.regNumber = regNumber;
		this.model = model;
		this.color = color;
		this.selfDriven  = selfDriven;
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.DL = DL;
		this.address = address;
	}
	
	public String toString() {
		return "\n\n" + "Entry Date and Time : " + time +  "\nVehicle Type : " + vehicleType + ", Registration No : " + regNumber + ", Vehicle Model : " + model + ", Color : " + color + ",\nDriver's Name :  " + 
				name + ", Driver's Age :  " + age + ", Gender : " + gender + ", Driving License Number : " + DL + ", Address : " + address;
		
	}

}
