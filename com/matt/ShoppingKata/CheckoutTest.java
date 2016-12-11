package com.matt.ShoppingKata;
import static org.junit.Assert.*;

import org.junit.Test;

public class CheckoutTest {

	@Test
	public void testOneSingleItemsCost() {
		Checkout co = new Checkout();
		co.addItemToCheckout("D");
		assert (co.calcTotal() == 15);

	}

	@Test
	public void testTwoSingleItemsCost() {
		Checkout co = new Checkout();
		co.addItemToCheckout("A");
		co.addItemToCheckout("B");
		assert (co.calcTotal() == 80);

	}

	@Test
	public void testThreeSingleItemsCost() {
		Checkout co = new Checkout();
		co.addItemToCheckout("A");
		co.addItemToCheckout("B");
		co.addItemToCheckout("C");
		assert (co.calcTotal() == 100);

	}

	@Test
	public void testFourSingleItemsCost() {
		Checkout co = new Checkout();
		co.addItemToCheckout("A");
		co.addItemToCheckout("B");
		co.addItemToCheckout("C");
		co.addItemToCheckout("D");
		assert (co.calcTotal() == 115);

	}

	@Test
	public void testFirstSpecialOfferCost() {
		Checkout co = new Checkout();
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		assert (co.calcTotal() == 130); 

	}

	@Test
	public void testFourACost() {
		Checkout co = new Checkout();
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		assert (co.calcTotal() == 180); 

	}

	@Test
	public void testFiveACost() {
		Checkout co = new Checkout();
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		assert (co.calcTotal() == 230); 

	}
	@Test
	public void testSixACost() {
		Checkout co = new Checkout();
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		assert (co.calcTotal() == 260); 

	}	
	
	@Test
	public void testTwoBCost() {
		Checkout co = new Checkout();
		co.addItemToCheckout("B");
		co.addItemToCheckout("B");
		assert (co.calcTotal() == 45); 

	}
	
	@Test
	public void testFiveBCost() {
		Checkout co = new Checkout();
		co.addItemToCheckout("B");
		co.addItemToCheckout("B");
		co.addItemToCheckout("B");
		co.addItemToCheckout("B");
		co.addItemToCheckout("B");		
		assert (co.calcTotal() == 120); 

	}	

	@Test
	public void testFiveDCost() {
		Checkout co = new Checkout();
		co.addItemToCheckout("D");
		co.addItemToCheckout("D");
		co.addItemToCheckout("D");
		co.addItemToCheckout("D");
		co.addItemToCheckout("D");		
		assert (co.calcTotal() == 75); 

	}	
	
	@Test
	public void testFourOfEachCost() {
		Checkout co = new Checkout();
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		co.addItemToCheckout("A");
		co.addItemToCheckout("B");
		co.addItemToCheckout("B");
		co.addItemToCheckout("B");
		co.addItemToCheckout("B");
		co.addItemToCheckout("C");
		co.addItemToCheckout("C");
		co.addItemToCheckout("C");
		co.addItemToCheckout("C");
		co.addItemToCheckout("D");
		co.addItemToCheckout("D");
		co.addItemToCheckout("D");
		co.addItemToCheckout("D");		
		assert (co.calcTotal() == 410); 

	}	

}
