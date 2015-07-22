package com.csform.android.uiapptemplate.fragment;

import java.util.ArrayList;
import java.util.List;

import com.csform.android.uiapptemplate.LeftMenusActivity;
import com.csform.android.uiapptemplate.R;
import com.csform.android.uiapptemplate.adapter.SubcategoryAdapter;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListView;

public class LeftMenusFragment extends Fragment implements OnItemClickListener {

	private ListView mListView;
	private List<String> mLeftMenus;
	
	public static LeftMenusFragment newInstance() {
		return new LeftMenusFragment();
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mLeftMenus = new ArrayList<String>();
		mLeftMenus.add(LeftMenusActivity.LEFT_MENU_OPTION_1);
		mLeftMenus.add(LeftMenusActivity.LEFT_MENU_OPTION_2);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_left_menus, container, false);

		mListView = (ListView) rootView.findViewById(R.id.list_view);
		mListView.setAdapter(new SubcategoryAdapter(getActivity(), mLeftMenus));
		mListView.setOnItemClickListener(this);
		
		return rootView;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Intent intent = new Intent(getActivity(), LeftMenusActivity.class);
		intent.putExtra(LeftMenusActivity.LEFT_MENU_OPTION, mLeftMenus.get(position));
		startActivity(intent);
	}
}
