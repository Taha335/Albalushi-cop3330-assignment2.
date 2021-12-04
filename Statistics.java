/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Taha Al Balushi
 */
package ex36;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Statistics {
    static ArrayList<Integer> numbers=new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    public static void main(String ar[])
{
        getInput();
        printNumbers();
        System.out.println();
        System.out.println("The average is "+calculateAverage());
        System.out.println("The minimum is "+calculateMin());
        System.out.println("The maximum is "+calculateMax());
        System.out.format("%s %.2f","The standard deviation is ",calculateDeviation());
}
    public static int calculateMax()
    {
        int max=numbers.get(0);
        for(int i=0;i<numbers.size();i++)
        {
            if(max<=numbers.get(i))
                max=numbers.get(i);
        }
        return max;
    }
    public static int calculateMin()
    {
        int min=numbers.get(0);
        for(int i=0;i<numbers.size();i++)
        {
            if(min>=numbers.get(i))
                min=numbers.get(i);
        }
        return min;
    }
    public static double calculateAverage()
    {
        double avg;
        int sum=0;
        for(int i=0;i<numbers.size();i++)
        {
            sum=sum+numbers.get(i);
        }
        avg=(double) (sum/numbers.size());
        return avg;
    }
    public static double calculateDeviation()
    {
        double av=calculateAverage();
        double std;
        double sum=0;
        for(int i=0;i<numbers.size();i++)
        {
            sum=sum+Math.pow((numbers.get(i)-av),2);
        }
        std=Math.sqrt(sum/numbers.size());
        return std;
    }
    public static void getInput()
    {
        String input;
        do{
            System.out.print("Enter a number: ");
            input=sc.nextLine();
            if(input.toLowerCase().compareTo("done")!=0)
                numbers.add(Integer.parseInt(input));
        }while(input.toLowerCase().compareTo("done")!=0);
    }
    public static void printNumbers()
    {
        System.out.print("Numbers: ");
        for(int i=0;i<numbers.size();i++)
        {
            System.out.print(numbers.get(i)+"  ");
        }
    }
}
