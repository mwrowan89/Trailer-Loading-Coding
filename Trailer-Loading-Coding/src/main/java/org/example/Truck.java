package org.example;

import java.util.Map;

public class Truck {
    public String[][] truck;
    private final int rows;
    private final int cols;
    public Map<String, int[][]> shapes;

    public Truck(int rows, int cols) {
        this.truck = new String[rows][cols];
        this.cols = cols;
        this.rows = rows;
        buildTruck();
        printTruck();
    }

    public void setShapes() {
        shapes.put("O", new int[][]{{1, 1}, {1, 1}});
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

    }


