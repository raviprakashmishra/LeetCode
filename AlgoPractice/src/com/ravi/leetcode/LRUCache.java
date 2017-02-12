package com.ravi.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache {
	public static void main(String[] args) {
				
				LRUCache cache = new LRUCache(2);
				System.out.println(cache.get(2));
				cache.set(2, 6);
				System.out.println(cache.get(1));
				cache.set(1, 5);
				cache.set(1, 2);
				System.out.println(cache.get(1));
				System.out.println(cache.get(2));
	}

    Map<Integer,Integer> map ;
    LinkedList<Integer> list ;
    int latest;
    int capacity;
    
    public LRUCache(int capacity) {
    	this.capacity = capacity;
        map = new HashMap<Integer,Integer>(capacity);
        list = new LinkedList<Integer>();
    }
    
    public int get(int key) {
    	if(map.size() == 0 || !map.containsKey(key)){
    		return -1;
    	}
    	list.remove(list.lastIndexOf(key));
    	list.offer(key);    		
        
        
        return map.get(key);
        
    }
    
    public void set(int key, int value) {
        if(map.size() == capacity){
            if(map.containsKey(key)){
                map.put(key,value);
                list.offer(list.poll());
            }else{
                // get first element of list which will be least used one and then delete
                // map key-value pair with similar key
                map.remove(list.poll());
                
                // now add new keu value pair in map
                
                map.put(key,value);
                // update list
                list.offer(key);
            }
            
            
        }else{
            map.put(key,value);
            list.offer(key);
        }
        
    }
    

    


}
