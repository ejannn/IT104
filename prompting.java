import java.util.Scanner;


public class prompting
{
    public static void main(String[]args)
    {   
        
        Scanner scanner = new Scanner(System.in);
        menu();
        System.out.print("Enter first num: ");
        int a = scanner.nextInt();
        System.out.print("Enter second num: ");
        int b = scanner.nextInt();
        scanner.close();

        System.out.println(sum(a,b));
        System.out.println(diff(a,b));
        System.out.println(prod(a,b));
        System.out.println(qou(a,b));
    }

private static String menu()
{
    System.out.print("Welcome to Calculator\n");
    return " ";

}

private static String sum(int num1 , int num2)
{
    return "The Sum of " + num1 + " and " + num2 + " is " + (num1 + num2);
}
private static String diff(int num1 , int num2)
{
    return "The Difference of " + num1 +" and " + num2 + " is " + (num1 - num2);
}
private static String prod(int num1 , int num2)
{
    return "The Product of " + num1 +" and " + num2 + " is " + (num1 * num2);
}
private static String qou(double num1 , double num2)
{
    return "The Qoutient of " + num1 +" and " + num2 + " is " + (num1 / num2);
}
}