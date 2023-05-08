package poo;

public class Coche { //caracteristicas, propiedades comunes 
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color; //propiedades que pueden variar
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
public Coche() { //metodo constructor. Da un estado inicial a nuestro objeto. 
	ruedas=4;
	largo=2000;
	ancho=300;
	motor=1600;
	peso_plataforma=500;	
	}

public String dime_datos_generales() { //GETTER -  forma de acceder a las propiedade de los objetos a traves de sus metodos
	return "El largo del coche es: " + largo + "cm, la plataforma tiene " + ruedas + "ruedas"+", mide "+largo+"cm y tiene un ancho de "+ ancho ;
    }

public void establece_color(String color_coche) { //SETTER - modifica la propiedad
		color=color_coche;
    }
public String dime_color() { //GETTER que te devuelve el color
	return "El color del coche es " + color;
    }
public void configura_asientos(String asientos_cuero) {//SETTER
	
	if(asientos_cuero.equalsIgnoreCase("si")) {
		this.asientos_cuero=true;
	}else {
		this.asientos_cuero=false;
	      }
   }
public String dime_asientos(){ //GETTER
	if(asientos_cuero==true) {
		return "El coche tiene asientos de cuero";
	}else {
		return "El coche tiene asientos de serie";
	     }
    }  
public void configura_climatizador(String climatizador) {//SETTER
	if(climatizador.equalsIgnoreCase("si")) {
		this.climatizador=true;
	}else {
		this.climatizador=false;
	}
	
  }
public String dime_climatizador() {//GETTER
	if(climatizador==true) {
		return "El coche incorpora climatizador";
	}else {
		return "El coche no tiene climatizador";
	}
  }
public String dime_peso_coche() {//SETTER Y GETTER juntos
	int peso_carroceria=500;
	peso_total=peso_plataforma+peso_carroceria;
	if(asientos_cuero==true) {
		peso_total=peso_total+50;
	}
	if(climatizador==true) {
		peso_total=peso_total+20;
	}return "El peso del coche es de " +peso_total+ " kg";
	}
public int precio_coche() {//GETTER
	int precio_final=10000;
	if(asientos_cuero=true) {
		precio_final+=2000;
	}
	if(climatizador==true) {
		precio_final+=1500;
	}
	return precio_final;
}

}
