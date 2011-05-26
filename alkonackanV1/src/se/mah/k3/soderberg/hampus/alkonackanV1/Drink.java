package se.mah.k3.soderberg.hampus.alkonackanV1;

import java.io.Serializable;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class Drink implements Serializable{
	
	String	typ;
	String	kansla;
	String	plats;
	String	sallskap;
	
	
	Drink(String typ, String kansla, String plats, String sallskap) {
		super();
		this.typ = typ;
		this.kansla = kansla;
		this.plats = plats;
		this.sallskap = sallskap;
		
		
	}
	
}



//Ta bort

//int[] drinkar = new int[8];

/*
int		antalStark;
int		antalFolk;
int		antalDrink;
int		antalOel;
int		antalVin;
int		antalShot;
*/

//for (int i =0; i<9;i++){
//this.drinkar[i]=0;
//}