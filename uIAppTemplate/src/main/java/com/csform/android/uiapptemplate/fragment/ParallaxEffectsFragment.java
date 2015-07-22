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

import com.csform.android.uiapptemplate.ParallaxActivity;
import com.csform.android.uiapptemplate.ParallaxKenBurnsActivity;
import com.csform.android.uiapptemplate.R;
import com.csform.android.uiapptemplate.adapter.SubcategoryAdapter;

public class ParallaxEffectsFragment extends Fragment implements OnItemClickListener {

	private ListView mListView;
	private List<String> mParallaxEffects;
	
	public static ParallaxEffectsFragment newInstance() {
		return new ParallaxEffectsFragment();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mParallaxEffects = new ArrayList<String>();
		mParallaxEffects.add(ParallaxKenBurnsActivity.TAG);
		mParallaxEffects.add(ParallaxActivity.TAG);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_paralax, container, false);
		
		mListView = (ListView) rootView.findViewById(R.id.list_view);
		mListView.setAdapter(new SubcategoryAdapter(getActivity(), mParallaxEffects));
		mListView.setOnItemClickListener(this);
		
		return rootView;
	}
	
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		String pe = mParallaxEffects.get(position);
		Intent intent = null;
		if (pe.equals(ParallaxKenBurnsActivity.TAG)) {
			intent = new Intent(getActivity(), ParallaxKenBurnsActivity.class);
		} else if (pe.equals(ParallaxActivity.TAG)) {
			intent = new Intent(getActivity(), ParallaxActivity.class);
		}
		if (intent != null)	startActivity(intent);
	}
}
