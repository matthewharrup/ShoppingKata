package com.matt.ShoppingKata;
import static org.junit.Assert.*;

import org.junit.Test;

public class SKUTest {

	@Test
	public void testOneItem() {
		SKU si1 = new SKU("crisps", 10,0,0);
		assert ("crisps".equals(si1.getName()));
		assert (si1.getPrice() == 10);
	}

}
