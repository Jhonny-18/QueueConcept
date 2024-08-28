package com.jhonny.conceito;

public class Main {

	public static void main(String[] args) {
	
		FilaCircular filaC = new FilaCircular(3);
		
		filaC.enfilerar(12);
		filaC.enfilerar(1);
		filaC.enfilerar(34);
		filaC.desenfilerar();
		filaC.enfilerar(13);
		System.out.println(filaC.verFrente());
	}

}
