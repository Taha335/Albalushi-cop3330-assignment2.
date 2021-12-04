/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Taha Al Balushi
 */
package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Winner {
    static ArrayList<String> winner=new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String ar[]) {
        Random rand=new Random();
        getInput();
        int i= rand.nextInt(winner.size())+1;
        System.out.print("The winner is ...."+winner.get(i-1));

    }
    public static void getInput()
    {
        String entry;
        do{
            System.out.print("Enter a name: ");
            entry=sc.nextLine();
            if(entry.length()!=0)
            winner.add(entry);
        }while(entry.length()!=0);
    }
}
