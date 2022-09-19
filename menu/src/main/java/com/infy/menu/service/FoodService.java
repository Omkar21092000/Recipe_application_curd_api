package com.infy.menu.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infy.menu.entity.Food;
import com.infy.menu.repository.FoodRepository;
import java.util.Optional;
import java.util.ArrayList;
import java.util.List;
@Service
public class FoodService {

    @Autowired
    FoodRepository foodRepository;

    public String addnewfood(Food food){
        foodRepository.saveAndFlush(food);
        return "Food add in menu successfully";
    }

    public List<Food> fetchmenulist(){
        
        return  foodRepository.findAll();
    }

    public String updatemenufromlist(Long Id, Food food){
		Optional<Food> w1 = foodRepository.findById(Id);
		if(w1.isEmpty()) {
			System.out.println("No data");
			return "No such Data";
		}else {
			Food w = w1.get();
			w.setDishname(food.getDishname());
	    	w.setType(food.getType());
	    	w.setMethodofcooking(food.getMethodofcooking());
	    	w.setServe(food.getServe());
	    	w.setIngredient(food.getIngredient());
	    	foodRepository.saveAndFlush(w);
		}
		return "Data Updated";
	}
    
    public String removefood(Long Id){
		
		Optional<Food>optionalfood=foodRepository.findById(Id);
		String response=null;
		if(optionalfood.isPresent())
		{
	      this.foodRepository.deleteById(Id);
	      response="FoodDish details are deleted successfully";
		}
		else
		{
			response="Invalid Data";
		}
	
		return response;
		 
	}
    
    public List<Food> getallveg(String vegeterian){
    	List<Food> flist=null;
    	flist=foodRepository.findBuyVeg(vegeterian);
    	return flist;
    }
    
    public List<Food> getbyingredient(Long numserve,String specingedient){
    	List<Food> flists=null;
    	List<Food> specificlist= new ArrayList<Food>();
    	flists=foodRepository.findAll();
    	for(Food i :flists) {
    		String a=i.getIngredient();
    			if(a==null) {
        			continue;
        		}
        		else {
    	    		String[] res = a.split("[,]", 0);
    	    	       for(String myStr: res) {
    	    	          if( i.getServe()>=numserve && myStr.toLowerCase().equals(specingedient.toLowerCase())) {
    	    	        	 
    	    	        	  specificlist.add(i);
    	    	        	  break; 
    	    	          } 
    	    	       }     
        		}
    	}
    	return specificlist;
    }
    
    public List<Food> getnoningredient(String ingre,String methcook){
    	List<Food> flists=null;
    	int flag=0;
    	List<Food> specificlist= new ArrayList<Food>();
    	flists=foodRepository.findAll();
    	for(Food i :flists) {
    		String a=i.getIngredient();
    		if(a==null) {
    			continue;
    		}
    		else {
    			String[] res = a.split("[,]", 0);
    			for(String myStr: res) {
    				if(myStr.toLowerCase().equals(ingre.toLowerCase())) {
    					flag=1;
    					break;
    				}else {
    					flag=0;	
    				}
    			}
    			if(flag==0 && i.getMethodofcooking().toLowerCase().equals(methcook.toLowerCase())) {
    				specificlist.add(i);
    				flag=0;	
    			}
    			
    		}	
    	}
    	return specificlist;
    	
    	
    	
    }
    
   

    
}
