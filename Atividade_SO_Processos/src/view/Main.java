package view;

import java.util.Scanner;

import controller.RedesController;

public class Main {

	public static void main(String[] args){

		// Instancia de classe Scanner
		Scanner sc = new Scanner(System.in);

		// Instancia da classe REdesController
		RedesController redes = new RedesController();

		int opc = 0;
		String sO;

		// Início de laço de repetição com switch case, alternativas para o usuário.
		while (opc != 9) {

			System.out.println(
					"Escolha a opção desejada: \n 1 - Configurações do Sistema Operacional \n 2 - Média de PING" + "\n"
							+ "3 - Finalizar Programa");
			opc = sc.nextInt();

			switch (opc) {

			case 1:
				sc.nextLine();
				System.out.print("Por favor, insira o nome do Sistema Operacional: ");
				sO = sc.nextLine();
				System.out.println(redes.ip(sO));
				break;

			case 2:
				sc.nextLine();
				System.out.print("Por favor, insira o nome do Sistema Operacional: ");
				sO = sc.nextLine();
				redes.ping(sO);
				break;

			case 3:

				System.out.println("Processo Finalizado. Até logo! ");
				opc = sc.nextInt();
				break;

			default:
				System.out.println("Opção Inválida!");
				break;

			}

		}

		sc.close();

	}

}
