package com.demoTest.enumDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Colony {
    
	public static int[] cellCompete(int[] cell, int day) {
        int[] ar = new int[10];
        for(int i=1; i<9; i++) {
            ar[i] = cell[i-1];
        }
        while(day-- >0) {
            int temp = 0;
            for(int i=1; i<9; i++) {
            	System.out.println("arrra"+ar[i+1]);
            	System.out.println("temp--"+temp);
            	System.out.println("maths--"+Math.abs(temp-ar[i+1]));
                if(Math.abs(temp-ar[i+1])==1) {
                    temp = ar[i];
                    ar[i] = 1;
                }
                else {
                    temp = ar[i];
                    ar[i] = 0;
                }
            }
        }
     //   List<Integer> list = Arrays.stream(ar).collect(Collectors.toList());
//System.out.println(list);
        return ar;
    }

    public static void main(String[] args) {

        int[] cell = {1,0,0,0,0,1,0,0};
        int day = 1;
        cell = cellCompete(cell, day);
        for(int i=1; i<9; i++) {
            System.out.print(cell[i]+" ");
        }
    }
}
