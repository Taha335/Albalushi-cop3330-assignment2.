/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Taha Al Balushi
 */
package ex29;

import java.util.Scanner;

public class HandlingBadInput {
    public static void main(String sr[])
    {
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        String rate;
        do{
            flag=false;
            System.out.print("What is the rate of return? ");
            rate=sc.nextLine();
            if(rate.compareTo("0")==0) {
                System.out.println("Sorry. That's not a valid input.");
                flag=true;
            }
            else {
                for(int i=0;i<rate.length();i++)
                {
                    if(Character.isLetter(rate.charAt(i)))
                    { flag=true;
                    System.out.println("Sorry. That's not a valid input.");
                        break;}
                }
            }
        }while(flag);
        int r=Integer.parseInt(rate);
        int years=72/r;
        System.out.println("It will take "+years+" years to double your initial investment.");
    }
}
