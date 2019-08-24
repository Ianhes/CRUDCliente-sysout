package com.ianhes.crudCliente.view;

public class ErrorView {
	
	
ComponentesView componente = new ComponentesView();
	
	public ErrorView() {
		
		System.out.println(componente.getLinhaApresentacao());
		System.err.println("OPÇÃO INVALIDA !!! RETORNANDO AO MENU... ");
	}

}
