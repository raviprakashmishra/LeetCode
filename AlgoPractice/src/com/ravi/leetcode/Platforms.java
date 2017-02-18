package com.ravi.prc;

import java.util.Arrays;

public class Platforms {
	public static void main(String[] args) {
		int[] arr  = {900,  940, 950,  1100, 1500, 1800};
        int[] dep  = {910, 1200, 1120, 1130, 1900, 2000};
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        System.out.println(noOfPlatforms(arr, dep));
		
	}
	
	public static int noOfPlatforms(int[] arrival, int[] departure){
		int plat = 0,max=0;
		int i=0,j=0;
		
		while(i<arrival.length && j<departure.length){
			if(arrival[i]<departure[j]){
				plat++;
				i++;
			}else{
				plat--;
				j++;
			}
			
			if(plat>max){
				max = plat;
			}
		}
		
		return max;
	}
}
