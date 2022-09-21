package com.singleinheritance;

public class Bag extends box{
	public void book() {
		System.out.println("Rs.50");

	}
	public void note() {
		System.out.println("Rs.100");
}
	public static void main(String[] args) {
		Bag bag=new Bag();
		bag.book();
		bag.note();
		bag.pen();
		bag.pensil();
	}
}