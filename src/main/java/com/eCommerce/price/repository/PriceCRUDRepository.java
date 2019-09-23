/**
 * 
 */
package com.eCommerce.price.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eCommerce.price.model.Price;

/**
 * @author Team 6
 *
 */

@Repository
public interface PriceCRUDRepository extends JpaRepository<Price, Integer>{
	Price findByProductID(Integer productID);
	
}
