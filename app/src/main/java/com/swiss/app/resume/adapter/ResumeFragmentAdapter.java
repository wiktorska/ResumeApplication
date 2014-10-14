package com.swiss.app.resume.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.swiss.app.resume.fragment.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by avelife on 2014-10-07.
 */
public class ResumeFragmentAdapter extends FragmentStatePagerAdapter{

    List<Fragment> fragments = new ArrayList<Fragment>();

    public ResumeFragmentAdapter(FragmentManager fm) {
        super(fm);
        this.fragments.add(new IntroduceFragment_());
        this.fragments.add(new InformFragment_());
        this.fragments.add(new ExperienceFragment_());
        this.fragments.add(new EducationFragment_());
        this.fragments.add(new SkillsSummeryFragment_());

        this.fragments.add(new ContactFragment_());


    }

    @Override
    public Fragment getItem(int position) {
        return this.fragments.get(position);
    }

    @Override
    public int getCount() {
        return this.fragments.size();
    }
}
