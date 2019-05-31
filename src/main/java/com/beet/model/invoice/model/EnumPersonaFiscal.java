package com.beet.model.invoice.model;

public enum EnumPersonaFiscal {
	FISICA(1),
	MORAL(2),
	GENERICA(3),
	EXTRANGERO(4);
	
	private int valor;
	
	EnumPersonaFiscal(int valor){
		this.valor = valor;
	}
	
	public int getValue(){
		return this.valor;
	}
	
}
