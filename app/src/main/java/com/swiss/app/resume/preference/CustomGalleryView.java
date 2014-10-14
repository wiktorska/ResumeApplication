package com.swiss.app.resume.preference;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by avelife on 2014-10-10.
 */
public class CustomGalleryView extends ViewPager {
    private static int childId;

    public CustomGalleryView(Context context) {
        super(context);
    }

    public CustomGalleryView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    protected boolean canScroll(View v, boolean checkV, int dx, int x, int y) {
        try {

            if (v != this && v instanceof ViewPager) {
                ViewPager viewPager = (ViewPager) v;
                int currentPage = viewPager.getCurrentItem();
                int size = viewPager.getAdapter().getCount();

                if (currentPage == (size - 1) && dx < 0) {
                    return false;
                } else if (currentPage == 0 && dx > 0) {
                    return false;
                } else {
                    return true;
                }
            }
            return super.canScroll(v, checkV, dx, x, y);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}

