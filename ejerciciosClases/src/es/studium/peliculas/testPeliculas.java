package es.studium.peliculas;

public class testPeliculas {
	public static void main (String[] args ) {
		Peliculas titanic = new Peliculas("titanic", 1998, 140);
		System.out.println(titanic.getYear());
		titanic.setYear(2005);
		System.out.println(titanic.getYear());
	}
}
