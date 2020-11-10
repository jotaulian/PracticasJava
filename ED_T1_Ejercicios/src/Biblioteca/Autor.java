package Biblioteca;

public class Autor
{
private String nombre;
private String apellido;
private String nacionalidad;

public Autor() {
	nombre = "";
	apellido = "";
	nacionalidad = "";
}
public Autor(String n, String a, String p) {
	this.nombre = n;
	this.apellido = a;
	this.nacionalidad = p;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String n) {
	this.nombre = n;
}

public String getApellido() {
	return apellido;
}
public void setApellido(String a) {
	this.apellido = a;
}
public String getNacionalidad() {
	return nacionalidad;
}
public void setNacionalidad(String p) {
	this.nacionalidad = p;
}
}
