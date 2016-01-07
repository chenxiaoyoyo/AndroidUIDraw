package com.example.androiduidraw;

import com.example.androiduidraw.view.DrawView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class DrawBazierActivity extends Activity {

	DrawView mDrawView;
	RadioGroup mRadioGpDrawBazier;
	
	RadioButton mBazierButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_drawbazier);
		
		mDrawView = (DrawView) findViewById(R.id.drawbazier_touch_view);
		
		mRadioGpDrawBazier = (RadioGroup) findViewById(R.id.radiogroup_drawtouch_bazier);
		mRadioGpDrawBazier.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				String strOut = "RadioGroup.onCheckedChanged checkID = " + checkedId;
				Log.d("AndroidUIDraw", strOut);
				switch (checkedId) {
				case R.id.radioBtn_touchbazier:
					mDrawView.DrawTouchBazierType(1);
					break;
				case R.id.radioBtn_touchliner:
					mDrawView.DrawTouchBazierType(2);
					break;
				default:
					break;
				}
			}
		});
		
		mBazierButton = (RadioButton) findViewById(R.id.radioBtn_touchbazier);
		mBazierButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				boolean bChecked = mBazierButton.isChecked();
				if (bChecked) {
					Log.d("AndroidUIDraw", "BazierButton.setOnClickListener");
				}
			}
		});
	}
}
