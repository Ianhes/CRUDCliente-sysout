package com.ianhes.crudCliente.view;

public class MenuView {

	ComponentesView componentes = new ComponentesView();
	
	public MenuView() {
		
		System.out.println(componentes.getLinhaComumMenor());
		System.out.println("--> " + "Listar");
		System.out.println("--> " + "Inserir");
		System.out.println("--> " + "Deletar");
		System.out.println("--> " + "Alterar (NÃO IMPLEMENTADO)");
		System.out.println("--> " + "Exit");
		System.out.println(componentes.getLinhaComumMenor());
		
		
	}
}
