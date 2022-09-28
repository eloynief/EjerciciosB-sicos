package basicex2;

import java.util.Scanner;

public class BasicEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//crear scanner
		Scanner c = new Scanner(System.in);
		
		//mensaje para introducir número
		System.out.print("pon tu edad: ");
		
		//crear numero entero
		int n = c.nextInt();
		
		//incrementa el valor +1
		n++;
		
		//aparece despues de escribir el numero
		System.out.print("la edad que tendrás será: " + n);
		
		//cierre de scanner
		c.close();
	}

}
