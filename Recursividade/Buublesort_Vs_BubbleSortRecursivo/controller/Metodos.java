package controller;

public class Metodos {

	// Construtor Padrão da Classe
	public Metodos() {

	}

	// -----------Inicio BubbleSort Recursivo----------------------------->>
	public int[] bubbleSort(int[] lista, int indiceX, int indiceY, int aux) {

		/*
		 * Aqui recebemos 2 indices, que serão nossos pontos de parada, o primeiro
		 * indice será a repetição da lista, de acordo com a quantidade de indices da
		 * lista.
		 * 
		 * O segundo indice será o que fará a verificação e irá percorrer a lsita
		 * fazendo as comparações. Cada vez que o "indiceX" é incrementado, zeramos o
		 * indiceY, para que ele sempre faça a nálise do inicio da lista.
		 * 
		 * Este primeiro método trabalha com recursividade indireta, pois faz a chamada
		 * de outr método, depende desse outro método para fazer a verificação índice a
		 * indice.
		 */

		if (indiceX == lista.length) {
			return lista;
		} else {
			indiceY = 0;
			indiceX++;

			return bubbleSortIndices(lista, indiceX, indiceY, aux);

		}
	}

	public int[] bubbleSortIndices(int[] lista, int indiceX, int indiceY, int aux) {

		/*
		 * Este segundo método recursivo é responsável por fazer a verificação indice
		 * por indice como ele faz a chamada dele mesmo, a recursividade aqui é direta,
		 * e quando a condição é alcançada o retorno é para o outro método recursivo.
		 */

		if (indiceY == lista.length - 1) {
			return bubbleSort(lista, indiceX, indiceY, aux);
		}

		// Caso a condição seja verdadeira, fazemos a troca de posição do elementos.
		if (lista[indiceY] > lista[indiceY + 1]) {
			aux = lista[indiceY];
			lista[indiceY] = lista[indiceY + 1];
			lista[indiceY + 1] = aux;
		}

		// No retorno da chamada, incrementamos 1 no indiceY, para que possamos verifica
		// o indice seguinte.
		return bubbleSortIndices(lista, indiceX, indiceY + 1, aux);

	}

	// ----------------------------------Fim do
	// Bubblesort---------------------------.

	// ----------Bubblesort Utilizando laço de repetição
	public int[] ordenaLista(int[] lista2) {

		/*
		 * Aqui utilizamos o Bubblesort tradicional, de maneira iterativa e utilizando 2
		 * laços for.
		 */
		int tamanho = lista2.length;
		int auxiliar;

		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho - 1; j++) {
				if (lista2[j] > lista2[j + 1]) {
					auxiliar = lista2[j];
					lista2[j] = lista2[j + 1];
					lista2[j + 1] = auxiliar;
				}
			}
		}

		return lista2;

	}

}
