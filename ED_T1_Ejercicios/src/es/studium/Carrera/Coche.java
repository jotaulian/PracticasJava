package es.studium.Carrera;

public class Coche
{
private String fabricante;
private String modelo;
private int anioFabricacion;
private boolean esGasolina;

public Coche() {
	fabricante = "";
	modelo = "";
	anioFabricacion = 0;
	esGasolina = false;
}
public Coche(String f, String m,int aF,boolean g ) {
	this.fabricante = f;
	this.modelo = m;
	this.anioFabricacion = aF;
	this.esGasolina = g;
}

public String getFabricante() {
	return fabricante;
}
public void setFabricante(String f) {
	this.fabricante = f;
}
public String getModelo() {
	return modelo;
}
public void serModelo(String m) {
	this.modelo = m;
}
public int getAnioF() {
	return anioFabricacion;
}
public void setAnioF(int aF ) {
	this.anioFabricacion = aF;
}
public boolean getGasolina() {
	return esGasolina;
}
public void setGasolina(boolean g) {
	this.esGasolina = g;
}
}
