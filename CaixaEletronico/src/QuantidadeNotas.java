/*
 Objetivo: Esta classe é responsável por fazer a validação da quantidade de notas
 ela verifica se o caixa possui notas o suficiente para posteriormente autorizar o saque ou não.


 Programador: Alan Gustavo
 Data: 24/04/2020
 */

import javax.swing.JOptionPane;

public class QuantidadeNotas {

    static boolean SaqueOk = false;

    //Este método irá verificar todas as notas para validar as quantidades
    static boolean CalcNotas(int SaqueNotas) {

        while (RetiraNotas.SaqueNotas != 0) {

            while (RetiraNotas.SaqueNotas % 5 != 0 && CarregaNotas.notas[0] > 0) {

                RetiraNotas.SaqueNotas -= CarregaNotas.ced2;
                CarregaNotas.notas[0] -= CarregaNotas.ced2;

            }

            while (RetiraNotas.SaqueNotas >= 100 && CarregaNotas.notas[5] > 0) {
                RetiraNotas.SaqueNotas -= CarregaNotas.ced100;
                CarregaNotas.notas[5] -= CarregaNotas.ced100;

            }

            while (RetiraNotas.SaqueNotas >= 50 && CarregaNotas.notas[4] > 0) {
                RetiraNotas.SaqueNotas -= CarregaNotas.ced50;
                CarregaNotas.notas[4] -= CarregaNotas.ced50;

            }

            while (RetiraNotas.SaqueNotas >= 20 && CarregaNotas.notas[3] > 0) {
                RetiraNotas.SaqueNotas -= CarregaNotas.ced20;
                CarregaNotas.notas[3] -= CarregaNotas.ced20;

            }

            while (RetiraNotas.SaqueNotas >= 10 && CarregaNotas.notas[2] > 0) {
                RetiraNotas.SaqueNotas -= CarregaNotas.ced10;
                CarregaNotas.notas[2] -= CarregaNotas.ced10;

            }

            while (RetiraNotas.SaqueNotas >= 5 && CarregaNotas.notas[1] > 0) {
                RetiraNotas.SaqueNotas -= CarregaNotas.ced5;
                CarregaNotas.notas[1] -= CarregaNotas.ced5;

            }

            while (RetiraNotas.SaqueNotas >= 2 && CarregaNotas.notas[0] > 0 || RetiraNotas.SaqueNotas == 6 && CarregaNotas.notas[0] > 0) {
                RetiraNotas.SaqueNotas -= CarregaNotas.ced2;
                CarregaNotas.notas[0] -= CarregaNotas.ced2;
            }

            if (RetiraNotas.SaqueNotas > 0) {
                RetiraNotas.status = false;
                RetiraNotas.opcaoBanco = false;
                break;

            } else {
                RetiraNotas.status = false;
                RetiraNotas.opcaoBanco = false;
                SaqueOk = true;
            }
        }
        return SaqueOk;

    }
}
