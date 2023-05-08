package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1=new Empleados("Matias");
		Empleados trabajador2=new Empleados("Josefina");
		trabajador1.cambiaSeccion("RRHH");
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());	

	}

}

class Empleados{
	public Empleados(String nom) {
		nombre=nom;
		seccion="Administracion";
	}
	public void cambiaSeccion(String seccion) { //setter
		this.seccion=seccion;
	}
	
	public String devuelveDatos() { //getter
		return "El nombre es: " + nombre + " y la seccion es: " + seccion;
	}
	private final String nombre;
	private String seccion;
	
}
