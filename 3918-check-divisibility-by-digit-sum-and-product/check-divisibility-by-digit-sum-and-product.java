class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int copy = n;
      while (n>0){
        int dig =n%10;
        sum+=dig;
        prod*=dig;
        n/=10;
      }  
      int res=0;
      res=sum+prod;
      if (copy%res==0)
      {
        return true;
      }
      else{
        return false;
      }
    }
}