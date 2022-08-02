package com.exemplo.polimorfismo;

public class Zoologico {

	public static void main(String[] args) {
		// instanciando as classes
		Animal animalzinho = new Animal(); //referencia do obj da classe-pai
		animalzinho.comer(); //acesso ao metodo comer da classe-pai
		
		Zebra zebrinha = new Zebra(); //referencia do obj da subclasse zebra
		zebrinha.comer(); //acesso ao metodo comer() da classe derivada zebra()
		
		Leao leozinho = new Leao(); //referencia do obj da subclasse leao
		leozinho.comer(); //acesso ao metodo comer da subclasse leao()
		
	}

}
