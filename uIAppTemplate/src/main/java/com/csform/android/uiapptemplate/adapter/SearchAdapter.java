package com.csform.android.uiapptemplate.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.csform.android.uiapptemplate.R;

public class SearchAdapter extends BaseAdapter {
	
	private LayoutInflater mInflater;
	private ArrayList<String> mSubcategories;
	
	public SearchAdapter(Context context, ArrayList<String> subcategories) {
		mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		mSubcategories = subcategories;
	}

	@Override
	public int getCount() {
		return mSubcategories.size();
	}

	@Override
	public Object getItem(int position) {
		return mSubcategories.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		final ViewHolder holder;
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.list_view_item_search, parent, false);
			holder = new ViewHolder();
			holder.icon = convertView.findViewById(R.id.search_icon);
			holder.text = (TextView) convertView.findViewById(R.id.search_text);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}
		
		String subcategory = mSubcategories.get(position);
		if (position == 0) { //We only show icon for the first item
			holder.icon.setVisibility(View.VISIBLE);
		} else {
			holder.icon.setVisibility(View.INVISIBLE);
		}
		holder.text.setText(subcategory);
		
		return convertView;
	}
	
	private static class ViewHolder {
		public View icon;
		public TextView text;
	}
}
