package com.infy.menu.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.menu.entity.Food;
import com.infy.menu.service.FoodService;

@RestController
@RequestMapping("/menu")

public class FoodController {
	
	@Autowired
	FoodService foodService;
	
	@PostMapping("/add")
	@CrossOrigin(origins = "http://localhost:4200")
	 public ResponseEntity<String> insertNewFood(@RequestBody Food food) {
		
	 	String response=this.foodService.addnewfood(food);
	 	return ResponseEntity.ok(response);
		
	 }
	
	@GetMapping("/all")
	@CrossOrigin(origins = "http://localhost:4200")
	 public List<Food> fetchAvailabledish(){
		
		return this.foodService.fetchmenulist();
	 }
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateMenu(@PathVariable("id") Long id, @RequestBody Food fooddetails) {
		ResponseEntity<String> e = new ResponseEntity<>(this.foodService.updatemenufromlist(id,fooddetails), HttpStatus.ACCEPTED);
		return e;
		
	}
	 @DeleteMapping("/delete/{id}")
		 public ResponseEntity<String> removefoodfromlist(@PathVariable Long id) {
		 	String response= this.foodService.removefood(id);
		 	return ResponseEntity.ok(response);
	}	
	 
	
	 @GetMapping("/{vegeterian}")
	 public List<Food> getAllVegDish(@PathVariable String vegeterian){
		 return this.foodService.getallveg(vegeterian);
	 }
	 
	 
	 @GetMapping("/getingredient/{numserve}/{specingedient}")
	 public List<Food> getbyspecific(@PathVariable Long numserve,@PathVariable String specingedient){
		 return this.foodService.getbyingredient(numserve,specingedient);
		 
	 }
	 
	 @GetMapping("/notiningredient/{ingre}/{methcook}")
	 public List<Food> getotherlist(@PathVariable String ingre,@PathVariable String methcook){
		 return this.foodService.getnoningredient(ingre,methcook);
	 }
		 
	 
	 
		 
	 
	 
	 
	 

	
	
	
	
	
	
	
	

}
