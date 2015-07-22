package com.csform.android.uiapptemplate.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.csform.android.uiapptemplate.R;

public class ButtonsFragment extends Fragment {

	public static ButtonsFragment newInstance() {
		return new ButtonsFragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_buttons, container, false);
		
		return rootView;
	}
}
