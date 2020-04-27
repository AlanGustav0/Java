/*
Objetivo: Esta classe é responsável por realizar o saque, validação
verificar o maior e menor valor e também possui o método que mostra as notas disponíveis.



Programador: Alan Gustavo
Data: 24/04/2020
*/
import javax.swing.JOptionPane;

public class RetiraNotas {

    //Declarção de Variáveis globais
    static int valorSaque = 0;
    static boolean status = false;
    static int Cod_banco = 0;
    static boolean opcaoBanco = false;
    static int matrizBancos[][] = new int[5][4];
    static boolean saqueValido = false;
    static int guardaSaque = 0;
    static int SaqueNotas = 0;
    static int guardaSaque_2 = 0;
    static int[] SomaSaqueBanco = new int[4];
    static int opcaoNota = 0;
    static int retiradas = 0;
    static boolean valorOK = false;
    static boolean escolhaNotas = false;

    static void SaqueCaixa() {

        EscolhaBanco bancos = new EscolhaBanco();
        bancos.setVisible(true);


    }

    static void validaSaque() {
        do {
            valorSaque = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do saque: ")); //Recebendo o valor do saque e realizando a validação inicial
            guardaSaque = valorSaque; // Primeiro backup do valor de saque
            SaqueNotas = guardaSaque; // Segundo Backup de valor do saque

            //Aqui validamos se o valor é meno ou =0, =1 ou =3
            if (valorSaque <= 0 || valorSaque == 1 || valorSaque == 3) {
                JOptionPane.showMessageDialog(null, "Valor inválido!");

            //Validação caso o valo solicitado seja maior que o permitido
            } else if (valorSaque > CarregaNotas.totalNotas) {
                JOptionPane.showMessageDialog(null, "Atenção! EXCEDEU O LIMITE DO CAIXA!");
                NotasDisponiveis();

            //Aqui verificamos se o valor está entre 2 e 20 para dar a opção ou não de notas de 10 e 20
            } else if (valorSaque >= 2 && valorSaque < 20) {
                QuantidadeNotas validaSaque = new QuantidadeNotas();
                validaSaque.CalcNotas(SaqueNotas);
                Saque();
            } else {
                QuantidadeNotas validaSaque = new QuantidadeNotas();
                validaSaque.CalcNotas(SaqueNotas);
                opcaoNotas();
                Saque();
            }
            status = true;
        } while (status == false && QuantidadeNotas.SaqueOk == false);

    }

    static void opcaoNotas() {
        
        //Aqui utilizamos o switch case para dar a opção de notas de 10 ou 20
        do{
        opcaoNota = Integer.parseInt(JOptionPane.showInputDialog("Opção de Notas de R$10 e R$20 \n"
                + "1 - 1x20 \n"
                + "2 - 2x10 \n"
                + "3 - NDA "));

        switch (opcaoNota) {

            case 1:

                valorSaque -= CarregaNotas.ced20;
                CarregaNotas.totalNotas -= CarregaNotas.ced20;
                CarregaNotas.n20 -= 1;
                valorOK = true;
                if (guardaSaque == 20) {
                    NotasDisponiveis();
                }
                escolhaNotas = true;
                break;

            case 2:

                valorSaque -= CarregaNotas.ced10 * 2;
                CarregaNotas.totalNotas -= CarregaNotas.ced10 * 2;
                CarregaNotas.n10 -= 2;
                if (guardaSaque == 10) {
                    NotasDisponiveis();
                }
                escolhaNotas = true;
                break;

            case 3:
                escolhaNotas = true;
                break;
                

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!.");
                break;
        }
        }while(escolhaNotas == false);

    }

