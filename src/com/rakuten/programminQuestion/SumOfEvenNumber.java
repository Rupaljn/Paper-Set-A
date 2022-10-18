package com.rakuten.programminQuestion;

public class SumOfEvenNumber {
public static void main(String[] args) {
	
	int sum = 0;
	for(int num = 1; num<=100; num++ ){
	while(num%2==0){
		sum+=num%10;
		num/=10;
	}
	
	System.out.println(sum);
	}
}
}
