import java.util.Scanner;

public class MoveAllNegaiveNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array: ");
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
	}

}
