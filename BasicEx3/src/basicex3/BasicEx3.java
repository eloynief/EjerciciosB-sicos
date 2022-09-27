package basicex3;

import java.util.Scanner;

public class BasicEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear scanners que se usarán a continuación
		Scanner actual = new Scanner(System.in);
		
		//print para poner la siguiente variable
		System.out.print("Introduzca el año en el que estás ahora: ");
		
		//comando para crear variable de numero entero
		int newnumber = actual.nextInt();
		
		//comando de printeo del año de nacimiento
		System.out.print("Introduzca el año en el que nacistes: ");
		
		//comando para crear la otra variable de numero entero
		int newnumber2 = actual.nextInt();
		
		//crear otra variable entera usando la resta de otros dos int
		int calculado = newnumber - newnumber2;
		
		//comando de printeo del resultado el cual es la variable "calculado"
		System.out.print("Tu edad es: " + calculado);
	}

}
