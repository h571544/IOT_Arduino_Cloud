package no.hvl.dat110.aciotdevice.controller;

public class Serial {

	public Serial() {
		// TODO Auto-generated constructor stub
		Serial.begin(9600);
	}

	public static void begin (int baudrate) {
		// not require here
	}
	
	public static void println(String str) {
		System.out.println(str);
	}
}
