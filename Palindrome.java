package com.ravi.prc;

public class Palindrome {
	public static void main(String[] args) {
		String s = "malayalam";
		System.out.println(new Palindrome().isPalindrome(s, 0, s.length()-1 ));
	}
	
	public boolean isPalindrome(String s,int l,int r){
		if(l==r){
			return true;
		}else{
			return s.charAt(l)==s.charAt(r) && isPalindrome(s, l+1, r-1);
		}
		
	}

}
