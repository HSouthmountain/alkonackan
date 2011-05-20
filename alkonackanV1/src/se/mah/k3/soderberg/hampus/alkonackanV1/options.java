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
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;

public class options extends Activity {
	
Bundle dataBundle;

//Radioknappar
private RadioButton radioWoman;
private RadioButton radioMan;
//Spinnervikt

//EditTextLösenord
private EditText password;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.options);
		
		//Radioknappar
		radioWoman=(RadioButton)findViewById(R.id.radioKvinna);
		radioMan=(RadioButton)findViewById(R.id.radioMan);
		//SpinnerVikt
		
		//EditTextLösenord
		password=(EditText)findViewById(R.id.textView_password);
		
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
				Intent show_sessionlist = new Intent(options.this, sessionlist.class);
				
				//Spara inställningar till dataBundle
				
				int checkpoint = 0;		
				
				//Spara kön
				if (radioWoman.isChecked() == true){
					dataBundle.putInt("sex", 1);
					checkpoint++;
				} else if (radioMan.isChecked() == false){
					dataBundle.putInt("sex", 2);
					checkpoint++;
				}
				//Spara vikt
				//nähä!! //dataBundle.putInt ("vikt", vikt.getSelectedItemPosition());
				//dataBundle.putInt("vikt", adapter_vikt.)
				//Spara losenord
				if (password.getText().toString() != null){
				dataBundle.putString("password", password.getText().toString());
				checkpoint++;
				}
				
				// If checkpoint är tillräckligt högt räknad Then byt activity
				if (checkpoint == 3){
					checkpoint = 0;
					startActivity(show_sessionlist);
				} else{
					checkpoint = 0;
				}
			}
		});

	}
}