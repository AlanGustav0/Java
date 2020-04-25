

 /*
Objetivo: Esta classe é responsável por mostrar a janaela "Estatísticas"
onde estão disponíveis as informações separadas por banco.


Programador: Alan Gustavo
Data: 24/04/2020
*/
import javax.swing.JOptionPane;

public class Estatisticas {

    static int opcaoBancos = 0;
    static boolean escolhaBanco = false;

    //Método responsável por mostrar as estatísticas dos bancos
    //Contendo dentro dele a chamada da classe EstatísticasBancos
    static void menuEstatisticas() {
        
        EstatisticasBancos estatisticas = new EstatisticasBancos();
        estatisticas.setVisible(true);

    }
    
    
    //Código anterior
    /*    
        do {
            opcaoBancos = Integer.parseInt(JOptionPane.showInputDialog("Estatísticas de Transações: \n"
                    + "0 - Banco do Brasil \n "
                    + "1 - Itaú \n"
                    + "2 - Caixa Econômica \n"
                    + "3 - Santander "));

            switch (opcaoBancos) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Maior valor sacado: R$" + RetiraNotas.matrizBancos[1][0] + "\n"
                            + "Menor valor sacado: R$ " + RetiraNotas.matrizBancos[2][0] + "\n"
                            + "Media dos valores sacados: " + RetiraNotas.matrizBancos[3][0] + "\n"
                            + "Total dos Saques R$ " + RetiraNotas.matrizBancos[4][0]);
                    escolhaBanco = true;
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Maior valor sacado: R$" + RetiraNotas.matrizBancos[1][1] + "\n"
                            + "Menor valor sacado: R$ " + RetiraNotas.matrizBancos[2][1] + "\n"
                            + "Media dos valores sacados: " + RetiraNotas.matrizBancos[3][1] + "\n"
                            + "Total dos Saques R$ " + RetiraNotas.matrizBancos[4][1]);
                    escolhaBanco = true;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Maior valor sacado: R$" + RetiraNotas.matrizBancos[1][2] + "\n"
                            + "Menor valor sacado: R$ " + RetiraNotas.matrizBancos[2][2] + "\n"
                            + "Media dos valores sacados: " + RetiraNotas.matrizBancos[3][2] + "\n"
                            + "Total dos Saques R$ " + RetiraNotas.matrizBancos[4][2]);
                    escolhaBanco = true;
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Maior valor sacado: R$" + RetiraNotas.matrizBancos[1][3] + "\n"
                            + "Menor valor sacado: R$ " + RetiraNotas.matrizBancos[2][3] + "\n"
                            + "Media dos valores sacados: " + RetiraNotas.matrizBancos[3][3] + "\n"
                            + "Total dos Saques R$ " + RetiraNotas.matrizBancos[4][3]);
                    escolhaBanco = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;

            }
        } while (escolhaBanco == false);
        */

}
