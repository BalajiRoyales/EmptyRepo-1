import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) 
    {

        Scanner reader = new Scanner(System.in);
        system.out .print("Java is programming laguage");

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
