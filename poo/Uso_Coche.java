package poo;
import javax.swing.*;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coche micoche=new Coche(); // Esto es instanciar una clase - Ejemplar de clase
		
		micoche.establece_color(JOptionPane.showInputDialog("Introducel el color"));
		System.out.println(micoche.dime_datos_generales());
		System.out.println(micoche.dime_color());
		micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos?"));
		System.out.println(micoche.dime_asientos());
		micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
		System.out.println(micoche.dime_climatizador());
		System.out.println(micoche.dime_peso_coche());
		System.out.println("El precio del coche es " + micoche.precio_coche());
		
	}

}
