package basicex9;

import java.util.Locale;
import java.util.Scanner;

public class BaisicEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner converter = new Scanner(System.in);
		
		converter.useLocale(Locale.US);
		
		System.out.print("Pon el precio en euros: ");
		
		double eur = converter.nextDouble();
		
		double pes = (eur * 166.386);
		
		System.out.print("El valor en pesetas es: " + pes);
		
		
	}

}
