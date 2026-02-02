import java.util.Scanner;

public class ifelse {
    public static void main(String[] args)

    {
        Scanner sc = new
        Scanner(System.in);
        // 1
        // USING IF-ELSE: CHECK WHETHER A NUMBER IS POSITIVE, NEGATIVE, OR ZERO

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if(num>0){
            System.out.println("The Number is positive. ");
        }else if (num<0){System.out.println("The Number is negative. ");}else{
            System.out.println("The Number is Zero. ");
        }

    }      
}
