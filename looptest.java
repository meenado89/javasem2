import java.util.Scanner;

public class looptest {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter the initial value");
        int i = input.nextInt();
        while (i <= 10) {
                System.out.println("values = "+i*2);
                i++;
        }

        
    }
}
