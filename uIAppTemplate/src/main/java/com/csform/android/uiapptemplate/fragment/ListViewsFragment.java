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

import com.csform.android.uiapptemplate.ExpandableListViewActivity;
import com.csform.android.uiapptemplate.GoogleCardsActivity;
import com.csform.android.uiapptemplate.ListViewsActivity;
import com.csform.android.uiapptemplate.R;
import com.csform.android.uiapptemplate.StickyListHeadersActivity;
import com.csform.android.uiapptemplate.adapter.SubcategoryAdapter;

public class ListViewsFragment extends Fragment implements OnItemClickListener {

	private ListView mListView;
	private List<String> mListViews;

	public static ListViewsFragment newInstance() {
		return new ListViewsFragment();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mListViews = new ArrayList<String>();
		mListViews.add(ListViewsActivity.LIST_VIEW_OPTION_1);
		mListViews.add(ListViewsActivity.LIST_VIEW_OPTION_2);
		mListViews.add(ListViewsActivity.LIST_VIEW_OPTION_3);
		mListViews.add(ListViewsActivity.LIST_VIEW_OPTION_4);
		mListViews.add(ListViewsActivity.LIST_VIEW_OPTION_5);
		mListViews.add(ListViewsActivity.LIST_VIEW_OPTION_6);
		mListViews.add(ListViewsActivity.LIST_VIEW_OPTION_7);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_list_views, container, false);

		mListView = (ListView) rootView.findViewById(R.id.list_view);
		mListView.setAdapter(new SubcategoryAdapter(getActivity(), mListViews));
		mListView.setOnItemClickListener(this);
		
		return rootView;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Intent intent;
		if (position == 6) {
			intent = new Intent(getActivity(), GoogleCardsActivity.class);
		} else if (position == 5) {
			intent = new Intent(getActivity(), StickyListHeadersActivity.class);
		} else if (position == 0) {
			intent = new Intent(getActivity(), ExpandableListViewActivity.class);
		} else {
			intent = new Intent(getActivity(), ListViewsActivity.class);
			intent.putExtra(ListViewsActivity.LIST_VIEW_OPTION, mListViews.get(position));
		}
		startActivity(intent);
	}
}
