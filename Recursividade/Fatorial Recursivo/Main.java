import java.util.Scanner;

public class Main {
    public static void main (String[] args){
      
      Scanner sc = new Scanner(System.in);

      System.out.print("Insira o valor desejado: ");
      int numero = sc.nextInt();

      System.out.print("O fatorial do número é: " + recursividade(numero));

      sc.close();

  }

  public static int recursividade(int numero){

      if(numero == 1){
        return numero;
      }else if(numero == 0){
        return 1;
      }else{
        return numero * recursividade(numero - 1);
      }

  }
