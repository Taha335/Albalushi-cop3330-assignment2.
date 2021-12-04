/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Taha Al Balushi
 */
package ex28;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int num;
        for(int i=1;i<=5;i++)
        {
            System.out.print("Enter a number: ");
            num=sc.nextInt();
            sum=sum+num;
        }
        System.out.print("The total is "+sum+".");
    }
}
