/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Taha Al Balushi
 */
package ex31;

import java.util.Scanner;

public class Karvonen {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int age,restingHR,TargetHeartRate;
        String rate,ageStr;
        boolean flag=false;
        do{
            flag=false;
            System.out.print("Resting Pulse: ");
            rate=sc.nextLine();
            System.out.print("Age: ");
            ageStr=sc.nextLine();
            if(rate.compareTo("0")==0 ) {
                System.out.println("Sorry. That's not a valid input for Resting pulse.");
                flag=true;
            }
            else if(ageStr.compareTo("0")==0)
            {
                System.out.println("Sorry. That's not a valid input for age.");
                flag=true;
            }
            else {
                for(int i=0;i<rate.length();i++)
                {
                    if(Character.isLetter(rate.charAt(i)))
                    { flag=true;
                        System.out.println("Sorry. That's not a valid input for Resting pulse.");
                        break;}
                }
                for(int i=0;i<ageStr.length();i++)
                {
                    if(Character.isLetter(ageStr.charAt(i)))
                    { flag=true;
                        System.out.println("Sorry. That's not a valid input for age.");
                        break;}
                }
            }
        }while(flag);
        restingHR=Integer.parseInt(rate);
        age=Integer.parseInt(ageStr);
        System.out.println("Intensity\t | Rate");
        System.out.println("---------\t | ---------");
        for(int i=55;i<=95;i=i+5)
        {
            TargetHeartRate = (((220- age) - restingHR) * i/100) + restingHR;
            System.out.format("%d%s %11s %2d %s\n",i,"%","|",TargetHeartRate," bpm");
        }


    }
}
