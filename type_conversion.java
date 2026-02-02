public class type_conversion {
       public static void main (String []args)
       {
        // IMPLICIT TYPE CONVERSION (WIDENING)

        int marks = 85;
        double marksdouble = marks; 

        System.out.println("Marks (int): "+marks);
        System.out.println("Marks (Double): " + marksdouble);


        // EXPLICIT TYPE CONVERSION (NARROWING)

        double price = 99.99;
        int priceInt = (int) price;

          System.out.println("Price (double):" +price);
          System.out.println("price(int):" +priceInt);


        //   TYPE CONVERSION BETWEEN CHAR AND INT
        char ch = 'A';
        int asciivalue =ch;

        System.out.println("ASCIIvalue:" +asciivalue);

        int num = 66;
        char newChar =(char)num;

        System.out.println("Number: " +num);

        System.out.println("Character from number: " + newChar);
       }
}
