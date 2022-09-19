package com.infy.menu.entity;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="foodlist")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="dishname")
    private String dishname;
    @Column(name="typev")
    private String type;
    @Column(name="methodofcooking")
    private String methodofcooking;
    @Column(name="ingredient")
    private String ingredient;
    
    @Column(name="serve")
    private Integer serve;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getDishname() {
        return dishname;
    }
    public void setDishname(String dishname) {
        this.dishname = dishname;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getMethodofcooking() {
        return methodofcooking;
    }
    public void setMethodofcooking(String methodofcooking) {
        this.methodofcooking = methodofcooking;
    }
    
    public Integer getServe() {
        return serve;
    }
    public void setServe(Integer serve) {
        this.serve = serve;
    }
   
    public Food() {
    }
	public String getIngredient() {
		return ingredient;
	}
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	public Food(long id, String dishname, String type, String methodofcooking, String ingredient,
			Integer serve) {
		super();
		this.id = id;
		this.dishname = dishname;
		this.type = type;
		this.methodofcooking = methodofcooking;
		this.ingredient = ingredient;
		this.serve = serve;
	}
   
}
