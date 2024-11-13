package org.example;

import java.util.HashMap;
import java.util.Map;

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
        Shapes shapes = new Shapes;

        if(shapes.){
            System.out.println(shape);
        }
        else{
            System.out.println("Shape does not exist");
        }

        truck[0][position] = "1";
        System.out.println("Shape length: " + shapes.size());
    }

    }


