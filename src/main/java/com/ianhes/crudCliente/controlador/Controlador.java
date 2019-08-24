package com.ianhes.crudCliente.controlador;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.ianhes.crudCliente.baseDados.Base;
import com.ianhes.crudCliente.modelo.Cliente;
import com.ianhes.crudCliente.view.ApresentacaoView;
import com.ianhes.crudCliente.view.DeleteView;
import com.ianhes.crudCliente.view.ErrorView;
import com.ianhes.crudCliente.view.EscolhaView;
import com.ianhes.crudCliente.view.ExitView;
import com.ianhes.crudCliente.view.InserirView;
import com.ianhes.crudCliente.view.ListaView;
import com.ianhes.crudCliente.view.MenuView;

public class Controlador {

	
	static Base base = new Base();
	static Scanner sc = new Scanner(System.in);
	static String opcaoMenu = null;
	static Cliente cliente = null;
	static String cpfCliente = null;


	public static void main(String[] args) throws Exception{
		
		
		
		apresentarMenu();
		
		if(opcaoMenu.equalsIgnoreCase("exit")) {
			new ExitView();
			sc.close();
		}
		

		while (!opcaoMenu.equalsIgnoreCase("exit")) {
			switch (opcaoMenu.toLowerCase()) {
			case "inserir":

				limparTela();
				
				
				cliente = new Cliente();
				
				new InserirView();
				System.out.println("Nome: ");
				cliente.setNome(sc.nextLine());
				System.out.println("CPF: ");
				cliente.setCPF(sc.nextLine());
				System.out.println("Idade: ");
				cliente.setIdade(sc.nextLine());
				System.out.println("Sexo: ");
				cliente.setSexo(sc.nextLine());
				
				base.adicionar(cliente);
				System.out.println("Cliente gravado com sucesso !!");
				System.out.println("\n" + "Indo para lista de clientes...");
				Thread.sleep(3000);
				
				limparTela();
				
				new ListaView();
				
				listarObjetos();
				
				new EscolhaView();

				opcaoMenu = sc.nextLine();
				break;

			case "listar":

				if (base.listar().size() == 0) {
					System.out.println(
							"Ainda não existe clientes cadastrados. Por favor, aguarde para retornar ao menu...");
					Thread.sleep(3000);
					
					limparTela();
					
					apresentarMenu();
					break;
				}

				limparTela();
				
				new ListaView();
				
				listarObjetos();
				
				new EscolhaView();

				opcaoMenu = sc.nextLine();
				break;

			case "menu":
				
				limparTela();
				
				apresentarMenu();
				break;
			
			case "deletar":
				
				limparTela();
				
				new DeleteView();
				cpfCliente = sc.nextLine();
				
				cliente = encontrarCliente( base.listar(), cpfCliente);
				
				if(cliente == null) {
					
					System.out.println("Cliente não encontrado. Por favor, aguarde para retornar ao menu...");
					Thread.sleep(3000);
					
					limparTela();
			
					apresentarMenu();
					break;
					//Controlador.main(args);
				}
				
				
				base.deletar(cliente);
				
				System.out.println("Cliente deletado com sucesso !!");
				System.out.println("\n" + "Voltando ao menu...");
				Thread.sleep(3000);
				
				limparTela();
				
				apresentarMenu();
				
				break;
			default:
				
				new ErrorView();
				Thread.sleep(3000);
				
				limparTela();
				
				apresentarMenu();
			}
			
			if (opcaoMenu.equalsIgnoreCase("exit")) {
				new ExitView();
				sc.close();
			}

		}
	}
	
	
	public static void limparTela() throws InterruptedException, IOException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}
	
	
	public static void apresentarMenu() {
		new ApresentacaoView();
		new MenuView();
		opcaoMenu = sc.nextLine();
	}
	
	
	public static void listarObjetos() {
		
		List<Object> l = base.listar();
		
		for (Object o : l) {
			
			System.out.println(o);
		}
		
	}
	
	public static Cliente encontrarCliente(List<Object> objetos, String cpf) {
		
		Cliente cliente = new Cliente();
		
		for(int i = 0; i < objetos.size(); i++) {
			
			cliente = (Cliente) objetos.get(i);
			
			if(cliente.getCPF().equalsIgnoreCase(cpf)) {
				
				return cliente;
			}
			
		}
		return null;
	}
}
