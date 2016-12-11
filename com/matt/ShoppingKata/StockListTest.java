package com.matt.ShoppingKata;
import static org.junit.Assert.*;

import org.junit.Test;

public class StockListTest {

	@Test
	public void testAddSKU() {
		StockList.addOrUpdate(new SKU("A", 50,0,0));
		assert ("A".equals(StockList.getSKU("A").getName()));
		assert (StockList.getSKU("A").getPrice() == 50);
	} 

}
