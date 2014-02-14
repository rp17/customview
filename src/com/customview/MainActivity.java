package com.customview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	CompassView view;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		view = new CompassView(this);
		setContentView(view);
		//setContentView(R.layout.activity_main);
	}

}
