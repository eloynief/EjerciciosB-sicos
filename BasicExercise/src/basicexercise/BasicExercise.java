package basicexercise;

import java.util.Scanner;

public class BasicExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear scanner para poder escribir el numero
		Scanner c = new Scanner(System.in);
		
		//mensaje para meter numero
		System.out.print("Introduce un número: ");
		
		//crear variable numérica
		int n = c.nextInt();
		
		//aparece despues de escribir el numero de la variable
		System.out.print("El número es: " + n);
		
		//cierre de scanner
		c.close();
	}

}
