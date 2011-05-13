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
        setContentView(R.layout.session);
        
       /* Spinner vikt = (Spinner) findViewById(R.id.spinner_vikt);
        ArrayAdapter adapter_vikt = ArrayAdapter.createFromResource(
                this, R.array.vikt, android.R.layout.simple_spinner_item);
        adapter_vikt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        vikt.setAdapter(adapter_vikt);*/
        
        Spinner kanslor = (Spinner) findViewById(R.id.spinner_kanslor);
        ArrayAdapter adapter_kanslor = ArrayAdapter.createFromResource(
                this, R.array.kanslor, android.R.layout.simple_spinner_item);
        adapter_kanslor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        kanslor.setAdapter(adapter_kanslor);
    }
}