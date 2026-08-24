class Solution {
    public int addDigits(int num) {
       
      
      
        while(num>0)
        {
            if(num>9){

            int d=num%10;
            
            int f=num/=10;
            num=d+f;
        }
        else 
           return num;
        }
      return num;
    }
}