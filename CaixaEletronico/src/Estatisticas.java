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
}