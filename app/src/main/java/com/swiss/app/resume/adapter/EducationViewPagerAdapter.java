package com.swiss.app.resume.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.swiss.app.resume.R;
import com.swiss.app.resume.dao.impl.Education;

/**
 * Created by avelife on 2014-10-13.
 */
public class EducationViewPagerAdapter extends PagerAdapter {
    private Education[] educations;
    private Context context;
    private TextView startDate;
    private TextView endDate;
    LayoutInflater inflater;
    private TextView degree;
    private TextView schoolName;
    private TextView faculty;
    private TextView major;
    private TextView fieldStudy;

    public EducationViewPagerAdapter(Education[] educations, Context context) {
        this.educations = educations;
        this.context = context;
    }

    @Override
    public int getCount() {
        return educations.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        Education item = educations[position];
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.education_list_item, container,
                false);
        startDate = (TextView) itemView.findViewById(R.id.start_date_ed);
        endDate = (TextView) itemView.findViewById(R.id.end_date_ed);
        degree = (TextView) itemView.findViewById(R.id.degree);
        schoolName = (TextView) itemView.findViewById(R.id.school_name);
        faculty = (TextView) itemView.findViewById(R.id.faculty);
        fieldStudy = (TextView) itemView.findViewById(R.id.field_study);
        major = (TextView) itemView.findViewById(R.id.major);
        pullData(item);
        ((ViewPager) container).addView(itemView);

        return itemView;
    }

    public void pullData(Education ed) {
        startDate.setText(ed.getStartDate());
        endDate.setText(ed.getEndDate());
        schoolName.setText(ed.getSchoolName());
        degree.setText(ed.getDegree());
        faculty.setText(ed.getFaculty());
        fieldStudy.setText(ed.getFieldOfStudy());
        major.setText(ed.getMajor());
    }
}
