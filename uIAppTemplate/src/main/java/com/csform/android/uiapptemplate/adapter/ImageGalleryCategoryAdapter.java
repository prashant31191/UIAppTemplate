package com.csform.android.uiapptemplate.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

import com.csform.android.uiapptemplate.ImageGallerySubcategoryActivity;
import com.csform.android.uiapptemplate.R;
import com.csform.android.uiapptemplate.model.ImageGalleryCategoryModel;
import com.csform.android.uiapptemplate.util.ImageUtil;

public class ImageGalleryCategoryAdapter extends BaseAdapter implements OnClickListener {
	 
    private static final int TYPE_ONE_COLUMN = 0;
    private static final int TYPE_TWO_COLUMNS = 1;
    private static final int TYPE_MAX_COUNT = TYPE_TWO_COLUMNS + 1;
	
	private Context mContext;
	private LayoutInflater mInflater;
	private ArrayList<ImageGalleryCategoryModel> mImageGalleryCategories;
	private boolean mIsLayoutOnTop;
	
	public ImageGalleryCategoryAdapter(Context context,
			ArrayList<ImageGalleryCategoryModel> imageGalleryCategories, boolean isLayoutOnTop) {
		mContext = context;
		mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		mImageGalleryCategories = imageGalleryCategories;
		mIsLayoutOnTop = isLayoutOnTop;
	}
	
    @Override
    public int getItemViewType(int position) {
    	if ((position == mImageGalleryCategories.size() / 2)
    			&& (mImageGalleryCategories.size() % 2 == 1)) {
    		return TYPE_ONE_COLUMN;
    	} else {
    		return TYPE_TWO_COLUMNS;
    	}
    }

    @Override
    public int getViewTypeCount() {
        return TYPE_MAX_COUNT;
    }

