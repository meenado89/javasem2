import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {

        // USING DOWHILE LOOP
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a number to print its table: ");
        int tableNum = sc.nextInt();
        int j = 1;

        System.out.println("Multiplication Table:");
        do {
            System.out.println(tableNum + " x " + j + " = " + (tableNum * j));
            j++;
        } while (j <= 10);

        sc.close();
    }
}
