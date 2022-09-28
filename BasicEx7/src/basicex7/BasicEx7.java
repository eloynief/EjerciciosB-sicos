package basicex7;

import java.util.Scanner;

public class BasicEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear el scanner para leer variables
		Scanner scans = new Scanner(System.in);
		
		//print de un mensaje que aparecerá en la pantalla
		System.out.print("Type your name: ");
		
		//crear la variable que será una variable de letras
		String lt1 = scans.nextLine();
		
		//print del siguiente mensaje que aparecerá en la pantalla
		System.out.print("Type your Address: ");
		
		//crear la variable que será una variable de letras
		String lt2 = scans.nextLine();
		
		//print de otro mensaje que aparecerá en la pantalla
		System.out.println("Type your Phone Number: ");
		
		//crear variable numérica
		int nm1 = scans.nextInt();
		
		
		//print de lo escrito anteriormente
		System.out.println("Your name is: " + lt1);
		System.out.println("Your address is: " + lt2);
		System.out.println("Your phone number is: " + nm1);
		
		//cierre de scanner
		scans.close();
	}

}
