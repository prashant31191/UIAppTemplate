package com.csform.android.uiapptemplate;

import java.util.ArrayList;
import java.util.List;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.csform.android.uiapptemplate.adapter.DrawerAdapter;
import com.csform.android.uiapptemplate.fragment.CheckAndRadioBoxesFragment;
import com.csform.android.uiapptemplate.fragment.ImageGalleryFragment;
import com.csform.android.uiapptemplate.fragment.LeftMenusFragment;
import com.csform.android.uiapptemplate.fragment.ListViewsFragment;
import com.csform.android.uiapptemplate.fragment.LogInPageFragment;
import com.csform.android.uiapptemplate.fragment.ParallaxEffectsFragment;
import com.csform.android.uiapptemplate.fragment.ProgressBarsFragment;
import com.csform.android.uiapptemplate.fragment.SearchBarsFragment;
import com.csform.android.uiapptemplate.fragment.ShapeImageViewsFragment;
import com.csform.android.uiapptemplate.fragment.SplashScreensFragment;
import com.csform.android.uiapptemplate.fragment.TextViewsFragment;
import com.csform.android.uiapptemplate.model.DrawerItem;

public class MainActivity extends ActionBarActivity {

	private ListView mDrawerList;
	private List<DrawerItem> mDrawerItems;
	private DrawerLayout mDrawerLayout;
	private ActionBarDrawerToggle mDrawerToggle;

	private CharSequence mDrawerTitle;
	private CharSequence mTitle;
	
