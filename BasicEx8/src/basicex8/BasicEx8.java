package basicex8;

import java.util.Scanner;

public class BasicEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cas = new Scanner(System.in);
		
		//crear mensaje que aparecerá en la pantalla
		System.out.print("Introduce tu nombre: ");
		
		//crear string
		String name = cas.nextLine();
		
		//mensaje que aparece
		System.out.print("Introduce tu edad: ");
		
		//crear variable numérica
		int num = cas.nextInt();
		
		//mensaje que aparecerá después de introducir la variable numérica
		System.out.print("Hola " + name + ", tienes " + num + " ,eres muy mayor!");
		
		//cierre de scanner
		cas.close();
	}

}
