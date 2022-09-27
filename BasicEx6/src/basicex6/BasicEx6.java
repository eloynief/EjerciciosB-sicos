package basicex6;

import java.util.Locale;
import java.util.Scanner;

public class BasicEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear el scanner para leer variables
		Scanner sc = new Scanner(System.in);
		
		//comando para que en vez de poner comas en los números tengas que poner puntos
		sc.useLocale(Locale.US);
		
		//print de un mensaje que aparecerá en la pantalla
		System.out.print("put two numbers: ");
		
		//variable donde puedes asignar cualquier valor
		float nm1 = sc.nextFloat();
		
		//otra variable donde puedes asignar cualquier valor
		float nm2 = sc.nextFloat();
		
		//print de todas las ecuaciones que hay que hacer con las variables
		System.out.println(nm1 + nm2);
		System.out.println();
		System.out.println(nm1 - nm2);
		System.out.println();
		System.out.println(nm1 * nm2);
		System.out.println();
		System.out.println(nm1 / nm2);
	}

}
