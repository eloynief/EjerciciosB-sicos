package basicex2;

import java.util.Scanner;

public class BasicEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner c = new Scanner(System.in);
		
		//mensaje para meter numero
		System.out.print("pon tu edad: ");
		
		//crear numero entero
		int n = c.nextInt();
		
		//Scanner readn = new Scanner(System.in); //crear el scanner
		
		//sumamos la variable +1
		n++;
		
		//aparece despues de escribir el numero
		System.out.print("la edad que tendrás será: " + n);
		
	}

}
