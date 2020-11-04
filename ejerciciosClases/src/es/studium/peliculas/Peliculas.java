package es.studium.peliculas;

public class Peliculas {
	
	private String titulo;
	private int year;
	private int duracion;
	
	public Peliculas() {
		titulo = "";
		year = 0;
		duracion = 0;
	} 
	public Peliculas(String t, int y, int d) {
		titulo = t;
		year = y;
		duracion = d;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String t) {
		titulo = t;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		year = y;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int d) {
		duracion = d;
	}
}
