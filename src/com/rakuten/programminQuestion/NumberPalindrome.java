package com.rakuten.programminQuestion;

public class NumberPalindrome {
public static void main(String[] args) {
	
	int num = 121;
	int temp = num;
	int reverse = 0;
	
	while(num>0){
		
		reverse += num%10;
		num/=10;
	}
	System.out.println(reverse);
}
}
