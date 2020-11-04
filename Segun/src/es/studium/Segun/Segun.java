package es.studium.Segun;

import java.util.Scanner;

public class Segun {

	public static void main(String[] args) {
		int a,b,resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero:");
		a = teclado.nextInt();
		System.out.println("Dame otro numero:");
		b = teclado.nextInt();
		teclado.close();
		if(a<b) {
			resultado = a + b;
			System.out.println("La suma de " + a + "+" + b + "es igual a " + resultado);
		}
		else {
			resultado = a * b;
			System.out.println("La multiplicacion de " +  a + "+" +  b + "es igual a " + resultado);
		}
	}

}
