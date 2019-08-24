package com.ianhes.crudCliente.view;

public class ApresentacaoView {
	
	ComponentesView componentes = new ComponentesView();
	
	public ApresentacaoView() {
		
		System.out.println(componentes.getLinhaApresentacao());
		System.out.println("BEM VINDO AO CRUD DE CLIENTES");
		System.out.println(componentes.getLinhaApresentacao());
		
		System.out.println(componentes.getEspaco());
		
		System.out.println(componentes.getLinhaComumMaior());
		System.out.println("ESCOLHA UMA OPÇÃO DO MENU ");
		
		
		

	}
	
	
}
