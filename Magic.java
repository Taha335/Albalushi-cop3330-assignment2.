/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Taha Al Balushi
 */
package ex33;

import java.util.Random;
import java.util.Scanner;

public class Magic {
    public static void main(String ar[])
    {
        String choice[]={"Yes","No","Maybe","Ask again later"};
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        String ques;
        System.out.println("What's your question?");
        ques=sc.nextLine();
        int i= rand.nextInt(4)+1;
        System.out.println(choice[i]);
    }
}
