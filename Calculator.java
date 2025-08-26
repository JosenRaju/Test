import java.util.Scanner;

// Problem = 1
//Used Java program
public class Calculator {

    public double calculator(double a, double b, String operator){
        switch (operator.toLowerCase()){
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply" :
                return a * b;
            case "divide":
                if(b == 0){
                    System.out.println("Error : divison by zero is not allowed");
                    return Double.NaN;
                }
                return a /b;
            default:
                System.out.println("Error : invalid operator");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator cal = new Calculator();

        System.out.println("Enter the a number : ");
        double a = scan.nextDouble();

        System.out.println("Enter the b number : ");
        double b = scan.nextDouble();

        System.out.println("Enter the Operator add, subtract, multiply,divide");
        String operator = scan.next();

        double result = cal.calculator(a,b,operator);

        if(!Double.isNaN(result)){
            System.out.println("Result : "+ result);
        }
        scan.close();
    }
}