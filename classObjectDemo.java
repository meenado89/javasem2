
// DEFINE A CLASS
class Student {

    // DATA MEMBERS(INSTANCE VARIABLES)
    int rollNo;
    String name;
    double marks;

    // METHOD TO ASSIGN VALUES
    void setDetails(int r, String n, double m)
    {
     rollNo=r;
     name=n;
     marks=m;

    }

    // METHOD TO DISPLAY VALUES
    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("-----------------------");
    }

}

// MAIN CLASS

public class classObjectDemo {
    public static void main(String[] args) {

        // CREATING FIRST OBJECT
        Student s1 = new Student();
        s1.setDetails(101, "Prabh", 85.5);
        s1.displayDetails();

        // Creating second object
        Student s2 = new Student();
        s2.setDetails(102, "Aman", 90.0);
        s2.displayDetails();
    }

}
