package swordoffer;

public class Sum_Solution {
	 public int Sum_Solution(int n) {
	        
	       Boolean a = (n!=0)&&((n += Sum_Solution(n - 1))==0);
	        return n;
	    }
}
