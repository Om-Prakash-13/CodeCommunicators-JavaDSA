package M3_Loops;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number n");
        int n = sc.nextInt();

        for(int i = 1; i<=n*2; i += 2){
            System.out.println("Hello World");
        }
    }
}
