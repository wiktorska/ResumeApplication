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
import com.swiss.app.resume.dao.impl.Experience;

/**
 * Created by avelife on 2014-10-13.
 */
public class ExperienceViewPager extends PagerAdapter {
    private Experience[] experience;
    private Context context;
    private TextView date;
      private TextView positions;
    private TextView companyName;
    LayoutInflater inflater;

    public ExperienceViewPager(Experience[] experience, Context context) {
        this.experience = experience;
        this.context = context;
    }

    @Override
    public int getCount() {
        return experience.length;
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
        Experience item = experience[position];
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView = inflater.inflate(R.layout.experience_list_item, container,
                false);
        date = (TextView)itemView.findViewById(R.id.date);

        positions = (TextView)itemView.findViewById(R.id.positions);
        companyName = (TextView)itemView.findViewById(R.id.company_name);
        pullData(item);
        ((ViewPager) container).addView(itemView);

        return itemView;
    }

    public void pullData(Experience exp){
        date.setText(exp.getDate());

        positions.setText(exp.getPosition());
        companyName.setText(exp.getCompanyName());
    }
}
