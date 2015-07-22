package com.csform.android.uiapptemplate.font;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.csform.android.uiapptemplate.R;

public class RobotoTextView extends TextView {

	public RobotoTextView(Context context) {
		super(context);
		if (isInEditMode()) return;
		parseAttributes(null);
	}

	public RobotoTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		if (isInEditMode()) return;
		parseAttributes(attrs);
	}

	public RobotoTextView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		if (isInEditMode()) return;
		parseAttributes(attrs);
	}
	
	private void parseAttributes(AttributeSet attrs) {
		int typeface;
		if (attrs == null) { //Not created from xml
			typeface = Roboto.ROBOTO_REGULAR;
		} else {
		    TypedArray values = getContext().obtainStyledAttributes(attrs, R.styleable.RobotoTextView);
		    typeface = values.getInt(R.styleable.RobotoTextView_typeface, Roboto.ROBOTO_REGULAR);
		    values.recycle();
		}
	    setTypeface(getRoboto(typeface));
	}
	
	public void setRobotoTypeface(int typeface) {
	    setTypeface(getRoboto(typeface));
	}
	
	private Typeface getRoboto(int typeface) {
		return getRoboto(getContext(), typeface);
	}
	
	public static Typeface getRoboto(Context context, int typeface) {
		switch (typeface) {
		case Roboto.ROBOTO_BLACK:
			if (Roboto.sRobotoBlack == null) {
				Roboto.sRobotoBlack = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Black.ttf");
			}
			return Roboto.sRobotoBlack;
		case Roboto.ROBOTO_BLACK_ITALIC:
			if (Roboto.sRobotoBlackItalic == null) {
				Roboto.sRobotoBlackItalic = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-BlackItalic.ttf");
			}
			return Roboto.sRobotoBlackItalic;
		case Roboto.ROBOTO_BOLD:
			if (Roboto.sRobotoBold == null) {
				Roboto.sRobotoBold = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Bold.ttf");
			}
			return Roboto.sRobotoBold;
		case Roboto.ROBOTO_BOLD_CONDENSED:
			if (Roboto.sRobotoBoldCondensed == null) {
				Roboto.sRobotoBoldCondensed = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-BoldCondensed.ttf");
			}
			return Roboto.sRobotoBoldCondensed;
		case Roboto.ROBOTO_BOLD_CONDENSED_ITALIC:
			if (Roboto.sRobotoBoldCondensedItalic == null) {
				Roboto.sRobotoBoldCondensedItalic = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-BoldCondensedItalic.ttf");
			}
			return Roboto.sRobotoBoldCondensedItalic;
		case Roboto.ROBOTO_BOLD_ITALIC:
			if (Roboto.sRobotoBoldItalic == null) {
				Roboto.sRobotoBoldItalic = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-BoldItalic.ttf");
			}
			return Roboto.sRobotoBoldItalic;
		case Roboto.ROBOTO_CONDENSED:
			if (Roboto.sRobotoCondensed == null) {
				Roboto.sRobotoCondensed = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Condensed.ttf");
			}
			return Roboto.sRobotoCondensed;
		case Roboto.ROBOTO_CONDENSED_ITALIC:
			if (Roboto.sRobotoCondensedItalic == null) {
				Roboto.sRobotoCondensedItalic = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-CondensedItalic.ttf");
			}
			return Roboto.sRobotoCondensedItalic;
		case Roboto.ROBOTO_ITALIC:
			if (Roboto.sRobotoItalic == null) {
				Roboto.sRobotoItalic = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Italic.ttf");
			}
			return Roboto.sRobotoItalic;
		case Roboto.ROBOTO_LIGHT:
			if (Roboto.sRobotoLight == null) {
				Roboto.sRobotoLight = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Light.ttf");
			}
			return Roboto.sRobotoLight;
		case Roboto.ROBOTO_LIGHT_ITALIC:
			if (Roboto.sRobotoLightItalic == null) {
				Roboto.sRobotoLightItalic = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-LightItalic.ttf");
			}
			return Roboto.sRobotoLightItalic;
		case Roboto.ROBOTO_MEDIUM:
			if (Roboto.sRobotoMedium == null) {
				Roboto.sRobotoMedium = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Medium.ttf");
			}
			return Roboto.sRobotoMedium;
		case Roboto.ROBOTO_MEDIUM_ITALIC:
			if (Roboto.sRobotoMediumItalic == null) {
				Roboto.sRobotoMediumItalic = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-MediumItalic.ttf");
			}
			return Roboto.sRobotoMediumItalic;
		default:
		case Roboto.ROBOTO_REGULAR:
			if (Roboto.sRobotoRegular == null) {
				Roboto.sRobotoRegular = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Regular.ttf");
			}
			return Roboto.sRobotoRegular;
		case Roboto.ROBOTO_THIN:
			if (Roboto.sRobotoThin == null) {
				Roboto.sRobotoThin = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Thin.ttf");
			}
			return Roboto.sRobotoThin;
		case Roboto.ROBOTO_THIN_ITALIC:
			if (Roboto.sRobotoThinItalic == null) {
				Roboto.sRobotoThinItalic = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-ThinItalic.ttf");
			}
			return Roboto.sRobotoThinItalic;
		}
	}
	
	public static class Roboto {
		/* From attrs.xml file:
        <enum name="robotoBlack" value="0" />
        <enum name="robotoBlackItalic" value="1" />
        <enum name="robotoBold" value="2" />
        <enum name="robotoBoldItalic" value="3" />
        <enum name="robotoBoldCondensed" value="4" />
        <enum name="robotoBoldCondensedItalic" value="5" />
        <enum name="robotoCondensed" value="6" />
        <enum name="robotoCondensedItalic" value="7" />
        <enum name="robotoItalic" value="8" />
        <enum name="robotoLight" value="9" />
        <enum name="robotoLightItalic" value="10" />
        <enum name="robotoMedium" value="11" />
        <enum name="robotoMediumItalic" value="12" />
        <enum name="robotoRegular" value="13" />
        <enum name="robotoThin" value="14" />
        <enum name="robotoThinItalic" value="15" />
        */
		public static final int ROBOTO_BLACK = 0;
		public static final int ROBOTO_BLACK_ITALIC = 1;
		public static final int ROBOTO_BOLD = 2;
		public static final int ROBOTO_BOLD_ITALIC = 3;
		public static final int ROBOTO_BOLD_CONDENSED = 4;
		public static final int ROBOTO_BOLD_CONDENSED_ITALIC = 5;
		public static final int ROBOTO_CONDENSED = 6;
		public static final int ROBOTO_CONDENSED_ITALIC = 7;
		public static final int ROBOTO_ITALIC = 8;
		public static final int ROBOTO_LIGHT = 9;
		public static final int ROBOTO_LIGHT_ITALIC = 10;
		public static final int ROBOTO_MEDIUM = 11;
		public static final int ROBOTO_MEDIUM_ITALIC = 12;
		public static final int ROBOTO_REGULAR = 13;
		public static final int ROBOTO_THIN = 14;
		public static final int ROBOTO_THIN_ITALIC = 15;

		private static Typeface sRobotoBlack;
		private static Typeface sRobotoBlackItalic;
		private static Typeface sRobotoBold;
		private static Typeface sRobotoBoldItalic;
		private static Typeface sRobotoBoldCondensed;
		private static Typeface sRobotoBoldCondensedItalic;
		private static Typeface sRobotoCondensed;
		private static Typeface sRobotoCondensedItalic;
		private static Typeface sRobotoItalic;
		private static Typeface sRobotoLight;
		private static Typeface sRobotoLightItalic;
		private static Typeface sRobotoMedium;
		private static Typeface sRobotoMediumItalic;
		private static Typeface sRobotoRegular;
		private static Typeface sRobotoThin;
		private static Typeface sRobotoThinItalic;
	}
}
