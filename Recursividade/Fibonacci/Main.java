import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.print(fibonacci(i) + " - ");
    }
  }

  public static int fibonacci(int numero) {

    if (numero < 2) {
      return numero;
    } else {
      return fibonacci(numero - 1) + fibonacci(numero - 2);
    }
  }
}
