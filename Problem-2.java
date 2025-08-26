import java.util.Scanner;

// Problem - 2

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a: ");
        int a = scanner.nextInt();


        int number = 1;
        for (int i = 0; i < a; i++) {
            System.out.print(number);
            if (i < a - 1) {
                System.out.print(", ");
            }
            number += 2;
        }

        scanner.close();
    }
}
