

 /*
Objetivo: Esta classe é responsável por fazer a chamada da classe "Menu",
que é a janela onde são mostradas as opções para o usuário



Programador: Alan Gustavo
Data: 24/04/2020
*/


import javax.swing.JOptionPane;



 //**************************************
// MÓDULO PROCEDIMENTO MENU PRINCIPAL
//**************************************
public class MenuPrincipal {

    static int menu = 0;
    static boolean ok = false;

    public void Opcoes() {
            
            Menu opcoes = new Menu();
            opcoes.setVisible(true);

    }
}
    //FIM MÓDULO MENU PRINCIPAL-------------------



//Código utilizando switch case
/*
            menu = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo! Escolha a opção desejada: " + "\n"
                    + "1 - Carregar Notas \n 2 - Retirar Notas \n 3 - Estatísticas \n 9 - Finalizar"));

            switch (menu) {

                case 1:
                    if (CarregaNotas.carregado == true) {
                        JOptionPane.showMessageDialog(null, "Atenção! As notas já foram carregadas.");
                        break;
                    } else {
                        CarregaNotas carrega = new CarregaNotas();
                        carrega.Carregar();
                        break;
                    }

                case 2:
                    if (CarregaNotas.carregado == false) {
                        JOptionPane.showMessageDialog(null, "Atenção! Você deve carregar as notas.");
                        break;
                    } else if (CarregaNotas.totalNotas == 0) {
                        JOptionPane.showMessageDialog(null, "Atenção! \n Não há notas disponíveis no caixa. Você deve carregá-lo.");
                        break;
                    } else if (RetiraNotas.retiradas > 100) {
                        JOptionPane.showMessageDialog(null, "Atenção! Número de saques atingido.");
                        System.exit(0);
                    } else {
                        RetiraNotas valor = new RetiraNotas();
                        valor.SaqueCaixa();
                        break;
                    }

                case 3:
                    Estatisticas bancos = new Estatisticas();
                    bancos.menuEstatisticas();
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Operação Finalizada. Até logo!");
                    ok = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida! \n Por favor, escolha uma opção válida.");
                    break;
            }
            */