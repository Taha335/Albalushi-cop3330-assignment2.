/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Taha Al Balushi
 */
package ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class FilteringValues {
    static ArrayList<Integer> numbers=new ArrayList<>();
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input[]=sc.nextLine().split(" ");
        for(int i=0;i<input.length;i++)
        {
            numbers.add(Integer.parseInt(input[i]));
        }
        System.out.print("The even numbers are: ");
        ArrayList<Integer> res=filterEvenNumbers();
        for(int j=0;j<res.size();j++)
        {
            System.out.print(res.get(j)+" ");
        }
    }
    public static ArrayList<Integer> filterEvenNumbers()
    {
        ArrayList<Integer> even=new ArrayList<>();
        for(int i=0;i<numbers.size();i++)
        {
            if(numbers.get(i)%2==0)
                even.add(numbers.get(i));
        }
        return even;
    }
}
