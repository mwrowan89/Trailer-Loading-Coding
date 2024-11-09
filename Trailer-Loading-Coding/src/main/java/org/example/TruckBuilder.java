package org.example;

import java.util.HashMap;
import java.util.Map;

public class TruckBuilder {
    public Map<Integer, Integer> buildTruck(int rows, int cols){
        Map<Integer, Integer> truckLayout = new HashMap<>();
        for (int i = 0; i < cols; i++) {
            truckLayout.put(i, i);
        }
        return truckLayout;
    }
}
