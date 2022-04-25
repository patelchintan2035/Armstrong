package edu.chintanpatel.tutorials.java;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int originalNumber = input.nextInt();
        int arm, sum = 0, tempNumber;
        tempNumber = originalNumber;

        while (tempNumber != 0)
        {
            arm = tempNumber % 10;
            sum = sum + (arm * arm * arm);
            tempNumber = tempNumber / 10;
        }
        if (sum == originalNumber) {
            System.out.println("Enter number " + originalNumber + " is an armstrong number");
        }
        else {
            System.out.println("Enter number " + originalNumber + " is not an armstrong number");
        }
    }
}
