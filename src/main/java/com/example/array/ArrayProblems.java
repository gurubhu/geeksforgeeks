package com.example.array;

public class ArrayProblems {
	
	public static int[] segregate0sAnd1s(int[] a) {
		int beg = 0;
		int end = a.length - 1;
		
		while(beg < end) {
			if(a[beg] == 0) {
				beg++;
				continue;
			}
			if(a[end] == 1) {
				end--;
				continue;
			}
			
			int temp = a[beg];
			a[beg] = a[end];
			a[end] = temp;
		}
		
		return a;
	}
	
	public static int[] segregate0sAnd1sGeek(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		
		while (left < right)
		{
			/* Increment left index while we see 0 at left */
			while (arr[left] == 0 && left < right)
			left++;

			/* Decrement right index while we see 1 at right */
			while (arr[right] == 1 && left < right)
				right--;

			/* If left is smaller than right then there is a 1 at left
			and a 0 at right. Exchange arr[left] and arr[right]*/
			if (left < right)
			{
				arr[left] = 0;
				arr[right] = 1;
				left++;
				right--;
			}
		}
		
		return arr;
	}
	
	public static int[] dutchNationalFlagProblem(int[] a) {
		int[] result = new int[a.length];
		
		int zerosCount = 0;
		int onesCount = 0;
		int twosCount = 0;
		
		for(int i = 0 ; i < a.length; i++) {
			if(a[i] == 0)
				zerosCount++;
			if(a[i] == 1)
				onesCount++;
			if(a[i] == 2)
				twosCount++;
		}
		
		int currentCount = 0;
		
		for(int i = 0 ; i < zerosCount; i++) {
			result[i] = 0;
			currentCount++;
		}
		
		int endCount = currentCount + onesCount;
		
		for(int j = currentCount; j < endCount; j++) {
			result[j] = 1;
			currentCount++;
		}
		
		endCount = currentCount + twosCount;
		
		for(int j = currentCount; j < endCount; j++) {
			result[j] = 2;
			currentCount++;
		}
		
		return result;
	}
	
    // https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
	public static int[] dutchNationalFlagProblemGeek(int[] a) {
			int low = 0;
			int high = a.length - 1;
			int mid = 0;
			int temp = 0;
			
			while(mid <= high) {
				switch (a[mid]) {
				case 0:{
					temp = a[mid];
					a[mid] = a[low];
					a[low] = temp;
					mid++;
					low++;
					break;
				}
				case 1:{
					mid++;
					break;
				}	
				case 2:{
					temp = a[high];
					a[high] = a[mid];
					a[mid] = temp;
					high--;
					break;
				}
			}
		}
		return a;
	}
}