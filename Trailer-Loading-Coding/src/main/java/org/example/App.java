package org.example;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        String shape;
        String position;
        Map<String, String> shapeMap = new HashMap<>();
        boolean inputs = true;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Trailer-Loader-Coder!");
        while(inputs){
            System.out.print("Please enter a number and shape: ");
            String userInput = input.nextLine();

            position = userInput.substring(0,1).toUpperCase();
            shape = userInput.substring(1).toUpperCase();
            shapeMap.put(position, shape);

            if(position.equalsIgnoreCase("") || shape.equalsIgnoreCase("")){
                System.out.println("Invalid Entry.");
                input.close();
                System.exit(0);
            }

            System.out.println("Position: " + position);
            System.out.println("Shape: " + shape);
            System.out.println(shapeMap);
            System.out.println("Add another shape? (Y/N)");
            String userResponse = input.nextLine();

            if(userResponse.equalsIgnoreCase("N")){
                System.exit(1);
            }
        }

    }
}
