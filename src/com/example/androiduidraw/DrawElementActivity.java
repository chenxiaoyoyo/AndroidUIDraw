package com.example.androiduidraw;

import com.example.androiduidraw.view.DrawView;

import android.app.Activity;
import android.os.Bundle;

public class DrawElementActivity extends Activity {

	DrawView mDrawView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_drawele);
		
		mDrawView = (DrawView) findViewById(R.id.drawele_view);
		mDrawView.DrawLine();
	}
	
}
