package es.Studium.cambiarAporO;

import java.util.Scanner;

public class CambiarApoO {

	public static void main(String[] args) {
		 
Scanner teclado = new Scanner(System.in);
		
		String cad1;
		
		System.out.println("Escriba una cadena");
		cad1=teclado.next();
		
		
		cad1=cad1.replace('a','o');
		
		System.out.println(cad1);
		
		
		
		teclado.close();
	}

}
