package com.ravi.leetcode;

import java.util.ArrayList;
import java.util.List;

public class NestedListWeightSum {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(1);
		intList.add(1);
		
		list.add(intList);
		
		intList = new ArrayList<Integer>();
		intList.add(2);
		list.add(intList);
		
		intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(1);
		list.add(intList);
		
		System.out.println(weightedSum(list));
		
		
		
		
	}
	
	public static int weightedSum(ArrayList<ArrayList<Integer>> list){
		int sum = 0;
		for (List<Integer> list2 : list) {
			int size = list2.size();
			Integer numb = list2.get(0);
			
			sum = sum+numb*numb*size;
			
		}
		 return sum;
	}

}
