import java.util.Scanner;

public class MaxMinInArray {

	public static void main(String[] args) {
		// Array Input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int max, min;
		
		if(n == 1)
			System.out.println("Max element is :" +arr[0]+ " Min elem in arr: "+arr[0]);
		
		max = arr[0];
		min = arr[0];
		
		for(int i=0; i<n; i++)
		{
			if(arr[i] > max)
				max = arr[i];
			if(arr[i]<min)
				min = arr[i];
		}
		
		System.out.println("Max element is :" +max+ " Min elem in arr: "+min);
	}

}
