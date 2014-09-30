package com.farevee.groceries;

public class BulkFood {
	
	String name;
	Units unit;
	int pricePerUnit;
	int supply;
	
	public BulkFood(String name, Units unit, int pricePerUnit, int supply) {
		
		this.name = name;
		this.unit = unit;
		this.pricePerUnit = pricePerUnit;
		this.supply = supply;
	}//BulkFood(String name, Units unit, int pricePerUnit, int supply)
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BulkFood){
			
			BulkFood objFood = (BulkFood)obj;
			
			if (objFood.name.equals(this.name) && objFood.unit.equals(this.unit) &&
					objFood.pricePerUnit == this.pricePerUnit
					&& objFood.supply == this.supply)
				return true;
			else 
				return false;
			
		} else
			return false;
	}

}
