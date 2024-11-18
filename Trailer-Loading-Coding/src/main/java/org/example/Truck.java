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
        int[][] currentShape = shapes.getShapes();

        System.out.println("Pos: " + Arrays.deepToString(currentShape));
        System.out.println("Len: " + currentShape.length);

        for(int i = 0; i < currentShape.length; i++){
            for(int j = 0; j < currentShape[j].length; j++) {
                if(currentShape[i][j] == 1) {
                    truck[currentShape[i][j]][position] = "\u001B[94m" + "7" + "\u001B[0m";
                }
                System.out.println("Current shape val: " + (currentShape[i][j]));
                System.out.println(Arrays.toString(currentShape[j]));
                System.out.println("Current pos: " + position);
                printTruck();
                System.out.println();
            }
            position++;
        }
    }

    }


