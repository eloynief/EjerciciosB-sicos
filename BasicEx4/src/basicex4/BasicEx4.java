package basicex4;


import java.util.Locale; //para poner punto en vez de comilla
import java.util.Scanner;

public class BasicEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//crear el scanner
		Scanner am = new Scanner(System.in);
		
		//cambia las comas por puntos en valor numérico
		am.useLocale(Locale.US); 

		//print de un mensaje que se mostrará a continuación
		System.out.print("Pon la nota que sacastes en mates: ");
		
		//agregar variable con decimales
		float ss1 = am.nextFloat();
		
		//print de un mensaje que aparecerá en la pantalla
		System.out.print("Pon la nota que sacastes en mates (la secuela): ");
		
		//agregar otra variable con decimales
		float ss2 = am.nextFloat();
		
		//agregar variable cuyo valor sea el resultado de la ecuación escrita
		float ss3 = (ss1+ss2)/2;
		
		//print del mensaje final
		System.out.print("Pon la nota que sacastes en mates (la secuela 2): " + ss3);
		
	}

}
