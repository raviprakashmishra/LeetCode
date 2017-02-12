package com.ravi.leetcode;

public class Permutation {
	public static void main(String[] args) {
		permu("abc");
	}
	
	public static void permu(String s){
		generate("", s);
	}
	
	public static void generate(String res, String left){
		if(left.isEmpty()){
			System.out.println(res);
		}else{
			for (int i = 0; i < left.length(); i++) {
				generate(res+left.charAt(i), left.substring(0,i)+left.substring(i+1));
			}
		}
	}

}
