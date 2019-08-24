package com.ianhes.crudCliente.baseDados;

import java.util.ArrayList;
import java.util.List;

public class Base {
	
	private List<Object> base = new ArrayList<Object>();
	
	public void adicionar(Object data) {
		
		try {
			base.add(data);
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
	
	public List<Object> listar(){
		
		return base;
	}
	
	public void deletar(Object o) {
		
		try {
			base.remove(o);
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}
}
