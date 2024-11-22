package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static int rows = 23;
    public static int cols = 10;

    public static void main( String[] args ) {
        Truck truck = new Truck(rows, cols);
        Shapes shapes = new Shapes();
        String[] parts;
        String shape;
        String position;
        boolean inputs = true;
        Map<String, int[][]> shapeMap = new HashMap<>(shapes.getShapes());

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To The Trailer-Loader-Coder!");

        while (inputs) {
            System.out.println("Enter input (x-coordinate (0-9)");
            System.out.println("+ a Shape (O, I, S, Z, L, J, T))");
            System.out.println("Separate each input with a single comma.");
            System.out.println("example: 4I, 5T, 1L,...");
            System.out.print("Inputs: ");
            String userInput = input.nextLine();

            if(userInput.equalsIgnoreCase("")){
                System.out.println("Invalid Entry.");
                System.out.println("Provide a valid entry.");
                continue;
            }

            parts = userInput.split(",");

            for(String part : parts) {
                part = part.trim();
                position = part.substring(0, 1).toUpperCase();
                shape = part.substring(1).toUpperCase();
                if (part.substring(0, 1).equalsIgnoreCase(" ") || part.substring(1).equalsIgnoreCase(" ")) {
                    System.out.println("Invalid Entry.");
                    System.out.println("Provide a valid entry.");
                    continue;
                }
                if(!shapeMap.containsKey(shape)){
                    System.out.println("Invalid Entry.");
                    System.out.println("Provide a valid entry.");
                    continue;
                }
                if (part.length() < 2) {
                    System.out.println("Invalid Entry.");
                    System.out.println("Please provide a valid entry.");
                    continue;
                }
                if(Integer.parseInt(position) > 10 || Integer.parseInt(position) < 0){
                    System.out.println("Invalid Entry.");
                    System.out.println("Please provide a valid entry.");
                    continue;
                }
                //TODO protect against double letter inputs
                truck.addShape(Integer.parseInt(position), shape);
            }

                truck.printTruck();
                System.out.println("Max Y: " + truck.findMaxY());



                System.out.println();
                System.out.println("Add another shape? (Y/N)");
                String userResponse = input.nextLine();


                if (userResponse.equalsIgnoreCase("N")) {
                    inputs = false;
                }
        }
        }
}
