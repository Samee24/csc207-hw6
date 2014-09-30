package com.farevee.groceries;

public class BulkItem implements Item {

	BulkFood food;
	Units unit;
	int amount;

	public BulkItem(BulkFood food, Units unit, int amount) {

		this.food = food;
		this.unit = unit;
		this.amount = amount;
	}//BulkItem(BulkFood food, Units unit, int amount) 

	@Override
	public Weight getWeight() {

		return new Weight(this.unit, this.amount);
	}//getWeight()

	@Override
	public int getPrice() {

		return this.amount * this.food.pricePerUnit;
	}//getPrice()

	@Override
	public String toString() {

		return this.amount + " " + this.unit.name + " of " + this.food.name;

	}//toString()

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BulkItem) {
			BulkItem objBulk = (BulkItem) obj;

			if (objBulk.food.equals(this.food) && objBulk.amount == this.amount
					&& objBulk.unit.equals(this.unit))
				return true;
			else
				return false;

		}//if
		else
			return false;
	}//equals(Object obj)

}
