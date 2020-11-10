package es.studium.ComparaCadena;

import java.util.Scanner;

public class ComparaCadena
{

	public static void main(String[] args)
	{
		String cadena1, cadena2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame la primer cadena");
		cadena1 = teclado.nextLine();
		System.out.println("Dame la segunda cadena");
		cadena2 = teclado.nextLine();
		teclado.close();
		if(cadena1.length() == cadena2.length()) {
			System.out.println("Ambas cadenas tienen la misma longitud");
		} else if(cadena1.length() > cadena2.length()) {
			System.out.println("La cadena1 tiene mayor longitud que la cadena2");
		} else {
			System.out.println("La cadena2 tiene mayor longitud que la cadena1");
		}
	}

}
