package basicex10;

import java.util.Scanner;

import java.util.Locale;

public class BasicEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear scanner
		Scanner sc = new Scanner(System.in);
		
		//cambio de coma a punto
		idk.useLocale(Locale.US);
		
		//crear variable
		float iva = 21;
		
		//print del siguiente mensaje
		System.out.print("Introduce un número: ");
		
		//crear otra variable
		float a = sc.nextFloat();
		
		//variable cuyo resultado tiene las otras variables
		float calc = ((iva/100) * a) + a;
		
		//print del siguiente mensaje
		System.out.print("El precio con iva es: " + calc);
		
		//cierre de scanner
		sc.close();
	}

}
