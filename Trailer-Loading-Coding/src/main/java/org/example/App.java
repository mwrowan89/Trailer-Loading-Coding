package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        System.out.print("What comes after five?  ");  // prints out a message
        String userInput = input.nextLine();

        if(userInput.equalsIgnoreCase("six")) {
            System.out.println("SIX!");
        } else
            System.out.println("Not Six");
    }
}
