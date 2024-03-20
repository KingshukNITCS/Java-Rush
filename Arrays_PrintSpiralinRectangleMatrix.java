// https://leetcode.com/problems/spiral-matrix/description/

class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> al = new ArrayList<Integer>();
        int m = arr.length; // rows
        int n = arr[0].length; // cols
        int x=0; int y=0;
        
        // number of elements in this block row/col

        int rsteps=m-1;
        int csteps=n-1; 
        
        

        while(rsteps>=1 && csteps>=1)

        {

        for(int i=0; i<csteps; i++)

        {

            al.add(arr[x][y]);

            y++;

        }

        

        for(int i=0; i<rsteps; i++)

        {

            al.add(arr[x][y]);

            x++;

        }

        for(int i=0; i<csteps; i++)

        {

            al.add(arr[x][y]);

            y--;

        }

        for(int i=0; i<rsteps; i++)

        {

            al.add(arr[x][y]);

            x--;

        }

        x++; y++; 
        // steps gets reduced by 2 on the inner block
        csteps=csteps-2;
        rsteps=rsteps-2; 

        }

        if(rsteps==0)
        {
            for(int i=0; i<csteps+1; i++)
            {
                al.add(arr[x][y]);
                y++;
            } 
        }
        else if(csteps==0)

        {

            for(int i=0; i<rsteps+1; i++)

            {

                al.add(arr[x][y]);

                x++;

            } 

        }
        return al;
    }
  }
