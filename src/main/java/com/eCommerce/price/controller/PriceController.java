/**
 * 
 */
package com.eCommerce.price.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eCommerce.price.model.Price;
import com.eCommerce.price.serviceImpl.PriceServiceImpl;

/**
 * @author Team 6
 *
 */
@RestController
@RequestMapping("/eCommerce/price")
public class PriceController {

	
	@Autowired
	private PriceServiceImpl priceServiceImpl;
	private Price price;
	
	@PostMapping(value="/createPrice",consumes="application/json",produces="application/json")
	public Price createPrice(@RequestBody Price price) 
	{
		return priceServiceImpl.saveNewPrice(price);
	}
 
	@PutMapping(value="/updatePriceByID",consumes="application/json",produces="application/json")
 public Price updatePrice(@RequestBody Price price)
 {
	return priceServiceImpl.updatePrice(price);
}
	
	@GetMapping(value ="/getAllPrices",produces="application/json")
	public List<Price> getAllPrices(){
		System.out.println("At controller page");
		return priceServiceImpl.getAllPrices();
	}
	
   @DeleteMapping(value="/deleteByProductID",consumes="application/json",produces="application/json")
	public String removeStudent(@RequestParam String productID)
	{
	return priceServiceImpl.deleteProductByID(productID);
	}
	
   @GetMapping(value ="/getPriceByID",produces="application/json")
	public float getPriceByID(@RequestParam String productID){
		
		return priceServiceImpl.getPriceByID(Integer.parseInt(productID));
		}
	
	
	@GetMapping(value ="/",produces="application/json")
	public String priceWelcomePage(){
		//System.out.println("At controller page");
		return "Welcome to the price page";
	}

	
}
