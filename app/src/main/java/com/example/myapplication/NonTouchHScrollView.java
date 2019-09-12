package com.example.myapplication;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.HorizontalScrollView;

import androidx.annotation.RequiresApi;

public class NonTouchHScrollView extends HorizontalScrollView {

    public NonTouchHScrollView(Context context) {
        super(context);
    }

    public NonTouchHScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NonTouchHScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public NonTouchHScrollView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }
}
