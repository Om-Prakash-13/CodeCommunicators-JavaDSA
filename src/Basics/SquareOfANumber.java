package Basics;
import java.util.Scanner;

public class SquareOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double x = sc.nextDouble();
        double square = x * x;
        System.out.println("Square of "+x+" is: "+square);
    }
}
