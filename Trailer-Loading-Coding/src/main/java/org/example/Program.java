package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

    public static void program() {
        //buildTruck(cols, rows);
        String[][] truck;
        String shape;
        String position;
        Map<String, String> shapeMap = new HashMap<>();
        int rows = 52;
        int cols = 10;
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
            truck = buildTruck(cols, rows);
            System.out.println(Arrays.deepToString(truck));

//            Map<Integer, Integer> truck = buildTruck(rows, cols);
//            System.out.println(truck);
        }
    }
//    private static Map<Integer, Integer> buildTruck(int rows, int cols) {
//        Map<Integer, Integer> truckLayout = new HashMap<>();
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                truckLayout.put(j, i);
//            }
//        }
//
//        return truckLayout;
//    }
    private static String[][] buildTruck(int cols, int rows) {
        String[][] truck = new String[cols][rows];
        for (int i = 1; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                truck[i][j] = "0";
            }
        }
        return truck;
    }

    }


