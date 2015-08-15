package com.shypz.DataStructures;

public class InsertionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,2,4,6,1,3,8,2};
		
		InsertionSort ins = new InsertionSort();
		ins.insertion_sort(a);

	}

}



class InsertionSort{
	
	
	public void insertion_sort(int arr[]){
		  System.out.println("Start time of Insertion sort is : " + System.currentTimeMillis());
		  long start_time = System.currentTimeMillis();
		  int arr_len = arr.length;
		  System.out.println("The length of array is : " + arr_len);
		  for(int j=1;j<arr_len;j++){
			  
			  int key = arr[j];
			  int i = j-1;
			  while(i>=0 && arr[i] > key){
				  	int temp = arr[i];
				  	arr[i] = arr[i+1];
				  	arr[i+1] = temp;
				  	i=i-1;
			  }
			  
		  }
		  
		  long end_time = System.currentTimeMillis();
		  System.out.println("End time of Insertion sort is : " + System.currentTimeMillis());
		  
		  System.out.println("Total running tim for algorithm : " + (end_time-start_time));
		  for(int k=0;k<arr_len;k++){
			  System.out.println(arr[k]);
		  }
		
	}
	
}
