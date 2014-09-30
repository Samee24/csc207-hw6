package com.farevee.groceries;

public class Package implements Item {

	String name;
	Weight weight;
	int price;
	public Package(String name,Weight weight,int price ) {
		
		this.name = name;
		this.weight = weight;
		this.price = price;
	}//Package(String name,Weight weight,int price )
	
	@Override
	public Weight getWeight() {

		return this.weight;
	}//getWeight()

	@Override
	public int getPrice() {
		
		return this.price;
	}//getPrice()
	
	@Override
	public String toString() {

		return this.weight.amount + " " + this.weight.units.abbrev + " package of " + this.name;
	}//toString()
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Package) {
			Package objPk = (Package) obj;

			if (objPk.name.equals(this.name) && objPk.weight.equals(this.weight) 
					&& objPk.price == this.price)
				return true;
			else
				return false;

		}//if
		else
			return false;
	}//equals(Object obj)

}
