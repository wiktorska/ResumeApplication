package com.swiss.app.resume.activity;


import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.FrameLayout;
import com.google.gson.Gson;
import com.swiss.app.resume.R;
import com.swiss.app.resume.adapter.ResumeFragmentAdapter;
import com.swiss.app.resume.dao.impl.Employee;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by avelife on 2014-10-03.
 */
@EActivity(R.layout.main_resume_activ)
public class MainResumeActivity extends BaseFragmentActivity {
    @ViewById
    FrameLayout content;
    @ViewById
    ViewPager pager;

    ResumeFragmentAdapter resumeFragmentAdapter;
    private final String EMPLOYEE = "aleksandra_wiktorska";

    @AfterViews
    void initialization() {
        setFragments();
        setEmployeeInformation();
    }

    private void setFragments() {
        resumeFragmentAdapter = new ResumeFragmentAdapter(getSupportFragmentManager());
        pager.setAdapter(resumeFragmentAdapter);


    }


    private void setEmployeeInformation() {
     String jsonLng = EMPLOYEE+"_"+getIntent().getExtras().getString("lng");

        InputStream is = this.getResources().openRawResource(getResources().getIdentifier(jsonLng,"raw",getPackageName()));
        Gson gson = new Gson();
        Reader reader = new InputStreamReader(is);
        Employee employee = gson.fromJson(reader, Employee.class);
        Employee.setInstance(employee);


    }


}
