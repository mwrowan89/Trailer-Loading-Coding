package org.example;

import java.util.HashMap;
import java.util.Map;

public class Truck {
    public String[][] truck;
    private final int rows;
    private final int cols;
    Shapes shapes = new Shapes();
    Map<String, int[][]> shapeMap = new HashMap<>(shapes.getShapes());


    public Truck(int rows, int cols) {
        this.truck = new String[rows][cols];
        this.cols = cols;
        this.rows = rows;
        buildTruck();
        printTruck();
    }


    public void buildTruck() {
        //Creates an empty grid for shapes to be added into

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                assert truck != null;
                truck[i][j] = "0";
            }
        }
    }

    public void printTruck() {
        //Updates the "truck" grid with shapes that have been successfully added

        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                if(!truck[i][j].equals("0")){
                    switch (truck[i][j]) {
                        //Adds shape with corresponding color to the grid

                        case "I":
                            System.out.print("\u001B[94m" + " I " + "\u001B[0m");
                            break;
                        case "T":
                            System.out.print("\033[1;35m" + " T " + "\u001B[0m");
                            break;
                        case "L":
                            System.out.print("\u001B[38;2;255;165;0m" + " L " + "\u001B[0m");
                            break;
                        case "O":
                            System.out.print("\u001B[93m" + " O " + "\u001B[0m");
                            break;
                        case "J":
                            System.out.print("\u001B[95m" + " J " + "\u001B[0m");
                            break;
                        case "S":
                            System.out.print("\u001B[91m" + " S " + "\u001B[0m");
                            break;
                        case "Z":
                            System.out.print("\u001B[92m" + " Z " + "\u001B[0m");
                            break;
                        case "X":
                            System.out.print("\u001B[94m" + " X " + "\u001B[0m");
                            break;
                    }
                } else {
                    System.out.print(" " + truck[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public void addShape(int position, String shape) {
        //Adds shape to the grid

        int[][] currentShape = shapeMap.get(shape);

        int shapeHeight = currentShape.length;
        int shapeWidth = currentShape[0].length;
        int y = 0;

        while (y + shapeHeight <= rows && shapeCollision(currentShape, position, y)){
            //Uses the shapeCollision function to move the y-axis if the current shape will not fit

            y++;
        }

        if(position + shapeWidth <= cols && y + shapeHeight <= rows) {
            //Checks to see if shape fits within the grid boundaries

            for(int i = 0; i < shapeHeight; i++) {
                for(int j = 0; j < shapeWidth; j++) {
                    if(currentShape[i][j] == 1) {
                            truck[y + i][position + j] = shape;
                    }
                }
            }
        } else {
            System.out.println("SHAPE NOT ADDED!");
            System.out.println("Shape or shapes have exceeded maximum size of the truck.");
        }
    }

    public boolean shapeCollision(int[][] shape, int x, int y) {
        //Checks if shape can be placed in desired position

        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[0].length; j++) {
                if(y + i >= 0 && y + i < rows && x + j >= 0 && x + j < cols) { //checking if shape is inbounds
                    if (shape[i][j] == 1 && !truck[y + i][x + j].equals("0")) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public int findMaxY() {
        //Tracks the maximum depth of the shapes added into the truck and returns the result

        int maxY = 0;
        for(int i = rows - 1; i >= 0; i--) {
            for(int j = cols - 1; j >= 0; j--) {
                if (!truck[i][j].equals("0")) {
                    maxY = i;
                    return maxY;
                }
            }
        }
        return maxY;
    }

}