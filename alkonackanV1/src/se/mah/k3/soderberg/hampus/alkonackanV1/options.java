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

public class options extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.options);

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
				startActivity(show_sessionlist);
			}
		});

	}
}