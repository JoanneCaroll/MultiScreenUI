package com.example.multiscreenui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MultiScreen1Fragment extends Fragment{
	TextView mTextView;
	EditText mEditText;
	Button mOk;
	Button mCancel;
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState){
		View v = inflater.inflate(R.layout.screen1_fragment, parent, false);
		
		mTextView = (TextView)v.findViewById(R.id.label);
		mEditText = (EditText)v.findViewById(R.id.entry);
		mOk = (Button)v.findViewById(R.id.okbutton);
		mCancel = (Button)v.findViewById(R.id.cancelbutton);
		
		return v;
	}
}
