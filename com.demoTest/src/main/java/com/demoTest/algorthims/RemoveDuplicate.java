package com.demoTest.algorthims;

import java.util.Arrays;

public class RemoveDuplicate {
	public void removeDuplicate(int [] ar){
		int [] fr=new int[ar.length];
		int j=0;
		/*BubbleSort bs=new BubbleSort();
		bs.sort(ar);*/
		Arrays.sort(ar);
		for(int i=0;i<ar.length-1;i++){
			if(ar[i]!=ar[i+1]){
				fr[j]=ar[i];
				j++;
			}

			}
		fr[j]=ar[ar.length-1];
		
		
		// Modify original array
        for (int i=0; i<j+1; i++){

            ar[i] = fr[i];
            System.out.println(ar[i]);
        }
	}
	public static void main(String[] args) {
		int []ar={1,4,2,3,4,5,5};
		RemoveDuplicate rd=new RemoveDuplicate();
		rd.removeDuplicate(ar);
	}

}
