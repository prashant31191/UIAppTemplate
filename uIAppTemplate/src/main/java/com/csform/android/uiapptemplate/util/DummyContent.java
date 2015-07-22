package com.csform.android.uiapptemplate.util;

import java.util.ArrayList;
import java.util.Random;

import com.csform.android.uiapptemplate.R;
import com.csform.android.uiapptemplate.model.DummyModel;
import com.csform.android.uiapptemplate.model.ImageGalleryCategoryModel;
import com.csform.android.uiapptemplate.model.ImageGallerySubcategoryModel;

public class DummyContent {
	
	/* This method gives us just a dummy content - array list
	 * of ImageGalleryCategoryModels. Every model has id that is
	 * need for some classes (e.g. DefaultAdapter.java).
	 * Favourites are randomly chosen to be true or false.
	 * Last category is randomly added to the list so you could
	 * see when there are even or odd numbers of categories in
	 * ImageGalleryActivity.
	 */
	public static ArrayList<ImageGalleryCategoryModel> getImageGalleryAnimalCategories() {
		ArrayList<ImageGalleryCategoryModel> imageGalleryCategoryModels = new ArrayList<ImageGalleryCategoryModel>();

		ImageGalleryCategoryModel imageGalleryCategoryModel = new ImageGalleryCategoryModel();
		imageGalleryCategoryModel.setId(0L);
		imageGalleryCategoryModel.setUrl("http://pengaja.com/uiapptemplate/dogs/14250733433_271362f4ff_h.jpg");
		imageGalleryCategoryModel.setTitle("Dogs");
		imageGalleryCategoryModel.setFavourite(false);
		imageGalleryCategoryModel.setSubcategories(getImageGalleryDogsSubcategory());
		imageGalleryCategoryModels.add(imageGalleryCategoryModel);
		
		imageGalleryCategoryModel = new ImageGalleryCategoryModel();
		imageGalleryCategoryModel.setId(1L);
		imageGalleryCategoryModel.setUrl("http://pengaja.com/uiapptemplate/horses/1242426877_9cdace7a19_b.jpg");
		imageGalleryCategoryModel.setTitle("Horses");
		imageGalleryCategoryModel.setFavourite(true);
		imageGalleryCategoryModel.setSubcategories(getImageGalleryHorsesSubcategory());
		imageGalleryCategoryModels.add(imageGalleryCategoryModel);
		
		imageGalleryCategoryModel = new ImageGalleryCategoryModel();
		imageGalleryCategoryModel.setId(2L);
		imageGalleryCategoryModel.setUrl("http://pengaja.com/uiapptemplate/cats/15636456045_f99e3a5ccd_k.jpg");
		imageGalleryCategoryModel.setTitle("Cats");
		imageGalleryCategoryModel.setFavourite(false);
		imageGalleryCategoryModel.setSubcategories(getImageGalleryCatsSubcategory());
		imageGalleryCategoryModels.add(imageGalleryCategoryModel);
		
		imageGalleryCategoryModel = new ImageGalleryCategoryModel();
		imageGalleryCategoryModel.setId(3L);
		imageGalleryCategoryModel.setUrl("http://pengaja.com/uiapptemplate/kangaroos/14018941654_b24dc40edd_k.jpg");
		imageGalleryCategoryModel.setTitle("Kangaroos");
		imageGalleryCategoryModel.setFavourite(true);
		imageGalleryCategoryModel.setSubcategories(getImageGalleryKangarooSubcategory());
		imageGalleryCategoryModels.add(imageGalleryCategoryModel);
		
		imageGalleryCategoryModel = new ImageGalleryCategoryModel();
		imageGalleryCategoryModel.setId(4L);
		imageGalleryCategoryModel.setUrl("http://pengaja.com/uiapptemplate/foxes/2741843163_5aefaae694_b.jpg");
		imageGalleryCategoryModel.setTitle("Foxes");
		imageGalleryCategoryModel.setFavourite(false);
		imageGalleryCategoryModel.setSubcategories(getImageGalleryFoxesSubcategory());
		imageGalleryCategoryModels.add(imageGalleryCategoryModel);

		imageGalleryCategoryModel = new ImageGalleryCategoryModel();
		imageGalleryCategoryModel.setId(5L);
		imageGalleryCategoryModel.setUrl("http://pengaja.com/uiapptemplate/eagles/12111485434_015bcf17e0_k.jpg");
		imageGalleryCategoryModel.setTitle("Eagles");
		imageGalleryCategoryModel.setFavourite(true);
		imageGalleryCategoryModel.setSubcategories(getImageGalleryEaglesSubcategory());
		imageGalleryCategoryModels.add(imageGalleryCategoryModel);

		imageGalleryCategoryModel = new ImageGalleryCategoryModel();
		imageGalleryCategoryModel.setId(6L);
		imageGalleryCategoryModel.setUrl("http://pengaja.com/uiapptemplate/squirrels/12683899725_ec12a691c5_k.jpg");
		imageGalleryCategoryModel.setTitle("Squirrels");
		imageGalleryCategoryModel.setFavourite(true);
		imageGalleryCategoryModel.setSubcategories(getImageGallerySquirrelsSubcategory());
		imageGalleryCategoryModels.add(imageGalleryCategoryModel);

		if (new Random().nextBoolean()) { // Sometimes show last category
			imageGalleryCategoryModel = new ImageGalleryCategoryModel();
			imageGalleryCategoryModel.setId(7L);
			imageGalleryCategoryModel.setUrl("http://pengaja.com/uiapptemplate/bears/14316604273_778ccdac73_b.jpg");
			imageGalleryCategoryModel.setTitle("Bears");
			imageGalleryCategoryModel.setFavourite(false);
			imageGalleryCategoryModel.setSubcategories(getImageGalleryBearsSubcategory());
			imageGalleryCategoryModels.add(imageGalleryCategoryModel);
		}
		
		return imageGalleryCategoryModels;
	}

