package es.studium.Meses;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		int mes;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el nro del mes buscado:");
		mes = teclado.nextInt();
		teclado.close();
		switch(mes){
		case 1:
			System.out.println("El mes equivalente al nro " + mes + " es Enero");
			break;
		case 2:
			System.out.println("El mes equivalente al nro " + mes + " es Febrero");
			break;
		case 3:
			System.out.println("El mes equivalente al nro " + mes + " es Marzo");
			break;
		case 4:
			System.out.println("El mes equivalente al nro " + mes + " es Abril");
			break;
		case 5:
			System.out.println("El mes equivalente al nro " + mes + " es Mayo");
			break;
		case 6:
			System.out.println("El mes equivalente al nro " + mes + " es Junio");
			break;
		case 7:
			System.out.println("El mes equivalente al nro " + mes + " es Julio");
			break;
		case 8:
			System.out.println("El mes equivalente al nro " + mes + " es Agosto");
			break;
		case 9:
			System.out.println("El mes equivalente al nro " + mes + " es Septiembre");
			break;
		case 10:
			System.out.println("El mes equivalente al nro " + mes + " es Octubre");
			break;
		case 11:
			System.out.println("El mes equivalente al nro " + mes + " es Noviembre");
			break;
		case 12:
			System.out.println("El mes equivalente al nro " + mes + " es Diciembre");
			break;
		default:
			System.out.println("El numero " + mes + " no pertenece a ningun mes");
		}

	}

}
