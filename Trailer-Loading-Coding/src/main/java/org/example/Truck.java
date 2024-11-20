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
        //TODO add protections against shapes overflowing the length of the truck
        int[][] currentShape = shapeMap.get(shape);

        int shapeHeight = currentShape.length;
        int shapeWidth = currentShape[0].length;
        int y = 0;

        while (y + shapeHeight <= rows && shapeCollision(currentShape, position, y)){
            y++;
        }

        System.out.println("Y: " + y);
        System.out.println("Shape height: " + shapeHeight);
        System.out.println("Shape width: "+ shapeWidth);

        System.out.println("Pos: " + Arrays.deepToString(currentShape));
        System.out.println("Len: " + currentShape.length);

        if(position + shapeWidth <= cols) {
            for(int i = 0; i < shapeHeight; i++) {
                for(int j = 0; j < shapeWidth; j++) {
                    if(currentShape[i][j] == 1) {
                        truck[y + i][position + j] = "1";
                    }
                }
            }
        } else {
            System.out.println("SHAPE NOT ADDED!");
            System.out.println("Shape or shapes have exceeded maximum size of the truck, try a different x-coordinate.");
        }
    }

    public boolean shapeCollision(int[][] shape, int x, int y) {
        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[0].length; j++) {
                if(y + i >= 0 && y + i < rows && x + j >= 0 && x + j < cols) { //checking if shape is inbounds
                    if (shape[i][j] == 1 && (truck[y + i][x + j].equals("1"))) {
                        return true;
                    }
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    }