    //Este método é responsável pelo Saque
    static void Saque() {

        //Aqui caso a variável  SaqueOk seja "false" ele não realiza o saque e mostra a informação de notas indispoíveis
        if (QuantidadeNotas.SaqueOk == false) {
            JOptionPane.showMessageDialog(null, "Quantidadde de Notas insuficiente!");
            NotasDisponiveis();
            opcaoBanco = false;
            status = false;
        } else {

            //Estes laçoas fazem a retiradas do maior para o menor enquanto for possível retirar determinada nota
            while (valorSaque != 0) {

                /*Se o valor não for múltiplo de 5, ele libera primeiramente notas de 2
                com isso podemos realizar saque de 11, 13, 23...
                */
                while (valorSaque % 5 != 0 && CarregaNotas.n2 > 0) {

                    valorSaque -= CarregaNotas.ced2;
                    CarregaNotas.totalNotas -= CarregaNotas.ced2;
                    if (CarregaNotas.n2 > 0) {
                        CarregaNotas.n2 -= 1;
                    }

                }

                while (valorSaque >= 100 && CarregaNotas.n100 > 0) {
                    valorSaque -= CarregaNotas.ced100;
                    CarregaNotas.totalNotas -= CarregaNotas.ced100;
                    if (CarregaNotas.n100 > 0) {
                        CarregaNotas.n100 -= 1;
                    }

                }

                while (valorSaque >= 50 && CarregaNotas.n50 > 0) {
                    valorSaque -= CarregaNotas.ced50;
                    CarregaNotas.totalNotas -= CarregaNotas.ced50;
                    if (CarregaNotas.n50 > 0) {
                        CarregaNotas.n50 -= 1;
                    }

                }

                while (valorSaque >= 20 && CarregaNotas.n20 > 0) {
                    valorSaque -= CarregaNotas.ced20;
                    CarregaNotas.totalNotas -= CarregaNotas.ced20;
                    if (CarregaNotas.n20 > 0) {
                        CarregaNotas.n20 -= 1;
                    }

                }

                while (valorSaque >= 10 && CarregaNotas.n10 > 0) {
                    valorSaque -= CarregaNotas.ced10;
                    CarregaNotas.totalNotas -= CarregaNotas.ced10;
                    if (CarregaNotas.n10 > 0) {
                        CarregaNotas.n10 -= 1;
                    }

                }

                while (valorSaque >= 5 && CarregaNotas.n5 > 0) {
                    valorSaque -= CarregaNotas.ced5;
                    CarregaNotas.totalNotas -= CarregaNotas.ced5;
                    if (CarregaNotas.n5 > 0) {
                        CarregaNotas.n5 -= 1;
                    }

                }

                while (valorSaque >= 2 && CarregaNotas.n2 > 0 || valorSaque == 6 && CarregaNotas.n2 > 0) {
                    valorSaque -= CarregaNotas.ced2;
                    CarregaNotas.totalNotas -= CarregaNotas.ced2;
                    if (CarregaNotas.n2 > 0) {
                        CarregaNotas.n2 -= 1;
                    }

                }
                
                // Ao final do saque é mostrado o valor sacado e as notas disponíveis
                JOptionPane.showMessageDialog(null, "Valor Sacado: R$" + RetiraNotas.guardaSaque);
                verificaBanco();
                MaiorMenor();
                NotasDisponiveis();
                opcaoBanco = false;
                status = false;
                QuantidadeNotas.SaqueOk = false;
            }

        }
    }

    //Este método verifica qual o maior e menor valor sacado de acordo com o código do banco.
    static void MaiorMenor() {

        if (matrizBancos[1][Cod_banco] == 0) {
            matrizBancos[1][Cod_banco] = guardaSaque;
            matrizBancos[2][Cod_banco] = guardaSaque;
        }

        if (guardaSaque > matrizBancos[1][Cod_banco]) {
            matrizBancos[1][Cod_banco] = guardaSaque;
        } else if (guardaSaque < matrizBancos[2][Cod_banco]) {
            matrizBancos[2][Cod_banco] = guardaSaque;
        }

    }

    //Este método faz a soma por banco da quantidade sacada e soma a quantidade de saques
    static void verificaBanco() {
        if (Cod_banco == 0) {
            matrizBancos[4][Cod_banco] += guardaSaque;
            SomaSaqueBanco[Cod_banco] += 1;
            retiradas += 1;
        } else if (Cod_banco == 1) {
            matrizBancos[4][Cod_banco] += guardaSaque;
            SomaSaqueBanco[Cod_banco] += 1;
            retiradas += 1;
        } else if (Cod_banco == 2) {
            matrizBancos[4][Cod_banco] += guardaSaque;
            SomaSaqueBanco[Cod_banco] += 1;
            retiradas += 1;
        } else if (Cod_banco == 3) {
            matrizBancos[4][Cod_banco] += guardaSaque;
            SomaSaqueBanco[Cod_banco] += 1;
            retiradas += 1;
        }
        
        //Aqui guardamos na Matriz a média de saque de acordo com cada banco
        matrizBancos[3][Cod_banco] = (matrizBancos[4][Cod_banco] / SomaSaqueBanco[Cod_banco]); 
    }

    //Este método mostra as notas disponíveis no caixa
    static void NotasDisponiveis() {
        JOptionPane.showMessageDialog(null, "Notas disponíveis: \n"
                + "Notas de R$2,00: " + CarregaNotas.n2 + " \n"
                + "Notas de R$5,00: " + CarregaNotas.n5 + "\n"
                + "Notas de R$ 10,00: " + CarregaNotas.n10 + "\n"
                + "Notas de R$ 20,00: " + CarregaNotas.n20 + "\n"
                + "Notas de R$ 50,00: " + CarregaNotas.n50 + "\n"
                + "Notas de R$ 100,00: " + CarregaNotas.n100 + "\n"
                + "Saldo Caixa: " + CarregaNotas.totalNotas);
    }
}
