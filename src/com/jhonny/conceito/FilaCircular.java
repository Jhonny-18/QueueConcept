package com.jhonny.conceito;

public class FilaCircular {
	private int[] fila;
	private int tamanho;
	private int front, rear;
	
	public FilaCircular(int tamanho) {
		this.tamanho = tamanho + 1;
		this.fila = new int[this.tamanho];
		this.front = 0;
		this.rear = 0;
	}
	
	
	public void enfilerar(int elemento) {
		if(estaCheia()) {
			System.out.println("Fila cheia.");
			return;
		}
		fila[rear] = elemento;
		rear = (rear + 1) % tamanho;
	}
	
	
	public int desenfilerar() {
		if(estaVazia()) {
			System.out.println("Fila vazia");
			return -1;
		}
		int elementoRemovido = fila[front];
		front = (front + 1) % tamanho;
		return elementoRemovido;
	}
	
	public boolean estaCheia() {
        return (rear + 1) % tamanho == front;
    }
	
	public boolean estaVazia() {
        return rear == front;
    }
	
	public int verFrente() {
		if(estaVazia()) {
			System.out.println("Fila vazia");
			return -1;
		}
		return fila[front];
	}
	
	
}
