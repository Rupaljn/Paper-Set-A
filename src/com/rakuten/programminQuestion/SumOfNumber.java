package com.rakuten.programminQuestion;

public class SumOfNumber {
public static void main(String[] args) {
	int num1 = 125;
    int sum = 0;
    
    while(num1!=0){
    	sum+= num1%10;
    	num1/=10;
    }
	
	
	System.out.println(sum);
}
}
