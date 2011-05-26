package se.mah.k3.soderberg.hampus.alkonackanV1;

import java.io.Serializable;
import java.util.ArrayList;


public class DrinkSession implements Serializable {
	
	private boolean isAlive = true;
	
	
	//Drink[] drinkar = new Drink[8];
	
	ArrayList<Drink> drinkar = new ArrayList<Drink>();
	
	public void addDrink(Drink newDrink) {
		
		drinkar.add(newDrink);
		
	}
	
	public void setSessionStatus(boolean setStatus){
		
		isAlive = setStatus;
		
	}
	
	public boolean getSessionStatus() {
		return isAlive;
	}
	
	
}