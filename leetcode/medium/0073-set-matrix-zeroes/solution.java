class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean[] r=new boolean[n];
        boolean[] c=new boolean[m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                   r[i]=true;
                   c[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(r[i]||c[j])
                {
                    matrix[i][j]=0;
                }
            }
        }

        
    }
}