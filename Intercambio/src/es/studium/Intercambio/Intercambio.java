package es.studium.Intercambio;

import java.util.Scanner;

public class Intercambio {

	public static void main(String[] args) {
		int numero1,numero2,comodin;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el número 1:");
		numero1 = teclado.nextInt();
		System.out.println("Dame el número2:");
		numero2 = teclado.nextInt();
		teclado.close();
		comodin = numero2;
		numero2 = numero1;
		numero1 = comodin;
		System.out.println("Intercambiamos valores...");
		System.out.println("Ahora el numero1 es " + numero1);
		System.out.println("Ahora el numero 2 es " + numero2);
	}

}
