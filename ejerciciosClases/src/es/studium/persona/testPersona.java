package es.studium.persona;

public class testPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		p1.setNombre("Maria");
		p1.setApellidos("Smith");
		p1.setEdad(16);
		p1.setHaPagado(false);
		System.out.println(p1.getNombre());
		System.out.println(p1.getApellidos());
		System.out.println(p1.getEdad());
		System.out.println(p1.getHaPagado());
		
		Persona p2 = new Persona("Lucía","Palomo",26,true);
		System.out.println(p2.getNombre());
		System.out.println(p2.getApellidos());
		System.out.println(p2.getEdad());
		System.out.println(p2.getHaPagado());
		
	}

}
