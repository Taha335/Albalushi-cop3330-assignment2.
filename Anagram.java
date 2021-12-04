/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Taha Al Balushi
 */
package ex24;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
public static void main(String ar[])
{
    Scanner sc=new Scanner(System.in);
    String first,second;
    System.out.println("Enter two strings and I'll tell you if they are anagrams:");
    System.out.print("Enter the first string: ");
    first=sc.nextLine();
    System.out.print("Enter the second string: ");
    second=sc.nextLine();
    if(isAnagram(first,second))
        System.out.println("\""+first+"\" and \""+second+"\" are anagrams");
    else
        System.out.println("\""+first+"\" and \""+second+"\" are not anagrams");
}
    static boolean isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }
       return status;
    }
}
