/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob DeBerry
 */
package oop.exercises;
import java.util.Scanner;

public class ComputingSimpleInterest
{
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("Enter the principal: ");
        String input = in.nextLine();
        double principal = Double.parseDouble(input);
        System.out.print("Enter the rate of interest: ");
        input = in.nextLine();
        double interestRate = Double.parseDouble(input);
        System.out.print("Enter the number of years: ");
        input = in.nextLine();
        int years = Integer.parseInt(input);

        //processing
        double investment = principal * (1 + interestRate / 100 * years);
        if ((investment * 1000) % 10 > 5)
        {
            investment += 0.01; //rounds to next penny
        }

        //output
        System.out.printf("After %d years at %.2f%%, the investment will be worth $%.2f.", years, interestRate,
                                                                                                    investment);
    }
}
