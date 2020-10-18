import java.util.*;

public class KthMaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the Array: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the kth element: ");
		int k = sc.nextInt();
		
		Arrays.sort(arr);
		System.out.println("Kth min element= " + arr[k-1]);
		System.out.println("Kth max element= " +arr[n-k]);
	}
}
