package com.jhonny.conceito;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	private Queue<Integer> fila;
	
	
	public Fila(){
		fila = new LinkedList<Integer>();
	}
	
	
	
	public void enfilerar(Integer elemento) {
		fila.add(elemento);
		System.out.println("Elemento adicionado com sucesso");
	}
	
	public int desenfileirar() {
		if(!fila.isEmpty()) {
			int elementoRemovido = fila.poll();
			System.out.println("Foi desenfileirado");
			return elementoRemovido;
		}else {
			System.out.println("A fila está vazia");
			return 0;
		}
	}
	
	
	public int verProximo() {
		if(!fila.isEmpty()) {
			return fila.peek();
		}else {
			System.out.println("A fila está vazia");
			return 0;
		}
	}
	
	
	public boolean estaVazia() {
		return fila.isEmpty();
	}
	
	
	public void exibirFila() {
		System.out.println("Fila atual: " + fila);
	}
	
	
	
	
	
}
