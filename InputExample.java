import java.util.Scanner;

public class InputExample
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hi," + name + ",Welcome!");
        scanner.close();
    }
}