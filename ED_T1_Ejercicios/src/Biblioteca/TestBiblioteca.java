package Biblioteca;

public class TestBiblioteca
{

	public static void main(String[] args)
	{
		Libro l1 = new Libro("Six Hats", new Autor("Pedro","Ramos","Chile"), 1993, "La corniza", 428);
		Libro l2 = new Libro("El Alquimista",new Autor("Pablo", "Coelo","Brasil"),1998, "Tempos du Cambio", 336 );
		Libro l3 = new Libro();
		l3.setTitulo("Harry Potter");
		l3.setAutor(new Autor("J.K","Rowling","UK"));
		l3.setYear(2001);
		l3.setEditorial("Salamandra");
		l3.setNroPag(496);
		
		System.out.println(l1.getTitulo() + " tiene " + l1.getNroPag() + " páginas.");
		System.out.println(l2.getTitulo() + " tiene " + l2.getNroPag() + " páginas.");
		System.out.println(l3.getTitulo() + " tiene " + l3.getNroPag() + " páginas.");
	}
}
