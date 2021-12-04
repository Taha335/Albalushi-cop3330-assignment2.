/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Taha Al Balushi
 */
package ex26;

import java.util.Scanner;
public class PaymentCalculator {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i;
        double b,p;
        System.out.print("What is your balance? ");
        b=sc.nextInt();
        System.out.print("What is the APR on the card (as a percent)? ");
        i=sc.nextInt();
        System.out.print("What is the monthly payment you can make? ");
        p=sc.nextInt();
        n=calculateMonthsUntilPaidOff(i,b,p);
        System.out.print("It will take you "+n+" months to pay off this card.");

    }
    public static int calculateMonthsUntilPaidOff(int i,double b,double p)
    {
        double j=i/365.0;
        int n= (int) ((-1/30.0)*(Math.log(1+(b/p)*(1-Math.pow((1+i),30)))/Math.log(1+i)));
        return  n;
    }
}
