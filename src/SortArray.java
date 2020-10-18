import java.util.*;

final class Counter
{ 
  int countZero; 
  int countOne;
  int countTwo;
};

public class SortArray {
	
	static void sortArray(int arr[], int size)
	{
		
	}
	
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-- > 0)
	    {
	        int size = sc.nextInt();
	        
	        int[] arr = new int[size];
			for(int i=0; i<size; i++)
			{
				arr[i] = sc.nextInt();
			}			
			
			Counter count = new Counter();
    		for(int i=0; i<size; i++)
            {
                if(arr[i]==0)
                    count.countZero++;
                else if(arr[i]==1)
                    count.countOne++;
                else if(arr[i]==2)
                    count.countTwo++;
            }
    		for(int i=0; i<count.countZero; i++)
    			System.out.println("0 ");
    		for(int i=0; i<count.countOne; i++)
    			System.out.println("1 ");
    		for(int i=0; i<count.countTwo; i++)
    			System.out.println("2 ");
	    }		
	}
}