	public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryDogsSubcategory() {
		ArrayList<ImageGallerySubcategoryModel> imageGallerySubcategoryModels = new ArrayList<ImageGallerySubcategoryModel>();
		
		ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(0L);
		imageGallerySubcategoryModel.setTitle("Dog 1");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/dogs/14250733433_271362f4ff_h.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(1L);
		imageGallerySubcategoryModel.setTitle("Dog 2");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/dogs/174085592_c0b7e5076f_o.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(2L);
		imageGallerySubcategoryModel.setTitle("Dog 3");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/dogs/174097822_6c0aae32e1_o.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(3L);
		imageGallerySubcategoryModel.setTitle("Dog 4");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/dogs/4733823624_a758c8e8e9_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(4L);
		imageGallerySubcategoryModel.setTitle("Dog 5");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/dogs/4939588185_4dc4fa8cca_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(5L);
		imageGallerySubcategoryModel.setTitle("Dog 6");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/dogs/6698150783_161b18182e_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(6L);
		imageGallerySubcategoryModel.setTitle("Dog 7");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/dogs/6787786882_4e74d00628_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(7L);
		imageGallerySubcategoryModel.setTitle("Dog 8");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/dogs/8206632393_36622366c6_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		return imageGallerySubcategoryModels;
	}

	public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryHorsesSubcategory() {
		ArrayList<ImageGallerySubcategoryModel> imageGallerySubcategoryModels = new ArrayList<ImageGallerySubcategoryModel>();
		
		ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(0L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/horses/1242426877_9cdace7a19_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(1L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/horses/2795764001_1e899c8560_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(2L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/horses/3571783564_b02308c31c_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(3L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/horses/3724307231_7077e8a5da_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(4L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/horses/548518280_b408f3d2a5_o.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(5L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/horses/6990704333_abff211880_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(6L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/horses/8621170742_15cd967dc8_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(7L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/horses/9581032545_e388ee7d3e_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		return imageGallerySubcategoryModels;
	}

	public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryCatsSubcategory() {
		ArrayList<ImageGallerySubcategoryModel> imageGallerySubcategoryModels = new ArrayList<ImageGallerySubcategoryModel>();
		
		ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(0L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/cats/15636456045_f99e3a5ccd_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(1L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/cats/3285731954_a31261bd38_o.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(2L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/cats/560380352_8b58b0611c_o.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(3L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/cats/6131811835_b7cdb594f3_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(4L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/cats/6944735673_7d201cbb98_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(5L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/cats/8470085922_ed703dcda3_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(6L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/cats/8854205418_3739d5b3e9_h.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(7L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/cats/9308613838_de3df521b0_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(8L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/cats/9657345685_b680cd813b_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		return imageGallerySubcategoryModels;
	}

	public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryKangarooSubcategory() {
		ArrayList<ImageGallerySubcategoryModel> imageGallerySubcategoryModels = new ArrayList<ImageGallerySubcategoryModel>();
		
		ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(0L);
		imageGallerySubcategoryModel.setTitle("Kangaroo 1");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/kangaroos/14018941654_b24dc40edd_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(1L);
		imageGallerySubcategoryModel.setTitle("Kangaroo 2");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/kangaroos/4849609708_06a24058ec_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(2L);
		imageGallerySubcategoryModel.setTitle("Kangaroo 3");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/kangaroos/4901737404_cf375a44d3_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(3L);
		imageGallerySubcategoryModel.setTitle("Kangaroo 4");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/kangaroos/4962092282_15a076cb8c_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(4L);
		imageGallerySubcategoryModel.setTitle("Kangaroo 5");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/kangaroos/5366854530_35d6de81c2_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(5L);
		imageGallerySubcategoryModel.setTitle("Kangaroo 6");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/kangaroos/7643187732_3753aa9b70_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(6L);
		imageGallerySubcategoryModel.setTitle("Kangaroo 7");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/kangaroos/8275651371_0e5e6bffc4_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(7L);
		imageGallerySubcategoryModel.setTitle("Kangaroo 8");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/kangaroos/8672908837_1ec6c9c967_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		return imageGallerySubcategoryModels;
	}

	public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryFoxesSubcategory() {
		ArrayList<ImageGallerySubcategoryModel> imageGallerySubcategoryModels = new ArrayList<ImageGallerySubcategoryModel>();
		
		ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(0L);
		imageGallerySubcategoryModel.setTitle("Fox 1");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/foxes/2741843163_5aefaae694_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(1L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/foxes/5461393397_b7bbff4c87_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(2L);
		imageGallerySubcategoryModel.setTitle("Fox 3");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/foxes/5872864880_b1739e6e76_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(3L);
		imageGallerySubcategoryModel.setTitle("Fox 4");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/foxes/6904712695_751bb39e16_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(4L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/foxes/6904714319_c4dbbb2b14_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(5L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/foxes/6977256115_af1011fbfb_h.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(6L);
		imageGallerySubcategoryModel.setTitle("Fox 7");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/foxes/7132259891_878e6513c4_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(7L);
		imageGallerySubcategoryModel.setTitle("Fox 8");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/foxes/7238361098_5d244ea023_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		return imageGallerySubcategoryModels;
	}

	public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryEaglesSubcategory() {
		ArrayList<ImageGallerySubcategoryModel> imageGallerySubcategoryModels = new ArrayList<ImageGallerySubcategoryModel>();
		
		ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(0L);
		imageGallerySubcategoryModel.setTitle("Eagles 1");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/eagles/12111485434_015bcf17e0_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(1L);
		imageGallerySubcategoryModel.setTitle("Eagles 2");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/eagles/12387369564_ee3e9810f3_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(2L);
		imageGallerySubcategoryModel.setTitle("Eagles");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/eagles/3358262896_8a623dc7ca_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(3L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/eagles/6130420503_b5516d49e4_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(4L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/eagles/7924818318_d4f0355bdd_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(5L);
		imageGallerySubcategoryModel.setTitle("Eagles 6");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/eagles/8626880581_7308f6a8a7_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(6L);
		imageGallerySubcategoryModel.setTitle("Eagles 7");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/eagles/9395841437_95035aed96_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		return imageGallerySubcategoryModels;
	}

	public static ArrayList<ImageGallerySubcategoryModel> getImageGallerySquirrelsSubcategory() {
		ArrayList<ImageGallerySubcategoryModel> imageGallerySubcategoryModels = new ArrayList<ImageGallerySubcategoryModel>();
		
		ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(0L);
		imageGallerySubcategoryModel.setTitle("Squirrels 1");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/squirrels/12683899725_ec12a691c5_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(1L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/squirrels/12935575784_bcb43443f9_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(2L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/squirrels/15365307348_82551c3cb6_h.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(3L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/squirrels/2438938256_655ed4f254_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(4L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/squirrels/5194088091_f8af189189_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(5L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/squirrels/5339749381_f1c0a3040b_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(6L);
		imageGallerySubcategoryModel.setTitle("Squirrels 7");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/squirrels/6359846085_c88e231c01_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(7L);
		imageGallerySubcategoryModel.setTitle("Squirrels 8");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/squirrels/6583159839_0ba9c33a75_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		return imageGallerySubcategoryModels;
	}

	public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryBearsSubcategory() {
		ArrayList<ImageGallerySubcategoryModel> imageGallerySubcategoryModels = new ArrayList<ImageGallerySubcategoryModel>();
		
		ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(0L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/bears/14316604273_778ccdac73_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(1L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/bears/14567666406_61df9c0d52_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(2L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/bears/15665160302_f87492c246_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(3L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/bears/3946668599_90958b634c_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(4L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/bears/5396353993_d8bcf19d5e_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(5L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/bears/6346303116_7f3d463a68_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(6L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/bears/8568153824_ae2b3d3a02_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(7L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/bears/8797595259_e99bf75d2e_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		return imageGallerySubcategoryModels;
	}

	public static ArrayList<ImageGalleryCategoryModel> getImageGalleryMusicCategories() {
		ArrayList<ImageGalleryCategoryModel> imageGalleryCategoryModels = new ArrayList<ImageGalleryCategoryModel>();

		ImageGalleryCategoryModel imageGalleryCategoryModel = new ImageGalleryCategoryModel();
		imageGalleryCategoryModel.setId(0L);
		imageGalleryCategoryModel.setUrl("http://pengaja.com/uiapptemplate/violins/147587554_205e3ed653_o.jpg");
		imageGalleryCategoryModel.setTitle("Violins");
		imageGalleryCategoryModel.setFavourite(true);
		imageGalleryCategoryModel.setSubcategories(getImageGalleryViolinsSubcategory());
		imageGalleryCategoryModels.add(imageGalleryCategoryModel);

		imageGalleryCategoryModel = new ImageGalleryCategoryModel();
		imageGalleryCategoryModel.setId(1L);
		imageGalleryCategoryModel.setUrl("http://pengaja.com/uiapptemplate/drums/14258762970_33f3a049ed_b.jpg");
		imageGalleryCategoryModel.setTitle("Drums");
		imageGalleryCategoryModel.setFavourite(false);
		imageGalleryCategoryModel.setSubcategories(getImageGalleryDrumsSubcategory());
		imageGalleryCategoryModels.add(imageGalleryCategoryModel);

		imageGalleryCategoryModel = new ImageGalleryCategoryModel();
		imageGalleryCategoryModel.setId(2L);
		imageGalleryCategoryModel.setUrl("http://pengaja.com/uiapptemplate/saxophones/3022692180_fd02682a44_b.jpg");
		imageGalleryCategoryModel.setTitle("Saxophones");
		imageGalleryCategoryModel.setFavourite(false);
		imageGalleryCategoryModel.setSubcategories(getImageGallerySaxophonesSubcategory());
		imageGalleryCategoryModels.add(imageGalleryCategoryModel);

		imageGalleryCategoryModel = new ImageGalleryCategoryModel();
		imageGalleryCategoryModel.setId(3L);
		imageGalleryCategoryModel.setUrl("http://pengaja.com/uiapptemplate/trumpets/14163752896_453a37b84a_h.jpg");
		imageGalleryCategoryModel.setTitle("Trumpets");
		imageGalleryCategoryModel.setFavourite(true);
		imageGalleryCategoryModel.setSubcategories(getImageGalleryTrumpetsSubcategory());
		imageGalleryCategoryModels.add(imageGalleryCategoryModel);

		imageGalleryCategoryModel = new ImageGalleryCategoryModel();
		imageGalleryCategoryModel.setId(4L);
		imageGalleryCategoryModel.setUrl("http://pengaja.com/uiapptemplate/pianos/14287113341_fe14885b70_b.jpg");
		imageGalleryCategoryModel.setTitle("Pianos");
		imageGalleryCategoryModel.setFavourite(true);
		imageGalleryCategoryModel.setSubcategories(getImageGalleryPianosSubcategory());
		imageGalleryCategoryModels.add(imageGalleryCategoryModel);

		imageGalleryCategoryModel = new ImageGalleryCategoryModel();
		imageGalleryCategoryModel.setId(5L);
		imageGalleryCategoryModel.setUrl("http://pengaja.com/uiapptemplate/accordions/153706234_c473e8eabd_o.jpg");
		imageGalleryCategoryModel.setTitle("Accordions");
		imageGalleryCategoryModel.setFavourite(false);
		imageGalleryCategoryModel.setSubcategories(getImageGalleryAccordionsSubcategory());
		imageGalleryCategoryModels.add(imageGalleryCategoryModel);
		
		return imageGalleryCategoryModels;
	}

	public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryViolinsSubcategory() {
		ArrayList<ImageGallerySubcategoryModel> imageGallerySubcategoryModels = new ArrayList<ImageGallerySubcategoryModel>();
		
		ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(0L);
		imageGallerySubcategoryModel.setTitle("Violin 1");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/violins/147587554_205e3ed653_o.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(1L);
		imageGallerySubcategoryModel.setTitle("Violin 2");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/violins/2322113757_808c904f04_o.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(2L);
		imageGallerySubcategoryModel.setTitle("Violin 3");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/violins/2323048092_b6c70654ef_o.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(3L);
		imageGallerySubcategoryModel.setTitle("Violin 4");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/violins/2348623142_af7802400f_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(4L);
		imageGallerySubcategoryModel.setTitle("Violin 5");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/violins/459221457_09e40e82a8_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(5L);
		imageGallerySubcategoryModel.setTitle("Violin 6");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/violins/5950552903_7dbea63895_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		return imageGallerySubcategoryModels;
	}

	public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryDrumsSubcategory() {
		ArrayList<ImageGallerySubcategoryModel> imageGallerySubcategoryModels = new ArrayList<ImageGallerySubcategoryModel>();
		
		ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(0L);
		imageGallerySubcategoryModel.setTitle("Drum 1");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/drums/14258762970_33f3a049ed_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(1L);
		imageGallerySubcategoryModel.setTitle("Drum 2");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/drums/2419154841_a4c2015605_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(2L);
		imageGallerySubcategoryModel.setTitle("Drum 3");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/drums/6500936951_bf8d21a4b7_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(3L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/drums/7587609934_f90d316fa0_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(4L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/drums/7672718592_ca4ccf7315_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(5L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/drums/8229110151_3c963f6a8d_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		return imageGallerySubcategoryModels;
	}

	public static ArrayList<ImageGallerySubcategoryModel> getImageGallerySaxophonesSubcategory() {
		ArrayList<ImageGallerySubcategoryModel> imageGallerySubcategoryModels = new ArrayList<ImageGallerySubcategoryModel>();
		
		ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(0L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/saxophones/3022692180_fd02682a44_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(1L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/saxophones/4268421378_e2d3ecdf1b_o.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(2L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/saxophones/4586115189_d4886a2118_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(3L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/saxophones/5823606898_77db8827b1_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(4L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/saxophones/7807389560_57b1d5b5f8_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(5L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/saxophones/870265218_716ebe2cb8_o.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		return imageGallerySubcategoryModels;
	}

	public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryTrumpetsSubcategory() {
		ArrayList<ImageGallerySubcategoryModel> imageGallerySubcategoryModels = new ArrayList<ImageGallerySubcategoryModel>();
		
		ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(0L);
		imageGallerySubcategoryModel.setTitle("Trumpet 1");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/trumpets/14163752896_453a37b84a_h.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(1L);
		imageGallerySubcategoryModel.setTitle("Trumpet 2");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/trumpets/2531134817_ba97791524_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(2L);
		imageGallerySubcategoryModel.setTitle("Trumpet 3");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/trumpets/4867822712_1b1d3da2cd_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(3L);
		imageGallerySubcategoryModel.setTitle("Trumpet 4");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/trumpets/4949712803_7fc832d2cc_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(4L);
		imageGallerySubcategoryModel.setTitle("Trumpet 5");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/trumpets/6186270505_cc834a94c6_o.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(5L);
		imageGallerySubcategoryModel.setTitle("Trumpet 6");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/trumpets/7865792422_ef00cb7840_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(6L);
		imageGallerySubcategoryModel.setTitle("Trumpet 7");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/trumpets/8044715752_9855063570_k.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		return imageGallerySubcategoryModels;
	}

	public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryPianosSubcategory() {
		ArrayList<ImageGallerySubcategoryModel> imageGallerySubcategoryModels = new ArrayList<ImageGallerySubcategoryModel>();
		
		ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(0L);
		imageGallerySubcategoryModel.setTitle("Piano 1");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/pianos/14287113341_fe14885b70_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(1L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/pianos/5052063297_61b6386db5_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(2L);
		imageGallerySubcategoryModel.setTitle("Piano 3");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/pianos/5200112333_502355c045_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(3L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/pianos/5637747696_42cba72967_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(4L);
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/pianos/7310209818_537dd46419_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(5L);
		imageGallerySubcategoryModel.setTitle("Piano 6");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/pianos/8247668743_36fcf1f4bb_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		return imageGallerySubcategoryModels;
	}

	public static ArrayList<ImageGallerySubcategoryModel> getImageGalleryAccordionsSubcategory() {
		ArrayList<ImageGallerySubcategoryModel> imageGallerySubcategoryModels = new ArrayList<ImageGallerySubcategoryModel>();
		
		ImageGallerySubcategoryModel imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(0L);
		imageGallerySubcategoryModel.setTitle("Accordion 1");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/accordions/153706234_c473e8eabd_o.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(1L);
		imageGallerySubcategoryModel.setTitle("Accordion 2");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/accordions/2681657661_177a5edbc5_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(2L);
		imageGallerySubcategoryModel.setTitle("Accordion 3");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/accordions/3369363243_94fb76891d_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(3L);
		imageGallerySubcategoryModel.setTitle("Accordion 4");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/accordions/5316360932_719617fa1d_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(4L);
		imageGallerySubcategoryModel.setTitle("Accordion 5");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/accordions/6151326630_349b892d5a_b.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		imageGallerySubcategoryModel = new ImageGallerySubcategoryModel();
		imageGallerySubcategoryModel.setId(5L);
		imageGallerySubcategoryModel.setTitle("Accordion 6");
		imageGallerySubcategoryModel.setUrl("http://pengaja.com/uiapptemplate/accordions/7607076588_593e509440_h.jpg");
		imageGallerySubcategoryModels.add(imageGallerySubcategoryModel);
		
		return imageGallerySubcategoryModels;
	}
	
	public static ArrayList<DummyModel> getDummyModelList() {
		ArrayList<DummyModel> list = new ArrayList<>();

		list.add(new DummyModel(0, "http://pengaja.com/uiapptemplate/avatars/0.jpg", "Isaac Reid", R.string.fontello_heart_empty));
		list.add(new DummyModel(1, "http://pengaja.com/uiapptemplate/avatars/1.jpg", "Jason Graham", R.string.fontello_heart_empty));
		list.add(new DummyModel(2, "http://pengaja.com/uiapptemplate/avatars/2.jpg", "Abigail Ross", R.string.fontello_heart_empty));
		list.add(new DummyModel(3, "http://pengaja.com/uiapptemplate/avatars/3.jpg", "Justin Rutherford", R.string.fontello_heart_empty));
		list.add(new DummyModel(4, "http://pengaja.com/uiapptemplate/avatars/4.jpg", "Nicholas Henderson", R.string.fontello_heart_empty));
		list.add(new DummyModel(5, "http://pengaja.com/uiapptemplate/avatars/5.jpg", "Elizabeth Mackenzie", R.string.fontello_heart_empty));
		list.add(new DummyModel(6, "http://pengaja.com/uiapptemplate/avatars/6.jpg", "Melanie Ferguson", R.string.fontello_heart_empty));
		list.add(new DummyModel(7, "http://pengaja.com/uiapptemplate/avatars/7.jpg", "Fiona Kelly", R.string.fontello_heart_empty));
		list.add(new DummyModel(8, "http://pengaja.com/uiapptemplate/avatars/8.jpg", "Nicholas King", R.string.fontello_heart_empty));
		list.add(new DummyModel(9, "http://pengaja.com/uiapptemplate/avatars/9.jpg", "Victoria Mitchell", R.string.fontello_heart_empty));
		list.add(new DummyModel(10, "http://pengaja.com/uiapptemplate/avatars/10.jpg", "Sophie Lyman", R.string.fontello_heart_empty));
		list.add(new DummyModel(11, "http://pengaja.com/uiapptemplate/avatars/11.jpg", "Carl Ince", R.string.fontello_heart_empty));
		list.add(new DummyModel(12, "http://pengaja.com/uiapptemplate/avatars/12.jpg", "Michelle Slater", R.string.fontello_heart_empty));
		list.add(new DummyModel(13, "http://pengaja.com/uiapptemplate/avatars/13.jpg", "Ryan Mathis", R.string.fontello_heart_empty));
		list.add(new DummyModel(14, "http://pengaja.com/uiapptemplate/avatars/14.jpg", "Julia Grant", R.string.fontello_heart_empty));
		list.add(new DummyModel(15, "http://pengaja.com/uiapptemplate/avatars/15.jpg", "Hannah Martin", R.string.fontello_heart_empty));
		
		return list;
	}
}
