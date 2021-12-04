/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Taha Al Balushi
 */
package ex32;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    static int cnt=0;
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Let's play Guess the Number!\n");
        String ch="y";
        int difficulty;
        int inputNum;
        String input;
        Random rand=new Random();
        int compNum;
        do{
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            difficulty=sc.nextInt();
            if(difficulty==1)
                compNum=rand.nextInt(10)+1;
            else if(difficulty==2)
                compNum= rand.nextInt(100)+1;
            else
                compNum=rand.nextInt(1000)+1;
            cnt=0;
            System.out.print("I have my number. What's your guess? ");
            inputNum=takeInput();

            do{
                if(inputNum<compNum){
                    System.out.print("Too low. Guess again: ");
                    inputNum=takeInput();
                }
                else if(inputNum>compNum)
                {
                    System.out.print("Too high. Guess again: ");
                    inputNum=takeInput();
                }
                cnt++;
            }while(inputNum!=compNum);
            System.out.println("You got it in "+cnt+" guesses!\n");
            sc.nextLine();
            System.out.print("Do you wish to play again (Y/N)? ");
            ch=sc.nextLine();
        }while(ch.compareTo("Y")==0 || ch.compareTo("y")==0);
    }
    public static int takeInput()
    {
        String input;
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        do {
            flag=false;
            input = sc.nextLine();
            if(input.compareTo("0")==0) {
                System.out.println("Sorry. That's not a valid input.");
                System.out.print("what's your guess: ");
                flag=true;
                cnt++;
            }
            else {
                for(int i=0;i<input.length();i++)
                {
                    if(Character.isLetter(input.charAt(i)))
                    { flag=true;
                        System.out.println("Sorry. That's not a valid input.");
                        System.out.print("what's your guess: ");
                      cnt++;
                        break;}
                }
            }
        }while(flag);
        return Integer.parseInt(input);
    }
}