	private Handler mHandler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
/*
		mTitle = mDrawerTitle = getTitle();
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerList = (ListView) findViewById(R.id.list_view);

		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
		prepareNavigationDrawerItems();
		mDrawerList.setAdapter(new DrawerAdapter(this, mDrawerItems, true));
		mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);

		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
				R.drawable.ic_drawer, R.string.drawer_open,
				R.string.drawer_close) {
			public void onDrawerClosed(View view) {
				getSupportActionBar().setTitle(mTitle);
				invalidateOptionsMenu();
			}

			public void onDrawerOpened(View drawerView) {
				getSupportActionBar().setTitle(mDrawerTitle);
				invalidateOptionsMenu();
			}
		};
		mDrawerLayout.setDrawerListener(mDrawerToggle);
		
		mHandler = new Handler();
		
		if (savedInstanceState == null) {
			int position = 0;
			selectItem(position, mDrawerItems.get(position).getTag());
			mDrawerLayout.openDrawer(mDrawerList);
		}*/
		
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar,
				R.string.drawer_open,
				R.string.drawer_close) {
			public void onDrawerClosed(View view) {
				getSupportActionBar().setTitle(mTitle);
				invalidateOptionsMenu();
			}

			public void onDrawerOpened(View drawerView) {
				getSupportActionBar().setTitle(mDrawerTitle);
				invalidateOptionsMenu();
			}
		};
		mDrawerToggle.setDrawerIndicatorEnabled(true);
		mDrawerLayout.setDrawerListener(mDrawerToggle);
		mTitle = mDrawerTitle = getTitle();
		mDrawerList = (ListView) findViewById(R.id.list_view);
		
		mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
		prepareNavigationDrawerItems();
		mDrawerList.setAdapter(new DrawerAdapter(this, mDrawerItems, true));
		mDrawerList.setOnItemClickListener(new DrawerItemClickListener());
		mDrawerLayout.setDrawerListener(mDrawerToggle);
		
		mHandler = new Handler();
		
		if (savedInstanceState == null) {
			int position = 0;
			selectItem(position, mDrawerItems.get(position).getTag());
			mDrawerLayout.openDrawer(mDrawerList);
		}
	}

	private void prepareNavigationDrawerItems() {
		mDrawerItems = new ArrayList<>();
		mDrawerItems.add(
				new DrawerItem(
						R.string.drawer_icon_list_views,
						R.string.drawer_title_list_views,
						DrawerItem.DRAWER_ITEM_TAG_LIST_VIEWS));
		mDrawerItems.add(
				new DrawerItem(
						R.string.drawer_icon_parallax,
						R.string.drawer_title_parallax,
						DrawerItem.DRAWER_ITEM_TAG_PARALLAX));
		mDrawerItems.add(
				new DrawerItem(
						R.string.drawer_icon_left_menus,
						R.string.drawer_title_left_menus,
						DrawerItem.DRAWER_ITEM_TAG_LEFT_MENUS));
		mDrawerItems.add(
				new DrawerItem(
						R.string.drawer_icon_login_page,
						R.string.drawer_title_login_page,
						DrawerItem.DRAWER_ITEM_TAG_LOGIN_PAGE_AND_LOADERS));
		mDrawerItems.add(
				new DrawerItem(
						R.string.drawer_icon_image_gallery,
						R.string.drawer_title_image_gallery,
						DrawerItem.DRAWER_ITEM_TAG_IMAGE_GALLERY));
		mDrawerItems.add(
				new DrawerItem(
						R.string.drawer_icon_shape_image_views,
						R.string.drawer_title_shape_image_views,
						DrawerItem.DRAWER_ITEM_TAG_SHAPE_IMAGE_VIEWS));
		mDrawerItems.add(
				new DrawerItem(
						R.string.drawer_icon_progress_bars,
						R.string.drawer_title_progress_bars,
						DrawerItem.DRAWER_ITEM_TAG_PROGRESS_BARS));
		mDrawerItems.add(
				new DrawerItem(
						R.string.drawer_icon_check_and_radio_buttons,
						R.string.drawer_title_check_and_radio_buttons,
						DrawerItem.DRAWER_ITEM_TAG_CHECK_AND_RADIO_BOXES));
		mDrawerItems.add(
				new DrawerItem(
						R.string.drawer_icon_splash_screens,
						R.string.drawer_title_splash_screens,
						DrawerItem.DRAWER_ITEM_TAG_SPLASH_SCREENS));
		mDrawerItems.add(
				new DrawerItem(
						R.string.drawer_icon_search_bars,
						R.string.drawer_title_search_bars,
						DrawerItem.DRAWER_ITEM_TAG_SEARCH_BARS));
		mDrawerItems.add(
				new DrawerItem(
						R.string.drawer_icon_text_views,
						R.string.drawer_title_text_views,
						DrawerItem.DRAWER_ITEM_TAG_TEXT_VIEWS));
		/*mDrawerItems.add(
				new DrawerItem(
						R.string.drawer_icon_buttons,
						R.string.drawer_title_buttons,
						DrawerItem.DRAWER_ITEM_TAG_BUTTONS));*/
		/*mDrawerItems.add(
				new DrawerItem(
						R.string.drawer_icon_audio_player,
						R.string.drawer_title_audio_player,
						DrawerItem.DRAWER_ITEM_TAG_BLOG));*/
		/*mDrawerItems.add(
				new DrawerItem(
						R.string.drawer_icon_video_player,
						R.string.drawer_title_video_player,
						DrawerItem.DRAWER_ITEM_TAG_VIDEO_PLAYER));*/
		/*mDrawerItems.add(
				new DrawerItem(
						R.string.drawer_icon_calendars,
						R.string.drawer_title_calendars,
						DrawerItem.DRAWER_ITEM_TAG_CALENDARS));*/
		/*mDrawerItems.add(
				new DrawerItem(
						R.string.drawer_icon_dialogs,
						R.string.drawer_title_dialogs,
						DrawerItem.DRAWER_ITEM_TAG_DIALOGS));*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		//boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
		//menu.findItem(R.id.action_websearch).setVisible(!drawerOpen);
		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}
		return super.onOptionsItemSelected(item);
		// Handle action buttons
		/*switch (item.getItemId()) {
		case R.id.action_websearch:
			// create intent to perform web search for this planet
			Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
			intent.putExtra(SearchManager.QUERY, getSupportActionBar().getTitle());
			// catch event that there's no activity to handle intent
			if (intent.resolveActivity(getPackageManager()) != null) {
				startActivity(intent);
			} else {
				Toast.makeText(this, R.string.app_not_available,
						Toast.LENGTH_LONG).show();
			}
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}*/
	}

	private class DrawerItemClickListener implements
			ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			selectItem(position, mDrawerItems.get(position).getTag());
		}
	}

	private void selectItem(int position, int drawerTag) {
		Fragment fragment = getFragmentByDrawerTag(drawerTag);
		commitFragment(fragment);
		
		mDrawerList.setItemChecked(position, true);
		setTitle(mDrawerItems.get(position).getTitle());
		mDrawerLayout.closeDrawer(mDrawerList);
	}
	
	private Fragment getFragmentByDrawerTag(int drawerTag) {
		Fragment fragment;
		if (drawerTag == DrawerItem.DRAWER_ITEM_TAG_SPLASH_SCREENS) {
			fragment = SplashScreensFragment.newInstance();
		} else if (drawerTag == DrawerItem.DRAWER_ITEM_TAG_PROGRESS_BARS) {
			fragment = ProgressBarsFragment.newInstance();
		}/* else if (drawerTag == DrawerItem.DRAWER_ITEM_TAG_BUTTONS) {
			fragment = ButtonsFragment.newInstance();
		}*/ else if (drawerTag == DrawerItem.DRAWER_ITEM_TAG_SHAPE_IMAGE_VIEWS) {
			fragment = ShapeImageViewsFragment.newInstance();
		} else if (drawerTag == DrawerItem.DRAWER_ITEM_TAG_TEXT_VIEWS) {
			fragment = TextViewsFragment.newInstance();
		} else if (drawerTag == DrawerItem.DRAWER_ITEM_TAG_SEARCH_BARS) {
			fragment = SearchBarsFragment.newInstance();
		} else if (drawerTag == DrawerItem.DRAWER_ITEM_TAG_LOGIN_PAGE_AND_LOADERS) {
			fragment = LogInPageFragment.newInstance();
		}/* else if (drawerTag == DrawerItem.DRAWER_ITEM_TAG_AUDIO_PLAYER) {
			fragment = AudioPlayerFragment.newInstance();
		}*//* else if (drawerTag == DrawerItem.DRAWER_ITEM_TAG_VIDEO_PLAYER) {
			fragment = VideoPlayerFragment.newInstance();
		}*/ else if (drawerTag == DrawerItem.DRAWER_ITEM_TAG_IMAGE_GALLERY) {
			fragment = ImageGalleryFragment.newInstance();
		} else if (drawerTag == DrawerItem.DRAWER_ITEM_TAG_CHECK_AND_RADIO_BOXES) {
			fragment = CheckAndRadioBoxesFragment.newInstance();
		}/* else if (drawerTag == DrawerItem.DRAWER_ITEM_TAG_CALENDARS) {
			fragment = CalendarsFragment.newInstance();
		}*/ else if (drawerTag == DrawerItem.DRAWER_ITEM_TAG_LEFT_MENUS) {
			fragment = LeftMenusFragment.newInstance();
		} else if (drawerTag == DrawerItem.DRAWER_ITEM_TAG_LIST_VIEWS) {
			fragment = ListViewsFragment.newInstance();
		} else if (drawerTag == DrawerItem.DRAWER_ITEM_TAG_PARALLAX) {
			fragment = ParallaxEffectsFragment.newInstance();
		}/* else if (drawerTag == DrawerItem.DRAWER_ITEM_TAG_DIALOGS) {
			fragment = DialogsFragment.newInstance();
		} */else {
			fragment = new Fragment();
		}
		return fragment;
	}
	
	private class CommitFragmentRunnable implements Runnable {

		private Fragment fragment;
		
		public CommitFragmentRunnable(Fragment fragment) {
			this.fragment = fragment;
		}
		
		@Override
		public void run() {
			FragmentManager fragmentManager = getFragmentManager();
			fragmentManager.beginTransaction()
					.replace(R.id.content_frame, fragment)
					.commit();
		}
	}
	
	public void commitFragment(Fragment fragment) {
		//Using Handler class to avoid lagging while
		//committing fragment in same time as closing
		//navigation drawer
		mHandler.post(new CommitFragmentRunnable(fragment));
	}

	@Override
	public void setTitle(int titleId) {
		setTitle(getString(titleId));
	}

	@Override
	public void setTitle(CharSequence title) {
		mTitle = title;
		getSupportActionBar().setTitle(mTitle);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		mDrawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		mDrawerToggle.onConfigurationChanged(newConfig);
	}
}