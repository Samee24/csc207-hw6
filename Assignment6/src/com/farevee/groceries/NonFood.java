package com.farevee.groceries;

public class NonFood implements Item {

	String name;
	Weight weight;
	int price;
	
	public NonFood(String name, Weight weight, int price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}//NonFood(String name, Weight weight, int price)
	
	@Override
	public Weight getWeight() {
		// TODO Auto-generated method stub
		return this.weight;
	}//getWeight()

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}//getPrice()
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}//toString()
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof NonFood) {
			NonFood objNonFood = (NonFood) obj;

			if (objNonFood.name.equals(this.name) && objNonFood.weight.equals(this.weight)
					&& objNonFood.price ==  this.price)
				return true;
			else
				return false;

		} else
			return false;
	}//equals(Object obj)

}
