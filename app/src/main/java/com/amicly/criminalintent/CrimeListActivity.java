package com.amicly.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by darrankelinske on 2/4/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
