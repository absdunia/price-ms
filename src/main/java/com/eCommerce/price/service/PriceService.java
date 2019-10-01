/**
 * 
 */
package com.eCommerce.price.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.eCommerce.price.model.*;
/**
 * @author Team 6
 *
 */
@Service
public interface PriceService {
public List<Price> getAllPrices();
public Price getPriceByID(int productID);

}
