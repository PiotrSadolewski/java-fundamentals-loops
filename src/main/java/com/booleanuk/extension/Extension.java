package com.booleanuk.extension;

import java.util.ArrayList;
import java.util.List;

public class  Extension {
    public int[] numsEven;

    public void stepOne() {
        // TODO: 1. Write a for loop that adds all the even numbers between 0 and 6 (0, 2, 4, 6) to evenNums
        List<Integer> evenNumbersList= new ArrayList<>();
        for (int i = 0; i <=6; i++){
            if (i%2 == 0){
                evenNumbersList.add(i);
            }
        }

        numsEven = new int[evenNumbersList.size()];

        for (int i = 0; i < numsEven.length; i++){
            numsEven[i] = evenNumbersList.get(i);
        }
    }
}
