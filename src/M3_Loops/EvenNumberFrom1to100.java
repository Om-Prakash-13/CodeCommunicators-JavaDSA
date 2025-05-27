package M3_Loops;
public class EvenNumberFrom1to100 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0)
                System.out.print(i+" ");
        }
        System.out.println("\nMethod 2");
        for(int i = 2 ; i<= 100; i += 2){
            System.out.print(i+" ");
        }
        System.out.println("\nMethod 3");
        for (int i = 1; i <= 100; i+=2){
            System.out.print(i+1+" ");
        }
    }
}