	@Override
	public int getCount() {
		return (mImageGalleryCategories.size() / 2) + (mImageGalleryCategories.size() % 2);
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		final ViewHolder.OneColumnViewHolder oneColumnViewHolder;
		final ViewHolder.TwoColumnsViewHolder twoColumnsViewHolder;
		int type = getItemViewType(position);
		if (type == TYPE_ONE_COLUMN) {
			if (convertView == null) {
				convertView = mInflater.inflate(R.layout.list_item_categories_one_column, parent, false);
				oneColumnViewHolder = new ViewHolder.OneColumnViewHolder();
				oneColumnViewHolder.image1 = (ImageView) convertView.findViewById(R.id.list_item_image_1);
				oneColumnViewHolder.favoriteImage1 = (TextView) convertView.findViewById(R.id.list_item_favourite_1);
				oneColumnViewHolder.title1 = (TextView) convertView.findViewById(R.id.list_item_title_1);
				oneColumnViewHolder.numberOfImages1 = (TextView) convertView.findViewById(R.id.list_item_number_of_images_1);
				oneColumnViewHolder.layoutTopBottom1 = (ViewGroup) convertView.findViewById(R.id.layout_top_bottom_1);
				oneColumnViewHolder.image1.setOnClickListener(this);
				oneColumnViewHolder.favoriteImage1.setOnClickListener(this);
				convertView.setTag(oneColumnViewHolder);
			} else {
				oneColumnViewHolder = (ViewHolder.OneColumnViewHolder) convertView.getTag();
			}
			ImageGalleryCategoryModel model1 = mImageGalleryCategories.get(position * 2);

			oneColumnViewHolder.title1.setText(model1.getTitle());
			oneColumnViewHolder.numberOfImages1.setText(mContext.getString(R.string.number_of_images, model1.getSubcategories().size()));
			ImageUtil.displayImage(oneColumnViewHolder.image1, model1.getUrl(), null);
			if (model1.isFavourite()) {
				oneColumnViewHolder.favoriteImage1.setText(R.string.fontello_heart_full);
			} else {
				oneColumnViewHolder.favoriteImage1.setText(R.string.fontello_heart_empty);
			}
			oneColumnViewHolder.image1.setTag(position * 2);
			oneColumnViewHolder.favoriteImage1.setTag(position * 2);
			LayoutParams lp1 = (LayoutParams) oneColumnViewHolder.layoutTopBottom1.getLayoutParams();
			if (!mIsLayoutOnTop) {
				lp1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
			} else {
				lp1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, 0);
			}
		} else if (type == TYPE_TWO_COLUMNS) {
			if (convertView == null) {
				convertView = mInflater.inflate(R.layout.list_item_categories_two_columns, parent, false);
				twoColumnsViewHolder = new ViewHolder.TwoColumnsViewHolder();
				twoColumnsViewHolder.image1 = (ImageView) convertView.findViewById(R.id.list_item_image_1);
				twoColumnsViewHolder.favoriteImage1 = (TextView) convertView.findViewById(R.id.list_item_favourite_1);
				twoColumnsViewHolder.title1 = (TextView) convertView.findViewById(R.id.list_item_title_1);
				twoColumnsViewHolder.numberOfImages1 = (TextView) convertView.findViewById(R.id.list_item_number_of_images_1);
				twoColumnsViewHolder.layoutTopBottom1 = (ViewGroup) convertView.findViewById(R.id.layout_top_bottom_1);
				twoColumnsViewHolder.image2 = (ImageView) convertView.findViewById(R.id.list_item_image_2);
				twoColumnsViewHolder.favoriteImage2 = (TextView) convertView.findViewById(R.id.list_item_favourite_2);
				twoColumnsViewHolder.title2 = (TextView) convertView.findViewById(R.id.list_item_title_2);
				twoColumnsViewHolder.numberOfImages2 = (TextView) convertView.findViewById(R.id.list_item_number_of_images_2);
				twoColumnsViewHolder.layoutTopBottom2 = (ViewGroup) convertView.findViewById(R.id.layout_top_bottom_2);
				twoColumnsViewHolder.image1.setOnClickListener(this);
				twoColumnsViewHolder.image2.setOnClickListener(this);
				twoColumnsViewHolder.favoriteImage1.setOnClickListener(this);
				twoColumnsViewHolder.favoriteImage2.setOnClickListener(this);
				convertView.setTag(twoColumnsViewHolder);
			} else {
				twoColumnsViewHolder = (ViewHolder.TwoColumnsViewHolder) convertView.getTag();
			}
			
			ImageGalleryCategoryModel model1 = mImageGalleryCategories.get(position * 2);
			twoColumnsViewHolder.title1.setText(model1.getTitle());
			twoColumnsViewHolder.numberOfImages1.setText(mContext.getString(R.string.number_of_images, model1.getSubcategories().size()));
			ImageUtil.displayImage(twoColumnsViewHolder.image1, model1.getUrl(), null);
			if (model1.isFavourite()) {
				twoColumnsViewHolder.favoriteImage1.setText(R.string.fontello_heart_full);
			} else {
				twoColumnsViewHolder.favoriteImage1.setText(R.string.fontello_heart_empty);
			}
			ImageGalleryCategoryModel model2 = mImageGalleryCategories.get(position * 2 + 1);

			twoColumnsViewHolder.title2.setText(model2.getTitle());
			twoColumnsViewHolder.numberOfImages2.setText(mContext.getString(R.string.number_of_images, model2.getSubcategories().size()));
			ImageUtil.displayImage(twoColumnsViewHolder.image2, model2.getUrl(), null);
			if (model2.isFavourite()) {
				twoColumnsViewHolder.favoriteImage2.setText(R.string.fontello_heart_full);
			} else {
				twoColumnsViewHolder.favoriteImage2.setText(R.string.fontello_heart_empty);
			}
			twoColumnsViewHolder.image1.setTag(position * 2);
			twoColumnsViewHolder.image2.setTag(position * 2 + 1);
			twoColumnsViewHolder.favoriteImage1.setTag(position * 2);
			twoColumnsViewHolder.favoriteImage2.setTag(position * 2 + 1);
			LayoutParams lp1 = (LayoutParams) twoColumnsViewHolder.layoutTopBottom1.getLayoutParams();
			LayoutParams lp2 = (LayoutParams) twoColumnsViewHolder.layoutTopBottom2.getLayoutParams();
			if (!mIsLayoutOnTop) {
				lp1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
				lp2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
			} else {
				lp1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, 0);
				lp2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, 0);
			}
		}
		return convertView;
	}
	
	private static class ViewHolder {
		
		public static class OneColumnViewHolder {
			public ImageView image1;
			public /*Fontello*/TextView favoriteImage1;
			public TextView title1;
			public TextView numberOfImages1;
			public ViewGroup layoutTopBottom1;
		}
		
		private static class TwoColumnsViewHolder {
			public ImageView image1;
			public /*Fontello*/TextView favoriteImage1;
			public TextView title1;
			public TextView numberOfImages1;
			public ViewGroup layoutTopBottom1;

			public ImageView image2;
			public /*Fontello*/TextView favoriteImage2;
			public TextView title2;
			public TextView numberOfImages2;
			public ViewGroup layoutTopBottom2;
		}
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		int position = (int) v.getTag();
		if (id == R.id.list_item_image_1 || id == R.id.list_item_image_2) {
			Intent intent = new Intent(mContext, ImageGallerySubcategoryActivity.class);
			intent.putParcelableArrayListExtra(
					ImageGallerySubcategoryActivity.IMAGE_GALLERY_SUBCATEGORY,
					mImageGalleryCategories.get(position).getSubcategories());
			intent.putExtra(ImageGallerySubcategoryActivity.IMAGE_GALLERY_LAYOUT_ON_TOP, mIsLayoutOnTop);
			mContext.startActivity(intent);
		} else if (id == R.id.list_item_favourite_1 || id == R.id.list_item_favourite_2) {
			ImageGalleryCategoryModel model = mImageGalleryCategories.get(position);
			model.setFavourite(!model.isFavourite());
			if (model.isFavourite()) {
				((TextView) v).setText(R.string.fontello_heart_full);
			} else {
				((TextView) v).setText(R.string.fontello_heart_empty);
			}
		}
	}
}
