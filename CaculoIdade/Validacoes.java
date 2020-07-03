import javax.swing.JOptionPane;

public class Validacoes {

    /********************************************************************
     * MÓDULO PROCEDIMENTO QUE VALIDA AS DATAS INSERIDAS
     ********************************************************************/

    static void ValidaDatas() {

        ClasseMetodos mostraDatas = new ClasseMetodos();

        int anoNasc = 0;
        int mesNasc = 0;
        int diaNasc = 0;

        int anoAtual = 0;
        int mesAtual = 0;
        int diaAtual = 0;

        boolean validaDatas = false;

        while (validaDatas == false) {
            diaNasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia de nascimento"));
            mesNasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês de nascimento: "));
            anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano de nascimento: "));

            diaAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia atual: "));
            mesAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês atual: "));
            anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual: "));

            if (anoNasc > anoAtual) {
                JOptionPane.showMessageDialog(null, "Atenção! O ano atual não pode ser menor que o ano de nascimento.");
                validaDatas = false;
            } else if (anoNasc == anoAtual && mesNasc == mesAtual && diaNasc == diaAtual) {
                JOptionPane.showMessageDialog(null, "Atenção! Todas as datas são iguais.");

            } else {
                validaDatas = true;
            }

        }
        mostraDatas.VerificarMostrarDatas(diaNasc, mesNasc, anoNasc, diaAtual, mesAtual, anoAtual);
    }

}