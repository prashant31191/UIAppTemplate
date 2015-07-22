package com.csform.android.uiapptemplate.fragment;

import com.csform.android.uiapptemplate.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TextViewsFragment extends Fragment {

	public static TextViewsFragment newInstance() {
		return new TextViewsFragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_text_views, container, false);
		
		return rootView;
	}
}
