package com.example.multiscreenui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;


public class MultiScreenActivity extends FragmentActivity {

	 boolean mIsDualPane;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_screen);  
        View screenView = findViewById(R.id.headlines2);
        mIsDualPane = screenView != null && 
        		screenView.getVisibility() == View.VISIBLE;

    }

}
