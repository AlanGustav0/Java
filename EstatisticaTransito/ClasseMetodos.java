import javax.swing.JOptionPane;

public class ClasseMetodos {
  // FUNÇÃO RECEBENDO REGISTROS aluno E RETORNANDO TIPO ALUNO[]
  public Estatistica[] FCADRASTRAESTATISTICA(Estatistica[] dados) {
    int i;

    for (i = 0; i < 10; i++) {
      dados[i].CodigoCidade = JOptionPane.showInputDialog("Entre com o código da cidade: ");
      dados[i].NomeCidade = JOptionPane.showInputDialog("Entre com o nome da cidade: ");
      dados[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de acidentes: "));
    }

    return dados;
  }

  // PROCEDIMENTO RECEBENDO REGISTRO aluno TIPO ALUNO[]
  public void PQTDACIDENTES(Estatistica[] dados) {
    int i;
    String mostraAcidentes = " ";

    for (i = 0; i < 10; i++) {

      if (dados[i].QtdAcidentes > 100 && dados[i].QtdAcidentes < 500) {
        mostraAcidentes += "Cód: " + dados[i].CodigoCidade + "\n Cidade: " + dados[i].NomeCidade
            + " \n Quantidade de acidentes: " + dados[i].QtdAcidentes + "\n";
      }

    }
    JOptionPane.showMessageDialog(null, mostraAcidentes);
  }

  public void PCONSULTAMAIORMENOR(Estatistica[] dados) {

    int maior = dados[0].QtdAcidentes;
    int menor = dados[0].QtdAcidentes;
    String cidadeMenor = dados[0].NomeCidade;
    String cidadeMaior = dados[0].NomeCidade;
    String codMenor = dados[0].CodigoCidade;
    String codMaior = dados[0].CodigoCidade;
    String mostraMaior = "";
    String mostraMenor = "";
    int i;

    for (i = 0; i < 5; i++) {
      if (dados[i].QtdAcidentes > maior) {
        maior = dados[i].QtdAcidentes;
        cidadeMaior = dados[i].NomeCidade;
        codMaior = dados[i].CodigoCidade;

      } else if (dados[i].QtdAcidentes < menor) {
        menor = dados[i].QtdAcidentes;
        cidadeMenor = dados[i].NomeCidade;
        codMenor = dados[i].CodigoCidade;

      }
    }
    mostraMaior += "Cidade com maior número de acidentes \n" + "Cod: " + codMaior + "\nCidade: " + cidadeMaior
        + "\nNúmero de acidentes: " + maior;
    mostraMenor += "Cidade com menor número de acidentes \n" + "Cod: " + codMenor + "\nCidade: " + cidadeMenor
        + "\nNúmero de acidentes: " + menor;

    JOptionPane.showMessageDialog(null, mostraMaior + "\n\n" + mostraMenor);

  }

  public void PCONSULTAESTATISTICA(Estatistica[] dados) {

    int totalAcidentes = 0;
    int media = 0;
    String mostraAcidentes = "";
    int i;

    for (i = 0; i < 10; i++) {
      totalAcidentes += dados[i].QtdAcidentes;
    }

    media = totalAcidentes / 10;

    JOptionPane.showMessageDialog(null, "Media do número de acidentes" + media);

    for (i = 0; i < 5; i++) {
      if (dados[i].QtdAcidentes > media) {
        mostraAcidentes += dados[i].CodigoCidade + "\n"
            + "Cidade: " + dados[i].NomeCidade + "\n" + "Número de Acidentes: " + dados[i].QtdAcidentes + "\n";
      }
    }

    JOptionPane.showMessageDialog(null, "Cidades com acidentes acima da média \n" + "Cod: " + mostraAcidentes);

  }

}