package com.csform.android.uiapptemplate.fragment;

import com.csform.android.uiapptemplate.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Coming soon.
 * */
public class DialogsFragment extends Fragment {

	public static DialogsFragment newInstance() {
		return new DialogsFragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_dialogs, container, false);
		
		return rootView;
	}
}
