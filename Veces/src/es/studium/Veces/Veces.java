package es.studium.Veces;

import java.util.Scanner;

public class Veces {

	public static void main(String[] args) {
		int numero, veces,i;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indicar un número:");
		veces = teclado.nextInt();
		System.out.println("Indicar otro número:");
		numero = teclado.nextInt();
		for(i=1;i<=veces;i++) {
			System.out.println(numero);
		}
		teclado.close();
	}

}
