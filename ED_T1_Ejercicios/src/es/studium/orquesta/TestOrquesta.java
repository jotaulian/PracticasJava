package es.studium.orquesta;

public class TestOrquesta
{

	public static void main(String[] args)
	{
		Instrumento i1 = new Instrumento("Guitar", "C");
		Musico m1 = new Musico("Jimi Hendrix","M");
		
		System.out.println("Hello my name is " + m1.getNombre() + "and I play the " + i1.getNombre());
		
	}

}
