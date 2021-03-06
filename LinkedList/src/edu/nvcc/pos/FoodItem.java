package edu.nvcc.pos;

import java.io.Serializable;
import java.math.BigDecimal;


public class FoodItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	BigDecimal price;
	int quantity;
	String description;
	String size;
	boolean specialOrder;

	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodItem(String name, BigDecimal price, int quantity,
			String description, String size, boolean specialOrder) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		this.size = size;
		this.specialOrder = specialOrder;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public boolean isSpecialOrder() {
		return specialOrder;
	}
	public void setSpecialOrder(boolean specialOrder) {
		this.specialOrder = specialOrder;
	}

	@Override
	public String toString() {
		return "FoodItem [name=" + name + ", price=" + price + ", quantity="
				+ quantity + ", description=" + description + ", size=" + size
				+ ", specialOrder=" + specialOrder + "]";
	}

}