package es.studium.orquesta;

public class Musico
{
private String nombre;
private String sexo;

public Musico() {
	nombre = "";
	sexo = "";
}

public Musico(String n, String s) {
	nombre = n;
	sexo = s;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String n) {
	this.nombre = n;
}

public String getSexo() {
	return sexo;
}
public void setSexo(String s) {
	sexo = s;
}
}
