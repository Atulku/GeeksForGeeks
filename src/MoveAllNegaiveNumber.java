import java.util.Scanner;

public class MoveAllNegaiveNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0; i<n; i++)
			{
				arr[i] = sc.nextInt();
			}
			int left = 0; 
			int right = n-1;
			while(left<=right)
			{
				if(arr[left] > 0 && arr[right] > 0)
				{
					right--;
				}
				else if(arr[left] < 0 && arr[right] > 0)
				{
					left++;
					right--;
				}
				else if(arr[left] > 0 && arr[right] < 0)
				{
					int temp = arr[left];
					arr[left] = arr[right];
					arr[right] = temp;
					left++;
					right--;
				}
				else
				{
					left++;
				}
			}
			for(int i=0; i<n; i++)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
