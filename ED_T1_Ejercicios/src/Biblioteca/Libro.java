package Biblioteca;

public class Libro
{
	private String titulo;
	private Autor autor;
	private int year;
	private String editorial;
	private int nroPag;

	public Libro() {
		titulo = "";
		//		A continuacion debemos crear un objeto vacio. Para eso utilizamos el "constructor vacío" de la clase Autor:		
		autor = new Autor();
		year = 0;
		editorial = "";
		nroPag = 0;
	}
	public Libro(String t, Autor a, int y, String e, int n) {
		this.titulo = t;
		this.autor = a;
		this.year = y;
		this.editorial = e;
		this.nroPag = n;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String t){
		this.titulo = t;
	}

	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor a) {
		this.autor = a;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		this.year = y;
	}

	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String e) {
		this.editorial = e;}

	public int getNroPag() {
		return nroPag;
	}
	public void setNroPag(int n) {
		this.nroPag = n;
	}

}



