package com.coderHouse;

public class PrimerEntrega {

	public static void main(String[] args) {
		float numero = (float) 7.1;
		int parteEntera;
		float parteDecimal;
		
		parteEntera = (int) numero;
		parteDecimal = (float) numero - parteEntera;
		
		System.out.println("La parte entera es: " + parteEntera);
		System.out.println("La parte decimal es: " + parteDecimal);

	}

}
