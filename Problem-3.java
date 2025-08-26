import java.util.Scanner;

// Problem - 3

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a: ");
        int a = scanner.nextInt();


        if (a % 2 == 0) {
            a -= 1;
        }

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
