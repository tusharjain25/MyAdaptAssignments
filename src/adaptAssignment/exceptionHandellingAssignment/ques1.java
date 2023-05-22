package adaptAssignment.exceptionHandellingAssignment;

import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        try {
            int res = num1 / num2;
            System.out.println("Result : " + res);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("ArithmeticException occurred");
        }

    }
}
