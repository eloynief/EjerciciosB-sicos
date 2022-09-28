package basicex10;

import java.util.Scanner;

import java.util.Locale;

public class BasicEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner idk = new Scanner(System.in);
		
		idk.useLocale(Locale.US);
		
		float iva = 21;
		
		System.out.print("putnub");
		
		float a = idk.nextFloat();
		
		float calc = ((iva/100) * a) + a;
		
		System.out.print("El precio con iva es: " + calc);
	}

}
