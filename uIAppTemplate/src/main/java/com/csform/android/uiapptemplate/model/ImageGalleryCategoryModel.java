package com.csform.android.uiapptemplate.model;

import java.util.ArrayList;

import android.os.Parcel;
import android.os.Parcelable;

public class ImageGalleryCategoryModel implements Parcelable {
	
	private long mId;
	private String mUrl;
	private String mTitle;
	private ArrayList<ImageGallerySubcategoryModel> mSubcategories;
	private boolean mFavourite;

	public ImageGalleryCategoryModel() {
	}

	protected ImageGalleryCategoryModel(Parcel in) {
		mId = in.readLong();
		mUrl = in.readString();
		mTitle = in.readString();
		if (in.readByte() == 0x01) {
			mSubcategories = new ArrayList<ImageGallerySubcategoryModel>();
			in.readList(mSubcategories,
					ImageGallerySubcategoryModel.class.getClassLoader());
		} else {
			mSubcategories = null;
		}
		mFavourite = in.readByte() != 0x00;
	}

	public long getId() {
		return mId;
	}

	public void setId(long id) {
		mId = id;
	}

	public String getUrl() {
		return mUrl;
	}

	public void setUrl(String url) {
		mUrl = url;
	}

	public String getTitle() {
		return mTitle;
	}

	public void setTitle(String title) {
		mTitle = title;
	}

	public ArrayList<ImageGallerySubcategoryModel> getSubcategories() {
		return mSubcategories;
	}

	public void setSubcategories(
			ArrayList<ImageGallerySubcategoryModel> subcategories) {
		mSubcategories = subcategories;
	}

	public boolean isFavourite() {
		return mFavourite;
	}

	public void setFavourite(boolean favourite) {
		mFavourite = favourite;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeLong(mId);
		dest.writeString(mUrl);
		dest.writeString(mTitle);
		if (mSubcategories == null) {
			dest.writeByte((byte) (0x00));
		} else {
			dest.writeByte((byte) (0x01));
			dest.writeList(mSubcategories);
		}
		dest.writeByte((byte) (mFavourite ? 0x01 : 0x00));
	}

	public static final Parcelable.Creator<ImageGalleryCategoryModel> CREATOR = new Parcelable.Creator<ImageGalleryCategoryModel>() {
		@Override
		public ImageGalleryCategoryModel createFromParcel(Parcel in) {
			return new ImageGalleryCategoryModel(in);
		}

		@Override
		public ImageGalleryCategoryModel[] newArray(int size) {
			return new ImageGalleryCategoryModel[size];
		}
	};
}