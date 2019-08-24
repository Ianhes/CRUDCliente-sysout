package com.ianhes.crudCliente.view;

public class ListaView {

	ComponentesView componente = new ComponentesView();
	
	public ListaView() {
		
		System.out.println(componente.getLinhaApresentacao());
		System.out.println("LISTA DE CLIENTES ");
		System.out.println(componente.getLinhaApresentacao());
		System.out.println(componente.getEspaco());
		System.out.println(componente.getLinhaComumMaior());
		
		
	}
	
}
