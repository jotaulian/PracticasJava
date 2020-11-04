package es.studium.Suma;

import java.util.Scanner;

public class Suma {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1,numero2,suma;
		System.out.println("Dame un numero:");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro numero:");
		numero2 = teclado.nextInt();
		teclado.close();
		suma = numero1 + numero2;
		System.out.println("La suma de los dos numeros ingresado equivale a " + suma);
	}
}

