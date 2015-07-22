package com.csform.android.uiapptemplate.fragment;

import java.util.ArrayList;
import java.util.List;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.csform.android.uiapptemplate.R;
import com.csform.android.uiapptemplate.SplashScreensActivity;
import com.csform.android.uiapptemplate.adapter.SubcategoryAdapter;

public class SplashScreensFragment extends Fragment implements OnItemClickListener {

	private ListView mListView;
	private List<String> mSplashScreens;
	
	public static SplashScreensFragment newInstance() {
		return new SplashScreensFragment();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mSplashScreens = new ArrayList<String>();
		mSplashScreens.add(SplashScreensActivity.SPLASH_SCREEN_OPTION_1);
		mSplashScreens.add(SplashScreensActivity.SPLASH_SCREEN_OPTION_2);
		mSplashScreens.add(SplashScreensActivity.SPLASH_SCREEN_OPTION_3);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_splash_screens, container, false);

		mListView = (ListView) rootView.findViewById(R.id.list_view);
		mListView.setAdapter(new SubcategoryAdapter(getActivity(), mSplashScreens));
		mListView.setOnItemClickListener(this);
		
		return rootView;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Intent intent = new Intent(getActivity(), SplashScreensActivity.class);
		intent.putExtra(SplashScreensActivity.SPLASH_SCREEN_OPTION, mSplashScreens.get(position));
		startActivity(intent);
	}
}
