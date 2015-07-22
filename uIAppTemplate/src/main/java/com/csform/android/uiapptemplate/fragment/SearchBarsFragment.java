package com.csform.android.uiapptemplate.fragment;

import java.util.ArrayList;
import java.util.List;

import com.csform.android.uiapptemplate.R;
import com.csform.android.uiapptemplate.SearchBarsActivity;
import com.csform.android.uiapptemplate.adapter.SubcategoryAdapter;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class SearchBarsFragment extends Fragment implements OnItemClickListener {

	private ListView mListView;
	private List<String> mSearchBars;

	public static SearchBarsFragment newInstance() {
		return new SearchBarsFragment();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mSearchBars = new ArrayList<String>();
		mSearchBars.add(SearchBarsActivity.SEARCH_BARS_DARK);
		mSearchBars.add(SearchBarsActivity.SEARCH_BARS_LIGHT);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_search_bars, container, false);
		
		mListView = (ListView) rootView.findViewById(R.id.list_view);
		mListView.setAdapter(new SubcategoryAdapter(getActivity(), mSearchBars));
		mListView.setOnItemClickListener(this);
		
		return rootView;
	}
	
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Intent intent = new Intent(getActivity(), SearchBarsActivity.class);
		intent.putExtra(SearchBarsActivity.SEARCH_BARS_OPTION, mSearchBars.get(position));
		startActivity(intent);
	}
}
