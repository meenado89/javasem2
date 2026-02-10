import java.util.Scanner;

public class loop {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // 1. Create Scanner to take input

        System.out.print("Enter initial value of i: ");
        int i = sc.nextInt();                  // 2. User enters starting value of i

        while (i <= 5) {                       // 3. Loop runs while i <= 5

             i++;                               // 4. Increase i by 1
            System.out.print(i + " ");         // 5. Print current value of i
           
        }
    }
}