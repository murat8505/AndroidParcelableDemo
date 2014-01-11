package com.example;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText name;
	private EditText id;
	private Button submit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		name = (EditText)findViewById(R.id.eName);
		id= (EditText)findViewById(R.id.eId);
		submit= (Button)findViewById(R.id.submit);


		submit.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Student student = new Student(name.getText().toString(),Integer.parseInt(id.getText().toString()));

				// Creating an intent to open the DisplayActivity
				Intent i = new Intent(getApplicationContext(), DisplayActivity.class);

				// Passing data as a parcelable object DisplayActivity
				i.putExtra("student",student);

				startActivity(i);
			}
		});

	}

}
