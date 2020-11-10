package es.studium.orquesta;

public class Instrumento
{
private String nombre;
private String afinacion;

public Instrumento(){
	nombre = "";
	afinacion = "";
}
public Instrumento(String n, String a) {
	nombre = n;
	afinacion = a;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String n) {
	this.nombre = n;
	
}

public String getAfinacion() {
	return afinacion;
}
public void setAfinacion(String a) {
	afinacion = a;
}
}
