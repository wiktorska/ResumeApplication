package com.swiss.app.resume.preference;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.swiss.app.resume.R;
import com.swiss.app.resume.dao.impl.Employee;
import com.swiss.app.resume.dao.impl.Experience;

/**
 * Created by avelife on 2014-10-10.
 */
public class ExperienceItemView extends RelativeLayout{
    private Context context;
    private Employee employee;
    private TextView startDate;
    private TextView positions;
    private TextView companyName;
    LayoutInflater inflater;

    public ExperienceItemView(Context context) {
        super(context);
        this.context=context;
        LayoutInflater.from(context).inflate(R.layout.experience_list_item, this);
        startDate = (TextView)findViewById(R.id.date);

        positions = (TextView)findViewById(R.id.positions);
        companyName = (TextView)findViewById(R.id.company_name);

    }
    public void pullData(Experience exp){
        startDate.setText(exp.getStartDate());
        positions.setText(exp.getPosition());
        companyName.setText(exp.getCompanyName());
    }
}
