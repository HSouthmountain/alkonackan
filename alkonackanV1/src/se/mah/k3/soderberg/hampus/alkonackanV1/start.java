package se.mah.k3.soderberg.hampus.alkonackanV1;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;

public class start extends Activity {
	
	//Alla inställningar och resultat lagras här sålänge programmet körs.
	Bundle dataBundle = new Bundle();
	
	//I denna lista finns alla sessioner. I alla sessioner finns alla drinkar. I varje instansierad drink finns vilken drinktyp, känsla, plats och sällskap
	ArrayList<DrinkSession> drinkSessioner = new ArrayList<DrinkSession>();
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Button start_knapp = (Button) findViewById(R.id.buttonStart);
		start_knapp.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				Intent show_options = new Intent(start.this, options.class);
				Intent session = new Intent(start.this, session.class);
				Intent overview = new Intent(start.this, overview.class);
				Intent sessionlist = new Intent(start.this, sessionlist.class);
				
			//FORMAT:	dataBundle.putString("test", "Hejsan!");
				
				
				dataBundle.putSerializable("objekt", drinkSessioner);
				
				//Spara inställningar
				show_options.putExtras(dataBundle);
				session.putExtras(dataBundle);
				session.putExtras(dataBundle);
				overview.putExtras(dataBundle);
				sessionlist.putExtras(dataBundle);
				
				startActivity(show_options);
				
			}
		});
		
		ImageButton info_knapp = (ImageButton) findViewById(R.id.buttonInfo);
		info_knapp.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View v) {
				Intent show_about = new Intent(start.this, about.class);
				startActivity(show_about);
				
			}
		});
	}
}