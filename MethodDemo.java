public class MethodDemo {

    // METOD WITHOUT PARAMETERS AND WITHOUT RETURN TYPE

    void greet() {

        System.out.println("Welcome to Java Programming! ");
    }

    // METHOD WITH PARAMETERS AND WITHOUT RETURN TYPE

    void displaySum(int a, int b) {

        int sum = a + b;
        System.out.println("Sum is: " + sum);

    }

    // METHOD WITH PARAMETERS AND WITH RETURN TYPE
    int multiply(int a, int b) {
        return a * b;
    }

    // METHOD OVERLOADING: SAME METHOD NAME, DIFFRENT PARAMETERS
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {

        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        MethodDemo obj = new MethodDemo();

        // CALLING METHODS
        obj.greet();
        obj.displaySum(10, 20);

        int result = obj.multiply(5, 4);
        System.out.println("Multiplication result: " + result);

        // CALLING OVERLOAD MEATHODS
        System.out.println("Add two integers: " + obj.add(10, 20));
        System.out.println("Add THREE Integers: " + obj.add(10, 20, 30));
        System.out.println("Add doubles: " + obj.add(5.5, 4.5));
    }

}
