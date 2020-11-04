package es.studium.persona;


	public class Persona {
		  /* Atributos */
		  private String nombre;
		  private String apellidos;
		  private int edad;
		  private boolean haPagado;
		 
		  /* Constructor por defecto */
		  public Persona () {
			  nombre = "";
			  apellidos = "";
			  edad = 0;
			  haPagado = false;
		  }
		 
		  /* Constructor con parámetros */
		  public Persona (String n, String a, int e, boolean h) {
		  	nombre = n;
			  apellidos = a;
			  edad = e;
			  haPagado = h;
		  }
		 
		  /* Métodos */
		  public String getNombre() {
			  return nombre;
		  }
		 
		  public void setNombre(String n) {
			  nombre = n;
		  }
		 
		  public String getApellidos() {
			  return apellidos;
		  }
		 
		  public void setApellidos(String a) {
			  apellidos = a;
		  }
		 
		  public int getEdad() {
			  return edad;
		  }
		 
		  public void setEdad(int e) {
			  edad = e;
		  }
		 
		  public boolean getHaPagado() {
			  return haPagado;
		  }
		 
		  public void setHaPagado(boolean h) {
			  haPagado = h;
		  }
		}
