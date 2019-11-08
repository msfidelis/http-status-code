package com.httpstatuscode.httpstatuscode.utils;

import java.util.Random;

public class RandomCode {
	
    public static int get(){
    	int[] items = new int[]{200,500};
    	Random rand = new Random();
    	return items[rand.nextInt(items.length)];
    }	
	
}
