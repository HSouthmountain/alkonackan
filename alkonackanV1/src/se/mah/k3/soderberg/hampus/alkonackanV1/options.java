package se.mah.k3.soderberg.hampus.alkonackanV1;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;

public class options extends Activity {

	Bundle dataBundle;
	//Bundle dataBundle = getIntent().getExtras();

	// Radioknappar
	private RadioButton radioWoman;
	private RadioButton radioMan;
	// Spinnervikt

	// EditTextLösenord
	private EditText password;

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		dataBundle = getIntent().getExtras();
	}
	
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.options);
		
		dataBundle = getIntent().getExtras();
		
		// Radioknappar
		radioWoman = (RadioButton) findViewById(R.id.radioKvinna);
		radioMan = (RadioButton) findViewById(R.id.radioMan);

		// EditTextLösenord
		password = (EditText) findViewById(R.id.editText_password);

		// SpinnerVikt
		Spinner vikt = (Spinner) findViewById(R.id.spinnerVikt);
		ArrayAdapter adapter_vikt = ArrayAdapter.createFromResource(this,
				R.array.vikt, android.R.layout.simple_spinner_item);
		adapter_vikt
		.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		vikt.setAdapter(adapter_vikt);

		Button start_knapp_session = (Button) findViewById(R.id.buttonOptionsStart);
		start_knapp_session.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent show_sessionlist = new Intent(options.this,
						sessionlist.class);

				//**** Spara inställningar till dataBundle

				//Checkpoint som ser till att alla fält har fyllts i
				int checkpoint = 0;

				// Spara vikt
				Spinner vikt = (Spinner) findViewById(R.id.spinnerVikt);
				
				if (vikt.getSelectedItem().toString() != null){
					dataBundle.putLong("vikt", vikt.getSelectedItemId());
					Log.i("vikt", ("Vikt id: "+vikt.getSelectedItemId()));
					checkpoint++;
				} else if (vikt.getSelectedItem().toString() == null){
					checkpoint = 0;
				}
				
				
				// Spara kön
				if (radioWoman.isChecked() == true && radioMan.isChecked() == false) {
					dataBundle.putString("kon", "kvinna");
					checkpoint++;
					Log.i("test", "kvinna");
				} else if (radioMan.isChecked() == true && radioWoman.isChecked() == false) {
					dataBundle.putString("kon", "man");
					checkpoint++;
					Log.i("test", "man");
				}
				/*if (radioWoman.isChecked() == false) {
					checkpoint = 0;
				} else if (radioMan.isChecked() == false) {
					checkpoint = 0;
				}*/
				
				
				//SKRÄP
				// Spara vikt
				// nähä!! //dataBundle.putInt ("vikt",
				// vikt.getSelectedItemPosition());
				// dataBundle.putInt("vikt", adapter_vikt.)
				// Spara losenord
				//SKRÄP
				
				//Spara lösenord
				if (password.getText().toString().length() > 1) {
					Log.i("hej","hej");
					dataBundle.putString("password", password.getText().toString());
					checkpoint++;
				}
				
				// If checkpoint är tillräckligt högt räknad Then byt activity
				if (checkpoint == 3) {
					checkpoint = 0;
					show_sessionlist.putExtras(dataBundle);
					startActivity(show_sessionlist);
				} else {
					checkpoint = 0;
				}
				//show_sessionlist.putExtras(dataBundle);
				//startActivity(show_sessionlist);
			}
			
		});

	}
}