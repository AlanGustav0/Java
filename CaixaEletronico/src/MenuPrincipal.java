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