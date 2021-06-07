package com.examples;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jesus Rodriguez
 */
public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        int Length;
        System.out.print("What is the length of the room in feet? ");
            Length  = myObj.nextInt();

        int Width;
        System.out.print("What is the width of the room in feet? ");
            Width = myObj.nextInt();

        double Area = Length * Width;
        int Gallons = (int) Math.ceil(Area / 350);


        System.out.println("You will need to purchase " + Gallons + " gallons of pain to cover " + Area + " square feet");

    }
}
