/*
 * Copyright 2014 Niek Haarman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.csform.android.uiapptemplate;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;

import com.csform.android.uiapptemplate.adapter.MyStickyListHeadersAdapter;
import com.nhaarman.listviewanimations.appearance.StickyListHeadersAdapterDecorator;
import com.nhaarman.listviewanimations.appearance.simple.AlphaInAnimationAdapter;
import com.nhaarman.listviewanimations.util.StickyListHeadersListViewWrapper;

public class StickyListHeadersActivity extends ActionBarActivity {

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stickylistheaders);

		StickyListHeadersListView listView = (StickyListHeadersListView) findViewById(R.id.activity_stickylistheaders_listview);
		listView.setFitsSystemWindows(true);
		MyStickyListHeadersAdapter adapter = new MyStickyListHeadersAdapter(
				this);
		AlphaInAnimationAdapter animationAdapter = new AlphaInAnimationAdapter(
				adapter);
		StickyListHeadersAdapterDecorator stickyListHeadersAdapterDecorator = new StickyListHeadersAdapterDecorator(
				animationAdapter);
		stickyListHeadersAdapterDecorator
				.setListViewWrapper(new StickyListHeadersListViewWrapper(
						listView));
		assert animationAdapter.getViewAnimator() != null;
		animationAdapter.getViewAnimator().setInitialDelayMillis(500);
		assert stickyListHeadersAdapterDecorator.getViewAnimator() != null;
		stickyListHeadersAdapterDecorator.getViewAnimator()
				.setInitialDelayMillis(500);
		listView.setAdapter(stickyListHeadersAdapterDecorator);
		
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == android.R.id.home) {
			finish();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}