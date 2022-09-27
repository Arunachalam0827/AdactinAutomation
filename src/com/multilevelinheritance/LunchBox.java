package com.multilevelinheritance;

import com.singleinheritance.Bag;

public class LunchBox extends Bag{
private void Bottle() {
	System.out.println("Rs.200");
	System.out.println("Arun");
}
private void foodBox() {
	System.out.println("Rs.400");

}
public static void main(String[] args) {
	LunchBox box=new LunchBox();
	box.Bottle();
	box.foodBox();
	box.book();
	box.note();
	box.pen();
	box.pensil();
}
}
