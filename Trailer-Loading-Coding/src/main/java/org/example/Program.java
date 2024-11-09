package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void program() {
        String shape;
        String position;
        Map<String, String> shapeMap = new HashMap<>();
        int rows = 52;
        int cols = 10;
        //buildTruck(cols, rows);

        boolean inputs = true;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Trailer-Loader-Coder!");

        while (inputs) {
            System.out.print("Please enter a number and shape: ");
            String userInput = input.nextLine();

            position = userInput.substring(0, 1).toUpperCase();
            shape = userInput.substring(1).toUpperCase();

            if (position.equalsIgnoreCase("") || shape.equalsIgnoreCase("")) {
                System.out.println("Invalid Entry.");
                System.out.println("Provide a valid entry.");
                continue;
            }
            if (userInput.length() > 2) {
                System.out.println("Invalid Entry.");
                System.out.println("Please provide a valid entry.");
                continue;
            }

            shapeMap.put(position, shape);

            System.out.println("Position: " + position);
            System.out.println("Shape: " + shape);
            System.out.println(shapeMap);
            System.out.println("Add another shape? (Y/N)");
            String userResponse = input.nextLine();

            if (userResponse.equalsIgnoreCase("N")) {
                inputs = false;
            }
            //System.out.println(buildTruck(cols, rows));
        }
    }

    }


