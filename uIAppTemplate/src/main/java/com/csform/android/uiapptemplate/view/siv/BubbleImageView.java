package com.csform.android.uiapptemplate.view.siv;

import android.content.Context;
import android.util.AttributeSet;

import com.csform.android.uiapptemplate.view.siv.shader.BubbleShader;
import com.csform.android.uiapptemplate.view.siv.shader.ShaderHelper;

public class BubbleImageView extends ShaderImageView {

    public BubbleImageView(Context context) {
        super(context);
    }

    public BubbleImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BubbleImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public ShaderHelper createImageViewHelper() {
        return new BubbleShader();
    }
}
