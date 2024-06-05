// https://www.geeksforgeeks.org/problems/merge-sort/1?utm_source=gfg

//{ Driver Code Starts
import java.util.*;

class Merge_Sort
{
    //method to print the elements of the array
	static void printArray(int arr[])
    {
        StringBuffer sb=new StringBuffer("");
        int n = arr.length;
        for (int i=0; i<n; ++i)
            sb.append(arr[i]+" ");
        System.out.println(sb.toString());
    }

    

	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking testcases
		int T = sc.nextInt();
		while(T>0)
		{
		    //taking elements count
			int n = sc.nextInt();
			
			//creating an object of class Merge_Sort
			Merge_Sort ms = new Merge_Sort();
			
			//creating an array of size n
			int arr[] = new int[n];
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

            
			Solution g = new Solution();
			
			//calling the method mergeSort
			g.mergeSort(arr,0,arr.length-1);

            //calling the method printArray
			ms.printArray(arr);
		T--;
		}
	}
}



// } Driver Code Ends


class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
        int len = r-l+1;
        int[] temp = new int[len];
        int x=l; int y=m+1; int c=0;
        while(x<=m && y<=r)
        {
            if(arr[x]<arr[y])
            {
                temp[c++]=arr[x++];
            }
            else
            {
                temp[c++]=arr[y++];
            }
        }
        while(x<=m)
        {
            temp[c++]=arr[x++];
        }
        while(y<=r)
        {
            temp[c++]=arr[y++];
        }
        int z=0;
        for(int i=l; i<=r; i++)
        {
            arr[i]=temp[z++];
        }
        //System.out.println(Arrays.toString(temp));
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l==r) return;
        int m=(l+r)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }
}

/*
3428
34 28
3 4 2 8
*/
