 /*
Objetivo: Esta classe é responsável por carregar as notas no caixa.


Programador: Alan Gustavo
Data: 24/04/2020
*/

import javax.swing.JOptionPane;

public class CarregaNotas 
{
    //Declaração das variáveis
    static int ced2 = 2;
    static int ced5 = 5;
    static int ced10 = 10;
    static int ced20 = 20;
    static int ced50 = 50;
    static int ced100 = 100;
    
    static int n2 = 0;
    static int n5 = 0;
    static int n10 = 0;
    static int n20 = 0;
    static int n50 = 0;
    static int n100 = 0;
    
    static int notas[] = new int[6]; 
    static int totalNotas = 0;
    
    static boolean carregado = false;
    
    //Método responsável por carregar o caixa
    static void Carregar()
    {
        
        //Aqui criamos um laço que irá inserir o valor 10 em cada índice da lsita "notas"
        for(int i=0;i < 6;i++){
            notas[i] = 10;
        }
    
        //Aqui cada indice da lista que possui o valor 10 é multiplicado pelo valor da respectiva nota
        notas[0] *= ced2;
        notas[1] *= ced5;
        notas[2] *= ced10;
        notas[3] *= ced20;
        notas[4] *= ced50;
        notas[5] *= ced100;
        
        //Aqui dividimos os valores multiplicados pelo valor da Cédula, assim temos a quantidade de notas espécie
        n2 = notas[0] / 2;
        n5 = notas[1] / 5;
        n10 = notas[2] /10;
        n20 = notas[3] / 20;
        n50 = notas[4] / 50;
        n100 = notas[5] / 100;
        
        //Este laço faz a soma to montante de notas, que será o valor total do caixa
        for(int i=0;i< 6;i++){
            totalNotas += notas[i];
        }
 
        
        carregado = true; //variável que será verificada posteriormente se o caixa está carregado
        JOptionPane.showMessageDialog(null,"Notas carregadas com sucesso!"); //Mensagem de notas carregadas
    }
}
