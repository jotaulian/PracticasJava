package es.studium.Potencia;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		int base,exp,resultado = 1,i;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame la base:");
		base = teclado.nextInt();
		System.out.println("Dame el exponente:");
		exp = teclado.nextInt();
		teclado.close();
		for(i=1;i<=exp;i++) {
			resultado = resultado * base;
		}

		System.out.println("El numero " + base + " elevado a " + exp +" es " + resultado );
	}

}
