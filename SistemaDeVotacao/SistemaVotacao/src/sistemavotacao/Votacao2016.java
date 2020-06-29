package sistemavotacao;
import javax.swing.JOptionPane;
import java.io.IOException;


//***********************************CLASSE PRINCIPAL VOTACAO2016*************************

public class Votacao2016 {
    
    //STARTPOINT

    public static void main(String[] args) throws IOException {
        
        //Declaração de variáveis
        VotacaoMetodos vm = new VotacaoMetodos();
        Votacao[] votacao = new Votacao[100];
        int opc = 0;

        //Menu principal SWITCH CASE
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite conforme as opções:\n"
                    + "1 – Carregar Seção/Número Eleitor\n"
                    + "2 – Classificar por Seção\n" + "3 – Gravar Registros\n"
                    + "4 – Mostrar Indicadores\n" + "9 – Finalizar"));

            switch (opc) {

                case 1:
                    votacao = vm.FCADASTRAVOTACAO(votacao);
                    JOptionPane.showMessageDialog(null, "Cadastrado");
                    break;

                case 2:
                    votacao = vm.FCLASSIFICASECAO(votacao);
                    JOptionPane.showMessageDialog(null, "Clasificado");
                    break;

                case 3:
                    votacao = vm.FGRAVAVOTACAO(votacao);
                    JOptionPane.showMessageDialog(null, "Arquivo gerado");
                    break;

                case 4:
                    vm.MOSTRAINDICADORES(votacao);
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
