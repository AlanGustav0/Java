 /*
Objetivo: Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a
idade em anos, meses e dias, considerando os anos bissextos.


Programador: Alan Gustavo
Data: 28/03/2020
*/
import javax.swing.JOptionPane;

class Calcula_Idade 
{
    
    //DECLARAÇÃO DE VARIÁVEIS GLOBAIS
    static int anoNasc = 0;
    static int mesNasc = 0;
    static int diaNasc = 0;
    
    static int anoAtual = 0;
    static int mesAtual = 0;
    static int diaAtual = 0;
    
    static int anoTotal = 0;
    static int mesTotal = 0;
    static int diaTotal = 0;
    
    static boolean validaDatas = false;
    static int contadorMes = 0;
    static int contaMes = 0;
    static int contaDias = 0;
    static int contadorDias = 0;
    static int contaBissexto = 0;
    
    
    /***************************************************************
     * CÓDIGO COMANDO PRINCIPAL
    **********************************************************************/
    public static void main(final String[] args) {
        ValidaDatas();
        VerificarMostrarDatas();
    }

    /********************************************************************
     * MÓDULO PROCEDIMENTO CONDICIONAIS QUE VERIFICAM E MOSTRAM OS RESULTADOS
     **********************************************************************/
    private static void VerificarMostrarDatas() {

        // * CONDIÇÕES COM DIASMESE E MESES DE NASCIMENTO MENORES QUE ATUAL (<) - ANO DE
        // NASCIMENTO MENOR (<) OU (=)

        if (diaNasc < diaAtual && mesNasc < mesAtual && anoNasc < anoAtual) {
            if (diaAtual - diaNasc == 1 && mesAtual - mesNasc == 1) {
                diaTotal = CalculaDias(diaNasc, contadorDias);
                mesTotal = CalculaMeses(mesNasc, contadorMes);
                anoTotal = anoAtual - anoNasc;
                Ordena();

                JOptionPane.showMessageDialog(null,
                        "Você tem: " + anoTotal + " anos " + mesTotal + " mes " + " e " + diaTotal + " dia de vida.");
            } else {
                diaTotal = CalculaDias(diaNasc, contadorDias);
                mesTotal = CalculaMeses(mesNasc, contadorMes);
                anoTotal = anoAtual - anoNasc;
                Ordena();

                JOptionPane.showMessageDialog(null, "Você tem: " + anoTotal + " anos " + mesTotal + " meses " + " e "
                        + diaTotal + " dias de vida.");

            }
        }

        else if (diaNasc == diaAtual && mesNasc == mesAtual && anoNasc < anoAtual) {

            if (anoAtual - anoNasc == 1) {
                JOptionPane.showMessageDialog(null, "Você tem: " + anoTotal + " ano de vida.");
            } else {
                diaTotal = CalculaDias(diaNasc, contadorDias);
                mesTotal = CalculaMeses(mesNasc, contadorMes);
                anoTotal = anoAtual - anoNasc;
                Ordena();

                JOptionPane.showMessageDialog(null,
                        "Você tem: " + anoTotal + " anos " + mesTotal + " meses " + diaTotal + " dias de vida.");

            }

        }

        else if (diaNasc == diaAtual && mesNasc < mesAtual && anoNasc < anoAtual) {
            diaTotal = CalculaDias(diaNasc, contadorDias);
            mesTotal = CalculaMeses(mesNasc, contadorMes);
            anoTotal = anoAtual - anoNasc;
            Ordena();

            JOptionPane.showMessageDialog(null,
                    "Você tem: " + anoTotal + " anos " + "e " + mesAtual + " meses de vida.");
        }

        else if (diaNasc < diaAtual && mesNasc == mesAtual && anoNasc < anoAtual) {
            diaTotal = CalculaDias(diaNasc, contadorDias);
            mesTotal = CalculaMeses(mesNasc, contadorMes);
            anoTotal = anoAtual - anoNasc;
            Ordena();

            JOptionPane.showMessageDialog(null,
                    "Você tem: " + anoTotal + " anos " + mesAtual + " meses e " + diaAtual + " dias de vida.");
        }

        else if (diaNasc < diaAtual && mesNasc <= mesAtual && anoNasc == anoAtual) {

            diaTotal = CalculaDias(diaNasc, contadorDias);
            mesTotal = CalculaMeses(mesNasc, contadorMes);
            anoTotal = anoAtual - anoNasc;
            Ordena();

            JOptionPane.showMessageDialog(null,
                    "Você tem: " + mesTotal + " meses " + " e " + diaTotal + " dias de vida.");
        }
        // * FIM DAS CONDIÇÕES COM DIAS E MESES DE NASCIMENTO MAIOR QUE ATUAL

        // * CONDIÇÕES COM DIAS E MESES DE NASCIMENTO MAIOR QUE ATUAL (>) - ANO DE
        // NASCIMENTO MENOR (<) OU (=)

        else if (diaNasc > diaAtual && mesNasc < mesAtual && anoNasc < anoAtual) {

            if (contadorDias == 1) {
                diaTotal = CalculaDias(diaNasc, contadorDias);
                mesTotal = CalculaMeses(mesNasc, contadorMes);
                anoTotal = (anoAtual - anoNasc) - 1;
                Ordena();

                JOptionPane.showMessageDialog(null,
                        "Você tem: " + anoTotal + " anos " + mesTotal + " meses e " + diaTotal + " dia de vida.");

            } else {
                diaTotal = CalculaDias(diaNasc, contadorDias);
                mesTotal = CalculaMeses(mesNasc, contadorMes);
                anoTotal = (anoAtual - anoNasc) - 1;
                Ordena();

                JOptionPane.showMessageDialog(null,
                        "Você tem: " + anoTotal + " anos " + mesTotal + " meses e " + diaTotal + " dias de vida.");
            }
        }

        else if (diaNasc < diaAtual && mesNasc > mesAtual && anoNasc < anoAtual) {

            if (diaAtual - diaNasc == 1 && mesNasc - mesAtual == 1) {
                diaTotal = CalculaDias(diaNasc, contadorDias);
                mesTotal = CalculaMeses(mesNasc, contadorMes);
                anoTotal = (anoAtual - anoNasc) - 1;
                Ordena();

                JOptionPane.showMessageDialog(null,
                        "Você tem: " + anoTotal + " anos " + mesTotal + " meses e " + diaTotal + " dia de vida.");
            } else {
                diaTotal = CalculaDias(diaNasc, contadorDias);
                mesTotal = CalculaMeses(mesNasc, contadorMes);
                anoTotal = (anoAtual - anoNasc) - 1;
                Ordena();

                JOptionPane.showMessageDialog(null,
                        "Você tem: " + anoTotal + " anos " + mesTotal + " meses e " + diaTotal + " dias de vida.");
            }
        }

        else if (diaNasc > diaAtual && mesNasc > mesAtual && anoNasc < anoAtual) {

            if (diaNasc - diaAtual == 1 && mesNasc - mesAtual == 1) {
                diaTotal = CalculaDias(diaNasc, contadorDias);
                mesTotal = CalculaMeses(mesNasc, contadorMes);
                anoTotal = (anoAtual - anoNasc) - 1;
                Ordena();

                JOptionPane.showMessageDialog(null,
                        "Você tem: " + anoTotal + " anos " + mesTotal + " meses e " + diaTotal + " dia de vida.");
            } else {
                diaTotal = CalculaDias(diaNasc, contadorDias);
                mesTotal = CalculaMeses(mesNasc, contadorMes);
                anoTotal = (anoAtual - anoNasc) - 1;
                Ordena();

                JOptionPane.showMessageDialog(null,
                        "Você tem: " + anoTotal + " anos " + mesTotal + " meses e " + diaTotal + " dias de vida.");
            }
        }

        else if (diaNasc > diaAtual && mesNasc == mesAtual && anoNasc == anoAtual) {
            diaTotal = CalculaDias(diaNasc, contadorDias);
            mesTotal = CalculaMeses(mesNasc, contadorMes);
            anoTotal = anoAtual - anoNasc;
            Ordena();

            if (diaTotal == 1 && mesTotal == 0 && anoTotal == 0) {
                JOptionPane.showMessageDialog(null, "Você tem: " + diaTotal + " dia de vida.");
            } else {
                JOptionPane.showMessageDialog(null, "Você tem: " + diaTotal + " dias de vida.");
            }

        } else if (diaNasc > diaAtual && mesNasc < mesAtual && anoNasc == anoAtual) {
            diaTotal = CalculaDias(diaNasc, contadorDias);
            mesTotal = CalculaMeses(mesNasc, contadorMes);
            anoTotal = anoAtual - anoNasc;
            Ordena();

            if (diaTotal == 0 && mesTotal == 1 && anoTotal == 0) {
                JOptionPane.showMessageDialog(null, "Você tem: " + mesTotal + " mes de vida.");
            } else if (diaTotal == 1 && mesTotal == 1 && anoTotal == 0) {
                JOptionPane.showMessageDialog(null,
                        "Você tem: " + mesTotal + " mes " + " e " + diaTotal + " dia de vida.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Você tem: " + mesTotal + " meses " + " e " + diaTotal + " dias de vida.");
            }
        }
        // FIM DAS CONDIÇÕES
    }

