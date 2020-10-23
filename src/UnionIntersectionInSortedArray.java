import java.util.Scanner;
	
public class UnionIntersectionInSortedArray {
	static void printIntersection(int a[], int b[], int m, int n)
	{
		int i = 0, j = 0;
		while(i<m && j<n)
		{
			if(a[i] > b[j])
			{
				j++;
			}
			else if(a[i] < b[j])
			{
				i++;
			}
			else
			{
				System.out.print(a[i] + " ");
				i++; j++;
			}
		}
	}
	
	static void printUnion(int a[], int b[], int m, int n)
	{
		int i = 0, j = 0;
		while(i < m && j < n)
		{
			if(a[i] > b[j])
			{
				System.out.print(b[j] + " ");
				j++;
			}
			else if(a[i] < b[j])
			{
				System.out.print(a[i] + " ");
				i++;
			}
			else
			{
				System.out.print(a[i] + " ");
				i++; j++;
			}
		}
		while(i<m)
			System.out.print(a[i++] + " ");
		while(j<n)
			System.out.print(b[j++] + " ");
		
	}

	public static void main(String[] args) {
		// Array Input
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{			
			int m = sc.nextInt();
			int n = sc.nextInt();
			
			int[] a = new int[m];
			int[] b = new int[n]; 
			for(int i=0; i<m; i++) 
			{ 
				a[i] = sc.nextInt(); 
			} 
			for(int i=0; i<n; i++) 
			{ 
				b[i] = sc.nextInt();
			}
			
			printUnion(a, b, m, n);
			System.out.println();
			printIntersection(a, b, m, n);
		}
	}
}
