package com.example.multiscreenui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CategoryFragment extends Fragment {
//	   Crime mCrime;
//	    EditText mTitleField;
	    Button setRegion;
//	    CheckBox mSolvedCheckBox;
	  
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);	      
	    }
	    @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
	        View v = inflater.inflate(R.layout.category_fragment, parent, false);
			
	        setRegion = (Button)v.findViewById(R.id.region);
	      //  updateDate();
	        setRegion.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {        
	            	AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
	        	    builder.setTitle(R.string.setregion)
	        	           .setItems(R.array.regions, new DialogInterface.OnClickListener() {
	        	               public void onClick(DialogInterface dialog, int which) {
	        	            	  if(which == 0)
	        	            		  setRegion.setText("ARMM");
	        	            	  if(which == 1)
	        	            		  setRegion.setText("CAR");
	        	            	  if(which == 2)
	        	            		  setRegion.setText("NCR");
	        	            	  if(which == 3)
	        	            		  setRegion.setText("Region I");
	        	            	  if(which == 4)
	        	            		  setRegion.setText("Region II");
	        	            	  if(which == 5)
	        	            		  setRegion.setText("Region III");
	        	            	  if(which == 6)
	        	            		  setRegion.setText("Region IV-A");
	        	            	  if(which == 7)
	        	            		  setRegion.setText("Region IV-B");
	        	            	  if(which == 8)
	        	            		  setRegion.setText("Region V");
	        	            	  if(which == 9)
	        	            		  setRegion.setText("Region VI");
	        	            	  if(which == 10)
	        	            		  setRegion.setText("Region VII");
	        	            	  if(which == 11)
	        	            		  setRegion.setText("Region VIII");
	        	            	  if(which == 12)
	        	            		  setRegion.setText("Region IX");
	        	            	  if(which == 13)
	        	            		  setRegion.setText("Region X");
	        	            	  if(which == 14)
	        	            		  setRegion.setText("Region XI");
	        	            	  if(which == 15)
	        	            		  setRegion.setText("Region XII");
	        	            	  if(which == 16)
	        	            		  setRegion.setText("Region XIII");
	        	            	  
	        	           }
	        	    });
	        	    builder.show();
	            }
	        });
		
		
			 
			        
	        return v;
	    }

}
