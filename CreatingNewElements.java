package Javaprogrammes;

import java.util.Arrays;

public class CreatingNewElements {

	public static void main(String[] args) {
	int[] arr= {6,7,8,9,10};
	
	//Creating Elements in array
	int[] myArray=new int[] {6,7,8,9,10};
	System.out.println("Array Created  With Elements:" +Arrays.toString( myArray));
	
	//AscessTheElement
	
	for(int i=0;i<arr.length;i++) {
	   	 if(i==0) {
	   		System.out.println("The first element is: " + arr[i]);
	   	 }
	   	 if(i==arr.length-1) {
	   		 System.out.println("The fourth element is: " + arr[i]);
	   		 
	   		 // LoopingthrouganArray
	   		 
	   		for(int i1=0;i1<arr.length;i1++) {
				System.out.println(i1);
				
				// ModifyinElement
				
				for(int i2=0;i2<arr.length;i2++) {
					if( i2 == 2 ) {
		        		arr[i2] = 10;
		        	}
					}
				 System.out.println(Arrays.toString(arr));
				//Findinind The Length of Array
				 System.out.println(arr.length);	
				 
				 // MultidimentionalArray
				 
				 int[][]arr1= {{1,2},{3,4},{5,6}};
					
					System.out.println("Element at row1 column1:" +arr1[0][1]);
					
					
					//SortingtheNumbers
					int[] arr3= {2,5,6,8,9,7};
					Arrays.sort(arr3);
					for(int i3=0;i3<arr3.length;i3++) {
						System.out.println(arr3[i3]);
				 
				 
				 
	   		 

	}
}
	}
}
}
}


     



        