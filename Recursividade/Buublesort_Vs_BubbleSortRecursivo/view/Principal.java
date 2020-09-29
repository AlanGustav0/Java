package view;

import controller.Metodos;

public class Principal {

	public static void main(String[] args) {

		// Instanciando a classe Metodos
		Metodos metodos = new Metodos();

		// Criando as listas
		int[] lista = new int[] { 1, 10, 3, 300, 8, 7, 4, 0, 0, -2 };
		int[] lista2 = new int[] { 1, 10, 3, 300, 8, 7, 4, 0, 0, -2 };

		int indiceX = 0;
		int indiceY = 0;
		int aux = 0;

		// --------INICIO DA ORDENAÇÃO RECURSIVA

		// Imprimindo a lista desoderdenada
		System.out.println("***Lista desordenada***");
		for (int valor : lista) {
			System.out.print(valor + " | ");
		}
		System.out.println("");

		// Inicializando a contagem do tempo
		double tempoIncial = System.nanoTime();
		metodos.bubbleSort(lista, indiceX, indiceY, aux);

		// Fim da contagem do tempo
		double temponFinal = System.nanoTime();

		// Aqui fazemos o cálculo do tempo e convertemos para segundos
		double tempoTotal = temponFinal - tempoIncial;
		tempoTotal = tempoTotal / Math.pow(10, 9);

		System.out.println("");

		// Imprimindo a lista oderdenada
		System.out.println("***Lista ordenada***");
		for (int valor : lista) {
			System.out.print(valor + " | ");
		}
		System.out.println("");
		System.out.println("Tempo total de ordenação recursivo: " + tempoTotal);
		// -----------------Fim de ordenação recursiva
		System.out.println("");

		// ----------INICIO DA ORDENAÇÃO ITERATIVA

		// Imprimindo a lista desoderdenada
		System.out.println("***Lista desordenada***");
		for (int valor : lista2) {
			System.out.print(valor + " | ");
		}
		System.out.println("");

		// Inicializando a contagem do tempo
		double tempoIncial2 = System.nanoTime();
		metodos.ordenaLista(lista2);

		// Fim da contagem de tempo
		double temponFinal2 = System.nanoTime();

		// Aqui fazemos o cálculo do tempo e convertemos para segundos
		double tempoTotal2 = temponFinal2 - tempoIncial2;
		tempoTotal2 = tempoTotal2 / Math.pow(10, 9);

		System.out.println("");

		// Imprimindo a lista oderdenada
		System.out.println("***Lista ordenada***");
		for (int valor : lista2) {
			System.out.print(valor + " | ");
		}
		System.out.println("");
		System.out.println("Tempo total de ordenação iterativo: " + tempoTotal2);
		// -----------Fim de ordenação iterativa

	}

}
