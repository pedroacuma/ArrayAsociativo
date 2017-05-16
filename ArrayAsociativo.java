package prArrayAsociativo;

import java.util.NoSuchElementException;

public class ArrayAsociativo {
	//Clases internas
	private class Nodo{
		private String clave;
		private String valor;
		private Nodo sig; //siguiente nodo
		
		public Nodo(String c, String v, Nodo s){
			clave = c;
			valor = v;
			sig = s;
		}
	}
	
	//Variables de instancia
	private  Nodo primero;
	
	
	//Constructores
	public ArrayAsociativo(){
		primero = null;
	}
	
	public ArrayAsociativo(String[] claves, String[] valores){
		this();
		if (claves.length > 0){
			primero = new Nodo(claves[0], valores[0],null);
			for (int i = 1; i< claves.length; i++){
				Nodo nuevo = new Nodo(claves[i], valores[i],primero);
				primero = nuevo;
			}
		}
	}
	
	//Métodos de instancia
	
	public int size(){
		int size = 0;
		Nodo current = primero;
		while(current != null){
			size++;
			current = current.sig;
		}
		return size;
	}
	
	public String get(String clave){
		Nodo current = primero;

		while(current != null && !clave.equals(current.clave)){
			current = current.sig;
		}
		if(current == null){
			throw new NoSuchElementException();
		}
		return current.valor;	
	}
	
	
	public void put(String clave,String valor){
		Nodo current = primero;

		while(current != null && !clave.equals(current.clave)){
			current = current.sig;
		}
		if(current != null){
			current.valor = valor;
		} else{
			Nodo n = new Nodo(clave,valor,primero);
			primero = n;
		}
	}
	
	
	
	
}
