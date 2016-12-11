package com.matt.ShoppingKata;

/*
 * Class to represent a SKU (Stock Keeping Unit) that could be bought at checkout. 
 * Price is in pence to avoid floating point errors
 * "Threshold" is the number of items before a special offer kicks in; e.g. "buy 3 for 90p, or 50p each" 
 * then every multiple of 3 units would be charged at 90p and everything after that at 50p
 *  
 */
public class SKU {

	private String name;
	private int price;
	private int threshold;
	private int discountPrice;

	public SKU(String name, int price, int threshold, int discountPrice) {
		this.name = name;
		this.price = price;
		this.threshold = threshold;
		this.discountPrice = discountPrice;

	}

	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}
	public int getThreshold() {
		return this.threshold;
	}

	public int getDiscountPrice() {
		return this.discountPrice;
	}
	/*
	 * For when / if the pricing rules change
	 */
	public void setSpecialOffer(int threshold, int discountPrice){
		this.threshold = threshold;
		this.discountPrice = discountPrice;
	}

}
