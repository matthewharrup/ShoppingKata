package com.matt.ShoppingKata;

import java.util.*;

/*
 * Class to simulate a checkout process, where a chosen set of shopping items is bought
 *  
 */
public class Checkout {

	// ArrayList representing everything the user is buying at the checkout,
	// using SKU name as the key
	private ArrayList<String> CheckoutItems = new ArrayList<String>();

	public void addItemToCheckout(String SKUkey) {
		CheckoutItems.add(SKUkey);
	}

	/*
	 * Calculate the total cost of all items in the shopping basket (the
	 * CheckoutItems list) Note the price for a given item varies according to
	 * how many items are bought, e.g. there may be a "buy 3 get 20%" offer.
	 */
	public int calcTotal() {
		int totalCost = 0;
		int currentCount = 0;
		String currentItem = "";
		String lastItem = "";

		Collections.sort(CheckoutItems);
		for (Iterator<String> iter = this.CheckoutItems.iterator(); iter.hasNext();) {
			currentItem = iter.next();
			if ("".equals(lastItem)) { // initialise the lastitem
				lastItem = currentItem;
				currentCount++;
			} else if (currentItem.equals(lastItem)) { // same item as before, increment the count
				currentCount++;
			} else { // we have moved onto a new type of item, send the previous
						// item with its full count to be priced and reset currentCount
				totalCost += calcPrice(currentCount, StockList.getSKU(lastItem));
				currentCount = 1;
				lastItem = currentItem;
			}
			if (!iter.hasNext()) { // if this is the last element in the list, add the price
				totalCost += calcPrice(currentCount, StockList.getSKU(currentItem));
			}

		}
		return totalCost;

	}

	public int calcPrice(int count, SKU item) {
		int price = 0;
		/*
		 * A typical deal is "buy 2 for 40p" when normally they're 30p each
		 * Hence if you buy 3, you get 2 for 40p and the third at full price for
		 * a total of 70p, not 90p. Here "threshold" means
		 * "any order over 3 items of this type", and the "discountPrice" would
		 * be 70p
		 */
		if (item.getThreshold() > 0) { // this signifies there is a special offer on
			while (count >= item.getThreshold()) {
				count = count - item.getThreshold();
				price += item.getDiscountPrice();
			}
		}
		price = price + count * item.getPrice();
		return price;
	}

}
