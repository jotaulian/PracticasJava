package es.studium.Potencia2;

import java.util.Scanner;

public class Potencia2 {
	public static void main(String[] args) {
		int a,b;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un nro para la base:");
		a = teclado.nextInt();
		System.out.println("Dame un nro para el exponente:");
		b = teclado.nextInt();
		teclado.close();
		System.out.println("El numero " + a + " elevado a " + b + " es igual a:" + pot(a,b));
	}

	public static int pot(int a, int b) {
		int i,resultado;
		resultado = 1;
		for(i=1;i<=b;i++) {
			resultado = resultado * a;
		}
		return resultado;
	}
}
