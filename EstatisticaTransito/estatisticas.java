class Estatistica {
   String CodigoCidade;
   String NomeCidade;
   int QtdAcidentes;

   // Método Construtor
   Estatistica() {
      this("", "", 0);
   }

   // Método Procedimento
   Estatistica(String codCidade, String nomeCidade, int qtdAcidentes) {
      CodigoCidade = codCidade;
      NomeCidade = nomeCidade;
      QtdAcidentes = qtdAcidentes;
   }
}