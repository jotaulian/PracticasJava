package es.studium.Carrera;

public class Piloto
{
private String nombre;
private String nacionalidad;

public Piloto() {
	nombre = "";
	nacionalidad = "";
}

public Piloto(String nombre, String pais) {
this.nombre = nombre;
this.nacionalidad = pais;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getNacionalidad() {
	return nacionalidad;
}
public void setNacionalidad(String pais) {
	this.nacionalidad = pais;
}

}
