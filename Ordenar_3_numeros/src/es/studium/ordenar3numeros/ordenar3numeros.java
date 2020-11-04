package es.studium.ordenar3numeros;

import java.util.Scanner;

public class ordenar3numeros {
	public static void main(String[] args) {
		int a,b,c;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un número:");
		a = teclado.nextInt();
		System.out.println("Dame otro número:");
		b = teclado.nextInt();
		System.out.println("Dame otro número:");
		c = teclado.nextInt();
		teclado.close();
		if((a>=b) && (b>=c)) {
			System.out.println("Los numeros ordenados de mayor a menor son: " + a+", " + b+", " + c);
		}
		else if((a>=c) && (c>=b)) {
			System.out.println("Los numeros ordenados de mayor a menor son: " + a +", " + c +", " + b);
		}
		else if((b>=a) && (a>=c)) {
			System.out.println("Los numeros ordenados de mayor a menor son: " + b+", " + a+", " + c);
		}
		else if(b>=c && c>=a) {
			System.out.println("Los numeros ordenados de mayor a menor son: " + b+", " + c+", " + a);
		}
		else if(c>=a && a>=b) {
			System.out.println("Los numeros ordenados de mayor a menor son: " + c+", " + a+", " + b);
		}
		else{
			System.out.println("Los numeros ordenados de mayor a menor son: " + c+", " + b+", " + a + "jeje");
		}
	}

}
