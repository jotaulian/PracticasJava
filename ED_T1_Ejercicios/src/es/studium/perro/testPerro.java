package es.studium.perro;

public class testPerro {
	public static void main(String[] args) {
		Perro p1 = new Perro("Pitbull",0.8,1,"Marron");
		Perro p2 = new Perro("Mastín",2,3,"Gris");
		Perro p3 = new Perro("Labradon",1.5,5,"vainilla");
		
		System.out.println(p1.getRaza());
		System.out.println(p2.getEdad());
		System.out.println(p3.getColor());
		p3.setColor("Blanco");
		System.out.println(p3.getColor());
	}
}
