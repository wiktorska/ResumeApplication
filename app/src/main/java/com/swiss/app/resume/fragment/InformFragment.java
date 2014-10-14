package com.swiss.app.resume.fragment;

import android.widget.TextView;
import com.swiss.app.resume.R;
import com.swiss.app.resume.dao.impl.Employee;
import com.swiss.app.resume.preference.FontsOverride;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;



/**
 * Created by avelife on 2014-10-07.
 */
@EFragment(R.layout.inform_fragment)
public class InformFragment extends BaseFragment {
    private static final String TAG = InformFragment.class.getName();
    @ViewById(R.id.inform_header)
    TextView informHeader;
    @ViewById(R.id.inform_text)
    TextView aboutMeText;

    @Override
    public void onResume() {
        super.onResume();
        informHeader.setTypeface(FontsOverride.setFontHeader(getActivity().getAssets()));
        aboutMeText.setText(Employee.getData().getDescription());
    }
    @Override
    public void onStart() {
        super.onStart();

    }
}
