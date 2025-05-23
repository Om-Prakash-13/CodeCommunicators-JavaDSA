package M1_Basics;

public class SimpleIntrest {
    public static void main(String[] args) {
        int p = 400000;
        float r = 5.5f;
        double t = 7.5;

        double si = (p * r * t)/100;
        System.out.println("Simple Interest = "+si);
        double ra = p + si;
        System.out.println("Total Return Amt = "+ra);
    }
}
