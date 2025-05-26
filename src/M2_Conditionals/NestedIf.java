package M2_Conditionals;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();

        if(num1 > 0){
            if(num1 > 100) System.out.println("Number is positive also greater than 100.");
            else System.out.println("Number is positive but less than or equals to 100.");
        }else {
            System.out.println("Number is negative.");
        }
    }
}
