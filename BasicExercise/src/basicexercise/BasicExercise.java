package basicexercise;

import java.util.Scanner;

public class BasicExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//para poder escribir el numero
		Scanner c = new Scanner(System.in);
		
		//mensaje para meter numero
		System.out.print("pon un numero: ");
		
		int n = c.nextInt(); //es int, pero podrías poner otras cosas como byte
		
		//aparece despues de escribir el numero
		System.out.print("The number is: " + n);
		
		
	}

}
