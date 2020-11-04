package es.studium.peliculas;

public class testPeliculas {
	public static void main (String[] args ) {
		Peliculas titanic = new Peliculas("titanic", 1998, 140);
		Peliculas miNoviaPoly = new Peliculas("Mi novia Poly", 2005, 120);
		Peliculas Batman = new Peliculas("Batman: El caballero de la noche", 2010, 200);
		Peliculas KingKong2 = new Peliculas("King Kong Part 2", 2003, 140);
		Peliculas Yazam = new Peliculas("Yazam!!", 2016,150);
		System.out.println(titanic.getYear());
		titanic.setYear(2005);
		System.out.println("Se cambio el año de estreno de la pelicula "+ titanic.getTitulo() + " a " + titanic.getYear());
		System.out.println(Batman.getTitulo());
		System.out.println(Yazam.getTitulo());
	}
}
