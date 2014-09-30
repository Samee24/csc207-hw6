package com.farevee.shopping;

import java.io.PrintWriter;
import java.util.ArrayList;

import com.farevee.groceries.Item;
import com.farevee.groceries.ManyPackages;
import com.farevee.groceries.Units;
import com.farevee.groceries.Weight;


/**Allows the construction of a shopping cart in which a user can add items, get the number of
 * items in the shopping cart, print its contents, get the number of entries, the total price,
 * the total weight and remove any specific items. 
 * @author Samee Zahid
 *
 */
public class Cart {

	//Fields
	ArrayList<Item> dataStorage;
	int itemCount;
	
	/**Constructor
	 * @param: None
	 */
	public Cart() {
		dataStorage = new ArrayList<Item>();
		itemCount= 0;
	}
	
	/**Add an item to the cart
	 * @param item
	 * @return none
	 */
	public void addItem(Item item){
		
		if (item instanceof ManyPackages)
			this.itemCount =+ ((ManyPackages) item).getCount();
		else
			this.itemCount++;
		
		this.dataStorage.add(item);
	}//addItem(Item item)
	
	/**Get the amount of things in the cart
	 * @param none
	 * @return int 
	 */
	public int numThings(){
				
		return this.itemCount;
	}//numThings()
	
	/**Get the number of entries in the cart
	 * 
	 * @return
	 */
	public int numEntries(){
		
		return this.dataStorage.size();
	}//numEntries()
	
	/**Print the contents of the cart
	 * 
	 * @param pen
	 */
	public void printContents(PrintWriter pen){
		
		for (Item it: this.dataStorage)
			pen.println(it);			
		
	}//printContents(PrintWriter pen)
	
	/**Get the total price of the contents in the cart
	 * 
	 * @return totalPrice
	 */
	public int getPrice(){
		int totalPrice = 0;
		
		for (Item it: this.dataStorage)
			totalPrice =+ it.getPrice();
		
		return totalPrice;
		
	}//getPrice()
	
	/**Get the total weight of the cart. Will return an array
	 * 
	 * @return ArrayList
	 */
	public ArrayList<Weight> getWeight(){
		int poundTotal = 0;
		int gramTotal = 0;
		int kgTotal = 0;
	    int ounceTotal = 0;
	    
		ArrayList<Weight> totalWeights = new ArrayList<Weight>();
		
		for (Item it: this.dataStorage){
			
			Weight currentWeight = it.getWeight();
		
			//Individual cases
			if (currentWeight.getUnits().equals(Units.GRAM))
				gramTotal =+ currentWeight.getAmount();
			else if (currentWeight.getUnits().equals(Units.POUND))
				poundTotal =+ currentWeight.getAmount();
			else if (currentWeight.getUnits().equals(Units.KILOGRAM))
				kgTotal =+ currentWeight.getAmount();
			else if (currentWeight.getUnits().equals(Units.OUNCE))
				ounceTotal =+ currentWeight.getAmount();
			
			totalWeights.add(new Weight(Units.POUND, poundTotal));
			totalWeights.add(new Weight(Units.GRAM, gramTotal));
			totalWeights.add(new Weight(Units.KILOGRAM, kgTotal));
			totalWeights.add(new Weight(Units.OUNCE, ounceTotal));
			
		}//for
		return totalWeights;
		
	}//getWeight()
	
	/**Remove any specific item. Searches and deletes by name
	 * 
	 * @param name
	 */
	public void remove (String name){
		
		for (int index = 0; index < this.dataStorage.size(); index++){
			
			//if name and item at index match, remove
			if(this.dataStorage.get(index).toString().equals(name))
				this.dataStorage.remove(index);
		}//for
		
	}//remove(String name)
	
	
	
}


