package sistemavotacao;

//***********************CLASSE ABSTRATA***********

public class Votacao {
    int numeroSecao;
    int numeroCandidato;
    
    Votacao(){
        this(0,0);
    }
    
    Votacao(int secao, int candidato){
        numeroSecao = secao;
        numeroCandidato = candidato;
    }
    
}
