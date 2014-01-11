package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends Activity {

	private TextView tv1;
	private TextView tv2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);

		tv1= (TextView)findViewById(R.id.sName);
		tv2= (TextView)findViewById(R.id.sId);

		// Fetching data from a parcelable object passed from MainActivity
		Student student = getIntent().getParcelableExtra("student");

		if(student!=null){
			tv1.setText("Name:"+student.studName);
			tv2.setText("Id:"+Integer.toString(student.studId));
		}
	
	}
}
