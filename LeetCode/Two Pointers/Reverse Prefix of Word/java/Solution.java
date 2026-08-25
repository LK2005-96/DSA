class Solution {
    public String reversePrefix(String word, char ch) {
     int index=-1;
     for(int i=0;i<word.length();i++)
     {
        if(word.charAt(i)==ch) 
        {
          index=i;
          break;
        }
     }
     if(index==-1) return word;
     int i=0;
     char [] arr=word.toCharArray();
     while(i<index)
     {
        char temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
        index--;
        i++;
     } 
     return new String(arr);
    }
}