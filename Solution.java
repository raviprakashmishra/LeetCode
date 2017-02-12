package com.ravi.string;

public class Solution {
	String revString = "";
    public String reverseString(String s) {
        
        char[] chars = s.toCharArray();
        for(int i=0; i<chars.length/2;i++){
            
        	chars = swap(chars,i);
            
            
        }
        return  new String(chars);
    }
    
    public char[] swap(char[] chars, int i){
        
        char temp = chars[i];
        chars[i] = chars[chars.length - i-1];
        chars[chars.length - i-1] = temp;
        
        return chars;
    }
    
    public String recReverse(String str){
    	
    	if(str.length()>0){
    		revString = str.charAt(str.length()-1)+recReverse(str.substring(0,str.length()-1)); 
    		return revString;
    	}else
    		return revString;
    }
    
    public static void main(String[] args) {
		String reverse = new Solution().reverseString("ravi");
		System.out.println(reverse);
	}
}
