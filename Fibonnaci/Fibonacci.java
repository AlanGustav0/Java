import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int current = 1;
        int previous = 1;
        int next,number;
        int count = 0;

        Scanner fib = new Scanner(System.in);

        System.out.println("Insert the number: ");
        number = fib.nextInt();

        while(count < number){

            if(count == 0){
                next = 1;
            }else{
                next = current + previous;
                previous = current;
                current = next;
            }
                System.out.print(next + "-");
            count += 1;
        }
    }
}
