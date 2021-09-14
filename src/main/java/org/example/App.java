package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println("Exercise 15 - Password Validation");
        String knownpassword = "abc$123",pw;
        System.out.print("What is the password? ");
        Scanner in = new Scanner(System.in);
        pw = in.next();
        if(pw.equals(knownpassword))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }

    }
}
