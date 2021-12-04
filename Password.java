/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Taha Al Balushi
 */
package ex37;

import java.util.Random;
import java.util.Scanner;

public class Password {
    static String password="";
    public static void main(String ar[])
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int len=sc.nextInt();
        System.out.print("How many special characters? ");
        int numChar=sc.nextInt();
        System.out.print("How many numbers? ");
        int num=sc.nextInt();
        generateLetter(len,num,numChar);
        generateNumber(num);
        generateSpecialCharacter(numChar);
        System.out.println(password);
    }
    public static void generateLetter(int len,int num, int numChar)
    {
        Random ran=new Random();
        char cht[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int ch=len-(num+numChar);
        for(int i=0;i<ch;i++)
        {
            int n=ran.nextInt(26)+1;
            password=password+cht[n-1];
        }
    }
    public static void generateNumber(int num)
    {
        int number[]={0,1,2,3,4,5,6,7,8,9};
        Random ran=new Random();
        for(int i=0;i<num;i++)
        {
            int n=ran.nextInt(10)+1;
            password=password+number[n-1];
        }
    }
    public static void generateSpecialCharacter(int numChar)
    {
        char character[]={'!','@','#','$','%','^','&','*'};
        Random ran=new Random();
        for(int i=0;i<numChar;i++)
        {
            int n=ran.nextInt(8)+1;
            password=password+character[n-1];
        }
    }
}
