import javax.swing.JOptionPane;

class estatististicas2019 {

       public static void main(String[] args) {
              // INSTÂNCIA DA CLASSE ABSTRATA COM 10 REGISTROS TIPO VETOR
              Estatistica[] dados = new Estatistica[10];

              // INSTÂNCIA DA CLASSEMETODOS
              ClasseMetodos m = new ClasseMetodos();

              int i;

              // EXECUÇÃO DO MÉTODO CONSTRUTOR
              for (i = 0; i < 10; i++) {
                     dados[i] = new Estatistica();
              }

              int opc = 0;
              while (opc != 9) {
                     opc = Integer.parseInt(JOptionPane.showInputDialog("Estatísticas de acidentes em 2019 \n"
                                   + "1 - Cadastro Estatística \n" + "2 - Consulta por quantidade de acidentes \n"
                                   + "3 - Consulta por estatísticas de acidentes \n"
                                   + "4 - Acidentes acima da média das 10 cidades \n" + "9 - Finaliza"));
                     switch (opc) {
                            case 1:
                                   dados = m.FCADRASTRAESTATISTICA(dados); // CHAMADA FUNÇÃO
                                   break;
                            case 2:
                                   m.PQTDACIDENTES(dados); // CHAMADA PROCEDIMENTO
                                   break;

                            case 3:
                                   m.PCONSULTAMAIORMENOR(dados); // CHAMADA PROCEDIMENTO
                                   break;

                            case 4:
                                   m.PCONSULTAESTATISTICA(dados); // CHAMADA PROCEDIMENTO
                                   break;
                            case 9:
                                   JOptionPane.showMessageDialog(null, "Programa finalizado"); // FINALIZAÇÃO DO
                                                                                               // PROGRAMA
                                   break;
                            default:
                                   JOptionPane.showMessageDialog(null, "Opção Inválida"); // DEFAULT
                                   break;
                     }
              }
       }
}