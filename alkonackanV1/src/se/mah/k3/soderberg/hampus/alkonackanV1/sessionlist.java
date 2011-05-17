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

public class sessionlist extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sessionlist);

		String[] data = new String[] { "14 mars, 2011", "15 mars, 2011",
				"23 mars, 2011", "27 mars, 2011", "5 maj, 2011",
				"15 maj, 2011", "24 maj, 2011", "4 juni, 2011", "10 juni, 2011" };
		ListView lst = (ListView) findViewById(R.id.listViewSessions);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.minlistitem, data);
		lst.setAdapter(adapter);

		Button ny_session = (Button) findViewById(R.id.buttonNewSession);
		ny_session.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent show_session = new Intent(sessionlist.this, session.class);
				startActivity(show_session);
			}
		});		
		
	}
}