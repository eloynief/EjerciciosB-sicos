package basicex9;

import java.util.Locale;
import java.util.Scanner;

public class BaisicEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner converter = new Scanner(System.in);
		
		//cambio de coma a punto
		converter.useLocale(Locale.US);
		
		//print del mensaje que aparecerá primero
		System.out.print("Pon el precio en euros: ");
		
		//crear variables numéricas
		double eur = converter.nextDouble();
		double pes = (eur * 166.386); //cálculo con la variable anterior
		
		//print del siguiente mensaje
		System.out.print("El valor en pesetas es: " + pes);
		
		//cierre de scanner
		converter.close();
		
	}

}
