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

    //TODO change print truck to display different colors and shape values


    public void buildTruck() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                assert truck != null;
                truck[i][j] = "0";
            }
        }
    }

    public void printTruck() {
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++){
                System.out.print("  " + truck[i][j]);
            }
            System.out.println();
        }
    }

    public void addShape(String shape, int position) {
        //TODO add protections against shapes overflowing the length of the truck
        int[][] currentShape = shapeMap.get(shape);

        int shapeHeight = currentShape.length;
        int shapeWidth = currentShape[0].length;
        int y = 0;

        while (y + shapeHeight <= rows && shapeCollision(currentShape, position, y)){
            y++;
        }

        if(position + shapeWidth <= cols && y + shapeHeight <= rows) {
            for(int i = 0; i < shapeHeight; i++) {
                for(int j = 0; j < shapeWidth; j++) {
                    if(currentShape[i][j] == 1) {
                            truck[y + i][position + j] = "\u001B[94m" + "1" + "\u001B[0m";
                    }
                }
            }
        } else {
            System.out.println("SHAPE NOT ADDED!");
            System.out.println("Shape or shapes have exceeded maximum size of the truck.");
        }
    }

    public boolean shapeCollision(int[][] shape, int x, int y) {
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[0].length; j++) {
                if(y + i >= 0 && y + i < rows && x + j >= 0 && x + j < cols) { //checking if shape is inbounds
                    if (shape[i][j] == 1 && (truck[y + i][x + j].equals("\u001B[94m" + "1" + "\u001B[0m"))) {
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