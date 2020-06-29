package sistemavotacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.io.IOException;

//***********************************CLASSE MÉTODOS**********************************

public class VotacaoMetodos {
    //***********************************
    //MÉTODO FUNÇÃO CADASTRAR VOTAÇÃO DE CANDIDATO
    //***********************************
    public Votacao[] FCADASTRAVOTACAO(Votacao[] votacao) throws IOException {

        int i;

        for (i = 0; i < 100; i++) {
            votacao[i] = new Votacao();
        }

        for (i = 0; i < 100; i++) {

            votacao[i].numeroSecao = (int) (Math.random() * 11);
            votacao[i].numeroCandidato = (int) (Math.random() * 301);
        }

        return votacao;
    }
    
    //***********************************
    //MÉTODO FUNÇÃO PARA CLASSIFICAR CANDIDATOS
    //***********************************

    public Votacao[] FCLASSIFICASECAO(Votacao[] votacao) {

        Votacao aux = new Votacao();

        for (int i = 0; i < 99; i++) {
            for (int j = i + 1; j < 100; j++) {
                if (votacao[i].numeroSecao > votacao[j].numeroSecao) {
                    aux.numeroCandidato = votacao[i].numeroCandidato;
                    aux.numeroSecao = votacao[i].numeroSecao;

                    votacao[i].numeroCandidato = votacao[j].numeroCandidato;
                    votacao[i].numeroSecao = votacao[j].numeroSecao;

                    votacao[j].numeroCandidato = aux.numeroCandidato;
                    votacao[j].numeroSecao = aux.numeroSecao;
                }
            }
        }

        return votacao;
    }
    
    //***********************************
    //MÉTODO FUNÇÃO PARA GRAVAR DADOS EM ARQUIVO TXT
    //***********************************

    public Votacao[] FGRAVAVOTACAO(Votacao[] votacao) throws IOException {

        int i;

        String nomeArquivo = "Votacao2016.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo));

        for (i = 0; i < 100; i++) {
            votacao[i].numeroSecao = votacao[i].numeroSecao;
            writer.write(Integer.toString(votacao[i].numeroSecao));
            writer.newLine();
            votacao[i].numeroCandidato = votacao[i].numeroCandidato;
            writer.write(Integer.toString(votacao[i].numeroCandidato));
            writer.newLine();
        }

        writer.close();

        return votacao;
    }
    
    //***********************************
    //MÉTODO PROCEDIMENTO PARA MOSTRAR MENU DE INDICADORES
    //***********************************

    public void MOSTRAINDICADORES(Votacao[] votacao) throws IOException {
        EstatisticaVotacao ev = new EstatisticaVotacao();

        String fileName = "Votacao2016.txt";

        BufferedReader ler = new BufferedReader(new FileReader(fileName));

        for (int i = 0; i < 100; i++) {
            votacao[i].numeroSecao = Integer.parseInt(ler.readLine());
            votacao[i].numeroCandidato = Integer.parseInt(ler.readLine());

        }

        int opc = 0;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite conforme as opções:\n"
                    + "1 - Quantidade Eleitores por Seção\n"
                    + "2 – Seção com Maior e Menor número de Eleitores\n"
                    + "3 – Quantidade de votos por candidato\n"
                    + "4 – 10 primeiros colocadas (nro  cand. e qtd votos )\n"
                    + "9 – Finalizar consulta"));

            switch (opc) {

                case 1:
                    ev.ELEITORESPORSECAO(votacao);
                    break;

                case 2:
                    ev.MAIORMENORSECAO(votacao);
                    break;

                case 3:
                    ev.VOTOSPORCANDIDATO(votacao);
                    break;

                case 4:
                    ev.MAISVOTADOS(votacao);
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "Fim!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
            }
        } while (opc != 9);
    }

}
