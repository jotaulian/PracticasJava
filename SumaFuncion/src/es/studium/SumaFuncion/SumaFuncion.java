package es.studium.SumaFuncion;

import java.util.Scanner;

public class SumaFuncion {

	public static void main(String[] args) {
		int numero1,numero2,resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero:");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro número:");
		numero2 = teclado.nextInt();
		teclado.close();
		resultado = suma(numero1,numero2);
		System.out.println("La suma de los dos numeros es: " + resultado);
		
		
	}

	public static int suma(int numero1, int numero2) {
		int resultado = numero1 + numero2;
		return resultado;
	}
}
