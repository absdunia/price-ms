/**
 * 
 */
package com.eCommerce.price.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.eCommerce.price.model.Price;
import com.eCommerce.price.repository.PriceCRUDRepository;
import com.eCommerce.price.service.PriceService;

/**
 * @author Team 6
 *
 */
@Service
@Qualifier("PriceService")
public class PriceServiceImpl implements PriceService {

	@Autowired
	private PriceCRUDRepository priceCRUDRepository;
	private Price price;

	@Transactional
	public List<Price> getAllPrices() {
		System.out.println("Price services implmenteation");
		return priceCRUDRepository.findAll();
	}

	@Override
	public float getPriceByID(int productID) {
		StringBuilder response = new StringBuilder();
		if (productID == 0) {
			return 0;
		} else {
			price = priceCRUDRepository.findByProductID(productID);
			System.out.println("Product Id : " + productID + "and the price of the product is " + price.getPrice());
			return price.getPrice();

		}
	}

	public Price saveNewPrice(Price price2) {
		System.out.println("Price displaying" + price2.getPrice() + "Product ID" + price2.getProductID());
		return priceCRUDRepository.saveAndFlush(price2);
	}

	public String deleteProductByID(String productID) {
		price = priceCRUDRepository.findByProductID(Integer.parseInt(productID));

		priceCRUDRepository.delete(price);
		return "Object has been removed from the DB";
	}

	public Price updatePrice(Price price2) {
		System.out.println("Product to be updated" + price2.getProductID());
		System.out.println("Product to be updated" + price2.getPrice());

		price = priceCRUDRepository.findByProductID(price2.getProductID());
		if (price.getProductID() >= 0) {
			System.out.println("Get the product Id" + price.getProductID());
			price.setPrice(price2.getPrice());
			System.out.println("Newly updated price");
			return priceCRUDRepository.saveAndFlush(price);
		} else {
			return price2;
		}
	}

}
