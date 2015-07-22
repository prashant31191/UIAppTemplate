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
public class VideoPlayerFragment extends Fragment {

	public static VideoPlayerFragment newInstance() {
		return new VideoPlayerFragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_video_player, container, false);
		
		return rootView;
	}
}
