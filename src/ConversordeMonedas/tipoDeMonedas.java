package ConversordeMonedas;

public class tipoDeMonedas {
	private String nombre;
	private double valor;
	
	public tipoDeMonedas(String nombre, double valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	public String getNombre() {
		return nombre;
	}
	public double getValor() {
		return valor;
	}
	
	public double convertir(double valor) {
		
		return this.valor * valor;
	}
}
