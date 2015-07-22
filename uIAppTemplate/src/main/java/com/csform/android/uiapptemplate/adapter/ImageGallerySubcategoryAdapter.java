package com.csform.android.uiapptemplate.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.RelativeLayout.LayoutParams;

import com.csform.android.uiapptemplate.R;
import com.csform.android.uiapptemplate.model.ImageGallerySubcategoryModel;
import com.csform.android.uiapptemplate.util.ImageUtil;

public class ImageGallerySubcategoryAdapter extends BaseAdapter /*implements OnClickListener*/ {

    private static final int TYPE_ONE_COLUMN = 0;
    private static final int TYPE_TWO_COLUMNS = 1;
    private static final int TYPE_MAX_COUNT = TYPE_TWO_COLUMNS + 1;
    
	private LayoutInflater mInflater;
	private ArrayList<ImageGallerySubcategoryModel> mImageGallerySubcategories;
	private final boolean mIsLayoutOnTop;
	
	public ImageGallerySubcategoryAdapter(Context context,
			ArrayList<ImageGallerySubcategoryModel> imageGallerySubcategories, boolean isLayoutOnTop) {
		mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		mImageGallerySubcategories = imageGallerySubcategories;
		mIsLayoutOnTop = isLayoutOnTop;
	}
	
    @Override
    public int getItemViewType(int position) {
    	if ((position == mImageGallerySubcategories.size() / 2)
    			&& (mImageGallerySubcategories.size() % 2 == 1)) {
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
		return (mImageGallerySubcategories.size() / 2) + (mImageGallerySubcategories.size() % 2);
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
				//oneColumnViewHolder.favoriteImage1 = (TextView) convertView.findViewById(R.id.list_item_favourite_1);
				oneColumnViewHolder.title1 = (TextView) convertView.findViewById(R.id.list_item_title_1);
				oneColumnViewHolder.numberOfImages1 = (TextView) convertView.findViewById(R.id.list_item_number_of_images_1);
				oneColumnViewHolder.layoutTopBottom1 = (ViewGroup) convertView.findViewById(R.id.layout_top_bottom_1);
				convertView.setTag(oneColumnViewHolder);
			} else {
				oneColumnViewHolder = (ViewHolder.OneColumnViewHolder) convertView.getTag();
			}
			ImageGallerySubcategoryModel model1 = mImageGallerySubcategories.get(position * 2);
			
			if (TextUtils.isEmpty(model1.getTitle())) {
				oneColumnViewHolder.layoutTopBottom1.setVisibility(View.GONE);
			} else {
				oneColumnViewHolder.title1.setText(model1.getTitle());
			}
			ImageUtil.displayImage(oneColumnViewHolder.image1, model1.getUrl(), null);
			oneColumnViewHolder.image1.setTag(position);
			
			//oneColumnViewHolder.favoriteImage1.setVisibility(View.GONE);
			oneColumnViewHolder.numberOfImages1.setVisibility(View.GONE);
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
				//twoColumnsViewHolder.favoriteImage1 = (TextView) convertView.findViewById(R.id.list_item_favourite_1);
				twoColumnsViewHolder.title1 = (TextView) convertView.findViewById(R.id.list_item_title_1);
				twoColumnsViewHolder.numberOfImages1 = (TextView) convertView.findViewById(R.id.list_item_number_of_images_1);
				twoColumnsViewHolder.layoutTopBottom1 = (ViewGroup) convertView.findViewById(R.id.layout_top_bottom_1);
				twoColumnsViewHolder.image2 = (ImageView) convertView.findViewById(R.id.list_item_image_2);
				//twoColumnsViewHolder.favoriteImage2 = (TextView) convertView.findViewById(R.id.list_item_favourite_2);
				twoColumnsViewHolder.title2 = (TextView) convertView.findViewById(R.id.list_item_title_2);
				twoColumnsViewHolder.numberOfImages2 = (TextView) convertView.findViewById(R.id.list_item_number_of_images_2);
				twoColumnsViewHolder.layoutTopBottom2 = (ViewGroup) convertView.findViewById(R.id.layout_top_bottom_2);
				convertView.setTag(twoColumnsViewHolder);
			} else {
				twoColumnsViewHolder = (ViewHolder.TwoColumnsViewHolder) convertView.getTag();
			}
			
			ImageGallerySubcategoryModel model1 = mImageGallerySubcategories.get(position * 2);
			if (TextUtils.isEmpty(model1.getTitle())) {
				twoColumnsViewHolder.layoutTopBottom1.setVisibility(View.GONE);
			} else {
				twoColumnsViewHolder.title1.setText(model1.getTitle());
			}
			ImageUtil.displayImage(twoColumnsViewHolder.image1, model1.getUrl(), null);
			
			ImageGallerySubcategoryModel model2 = mImageGallerySubcategories.get(position * 2 + 1);
			if (TextUtils.isEmpty(model2.getTitle())) {
				twoColumnsViewHolder.layoutTopBottom2.setVisibility(View.GONE);
			} else {
				twoColumnsViewHolder.title2.setText(model2.getTitle());
			}
			ImageUtil.displayImage(twoColumnsViewHolder.image2, model2.getUrl(), null);
			
			twoColumnsViewHolder.image1.setTag(position);
			twoColumnsViewHolder.image2.setTag(position);
			
			//twoColumnsViewHolder.favoriteImage1.setVisibility(View.GONE);
			twoColumnsViewHolder.numberOfImages1.setVisibility(View.GONE);
			//twoColumnsViewHolder.favoriteImage2.setVisibility(View.GONE);
			twoColumnsViewHolder.numberOfImages2.setVisibility(View.GONE);
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
	
	/* We are not using favourite image here. If you really want to use it,
	 * remove commented lines related to favourite image. 
	 */
	private static class ViewHolder {
		public static class OneColumnViewHolder {
			public ImageView image1;
			//public TextView favoriteImage1;
			public TextView title1;
			public TextView numberOfImages1;
			public ViewGroup layoutTopBottom1;
		}
		
		private static class TwoColumnsViewHolder {
			public ImageView image1;
			//public TextView favoriteImage1;
			public TextView title1;
			public TextView numberOfImages1;
			public ViewGroup layoutTopBottom1;

			public ImageView image2;
			//public TextView favoriteImage2;
			public TextView title2;
			public TextView numberOfImages2;
			public ViewGroup layoutTopBottom2;
		}
	}
}
