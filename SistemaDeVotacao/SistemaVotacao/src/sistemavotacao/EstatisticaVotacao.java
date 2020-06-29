package sistemavotacao;

import javax.swing.JOptionPane;
import java.io.IOException;

//***********************************CLASSE ESTATISTICAVOTACAO**********************************

public class EstatisticaVotacao {
    
    //***********************************
    //MÉTODO PROCEDIMENTO PARA MOSTRAR NÚMERO DE ELEITORES POR SEÇÃO
    //***********************************

    public void ELEITORESPORSECAO(Votacao[] votacao) {
        int qtd_secao;
        int secao;
        String eleitores_secao = "";
        for (secao = 0; secao <= 10; secao++) {
            qtd_secao = 0;
            for (int eleitores = 0; eleitores < 100; eleitores++) {
                if (votacao[eleitores].numeroSecao == secao) {
                    qtd_secao += 1;
                }
            }
            eleitores_secao += "Nº da seção: " + secao + "\t\t Total de eleitores: " + qtd_secao + "\n";
        }
        JOptionPane.showMessageDialog(null, eleitores_secao);
    }
    
    //***********************************
    //MÉTODO PROCEDIMENTO PARA MOSTRAR MAIS VOTADO E MENOS VOTADO
    //***********************************

    public void MAIORMENORSECAO(Votacao[] votacao) {
        int maior = -1;
        int menor = 101;
        int secao;
        int qtd_secao;
        int maior_secao = 0;
        int menor_secao = 0;

        for (secao = 0; secao < 10; secao++) {
            qtd_secao = 0;
            for (int eleitores = 0; eleitores < 100; eleitores++) {
                if (votacao[eleitores].numeroSecao == secao) {
                    qtd_secao += 1;
                }
            }
            if (qtd_secao > maior) {
                maior = qtd_secao;
                maior_secao = secao;
            } else if (qtd_secao < menor) {
                menor = qtd_secao;
                menor_secao = secao;
            }
        }
        JOptionPane.showMessageDialog(null, "Seção com maior votos nº de votos: " + maior_secao + "\n" + "Eleitores: " + maior);
        JOptionPane.showMessageDialog(null, "Seção com menor votos nº de votos: " + menor_secao + "\n" + "Eleitores: " + menor);
    }
    
    //***********************************
    //MÉTODO PROCEDIMENTO PARA MOSTRAR OS VOTOS POR CANDIDATO
    //***********************************

    public void VOTOSPORCANDIDATO(Votacao[] votacao) {

        int qtd_votos;
        int candidato;
        int contador = 0;
        int eleitores;
        String votos_candidato = "";
        String votos[] = new String[100];
        String matriz_votos[][] = new String[20][5];
        String mostra_matriz = " ";

        //Carregando informações em vetor
        while (contador < 100) {
            for (candidato = 0; candidato <= 300; candidato++) {
                qtd_votos = 0;

                for (eleitores = 0; eleitores < 100; eleitores++) {
                    if (votacao[eleitores].numeroCandidato == candidato) {
                        qtd_votos += 1;
                        votos_candidato = "Nº Candidato: " + candidato + " - Total de votos: " + qtd_votos;
                        votos[contador] = votos_candidato;
                        contador++;

                    }

                }
            }
        }

        contador = 0;

        //Passando as informações do vetor para matriz
        while (contador < 100) {
            for (int x = 0; x < 20; x++) {
                for (int y = 0; y < 5; y++) {
                    matriz_votos[x][y] = votos[contador];
                    contador++;
                }
            }
        }
        //Mosntando a matriz para ser mostrada para o usuário
        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 5; y++) {
                mostra_matriz += matriz_votos[x][y] + "  |  ";
            }
            mostra_matriz += "\n\n";

        }
        JOptionPane.showMessageDialog(null, mostra_matriz);
    }
    
    //***********************************
    //MÉTODO PROCEDIMENTO PARA MOSTRAR OS MAIS VOTADOS
    //***********************************

    public void MAISVOTADOS(Votacao[] votacao) {
        int candidato_votos[][] = new int[301][2];
        int eleitores;
        for (eleitores = 0; eleitores < 100; eleitores++) {
            candidato_votos[votacao[eleitores].numeroCandidato][1] += 1;
            candidato_votos[votacao[eleitores].numeroCandidato][0] = votacao[eleitores].numeroCandidato;
        }
        
        // Bubble Sort
        int aux_candidato;
        int aux_votos;
        for (int i = 0; i < 300; i++) {
            for (int j = i + 1; j < 301; j++) {
                if (candidato_votos[i][1] > candidato_votos[j][1]) {
                    aux_candidato = candidato_votos[i][0];
                    aux_votos = candidato_votos[i][1];

                    candidato_votos[i][0] = candidato_votos[j][0];
                    candidato_votos[i][1] = candidato_votos[j][1];

                    candidato_votos[j][0] = aux_candidato;
                    candidato_votos[j][1] = aux_votos;
                }
            }
        }
        // Organizando a mensagem a ser exibida
        String top10 = "TOP 10\n" + "Candidato" + "        " + "Votos \n";
        for (int i = 300; i > 290; i = i - 1) {
            top10 += String.format("%5d %20d", candidato_votos[i][0], candidato_votos[i][1]);
            top10 += "\n";
        }

        JOptionPane.showMessageDialog(null, top10);
    }

}
