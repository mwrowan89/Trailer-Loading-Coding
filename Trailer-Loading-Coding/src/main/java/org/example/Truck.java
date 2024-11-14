package org.example;

import java.util.Arrays;

public class Truck {
    public String[][] truck;
    private final int rows;
    private final int cols;


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
        Shapes shapes = new Shapes();
        int[][] shapePosition = shapes.getShapes(shape);

        System.out.println("Pos: " + Arrays.deepToString(shapePosition));
        System.out.println("Len: " + shapePosition.length);

        for(int i = 0; i < shapePosition.length; i++){
            for(int j = 0; j < shapePosition.length; j++) {
                if(shapePosition[i][j] == 1) {
                    truck[j][position] = "\u001B[94m" + "7" + "\u001B[0m";
                }
                System.out.println(shapePosition[j][j]);
//                printTruck();
                System.out.println();
            }
            position++;
        }
    }

    }


