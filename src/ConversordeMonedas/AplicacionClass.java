package ConversordeMonedas;

import GUI.Menu;
import GUI.Monedas;

public class AplicacionClass {
	
	public AplicacionClass() {
		presentarVentana();
	}
	
	
	
	public void presentarVentana(){
		/*Monedas miVentana = new Monedas();*/
		Menu miVentana= new Menu();
		miVentana.setVisible(true);
	}
}

