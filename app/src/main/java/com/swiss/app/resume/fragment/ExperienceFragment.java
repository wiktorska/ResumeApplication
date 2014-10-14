package com.swiss.app.resume.fragment;

import android.support.v4.view.ViewPager;
import android.util.Log;
import android.widget.TextView;
import com.swiss.app.resume.R;
import com.swiss.app.resume.adapter.ExperienceViewPager;
import com.swiss.app.resume.dao.impl.Employee;
import com.swiss.app.resume.dao.impl.Experience;
import com.swiss.app.resume.preference.FontsOverride;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import java.util.List;

/**
 * Created by avelife on 2014-10-07.
 */
@EFragment(R.layout.experience_fragment)
public class ExperienceFragment extends BaseFragment {
    private static final String TAG = ExperienceFragment.class.getName();
    @ViewById(R.id.experience_header)
    TextView experienceHeader;
    @ViewById(R.id.vp_experience)
    ViewPager vpExperience;

    private Experience[] experiences;

    @Override
    public void onResume() {
        super.onResume();
        experienceHeader.setTypeface(FontsOverride.setFontHeader(getActivity().getAssets()));
        Log.i(TAG, "OnResume");

    }

    @AfterViews
    void pullExperiences() {

        final List<Experience> experienceList = Employee.getData().getExperienceList();
        experiences = new Experience[experienceList.size()];

        for (int i = 0; i < experienceList.size(); i++) {
            experiences[i] = experienceList.get(i);
        }
        ExperienceViewPager adapter = new ExperienceViewPager( experiences,this.getActivity());
        vpExperience.setAdapter(adapter);


    }
}
