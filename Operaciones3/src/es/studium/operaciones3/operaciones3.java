package es.studium.operaciones3;

import java.util.Scanner;

public class operaciones3
{

	public static void main(String[] args)
	{
		int num1, num2, num3;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un n�mero:");
		num1 = teclado.nextInt();
		System.out.println("Dame otro n�mero:");
		num2 = teclado.nextInt();
		System.out.println("Dame otro n�mero:");
		num3 = teclado.nextInt();
		System.out.println("La suma de los n�meros es: " + suma(num1,num2,num3));
		System.out.println("El producto de los n�meros es: " + producto(num1,num2,num3));
		System.out.println("La media de los n�meros es: " + media(num1,num2,num3));
		teclado.close();

	}
	public static int suma(int num1, int num2, int num3) {
		return (num1 + num2 + num3);
	}
	public static int producto(int num1, int num2, int num3) {
		return (num1 * num2 * num3);
	}
	public static float media(int num1, int num2, int num3) {
		return ((float)(suma(num1,num2,num3))/(float)3);
	}
}
