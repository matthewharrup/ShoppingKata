package com.matt.ShoppingKata;
import java.util.*;

/*
 * Class to represent all SKU (Stock Keeping Units) available for checkout
 */
public class StockList {

	private static HashMap<String, SKU> allSKUs = new HashMap <String, SKU>();
	
	//for brevity, initialise the stock list here
	static {
		allSKUs.put("A", new SKU("A",50,3,130));
		allSKUs.put("B", new SKU("B",30,2,45));
		allSKUs.put("C", new SKU("C",20,0,0));
		allSKUs.put("D", new SKU("D",15,0,0));
	}
	public static void addOrUpdate(SKU newStockItem) {
		allSKUs.put(newStockItem.getName(), newStockItem);
	}

	public static SKU getSKU(String key) {
		return allSKUs.get(key);
	}

}
