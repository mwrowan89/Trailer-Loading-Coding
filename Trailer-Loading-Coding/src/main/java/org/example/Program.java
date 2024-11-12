package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static int rows = 52;
    public static int cols = 10;
    public static String[][] truck = buildTruck(rows, cols);

    public static void program() {
        String shape;
        String position;
        Map<String, String> shapeMap = new HashMap<>();
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
        }
    }

    private static String[][] buildTruck(int rows, int cols) {
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                assert truck != null;
                truck[i][j] = "0";
            }
        }
        return truck;
    }

    private static void printTruck(int rows, int cols) {
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                System.out.print("  " + truck[i][j] + "");
            }
        }
    }

    }


