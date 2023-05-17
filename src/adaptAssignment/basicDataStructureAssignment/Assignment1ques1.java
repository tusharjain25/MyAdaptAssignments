package adaptAssignment.basicDataStructureAssignment;

import java.util.Scanner;

public class Assignment1ques1 {
    static class Armstrong {

        int order(int x) {
            int n = 0;
            while (x != 0) {
                n++;
                x = x / 10;
            }
            return n;
        }

        boolean isArmstrong(int x) {

            int n = order(x);
            int temp = x, sum = 0;
            while (temp != 0) {
                int r = temp % 10;
                sum = (int) (sum + Math.pow(r, n));
                temp = temp / 10;
            }
            return (sum == x);
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Armstrong ob = new Armstrong();
            int x = sc.nextInt();
            System.out.println(ob.isArmstrong(x));
        }
    }
}