package es.studium.Recorrer;

public class Recorrer
{

	public static void main(String[] args)
	{
		String cadena = "ABCDEFGHIJKLMN�OPQRSTUVWXYZ";
		for(int i=0;i<cadena.length(); i++) {			
			System.out.println(cadena.charAt(i));
		}
		
	}

}
