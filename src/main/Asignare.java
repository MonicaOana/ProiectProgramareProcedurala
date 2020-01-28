package main;

import java.io.IOException;

public class Asignare {

	public static void main(String[] args) {
		double d = 2.95;
		int i = 4;
		System.out.println(++d > i ? d : i);
		
		int suma = 0;
		for(i = 1; i < 10; i++ ) {
			suma += suma + i;
		}
		System.out.println("Suma este:" + suma);
		
		int numarul = 3;
	    System.out.println("Introduceti numarul:");
	if (numarul % 2 == 0)
		System.out.println("Numarul "+ numarul +" este par");
	else
		System.out.println("Numarul "+ numarul +" este impar");
	
	char inChar;
    System.out.println("Enter a Character:");
    try {
        inChar = (char)System.in.read();
        System.out.print("You entered ");
        System.out.println(inChar);
    }
    catch (IOException e){
        System.out.println("Error reading from user");
    }
	}

}
