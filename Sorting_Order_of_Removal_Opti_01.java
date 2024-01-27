import java.io.*;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n]; int minc = 0;

        for(int i=0; i<n; i++)

        {

            arr[i] = scn.nextInt();

        }

        Arrays.sort(arr);

        for(int i=n-1; i>=0; i--)

        {
                minc = minc + (n-i)*arr[i];
        }

        System.out.print(minc);

    }

}
