package com.example.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {
	Paint paint;

	public MyView(Context context, AttributeSet attrs) {
		super(context, attrs);
		paint = new Paint();
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// this is the canvas where you will draw all your stuff

		paint.setStyle(Style.STROKE); // set style to paint
		paint.setColor(0xFFE80926); // set color
		paint.setStrokeWidth(10); // set stroke width
		canvas.drawRect(50, 50, 200, 200, paint); // draw rectangle
		canvas.drawRect(100, 100, 250, 250, paint); // draw other rectangle
		canvas.drawLine(50, 50, 100, 100, paint);// simple line joining edges
		canvas.drawLine(200, 200, 250, 250, paint);
		canvas.drawLine(50, 200, 100, 250, paint);
		canvas.drawLine(200, 50, 250, 100, paint);

	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		setMeasuredDimension(400, 300); // set desired width and height of your
										// layout
	}

}
