package com.example.android.tourguideapp;

/**
 * Created by Rebecca Macaw on 12/18/2016.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Place} objects.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EatFragment();
        } else if (position == 1) {
            return new DrinkFragment();
        } else if (position == 2) {
            return new PlayFragment();
        } else {
            return new ExploreFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_eat);
        } else if (position == 1) {
            return mContext.getString(R.string.category_drink);
        } else if (position == 2) {
            return mContext.getString(R.string.category_play);
        } else {
            return mContext.getString(R.string.category_explore);
        }
    }


}
