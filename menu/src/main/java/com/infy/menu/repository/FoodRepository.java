package com.infy.menu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infy.menu.entity.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food,Long>{
	
	@Query("select c from Food c where c.type=?1")
	List<Food> findBuyVeg(String type);
	

}

