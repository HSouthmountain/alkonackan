package se.mah.k3.soderberg.hampus.alkonackanV1;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;


public class overview extends Activity {
	
	Bundle dataBundle;
	
	
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
		setContentView(R.layout.overview);


		int config = getResources().getConfiguration().orientation;
		
		if ( config == 2 ){  // 2 betyder landscape, 1 betyder portrait.
		
		String[] overviewData = new String[] { "19.00, Glad, Debaser, Peter",
				"20.00, Arg, Debaser, Filip", "21.00, Tr�tt, Babel, Nils", "19.00, Glad, Debaser, Peter, Filip, Jonas, Malin, G�ran, Gunnar, Sven, Johannes, Christian",
				"20.00, Arg, Debaser, Filip", "21.00, Tr�tt, Babel, Nils", "19.00, Glad, Debaser, Peter",
				"20.00, Arg, Debaser, Filip", "21.00, Tr�tt, Babel, Nils"};
		
		ListView lst = (ListView) findViewById(R.id.listViewOverviewLocations);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.row, R.id.label, overviewData);
		lst.setAdapter(adapter);
	
		}

	}
}