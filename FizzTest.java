package com.ravi.prc;

public class FizzTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <=100; i++) {
			if(i%3==0 && i%5==0){
				sb.append("rightpoint ");
			}
			else if(i%3 == 0){
				sb.append("right ");
			}else if(i%5==0){
				sb.append("point ");
			}else{
				sb.append(i+" ");
			}
		}
		
		System.out.println(sb.toString().trim());
		
	}

}
