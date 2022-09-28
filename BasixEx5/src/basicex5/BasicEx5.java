package basicex5;

import java.util.Locale;
import java.util.Scanner;

public class BasicEx5 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner u = new Scanner(System.in);
		
		u.useLocale(Locale.US); //pone los puntos en vez de comillas
		
		//print de mensaje
		System.out.print("Pon el radio de la circunferencia: ");
		
		//variable para introducir el valor que pide
		double ratio = u.nextFloat();
		
		//variable cuyo valor sea el resultado de la ecuación escrita
		double circlong = (ratio*2);
		
		//variable cuyo valor es PI
		double ep = Math.PI;
		
		//otra variable cuyo valor sea el resultado de la ecuación escrita
		double circarea = (2 * ep * ratio);
		
		//print de las variables cuyos resultados son los cálculos anteriores
		System.out.println("La longitud de la circunferencia es: " + circlong);
		System.out.print("El área de la circunferencia es: " + circarea);
		
		//cierre de scanner
		u.close();
	}

}
