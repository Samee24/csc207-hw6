package com.farevee.groceries;

public class BulkContainer extends BulkItem {

	String container;
	
	public BulkContainer(String container, BulkFood food, Units unit, int amount) {
		super(food, unit, amount);
		this.container = container;
	}// BulkContainer(String container, BulkFood food, Units unit, int amount)
	
	@Override
	public String toString() {
			
		return this.container + " of " + super.toString();
	}//toString()

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BulkItem) {
			BulkContainer objBulk = (BulkContainer) obj;

			if (objBulk.food == this.food && objBulk.amount == this.amount
					&& objBulk.unit == this.unit && objBulk.container == this.container)
				return true;
			else
				return false;

		}//if
		else
			return false;
	}//equals(Object obj)
}
