package se.mah.k3.soderberg.hampus.alkonackanV1;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class start extends Activity {
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.sessionlist);

String[] data = new String[]{"14 mars, 2011", "15 mars, 2011", "23 mars, 2011","27 mars, 2011", "5 maj, 2011", "15 maj, 2011", "24 maj, 2011", "4 juni, 2011", "10 juni, 2011"};
ListView lst = (ListView) findViewById( R.id.listViewSessions);
ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.minlistitem, data );
lst.setAdapter(adapter);




/* Spinner vikt = (Spinner) findViewById(R.id.spinner_vikt);
ArrayAdapter adapter_vikt = ArrayAdapter.createFromResource(
this, R.array.vikt, android.R.layout.simple_spinner_item);
adapter_vikt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
vikt.setAdapter(adapter_vikt);*/

/* Spinner kanslor = (Spinner) findViewById(R.id.spinner_kanslor);
ArrayAdapter adapter_kanslor = ArrayAdapter.createFromResource(
this, R.array.kanslor, android.R.layout.simple_spinner_item);
adapter_kanslor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
kanslor.setAdapter(adapter_kanslor);
*/
}
}