package adaptAssignment.basicDataStructureAssignment;

import java.util.Scanner;

public class Assignment1ques3 {
    public static double simpleInterest(double principalAmount,int time,double interestRate){
        return (principalAmount*interestRate*time)/100;
    }
    public static double compoundInterest(double principalAmount,int time,double interestRate){
        return (int) (principalAmount*(1+interestRate))^(int) (time-principalAmount);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double principalAmount=sc.nextDouble();
        int time=sc.nextInt();
        double interestRate=sc.nextDouble();
        System.out.println(simpleInterest(principalAmount, time, interestRate));
        System.out.println(compoundInterest(principalAmount,time,interestRate));
    }
}
