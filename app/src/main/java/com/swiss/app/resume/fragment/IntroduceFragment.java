package com.swiss.app.resume.fragment;

import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import com.swiss.app.resume.R;
import com.swiss.app.resume.dao.impl.Employee;
import com.swiss.app.resume.preference.FontsOverride;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

/**
 * Created by avelife on 2014-10-03.
 */
@EFragment(R.layout.basic_introduce_fragment)
public class IntroduceFragment extends BaseFragment{

    private static final String TAG = IntroduceFragment.class.getName();
    @ViewById(R.id.employee_photo)
    ImageView employeePhoto;
    @ViewById(R.id.introduction)
    TextView introduction;
    @ViewById(R.id.introduction_header)
    TextView introductionHeader;

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
        employeePhoto.setImageDrawable(getResources().getDrawable(R.drawable.formalne));
        introduction.setText(String.format(getResources().getString(R.string.introduction), Employee.getData().getName()));
        introductionHeader.setTypeface(FontsOverride.setFontHeader(getActivity().getAssets()));
    }




    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
       // employeePhoto.setImageResource(0);


    }
}
