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

        for(int i = 0; i < currentShape.length; i++){
            for(int j = 0; j < currentShape[j].length; j++) {
                if(currentShape[j][j] == 1) {
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


