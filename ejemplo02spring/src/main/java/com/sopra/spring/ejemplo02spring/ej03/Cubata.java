package com.sopra.spring.ejemplo02spring.ej03;

public class Cubata {
	private Licor licor;
	private Integer volumen;
	
	@Override
	public String toString() {
		return "Cubata de " + licor + " de volumen: " + volumen + " CL";
	}
	public Licor getLicor() {
		return licor;
	}
	public void setLicor(Licor licor) {
		this.licor = licor;
	}
	public Integer getVolumen() {
		return volumen;
	}
	public void setVolumen(Integer volumen) {
		this.volumen = volumen;
	}
	
	
}
