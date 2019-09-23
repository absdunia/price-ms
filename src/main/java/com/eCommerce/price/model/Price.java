/**
 * 
 */
package com.eCommerce.price.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Team 6
 *
 */
@Entity
public class Price {

	@Id
	private int productID;

	private float price;
	public Price()
	{
		
	}
	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
@Override
public String toString()
{
	return "Product Id :"+productID+"Price of the product is :"+price;
}
}
