package com.demoTest.algorthims;

public class BubbleSort {
	public void sort(int [] ar){
		int temp=0;
		for(int i=0;i<ar.length;i++){
			for(int j=1;j<ar.length-i;j++){
				if(ar[j-1]>ar[j]){
					temp=ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int [] ar={1,7,3,8,2};
		BubbleSort bs=new BubbleSort();
		bs.sort(ar);
		System.out.println("after");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
