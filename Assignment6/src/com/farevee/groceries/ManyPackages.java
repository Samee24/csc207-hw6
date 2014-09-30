package com.farevee.groceries;

public class ManyPackages implements Item {

	Package type;
	int count;
	
	public ManyPackages(Package type, int count) {
		this.type = type;
		this.count = count;
	}//ManyPackages(Package type, int count)
	
	@Override
	public Weight getWeight() {
		// TODO Auto-generated method stub
		return new Weight(this.type.getWeight().units, this.type.getWeight().amount * count);
	}//getWeight()

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.type.getPrice() * count;
	}//getPrice()
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.count + " x " + this.type;
	}//toString()
	
	public int getCount(){
		
		return this.count;
	}//getCount()
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ManyPackages) {
			ManyPackages objManyPk = (ManyPackages) obj;

			if (objManyPk.count == this.count && objManyPk.type.equals(this.type))
				return true;
			else
				return false;

		}//if
		else
			return false;
	}//equals(Object obj) 

}
