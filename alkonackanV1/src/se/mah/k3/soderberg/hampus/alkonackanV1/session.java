package se.mah.k3.soderberg.hampus.alkonackanV1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SlidingDrawer;
import android.widget.SlidingDrawer.OnDrawerCloseListener;
import android.widget.SlidingDrawer.OnDrawerOpenListener;
import android.widget.Spinner;
import android.widget.TextView;

public class session extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.session);

		SlidingDrawer offDrawer;

		// SlidingDrawer
		offDrawer = (SlidingDrawer) this
				.findViewById(R.id.slidingDrawerOffDrawer);

		// Open Handler
		offDrawer.setOnDrawerOpenListener(new OnDrawerOpenListener() {
			@Override
			public void onDrawerOpened() {
				// listView.setVisibility(ListView.GONE);
			}
		});

		// Closing Handler
		offDrawer.setOnDrawerCloseListener(new OnDrawerCloseListener() {
			@Override
			public void onDrawerClosed() {
				// listView.setVisibility(ListView.VISIBLE);
			}
		});

		Spinner kanslor = (Spinner) findViewById(R.id.spinner_kanslor);
		ArrayAdapter adapter_kanslor = ArrayAdapter.createFromResource(this,
				R.array.kanslor, android.R.layout.simple_spinner_item);
		adapter_kanslor
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		kanslor.setAdapter(adapter_kanslor);
	}
}
