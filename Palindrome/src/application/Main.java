package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the phrase: ");
		String originalPhrase = sc.next();
		
		//Utilizamos o Stringbuffer e passamos a frase por par�metro
		StringBuffer str = new StringBuffer(originalPhrase);

		//Imprimindo a frase original
		System.out.println("Your phrase is: " + originalPhrase);
		System.out.println();

		//Utilizando o recurso reverse para inverter a frase original
		String phraseReverse = str.reverse().toString();

		//imprimindo a frase invertida
		System.out.println("The inverted phrase is: " + phraseReverse);
		System.out.println();

		//Vari�vel para compara��o
		String newPhrase = "";
		
		//Aqui criamos um array para armazanar cada letra da palavra em um �ndice expec�fico
		String[] vectB = phraseReverse.split("");

		//Aqui percorremos o vetor e montamos a palavra de tr�z para frente
		for (int j = 0; j < vectB.length; j++) {
			newPhrase += vectB[j];
		}

		//Aqui verificamos se a nova frase � igual a frase original, se for, � uma frase palindroma.
		if (originalPhrase.equals(newPhrase)) {
			System.out.print("Pharase " + originalPhrase + " is palindrome.");
		} else {
			System.out.print("Pharase " + originalPhrase + " isn't palindrome");
		}

		sc.close();

	}

}
