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

import com.csform.android.uiapptemplate.ImageGalleryCategoryActivity;
import com.csform.android.uiapptemplate.ImageGallerySubcategoryActivity;
import com.csform.android.uiapptemplate.R;
import com.csform.android.uiapptemplate.adapter.SubcategoryAdapter;
import com.csform.android.uiapptemplate.util.DummyContent;

public class ImageGalleryFragment extends Fragment implements OnItemClickListener {
	
	private ListView mListView;
	private List<String> mImageGalleries;
	
	public static ImageGalleryFragment newInstance() {
		return new ImageGalleryFragment();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mImageGalleries = new ArrayList<String>();
		mImageGalleries.add(ImageGalleryCategoryActivity.ANIMALS_CATEGORY);
		mImageGalleries.add(ImageGalleryCategoryActivity.DOGS_SUBCATEGORY);
		mImageGalleries.add(ImageGalleryCategoryActivity.MUSIC_CATEGORY);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_image_gallery, container, false);
		
		mListView = (ListView) rootView.findViewById(R.id.list_view);
		mListView.setAdapter(new SubcategoryAdapter(getActivity(), mImageGalleries));
		mListView.setOnItemClickListener(this);
		
		return rootView;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		if (position == 1) {//Jump directly to sub-category
			Intent intent = new Intent(getActivity(), ImageGallerySubcategoryActivity.class);
			intent.putExtra(ImageGallerySubcategoryActivity.IMAGE_GALLERY_SUBCATEGORY, DummyContent.getImageGalleryDogsSubcategory());
			startActivity(intent);
			return;
		}
		String imageGallery = mImageGalleries.get(position);
		Intent intent = new Intent(getActivity(), ImageGalleryCategoryActivity.class);
		intent.putExtra(ImageGalleryCategoryActivity.IMAGE_GALLERY_CATEGORY, imageGallery);
		startActivity(intent);
	}
}
