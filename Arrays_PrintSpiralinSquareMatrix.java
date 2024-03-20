import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++)

        {

        for(int j=0; j<n; j++)

        {

            arr[i][j]=sc.nextInt();

        }

        }

        int x=0; int y=0;
        int start=0; int end=n-1;
        
        while(x<=n/2 && y<=n/2)
        {

        while(y<end)

        {

            System.out.print(arr[x][y]+" ");

            y++;

        }

        while(x<end)

        {

            System.out.print(arr[x][y]+" ");

            x++;

        }

        while(y>start)

        {

            System.out.print(arr[x][y]+" ");

            y--;

        }

        while(x>start)

        {

            System.out.print(arr[x][y]+" ");

            x--;

        }
        x++; y++; 
        start++; end--;
        }
        if(n%2!=0) System.out.print(arr[n/2][n/2]);
    }
}

/*
2 3 6 4
4 5 6 9
7 8 9 3
5 3 9 1
*/
