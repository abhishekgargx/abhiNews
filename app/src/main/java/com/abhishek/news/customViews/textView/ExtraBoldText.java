package com.abhishek.news.customViews.textView;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;


public class ExtraBoldText extends AppCompatTextView {
    public ExtraBoldText(Context context) {
        super(context);
        applyCustomFont(context);
    }

    public ExtraBoldText(Context context, AttributeSet attrs) {
        super(context, attrs);
        applyCustomFont(context);
    }

    public ExtraBoldText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyCustomFont(context);
    }

    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("fonts/Nunito-ExtraBold.ttf", context);
        setTypeface(customFont);
    }
}
