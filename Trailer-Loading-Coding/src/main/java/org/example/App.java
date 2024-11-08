package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        String shape = "";
        String position = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Trailer-Loader-Coder!");
        System.out.print("Please enter a number and shape: ");
        String userInput = input.nextLine();

        position = userInput.substring(0,1).toUpperCase();
        shape = userInput.substring(1).toUpperCase();

        if(position.equalsIgnoreCase("") || shape.equalsIgnoreCase("")){
            System.out.println("Invalid Entry.");
            System.exit(0);
        }

        if(position.equalsIgnoreCase("6")) {
            System.out.println("SIX!");
        } else
            System.out.println("Not Six");

        System.out.println("Position: " + position);
        System.out.println("Shape: " + shape);
    }
}
