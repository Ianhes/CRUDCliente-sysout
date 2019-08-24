package com.ianhes.crudCliente.modelo;

public class Cliente {

	private String nome;
	private String idade;
	private String CPF;
	private String sexo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Cliente " + nome + " | idade=" + idade + " | CPF=" + CPF + " | sexo=" + sexo;
	}
	
	
	
	
	
}
