package com.demoTest.enumDemo;

import java.util.ArrayList;
import java.util.List;

public class NColony {
	/**
	 * Created by schandramouli on 8/26/15.
	 */
	    public static List<Integer> cellCompete(int[] cells, int days)
	    {
	        // INSERT YOUR CODE HERE
	        int len = cells.length;
	        List<Integer> newCells=new ArrayList<>();
	        for(int k = 0; k < days; k++) {
	            for (int i = 0; i < cells.length; i++) {
	                int cell = cells[i];
	                int nextCell;
	                int prevCell;
	                int activenumber;
	                if (i == 0) {
	                    // edge cases
	                    nextCell = cells[1];
	                    prevCell = 0;
	                } else if (i == cells.length - 1) {
	                    // edge case
	                    prevCell = cells[cells.length - 2];
	                    nextCell = 0;
	                } else {
	                    nextCell = cells[i + 1];
	                    prevCell = cells[i - 1];
	                }
	                if (nextCell == prevCell) {
	                    // set it to inactive
	                    activenumber = 0;
	                } else {
	                    //set it to active
	                    activenumber = 1;
	                }
	                newCells.add(activenumber) ;

	            }
	            for (int i = 0; i < 8; i++) {
	                newCells.add(cells[i]);
	            }
	        }

	        return newCells;
	    }

	    public static void main(String[] args) {
	        int[] array = {1,1,1,0,1,1,1,1};
	        int days = 2;
	        List<Integer>  arrays = cellCompete(array, days);
	        for (int i = 0; i < arrays.size(); i++) {
	            System.out.print(arrays.get(i));
	        }

	    }
	}

