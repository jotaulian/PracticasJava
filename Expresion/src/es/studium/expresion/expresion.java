package es.studium.expresion;

import java.util.Scanner;

public class expresion {

	public static void main(String[] args) {
		int a,b,c;
		float result;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el número equivalente a la letra a:");
		a = teclado.nextInt();
		System.out.println("Dame el número equivalente a la letra b:");
		b = teclado.nextInt();
		System.out.println("Dame el número equivalente a la letra c:");
		c = teclado.nextInt();
		teclado.close();
		result = expresion(a,b,c);
		System.out.println("El resultado es" + result);
	}

	public static float expresion(int a, int b, int c) {
		return (((float)b*(float)b)-(4*(float)a*(float)c))/(2*(float)a);
	}

}
