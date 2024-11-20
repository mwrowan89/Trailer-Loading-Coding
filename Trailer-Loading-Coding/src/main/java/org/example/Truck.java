package org.example;

import java.util.Arrays;
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
        int[][] currentShape = shapeMap.get(shape);

        int shapeHeight = currentShape.length;
        int shapeWidth = currentShape[0].length;

        System.out.println("Shape height: " + shapeHeight);
        System.out.println("Shape width: "+ shapeWidth);

        System.out.println("Pos: " + Arrays.deepToString(currentShape));
        System.out.println("Len: " + currentShape.length);

        if(position + shapeWidth <= cols) {
            for(int i = 0; i < shapeHeight; i++) {
                for(int j = 0; j < shapeWidth; j++) {
                    if(currentShape[i][j] == 1) {
                        truck[i][position + j] = "\u001B[94m" + "1" + "\u001B[0m";
                    }
                }
            }
        } else {
            System.out.println("SHAPE NOT ADDED!");
            System.out.println("Shape or shapes have exceeded maximum size of the truck, try a different x-coordinate.");
        }
    }

    }


