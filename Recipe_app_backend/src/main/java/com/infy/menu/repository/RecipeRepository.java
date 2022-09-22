package com.infy.menu.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.infy.menu.entity.RecipeEntity;

@Repository
public interface RecipeRepository extends JpaRepository<RecipeEntity,Long>{

	@Query("select c from RecipeEntity c where c.type=?1")
	List<RecipeEntity> findBuyVeg(String type);

	@Query("select c from RecipeEntity c where c.serve>=?1")
	List<RecipeEntity> findbuyserving(int numserve);
	
}

