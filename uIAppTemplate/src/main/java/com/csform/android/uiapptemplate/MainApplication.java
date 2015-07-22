package com.csform.android.uiapptemplate;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class MainApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		ImageLoader.getInstance()
				.init(ImageLoaderConfiguration.createDefault(this));
	}
}
