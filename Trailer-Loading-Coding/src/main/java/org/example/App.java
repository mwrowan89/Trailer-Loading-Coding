package org.example;


import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static int rows = 23;
    public static int cols = 10;
    public static void main( String[] args ) {
        Truck truck = new Truck(rows, cols);
        Shapes shapes = new Shapes();
        String shape;
        String position;
        boolean inputs = true;

        Map<String, int[][]> shapeMap = new HashMap<>(shapes.getShapes());


        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Trailer-Loader-Coder!");

        while (inputs) {
            System.out.print("Please enter a number and shape: ");
            String userInput = input.nextLine();
            shape = userInput.substring(1).toUpperCase();

            if (userInput.substring(0, 1).equalsIgnoreCase(" ") || userInput.substring(1).equalsIgnoreCase("")) {
                System.out.println("Invalid Entry.");
                System.out.println("Provide a valid entry.");
                continue;
            }
            if(!shapeMap.containsKey(shape)){
                System.out.println("Invalid Entry.");
                System.out.println("Provide a valid entry.");
                continue;
            }
            if (userInput.length() > 2) {
                System.out.println("Invalid Entry.");
                System.out.println("Please provide a valid entry.");
                continue;
            }

                position = userInput.substring(0, 1).toUpperCase();
                shape = userInput.substring(1).toUpperCase();


                truck.addShape(shape,Integer.parseInt(position));
                truck.printTruck();

                System.out.println("Position: " + position);
                System.out.println("Shape: " + shape);
                System.out.println();
                System.out.println("Add another shape? (Y/N)");
                String userResponse = input.nextLine();


                if (userResponse.equalsIgnoreCase("N")) {
                    inputs = false;
                }
//            position = userInput.substring(0, 1).toUpperCase();
//            shape = userInput.substring(1).toUpperCase();
//
//            shapeMap.put(position, shape);
//            truck.addShape(shape,Integer.parseInt(position));
//            truck.printTruck();
//
//            System.out.println("Position: " + position);
//            System.out.println("Shape: " + shape);
//            System.out.println();
//            System.out.println("Add another shape? (Y/N)");
//            String userResponse = input.nextLine();
//
//
//            if (userResponse.equalsIgnoreCase("N")) {
//                inputs = false;
//            }
        }
        }
}
