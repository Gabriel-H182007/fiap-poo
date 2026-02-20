package br.com.fiapride.main;

import br.com.fiapride.model.Smartwatch;

public class SistemaPrincipal {

	public static void main(String[] args) {
		Smartwatch meusmartwatch = new Smartwatch();
		meusmartwatch.marca = "Technos";
		meusmartwatch.cor = "Cinza";
		meusmartwatch.tamanho = 44;
 
		Smartwatch smartwatch2 = new Smartwatch();
		smartwatch2.marca = "Apple";
		smartwatch2.cor = "Branco";
		smartwatch2.tamanho = 44;
 
		System.out.println("Meu Smartwatch é da cor: " + meusmartwatch.cor + " | Marca: " + meusmartwatch.marca
				+ " | Tamanho: " + meusmartwatch.tamanho);
		System.out.println("O Smartwatch2 é da cor: " + smartwatch2.cor + " | Marca: " + smartwatch2.marca
				+ " | Tamanho: " + smartwatch2.tamanho);
		
	}

}
