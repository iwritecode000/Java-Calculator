package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        float num1, num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        num1 = scan.nextFloat();

        System.out.println("Enter second number");
        num2 = scan.nextFloat();

        System.out.println("You have entered " + num1 + " and " + num2);

        String promt = "Enter 0 for addition, 1 for subtraction, 2 for multiplication, 3 for division";
        System.out.println(promt);

        int input = scan.nextInt();

        switch (input) {
            case 0:
                System.out.print("Addition of " + num1 + " and " + num2 + " is ");
                System.out.println(num1 + num2);
                break;

            case 1:
                System.out.print("Subtraction of " + num1 + " and " + num2 + " is ");
                System.out.println(num1 - num2);
                break;

            case 2:
                System.out.print("Multiplication of " + num1 + " and " + num2 + " is ");
                System.out.println(num1 * num2);
                break;

            case 3:
                System.out.print("Division of " + num1 + " and " + num2 + " is ");
                System.out.println(num1 / num2);
                break;

            default:
                System.out.println("Invalid Input");
        }
    }
}
