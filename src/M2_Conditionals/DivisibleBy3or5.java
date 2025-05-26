package M2_Conditionals;

import java.util.Scanner;

public class DivisibleBy3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num % 3 == 0 || num % 5 == 0){
            System.out.println("divisibe by either 3 or 5 or both.");
        }else {
            System.out.println("Neither divisible by 3 nor by 5.");
        }
    }
}
