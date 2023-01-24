import java.util.Scanner;
public class Calculate {

    static int DoCalculate() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter a number: ");
        int num2 = scanner.nextInt();

        return num1 + num2;
    }

}

