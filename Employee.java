/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Taha Al Balushi
 */
package ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String name;
        ArrayList<String> emp=new ArrayList<>();
        emp.add("John Smith");
        emp.add("Jackie Jackson");
        emp.add("Chris Jones");
        emp.add("Amanda Cullen");
        emp.add("Jeremy Goodwin");
      printList(emp);
      System.out.println();
        System.out.print("Enter an employee name to remove: ");
        name=sc.nextLine();
        emp.remove(name);
        System.out.println();
printList(emp);
    }
    public static void printList(ArrayList<String> emp)
    {
        System.out.println("There are "+emp.size()+" employees:");
        for(int i=0;i<emp.size();i++)
        {
            System.out.println(emp.get(i));
        }
    }
}
