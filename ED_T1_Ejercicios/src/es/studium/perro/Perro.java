package es.studium.perro;

public class Perro {

	private String raza;
	private double tamano;
	private int edad;
	private String color;
	
	public Perro() {
		raza = "";
		tamano = 0.0;
		edad = 0;
		color = "";
	}
	public Perro(String r, double t, int e, String c) {
		raza = r;
		tamano = t;
		edad = e;
		color = c;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String r) {
		raza = r;
	}
	public double getTamano() {
		return tamano;
	}
	public void setTamano(double t) {
		tamano = t;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int e) {
		edad = e;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		color = c;
	}
}
