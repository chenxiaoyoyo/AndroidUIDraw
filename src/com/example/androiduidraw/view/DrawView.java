package com.example.androiduidraw.view;

import com.example.androiduidraw.R;

import android.R.color;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;

public class DrawView extends View {

	private Paint mPaint;
	
	int msreenWidth;
	int msreenHeight;
	
	boolean mbDrawLine;
	boolean mbDrawStar;
	
	public DrawView(Context context) {
		super(context);
		init();
	}
	
	public DrawView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		init();
	}

	public DrawView(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	protected void init() {
		mPaint = new Paint();
		
		mbDrawLine = false;
		mbDrawStar = false;
		
		DisplayMetrics dm = getResources().getDisplayMetrics();
		msreenWidth = dm.widthPixels;
		msreenHeight = dm.heightPixels;
	}
	@Override
	protected void onDraw (Canvas canvas) {
		super.onDraw (canvas);
		
		if (mbDrawLine) {
			mPaint.reset();  
			mPaint.setColor(Color.GREEN);
			mPaint.setStrokeWidth(3);
			mPaint.setStyle(Style.STROKE);
			int DesPos = getResources().getDimensionPixelOffset(R.dimen.drawele_line_width);
			canvas.drawLine(0, 0, DesPos, DesPos, mPaint);			
		}
		else if (mbDrawStar) {
			mPaint.reset();
			mPaint.setColor(color.white);
			int CenterPosX = msreenWidth / 2;
			int CenterPosY = msreenHeight / 3 * 2;
			
		}

	}
	
	public void DrawLine() {
		mbDrawLine = true;
		invalidate();
	}
	
	public void DrawStarLine() {
		mbDrawStar = true;
		invalidate();
	}
}
