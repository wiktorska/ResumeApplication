package com.swiss.app.resume.fragment;

import android.support.v4.view.ViewPager;
import android.util.Log;
import android.widget.TextView;
import com.swiss.app.resume.R;
import com.swiss.app.resume.adapter.EducationViewPagerAdapter;
import com.swiss.app.resume.dao.impl.Education;
import com.swiss.app.resume.dao.impl.Employee;
import com.swiss.app.resume.preference.FontsOverride;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.List;

/**
 * Created by avelife on 2014-10-07.
 */
@EFragment(R.layout.education_fragment)
public class EducationFragment extends BaseFragment {
    private static final String TAG = ExperienceFragment.class.getName();
    @ViewById(R.id.education_header)
    TextView educationHeader;
    @ViewById(R.id.vp_education)
    ViewPager vpEducation;
    private Education [] educationItem;
    @Override
    public void onResume() {
        super.onResume();
        educationHeader.setTypeface(FontsOverride.setFontHeader(getActivity().getAssets()));
        Log.i(TAG, "OnResume");

    }
    @AfterViews
    void pullExperiences() {

        final List<Education> educationList = Employee.getData().getEducationList();
        educationItem = new Education[educationList.size()];

        for (int i = 0; i < educationList.size(); i++) {
            educationItem[i] = educationList.get(i);
        }
        EducationViewPagerAdapter adapter = new EducationViewPagerAdapter( educationItem,this.getActivity());
        vpEducation.setAdapter(adapter);


    }
}
