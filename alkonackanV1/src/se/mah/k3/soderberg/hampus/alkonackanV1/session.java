package se.mah.k3.soderberg.hampus.alkonackanV1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SlidingDrawer;
import android.widget.Toast;
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

		Button avsluta_session = (Button) findViewById(R.id.buttonAvslutaSession);
		avsluta_session.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent show_overview = new Intent(session.this, overview.class);
				startActivity(show_overview);
			}
		});

		// Drickknappar

		ImageButton button_stark = (ImageButton) findViewById(R.id.button_stark);
		button_stark.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Spinner kansla = (Spinner) findViewById(R.id.spinner_kanslor);
				EditText varText = (EditText) findViewById(R.id.editText_var);
				EditText vemText = (EditText) findViewById(R.id.editText_vem);

				Toast toast = Toast.makeText(
						getApplicationContext(),
						"KŠnsla: " + kansla.getSelectedItem() + "\nVart: "
								+ varText.getText() + " \nMed: "
								+ vemText.getText() + " \n\nStor stark",
						Toast.LENGTH_SHORT);
				toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
				toast.show();

				varText.clearFocus();
				vemText.clearFocus();
			}
		});

		ImageButton button_folk = (ImageButton) findViewById(R.id.button_folk);
		button_folk.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Spinner kansla = (Spinner) findViewById(R.id.spinner_kanslor);
				EditText varText = (EditText) findViewById(R.id.editText_var);
				EditText vemText = (EditText) findViewById(R.id.editText_vem);

				Toast toast = Toast.makeText(
						getApplicationContext(),
						"KŠnsla: " + kansla.getSelectedItem() + "\nVart: "
								+ varText.getText() + " \nMed: "
								+ vemText.getText() + " \n\nFolkšl",
						Toast.LENGTH_SHORT);
				toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
				toast.show();

				varText.clearFocus();
				vemText.clearFocus();
			}
		});

		ImageButton button_drink = (ImageButton) findViewById(R.id.button_drink);
		button_drink.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Spinner kansla = (Spinner) findViewById(R.id.spinner_kanslor);
				EditText varText = (EditText) findViewById(R.id.editText_var);
				EditText vemText = (EditText) findViewById(R.id.editText_vem);

				Toast toast = Toast.makeText(
						getApplicationContext(),
						"KŠnsla: " + kansla.getSelectedItem() + "\nVart: "
								+ varText.getText() + " \nMed: "
								+ vemText.getText() + " \n\nDrink 4 cl",
						Toast.LENGTH_SHORT);
				toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
				toast.show();

				varText.clearFocus();
				vemText.clearFocus();
			}
		});

		ImageButton button_oel = (ImageButton) findViewById(R.id.button_oel);
		button_oel.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Spinner kansla = (Spinner) findViewById(R.id.spinner_kanslor);
				EditText varText = (EditText) findViewById(R.id.editText_var);
				EditText vemText = (EditText) findViewById(R.id.editText_vem);

				Toast toast = Toast.makeText(
						getApplicationContext(),
						"KŠnsla: " + kansla.getSelectedItem() + "\nVart: "
								+ varText.getText() + " \nMed: "
								+ vemText.getText() + " \n\n33 cl 5,2%",
						Toast.LENGTH_SHORT);
				toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
				toast.show();

				varText.clearFocus();
				vemText.clearFocus();
			}
		});

		ImageButton button_vin = (ImageButton) findViewById(R.id.button_vin);
		button_vin.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Spinner kansla = (Spinner) findViewById(R.id.spinner_kanslor);
				EditText varText = (EditText) findViewById(R.id.editText_var);
				EditText vemText = (EditText) findViewById(R.id.editText_vem);

				Toast toast = Toast.makeText(
						getApplicationContext(),
						"KŠnsla: " + kansla.getSelectedItem() + "\nVart: "
								+ varText.getText() + " \nMed: "
								+ vemText.getText() + " \n\nEtt glas vin",
						Toast.LENGTH_SHORT);
				toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
				toast.show();

				varText.clearFocus();
				vemText.clearFocus();
			}
		});

		ImageButton button_shot = (ImageButton) findViewById(R.id.button_shot);
		button_shot.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Spinner kansla = (Spinner) findViewById(R.id.spinner_kanslor);
				EditText varText = (EditText) findViewById(R.id.editText_var);
				EditText vemText = (EditText) findViewById(R.id.editText_vem);

				Toast toast = Toast.makeText(
						getApplicationContext(),
						"KŠnsla: " + kansla.getSelectedItem() + "\nVart: "
								+ varText.getText() + " \nMed: "
								+ vemText.getText() + " \n\n4 cl Shot",
						Toast.LENGTH_SHORT);
				toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
				toast.show();

				varText.clearFocus();
				vemText.clearFocus();
			}
		});

	}
}
