import java.util.Scanner;

public class calculator2{
    static int num1 = 0, num2 = 0, sum = 0, diff = 0, prod = 0; 
    static float quotient = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]args) {
        calculatorMenu();
    }

    static void calculatorMenu() {
        clearScreen();
        operationsMenu();
        int choice = 0;
        
         do {
        print("\nEnter choice (1-5): ");
        if (scanner.hasNextInt()) {
            choice = scanner.nextInt();
            if (choice < 1 || choice > 5) {
                clearScreen();
                System.out.println("Invalid Input. Please enter a number between 1 and 5.");
            } else {
                break;
            }
        } else {
            clearScreen();
            scanner.next(); 
            System.out.println("Invalid Input. Please enter a valid number between 1 and 5.");
        }
        } while (true);
        switch (choice) {
            case 1:
                add();
                break;
            case 2:
                subtract();
                break;
            case 3:
                multiply();
                break;
            case 4:
                divide();
                break;
            case 5:
                exitMessage();
                break;
        }
    }
    
    static void operationsMenu(){
        System.out.println("╔═══════════════════════╗");
        System.out.println("║  C A L C U L A T O R  ║");
        System.out.println("║═══════════════════════║");
        System.out.println("║ 1. Addition           ║");
        System.out.println("║ 2. Subtraction        ║");
        System.out.println("║ 3. Multiplication     ║");
        System.out.println("║ 4. Division           ║");
        System.out.println("║ 5. End Program        ║");
        System.out.println("╚═══════════════════════╝");
    }

    static void add(){
        clearScreen();
        print("╔═════════════════════════╗\n");
        print("║   WELCOME TO ADDITION   ║\n");
        print("╚═════════════════════════╝\n");
        userAdd();
        sum = num1 + num2;
        System.out.printf(" The sum of %d and %d is \n    %d\n", num1, num2, sum);
        if (tryAgain()){
            calculatorMenu();
        }
        // else{
        //     clearScreen();
        //     exitMessage();
        // }
    }

    static void subtract(){
        clearScreen();
        print("╔════════════════════════════╗\n");
        print("║   WELCOME TO SUBTRACTION   ║\n");
        print("╚════════════════════════════╝\n");
        userAdd();
        diff = num1 - num2;
        System.out.printf(" The difference of %d and %d is \n    %d\n", num1, num2, diff);
        if (tryAgain()){
            calculatorMenu();
        }
        // else{
        //     clearScreen();
        //     exitMessage();
        // }
    }

    static void divide(){
        clearScreen();
        print("╔═════════════════════════╗\n");
        print("║   WELCOME TO DIVISION   ║\n");
        print("╚═════════════════════════╝\n");
        System.out.print(" Enter first num: ");
        float num1 = scanner.nextInt();
        float num2 ;
        do{
        System.out.print(" Enter second num: ");
        num2 = scanner.nextInt();
        if(num2 == 0){
            print("Cannot be divided by zero:\n Please enter non-zero: ");
        }
        } while (num2 == 0);
        
        float quotient = num1 / num2;
        System.out.printf(" The qoutient of %.2f and %.2f is\n    %.2f\n", num1, num2, quotient);
        if (tryAgain()){
            calculatorMenu();
        }
        // else{
        //     clearScreen();
        //     exitMessage();
        // }
    }

    static void multiply(){
        clearScreen();
        print("╔═══════════════════════════════╗\n");
        print("║   WELCOME TO MULTIPLICATION   ║\n");
        print("╚═══════════════════════════════╝\n");
        userAdd();
        prod = num1 * num2;
        System.out.printf(" The product of %d and %d is\n    %d\n", num1, num2, prod);
        if (tryAgain()){
           calculatorMenu();
        }
        // else{
        //     clearScreen();
        //     exitMessage();
        // }
        
    }

    static void userAdd() {
        print(" Enter first num: ");
        num1 = scanner.nextInt();
        print(" Enter second num: ");
        num2 = scanner.nextInt();
    }

    static void print(String word){
        System.out.print(word);
    }
    static boolean tryAgain(){
        char retry = ' ';
        boolean isTryAgain = true;
        do {
            
            print("  \nDo you want to Calculate again? (y/n)");
            retry = scanner.next().charAt(0);

            if (retry != 'n' && retry != 'N' && retry != 'y' && retry != 'Y') {
                clearScreen();
                print("  Invalid input");
            } else if (retry == 'y' || retry == 'Y') {
                isTryAgain = true;
                break;
            } else {
                isTryAgain = false;
                clearScreen();
                exitMessage();
                break;
            }
        } while (true);

       return isTryAgain;
    }
    static void clearScreen(){
        try {
           new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
       } catch (Exception e) {
           e.printStackTrace();
       }
    } 
    
    static void exitMessage(){
        clearScreen();
        print("Program Ended");
        System.exit(0);
    }
}