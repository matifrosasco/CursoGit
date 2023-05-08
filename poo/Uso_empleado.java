package poo;
import java.util.*;
public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado1=new Empleado("Matias Frosasco", 85000, 1990,12,17); //INSTANCIAR UNA CLASE
		Empleado empleado2=new Empleado("Josegina Frey", 95000, 1995,10,10);
		Empleado empleado3=new Empleado("Graciela Muchut", 105000, 1989,9,15);
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		System.out.println("Nombre: " + empleado1.dameNombre()+ " Sueldo: "+empleado1.dameSueldo()
		+ " Fecha de alta: "+ empleado1.dameFechaContrato());
		System.out.println("Nombre: " + empleado2.dameNombre()+ " Sueldo: "+empleado2.dameSueldo()
		+ " Fecha de alta: "+ empleado2.dameFechaContrato());
		System.out.println("Nombre: " + empleado3.dameNombre()+ " Sueldo: "+empleado3.dameSueldo()
		+ " Fecha de alta: "+ empleado3.dameFechaContrato());*/ //comentamos para simplificar este codigo
		
		Empleado[] misEmpleados=new Empleado[3];
		misEmpleados[0]=new Empleado("Matias Frosasco", 85000, 1990,12,17);
		misEmpleados[1]=new Empleado("Josefina Frey", 95000, 1995,10,10);
		misEmpleados[2]=new Empleado("Graciela Muchut", 105000, 1989,9,15);
		
		/*for(int i=0; i<3; i++) {
			misEmpleados[i].subeSueldo(5);
		}*/
		
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		
		for(int i=0; i<3; i++) {
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + misEmpleados[i].dameSueldo()
			+ " Fecha de alta: " + misEmpleados[i].dameFechaContrato());
		}		
 
	}
}

class Empleado{ //cuando usamos un solo fichero,Solo una de las clases debe ser publica y solo una con el metodo main
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
		altaContrato=calendario.getTime();
		
	}
	public String dameNombre() { //GETTER
		return nombre;
	}
	public double dameSueldo() { //GETTER
		return sueldo;
	}
	public Date dameFechaContrato() { //GETTER
		return altaContrato;
	}
	public void subeSueldo(double porcentaje) { //SETTER
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
	
}

