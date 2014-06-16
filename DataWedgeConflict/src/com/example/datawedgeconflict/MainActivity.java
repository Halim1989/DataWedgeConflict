package com.example.datawedgeconflict;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class MainActivity extends ActionBarActivity {
	private static final String ACTION_SOFTSCANTRIGGER = "com.motorolasolutions.emdk.datawedge.api.ACTION_SOFTSCANTRIGGER";
	private static final String EXTRA_PARAM = "com.motorolasolutions.emdk.datawedge.api.EXTRA_PARAMETER";
	private static final String DWAPI_START_SCANNING = "START_SCANNING";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void launchDataWedge(View v) {

		Intent i = new Intent();
		i.setAction(ACTION_SOFTSCANTRIGGER);
		i.putExtra(EXTRA_PARAM, DWAPI_START_SCANNING);
		sendBroadcast(i);
	}

	public void takePicture(View v) {

		Intent i = new Intent(this, CamActivity.class);
		startActivity(i);

	}
}
