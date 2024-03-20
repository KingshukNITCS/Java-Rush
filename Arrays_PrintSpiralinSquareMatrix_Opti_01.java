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
        int steps=n-1; // number of elements in this block row/col
        
        while(steps>=1)
        {

        for(int i=0; i<steps; i++)

        {

            System.out.print(arr[x][y]+" ");

            y++;

        }

        
        for(int i=0; i<steps; i++)

        {

            System.out.print(arr[x][y]+" ");

            x++;

        }

        for(int i=0; i<steps; i++)

        {

            System.out.print(arr[x][y]+" ");

            y--;

        }

        for(int i=0; i<steps; i++)

        {

            System.out.print(arr[x][y]+" ");

            x--;

        }
        x++; y++; 
        steps=steps-2; // steps gets reduced by 2 on the inner block
        }
        if(steps==0) System.out.print(arr[x][y]);
    }
}

/*
2 3 6 4
4 5 6 9
7 8 9 3
5 3 9 1
*/
