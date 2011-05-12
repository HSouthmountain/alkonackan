package se.mah.k3.soderberg.hampus.alkonackanV1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class start extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options);
        
        Spinner s = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this, R.array.ManVikt, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
    }
}