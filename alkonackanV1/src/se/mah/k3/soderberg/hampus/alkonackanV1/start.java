package se.mah.k3.soderberg.hampus.alkonackanV1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

public class start extends Activity {
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
				startActivity(show_options);
				
			}
		});
	}
}