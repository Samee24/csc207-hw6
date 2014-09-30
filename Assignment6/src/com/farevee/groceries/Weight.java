package com.farevee.groceries;

public class Weight {
	
	Units units;
	int amount;
	
	
	public Weight(Units units, int amount) {
		
		this.units = units;
		this.amount = amount;
	}//Weight(Units units, int amount)
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.amount + " " + this.units.name;
	}//toString()
	
	public Units getUnits(){
		
		return this.units;
	}//getUnits()
	
	public int getAmount(){
		
		return this.amount;
	}//getAmount()
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Weight){
			
			Weight objW = (Weight)obj;
			if (objW.amount == this.amount && objW.units.equals(this.units))
				return true;
			else
				return false;
			
			
		} else
			return false;
	}

}
