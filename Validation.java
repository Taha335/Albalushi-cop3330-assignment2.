/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Taha Al Balushi
 */
package ex27;

import java.util.Scanner;

public class Validation {
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        String first,last,zip,emp;
        System.out.print("Enter the first name: ");
        first=sc.nextLine();
        System.out.print("Enter the last name: ");
        last=sc.nextLine();
        System.out.print("Enter the ZIP code: ");
        zip=sc.nextLine();
        System.out.print("Enter the employee ID: ");
        emp=sc.nextLine();
        System.out.println(validateInput(first,last,zip,emp));

    }
    public  static String validateFirstName(String first)
    {
        String flag="";
        if(first.length()<2) {
            flag = "The first name must be at least 2 characters long.\n";
            if(first.length()==0)
                flag=flag+"The first name must be filled in.\n";
        }
        return flag;
    }
    public  static String validateLastName(String last)
    {
        String flag="";
        if(last.length()<2) {
            flag = "The last name must be at least 2 characters long.\n";
            if(last.length()==0)
                flag=flag+"The last name must be filled in.\n";
        }
        return flag;
    }
    public  static String validateZip(String Zip)
    {
        String flag="";
        int num=0;
        for(int i=0;i<Zip.length();i++)
        {
            if(Character.isDigit(Zip.charAt(i)))
                num++;
        }
        if(num!=Zip.length() || Zip.length()!=5)
            flag="The zipcode must be a 5 digit number.\n";
        return flag;
    }
    public  static String validateEmployeeId(String empID)
    {
        String  flag="";
        boolean fl=false;
        int len=empID.length();
        int num=0;
        if(Character.isLetter(empID.charAt(0)) && Character.isLetter(empID.charAt(1)))
        {
            if(empID.charAt(2)=='-')
            {
                for (int i=3;i<empID.length();i++)
                {
                  if(Character.isDigit(empID.charAt(i)))
                      num++;
                }
            }
            if(num==4)
                fl=true;
        }
        if(!fl)
            flag="The employee ID must be in the format of AA-1234.\n";
        return flag;
    }
    public static String validateInput(String first,String last,String zip,String empId)
    {
        int cnt=0;
        String output="";
        String out1,out2,out3,out4;
        out1=validateFirstName(first);
        if(out1=="")
            cnt++;
        else
            output=output+out1;
        out2=validateLastName(last);
        if(out2=="")
            cnt++;
        else
            output=output+out2;
        out3=validateZip(zip);
        if(out3=="")
            cnt++;
        else
            output=output+out3;
        out4=validateEmployeeId(empId);
        if(out4=="")
            cnt++;
        else
            output=output+out4;
        if(output=="")
            output="There were no errors found.";
return output;
    }
}
