package M2_Conditionals;

import java.util.Scanner;

public class GreaterOf3Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3) System.out.println(num1+"Is greatest.");
        if(num2 > num1 && num2 > num3) System.out.println(num2+"Is greatest.");
        if(num3 > num2 && num3 > num1) System.out.println(num3+"Is greatest.");
    }
}
