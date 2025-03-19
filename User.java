import java.util.*;
public class User {
    public String name;
    public int age;
    public double marks;
    public User(String name,int age,double marks)
    {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public void displayUserDetails()
    {
        System.out.println("\nUSER DETAILS : ");
        System.out.println("USER NAME : "+this.name);
        System.out.println("USER AGE : "+this.age);
        System.out.println("USER MARKS : "+this.marks);
    }
    public void displayUserDetails(boolean detailed) {
        if (detailed) {
            System.out.println("\n--- Detailed User Report ---");
            System.out.println("Name      : " + name);
            System.out.println("Age       : " + age);
            System.out.println("Marks     : " + marks);
            System.out.println("Result    : " + (marks >= 50 ? "PASS" : "FAIL"));
            System.out.println("-----------------------------");
        } else {
            System.out.println("NO REQUEST PASSED TO DISPLAY ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("entered name is "+name);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("entered age is "+age);
        System.out.println("Enter your marks");
        double marks = sc.nextDouble();
        System.out.println("entered marks is "+marks);
        String examResult;
        if(marks < 50 )
        {
            examResult = "FAIL";
        }
        else{
            examResult = "PASS";
        }
        System.out.println("EXAM RESULT IS  "+examResult);
        System.out.println("List of numbers starting from 1 to "+age);
        for(int i = 1;i<age;i++)
        {
            System.out.println(i);
        }
        char firstLetter = name.charAt(0);
        switch (Character.toLowerCase(firstLetter)) {
            case 'a': case 'b': case 'c': case 'd': case 'e':
            case 'f': case 'g': case 'h': case 'i': case 'j':
            case 'k': case 'l': case 'm': case 'n': case 'o':
            case 'p': case 'q': case 'r': case 's': case 't':
            case 'u': case 'v': case 'w': case 'x': case 'y': case 'z':
                System.out.println("First character of your name is "+firstLetter);
                break;
            default:
                System.out.println("Invalid character");
        }
        User user = new User(name,age,marks);
        user.displayUserDetails();
        user.displayUserDetails(true);
    }
}