package es.studium.Carrera;

public class TestCarrera
{

	public static void main(String[] args)
	{
		Coche c1 = new Coche("Kia", "Rio",2008, true);
		Coche c2 = new Coche("Ford", "Focus",2015, true);
		Piloto p1 = new Piloto("Fernando Alonso","España");
		Piloto p2 = new Piloto("Juan Manuel Fangio", "Argentina");
		System.out.println("Hola, me llamo " + p1.getNombre());
		System.out.println("Hola, me llamo " + p2.getNombre());
	}

}
