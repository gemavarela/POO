package com.gatitos;

public class Gato {
	
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) { //no regresan ningun valor, VOID
		this.nombre=nombre;
	}
	
	public int getPatas() {
		return this.patas;
		
	}
	
	public void setPatas(int Patas) {
		if(patas >=0 && patas<5) {
			this.patas=patas;
		}else {
			throw new IllegalArgumentException("El numero de patas es inválido");
		}
		//this.patas=patas;
	}
	
	public boolean isAdoptado() {
		return this.adoptado;
	}
	
	public boolean setAdoptado(int patas) {
		return this.adoptado;
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + "]";
	}
	
	

}