    /********************************************************************
     * MÓDULO PROCEDIMENTO QUE VALIDA AS DATAS INSERIDAS
     **********************************************************************/

    private static void ValidaDatas() {
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
    }

    /********************************************************************
     * MÓDULO FUNÇÃO QUE CALCULA ANOS BISSEXTOS
     **********************************************************************/
    private static int CalculaBissexto(final int anoNasc, final int anoAtual) {

        for (int ano = anoNasc; ano <= anoAtual; ano++) {
            if ((ano % 4 == 0)) {
                contaBissexto++;
            }
        }

        return contaBissexto;
    }

    /********************************************************************
     * MÓDULO FUNÇÃO QUE CALCULA OS DIAS
     **********************************************************************/
    private static int CalculaDias(final int diaNasc, int contadorDias) {
        contaDias = diaNasc;

        while (contaDias != diaAtual) {
            contadorDias++;

            if (contaDias == 30) {
                contaDias = 1;
            } else {
                contaDias++;
            }
        }
        return contadorDias;
    }

    /********************************************************************
     * MÓDULO FUNÇÃO QUE CALCULA OS MESES
     **********************************************************************/
    private static int CalculaMeses(final int mesNasc, int contadorMes)
    {
        contaMes = mesNasc;
            
            while (contaMes != mesAtual)
            {
                contadorMes++;
                 
                if(contaMes == 12)
                {
                    contaMes = 1;
                }
                else
                {
                contaMes++;
                }
            }
            return contadorMes;
    }
    
    /********************************************************************
     * MÓDULO PROCEDIMENTO ORDENA MESES E DIAS
    **********************************************************************/
    private static void Ordena()
    {
        diaTotal += CalculaBissexto(anoNasc,anoAtual);
        
        if (diaTotal > 30)
        {
            mesTotal = mesTotal + diaTotal / 30;
            diaTotal = diaTotal % 30;
            if(mesTotal > 12)
            {
                anoTotal = anoTotal + mesTotal / 12;
                mesTotal = mesTotal % 12;
            }
        }
    }
         
}
