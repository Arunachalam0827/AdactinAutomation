package com.interview;

public class PalandromOrNot {
public static void main(String[] args) {
	int num=141;
	int i=0,j=0,a=num;
	while (a>0) {
		i=a%10;
		j=(j*10)+i;
		a=a/10;
	}
	if(j==num) {
		System.out.println("Its a palandrom");
	}
	else {
		System.out.println("Its not a palandrom");
	}
}
}
