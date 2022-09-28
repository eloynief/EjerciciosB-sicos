package basicex8;

import java.util.Scanner;

public class BasicEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cas = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		
		String name = cas.nextLine();
		
		System.out.print("Introduce tu edad: ");
		int num = cas.nextInt();
		
		System.out.print("Hola " + name + ", tienes " + num + " ,eres muy mayor!");
		
	}

}
