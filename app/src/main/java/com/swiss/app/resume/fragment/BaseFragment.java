package com.swiss.app.resume.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import org.androidannotations.annotations.EFragment;

/**
 * Created by avelife on 2014-10-03.
 */
/**
 * Manage common fragment methods
 */
@EFragment
public class BaseFragment extends Fragment {

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
    @Override
    public void onStart() {
        super.onStart();

    }
}
