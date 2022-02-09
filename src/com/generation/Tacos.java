package com.generation;

public class Tacos {
	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	private String tamanioDeTortilla;
	
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}

	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}

	public String getTipoDeGuisado() {
		return tipoDeGuisado;
	}

	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}

	public int getNumeroDeTortilla() {
		
		return numeroDeTortilla;
	}

	public void setNumeroDeTortilla(int numeroDeTortilla) {
		if(numeroDeTortilla >=0 && numeroDeTortilla<4) {
			this.numeroDeTortilla=numeroDeTortilla;
		}
		else {
			throw new IllegalArgumentException("El numero de tortillas es demasiado karnal, mejor pide otro taquito");
		}
		//this.numeroDeTortilla = numeroDeTortilla;
	}

	public String getTamanioDeTortilla() {
		return tamanioDeTortilla;
	}

	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	float precio=0.0f;
	
	void preparar() {
		System.out.println("perarando tu taco");
	}
	
	void ponerSalsa(){
		System.out.println("Salsita time");

		}

		void subirPrecio(float aumento){
		precio=precio+aumento;
		}
		
		public Tacos() {
			
		}

		public Tacos(String tipoDeTortilla) {
			this.tipoDeTortilla = tipoDeTortilla;
			
		}
		public Tacos(String tipoDeTortilla, String tipoDeGuisado, int numeroDeTortilla, String tamanioDeTortilla,
				float precio) {
			super();
			this.tipoDeTortilla = tipoDeTortilla;
			this.tipoDeGuisado = tipoDeGuisado;
			this.numeroDeTortilla = numeroDeTortilla;
			this.tamanioDeTortilla = tamanioDeTortilla;
			this.precio = precio;
		}
		
		

}
