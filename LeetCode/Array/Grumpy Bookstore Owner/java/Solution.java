class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum=0;
        int max=0;
        for(int i=0;i<customers.length;i++)
        {
          if(grumpy[i]==0) sum+=customers[i];
        } 
        for(int i=0;i<customers.length;i++)
        {   
            int csum=0;
            if(i+minutes-1<=customers.length-1)
            {
                for(int j=i;j<=i+minutes-1;j++)
                {
                    if(grumpy[j]==1) csum+=customers[j];
                } if(csum>max) max=csum;
            }
        } return max+sum;
    }
}