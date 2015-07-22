package com.csform.android.uiapptemplate.model;

public class DrawerItem {
	/* Commented tags are expected in future updates.
	 */
	public static final int DRAWER_ITEM_TAG_SPLASH_SCREENS = 10;
	public static final int DRAWER_ITEM_TAG_PROGRESS_BARS = 11;
	//public static final int DRAWER_ITEM_TAG_BUTTONS = 12;
	public static final int DRAWER_ITEM_TAG_SHAPE_IMAGE_VIEWS  = 13;
	public static final int DRAWER_ITEM_TAG_TEXT_VIEWS = 14;
	public static final int DRAWER_ITEM_TAG_SEARCH_BARS = 15;
	public static final int DRAWER_ITEM_TAG_LOGIN_PAGE_AND_LOADERS = 16;
	//public static final int DRAWER_ITEM_TAG_AUDIO_PLAYER = 17;
	//public static final int DRAWER_ITEM_TAG_VIDEO_PLAYER = 18;
	public static final int DRAWER_ITEM_TAG_IMAGE_GALLERY = 19;
	public static final int DRAWER_ITEM_TAG_CHECK_AND_RADIO_BOXES = 20;
	//public static final int DRAWER_ITEM_TAG_CALENDARS = 21;
	public static final int DRAWER_ITEM_TAG_LEFT_MENUS = 22;
	public static final int DRAWER_ITEM_TAG_LIST_VIEWS = 23;
	public static final int DRAWER_ITEM_TAG_PARALLAX  = 24;
	//public static final int DRAWER_ITEM_TAG_DIALOGS = 25;
	
	public static final int DRAWER_ITEM_TAG_LINKED_IN = 26;
	public static final int DRAWER_ITEM_TAG_BLOG = 27;
	public static final int DRAWER_ITEM_TAG_GIT_HUB = 28;
	public static final int DRAWER_ITEM_TAG_INSTAGRAM = 29;
	
	public DrawerItem(int icon, int title, int tag) {
		this.icon = icon;
		this.title = title;
		this.tag = tag;
	}

	private int icon;
	private int title;
	private int tag;

	public int getIcon() {
		return icon;
	}

	public void setIcon(int icon) {
		this.icon = icon;
	}

	public int getTitle() {
		return title;
	}

	public void setTitle(int title) {
		this.title = title;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}
}
