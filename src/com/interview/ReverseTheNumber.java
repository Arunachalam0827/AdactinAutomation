package com.interview;

public class ReverseTheNumber {
public static void main(String[] args) {
	int num=65478;
	int i=0,j=0,a=num;
	while (a>0) {
		i=a%10;
		j=(j*10)+i;
		a=a/10;
	}
	System.out.println(j);
}
}
