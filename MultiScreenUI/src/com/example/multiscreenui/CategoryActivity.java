package com.example.multiscreenui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class CategoryActivity extends FragmentActivity{
		
//	@Override
//	    protected Fragment createFragment() {
//	        return new CategoryFragment();
//	    }
//	 protected abstract Fragment createFragment();

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.fragment_container);
	        FragmentManager manager = getSupportFragmentManager();
	        Fragment fragment = manager.findFragmentById(R.id.fragmentContainer);

	        if (fragment == null) {
	            fragment = new CategoryFragment();//createFragment();
	            manager.beginTransaction()
	                .add(R.id.fragmentContainer, fragment)
	                .commit();
	        }
	    }
}
