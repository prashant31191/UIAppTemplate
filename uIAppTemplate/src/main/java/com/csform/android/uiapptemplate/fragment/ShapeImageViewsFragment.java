package com.csform.android.uiapptemplate.fragment;

import com.csform.android.uiapptemplate.R;
import com.csform.android.uiapptemplate.util.ImageUtil;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ShapeImageViewsFragment extends Fragment {

	public static ShapeImageViewsFragment newInstance() {
		return new ShapeImageViewsFragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_shape_image_views, container, false);
		ImageUtil.displayImage((ImageView) rootView.findViewById(R.id.a), "http://pengaja.com/uiapptemplate/avatars/0.jpg", null);
		ImageUtil.displayImage((ImageView) rootView.findViewById(R.id.b), "http://pengaja.com/uiapptemplate/avatars/0.jpg", null);
		ImageUtil.displayImage((ImageView) rootView.findViewById(R.id.c), "http://pengaja.com/uiapptemplate/avatars/0.jpg", null);
		ImageUtil.displayImage((ImageView) rootView.findViewById(R.id.d), "http://pengaja.com/uiapptemplate/avatars/0.jpg", null);
		ImageUtil.displayImage((ImageView) rootView.findViewById(R.id.e), "http://pengaja.com/uiapptemplate/avatars/0.jpg", null);
		ImageUtil.displayImage((ImageView) rootView.findViewById(R.id.f), "http://pengaja.com/uiapptemplate/avatars/0.jpg", null);
		ImageUtil.displayImage((ImageView) rootView.findViewById(R.id.g), "http://pengaja.com/uiapptemplate/avatars/0.jpg", null);
		ImageUtil.displayImage((ImageView) rootView.findViewById(R.id.h), "http://pengaja.com/uiapptemplate/avatars/0.jpg", null);
		return rootView;
	}
}
