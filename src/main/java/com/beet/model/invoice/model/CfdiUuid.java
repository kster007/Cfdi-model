package com.beet.model.invoice.model;

import com.beet.model.invoice.exception.ValidacionExcepcion;

public class CfdiUuid extends ValueObjectBase implements ValueObject<CfdiUuid> {
	
	private static final long serialVersionUID = 4762713941809641760L;
	private final static String EXP = "^([a-f0-9A-F]){8}-([a-f0-9A-F]){4}-([a-f0-9A-F]){4}-([a-f0-9A-F]){4}-([a-f0-9A-F]){12}$";
	
	public CfdiUuid(){
		
	}
	
	public CfdiUuid(String valor) {
		this.setValor(valor);
	}
	@Override
	public void setValor(String valor){
		try{
			super.setValor(valor);
		}catch(ValidacionExcepcion e){
			throw new ValidacionExcepcion("Error de formato para el campo UUID v:" + valor, e);
		}
	}
	
	@Override
	public boolean sameValueAs(CfdiUuid other) {

		return super.equals(other);
	}

	@Override
	public String getPattern() {
		// TODO Auto-generated method stub
		return EXP;
	}

}
