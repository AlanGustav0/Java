import javax.swing.JOptionPane;

public class ClasseMetodos {

    /********************************************************************
     * MÓDULO PROCEDIMENTO CONDICIONAIS QUE VERIFICAM E MOSTRAM OS RESULTADOS
     **********************************************************************/
    static void VerificarMostrarDatas(int diaNasc, int mesNasc, int anoNasc, int diaAtual, int mesAtual, int anoAtual) {

        int anoTotal = 0;
        int mesTotal = 0;
        int diaTotal = 0;

        int contadorMes = 0;
        int contadorDias = 0;

        // * CONDIÇÕES COM DIASMESE E MESES DE NASCIMENTO MENORES QUE ATUAL (<) - ANO DE
        // NASCIMENTO MENOR (<) OU (=)

        if (diaNasc < diaAtual && mesNasc < mesAtual && anoNasc < anoAtual) {
            if (diaAtual - diaNasc == 1 && mesAtual - mesNasc == 1) {
                diaTotal = CalculaDias(diaNasc, contadorDias, diaAtual);
                mesTotal = CalculaMeses(mesNasc, contadorMes, mesAtual);
                anoTotal = anoAtual - anoNasc;
                Ordena(diaTotal, mesTotal, anoTotal, anoNasc, anoAtual);

                JOptionPane.showMessageDialog(null,
                        "Você tem: " + anoTotal + " anos " + mesTotal + " mes " + " e " + diaTotal + " dia de vida.");
            } else {
                diaTotal = CalculaDias(diaNasc, contadorDias, diaAtual);
                mesTotal = CalculaMeses(mesNasc, contadorMes, mesAtual);
                anoTotal = anoAtual - anoNasc;
                Ordena(diaTotal, mesTotal, anoTotal, anoNasc, anoAtual);

                JOptionPane.showMessageDialog(null, "Você tem: " + anoTotal + " anos " + mesTotal + " meses " + " e "
                        + diaTotal + " dias de vida.");

            }
        }

        else if (diaNasc == diaAtual && mesNasc == mesAtual && anoNasc < anoAtual) {

            if (anoAtual - anoNasc == 1) {
                JOptionPane.showMessageDialog(null, "Você tem: " + anoTotal + " ano de vida.");
            } else {
                diaTotal = CalculaDias(diaNasc, contadorDias, diaAtual);
                mesTotal = CalculaMeses(mesNasc, contadorMes, mesAtual);
                anoTotal = anoAtual - anoNasc;
                Ordena(diaTotal, mesTotal, anoTotal, anoNasc, anoAtual);

                JOptionPane.showMessageDialog(null,
                        "Você tem: " + anoTotal + " anos " + mesTotal + " meses " + diaTotal + " dias de vida.");

            }

        }

        else if (diaNasc == diaAtual && mesNasc < mesAtual && anoNasc < anoAtual) {
            diaTotal = CalculaDias(diaNasc, contadorDias, diaAtual);
            mesTotal = CalculaMeses(mesNasc, contadorMes, mesAtual);
            anoTotal = anoAtual - anoNasc;
            Ordena(diaTotal, mesTotal, anoTotal, anoNasc, anoAtual);

            JOptionPane.showMessageDialog(null,
                    "Você tem: " + anoTotal + " anos " + "e " + mesAtual + " meses de vida.");
        }

        else if (diaNasc < diaAtual && mesNasc == mesAtual && anoNasc < anoAtual) {
            diaTotal = CalculaDias(diaNasc, contadorDias, diaAtual);
            mesTotal = CalculaMeses(mesNasc, contadorMes, mesAtual);
            anoTotal = anoAtual - anoNasc;
            Ordena(diaTotal, mesTotal, anoTotal, anoNasc, anoAtual);

            JOptionPane.showMessageDialog(null,
                    "Você tem: " + anoTotal + " anos " + mesAtual + " meses e " + diaAtual + " dias de vida.");
        }

        else if (diaNasc < diaAtual && mesNasc <= mesAtual && anoNasc == anoAtual) {

            diaTotal = CalculaDias(diaNasc, contadorDias, diaAtual);
            mesTotal = CalculaMeses(mesNasc, contadorMes, mesAtual);
            anoTotal = anoAtual - anoNasc;
            Ordena(diaTotal, mesTotal, anoTotal, anoNasc, anoAtual);

            JOptionPane.showMessageDialog(null,
                    "Você tem: " + mesTotal + " meses " + " e " + diaTotal + " dias de vida.");
        }
        // * FIM DAS CONDIÇÕES COM DIAS E MESES DE NASCIMENTO MAIOR QUE ATUAL

        // * CONDIÇÕES COM DIAS E MESES DE NASCIMENTO MAIOR QUE ATUAL (>) - ANO DE
        // NASCIMENTO MENOR (<) OU (=)

        else if (diaNasc > diaAtual && mesNasc < mesAtual && anoNasc < anoAtual) {

            if (contadorDias == 1) {
                diaTotal = CalculaDias(diaNasc, contadorDias, diaAtual);
                mesTotal = CalculaMeses(mesNasc, contadorMes, mesAtual);
                anoTotal = (anoAtual - anoNasc) - 1;
                Ordena(diaTotal, mesTotal, anoTotal, anoNasc, anoAtual);

                JOptionPane.showMessageDialog(null,
                        "Você tem: " + anoTotal + " anos " + mesTotal + " meses e " + diaTotal + " dia de vida.");

            } else {
                diaTotal = CalculaDias(diaNasc, contadorDias, diaAtual);
                mesTotal = CalculaMeses(mesNasc, contadorMes, mesAtual);
                anoTotal = (anoAtual - anoNasc) - 1;
                Ordena(diaTotal, mesTotal, anoTotal, anoNasc, anoAtual);

                JOptionPane.showMessageDialog(null,
                        "Você tem: " + anoTotal + " anos " + mesTotal + " meses e " + diaTotal + " dias de vida.");
            }
        }

        else if (diaNasc < diaAtual && mesNasc > mesAtual && anoNasc < anoAtual) {

            if (diaAtual - diaNasc == 1 && mesNasc - mesAtual == 1) {
                diaTotal = CalculaDias(diaNasc, contadorDias, diaAtual);
                mesTotal = CalculaMeses(mesNasc, contadorMes, mesAtual);
                anoTotal = (anoAtual - anoNasc) - 1;
                Ordena(diaTotal, mesTotal, anoTotal, anoNasc, anoAtual);

                JOptionPane.showMessageDialog(null,
                        "Você tem: " + anoTotal + " anos " + mesTotal + " meses e " + diaTotal + " dia de vida.");
            } else {
                diaTotal = CalculaDias(diaNasc, contadorDias, diaAtual);
                mesTotal = CalculaMeses(mesNasc, contadorMes, mesAtual);
                anoTotal = (anoAtual - anoNasc) - 1;
                Ordena(diaTotal, mesTotal, anoTotal, anoNasc, anoAtual);

                JOptionPane.showMessageDialog(null,
                        "Você tem: " + anoTotal + " anos " + mesTotal + " meses e " + diaTotal + " dias de vida.");
            }
        }

        else if (diaNasc > diaAtual && mesNasc > mesAtual && anoNasc < anoAtual) {

            if (diaNasc - diaAtual == 1 && mesNasc - mesAtual == 1) {
                diaTotal = CalculaDias(diaNasc, contadorDias, diaAtual);
                mesTotal = CalculaMeses(mesNasc, contadorMes, mesAtual);
                anoTotal = (anoAtual - anoNasc) - 1;
                Ordena(diaTotal, mesTotal, anoTotal, anoNasc, anoAtual);

                JOptionPane.showMessageDialog(null,
                        "Você tem: " + anoTotal + " anos " + mesTotal + " meses e " + diaTotal + " dia de vida.");
            } else {
                diaTotal = CalculaDias(diaNasc, contadorDias, diaAtual);
                mesTotal = CalculaMeses(mesNasc, contadorMes, mesAtual);
                anoTotal = (anoAtual - anoNasc) - 1;
                Ordena(diaTotal, mesTotal, anoTotal, anoNasc, anoAtual);

                JOptionPane.showMessageDialog(null,
                        "Você tem: " + anoTotal + " anos " + mesTotal + " meses e " + diaTotal + " dias de vida.");
            }
        }

        else if (diaNasc > diaAtual && mesNasc == mesAtual && anoNasc == anoAtual) {
            diaTotal = CalculaDias(diaNasc, contadorDias, diaAtual);
            mesTotal = CalculaMeses(mesNasc, contadorMes, mesAtual);
            anoTotal = anoAtual - anoNasc;
            Ordena(diaTotal, mesTotal, anoTotal, anoNasc, anoAtual);

            if (diaTotal == 1 && mesTotal == 0 && anoTotal == 0) {
                JOptionPane.showMessageDialog(null, "Você tem: " + diaTotal + " dia de vida.");
            } else {
                JOptionPane.showMessageDialog(null, "Você tem: " + diaTotal + " dias de vida.");
            }

        } else if (diaNasc > diaAtual && mesNasc < mesAtual && anoNasc == anoAtual) {
            diaTotal = CalculaDias(diaNasc, contadorDias, diaAtual);
            mesTotal = CalculaMeses(mesNasc, contadorMes, mesAtual);
            anoTotal = anoAtual - anoNasc;
            Ordena(diaTotal, mesTotal, anoTotal, anoNasc, anoAtual);

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

    }
    // FIM DAS CONDIÇÕES

    /********************************************************************
     * MÓDULO FUNÇÃO QUE CALCULA ANOS BISSEXTOS
     **********************************************************************/
    static int CalculaBissexto(int anoNasc, int anoAtual) {

        int contaBissexto = 0;

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
    public static int CalculaDias(int diaNasc, int contadorDias, int diaAtual) {
        int contaDias = 0;
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
    static int CalculaMeses(final int mesNasc, int contadorMes, int mesAtual) {
        int contaMes = 0;
        contaMes = mesNasc;

        while (contaMes != mesAtual) {
            contadorMes++;

            if (contaMes == 12) {
                contaMes = 1;
            } else {
                contaMes++;
            }
        }
        return contadorMes;
    }

    /********************************************************************
     * MÓDULO PROCEDIMENTO ORDENA MESES E DIAS
     **********************************************************************/
    static void Ordena(int diaTotal, int mesTotal, int anoTotal, int anoNasc, int anoAtual) {
        diaTotal += CalculaBissexto(anoNasc, anoAtual);

        if (diaTotal > 30) {
            mesTotal = mesTotal + diaTotal / 30;
            diaTotal = diaTotal % 30;
            if (mesTotal > 12) {
                anoTotal = anoTotal + mesTotal / 12;
                mesTotal = mesTotal % 12;
            }
        }
    }

}
