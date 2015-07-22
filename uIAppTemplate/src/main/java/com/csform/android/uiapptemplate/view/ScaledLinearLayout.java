package com.csform.android.uiapptemplate.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.csform.android.uiapptemplate.R;

public class ScaledLinearLayout extends LinearLayout {

	private float widthRatio = 1F / 2F;
	
    public ScaledLinearLayout(Context context) {
        super(context);
    }

    public ScaledLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        
		TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ScaledLinearLayout);
		final int N = a.getIndexCount();
		for (int i = 0; i < N; ++i) {
			int attr = a.getIndex(i);
			switch (attr) {
			case R.styleable.ScaledLinearLayout_linear_layout_ratio:
				float styleableRatio = a.getFloat(attr, widthRatio);
				//Log.v("ratio", styleableRatio + "");
				widthRatio = styleableRatio;
				break;
			}
		}
		a.recycle();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), (int)(getMeasuredWidth() * widthRatio));
        //Log.v("" + getMeasuredWidth(), "" + (int)(getMeasuredWidth() * widthRatio));
		//Log.v("s", widthRatio + "");
    }
}