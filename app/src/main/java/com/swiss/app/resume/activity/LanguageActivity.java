package com.swiss.app.resume.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import com.swiss.app.resume.R;
import com.swiss.app.resume.preference.FontsOverride;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.util.Locale;


@EActivity(R.layout.language_activity_main)
public class LanguageActivity extends Activity {

    private static final String TAG = LanguageActivity.class.getName();
    @ViewById(R.id.de_label)
    Button germanyLabel;

    @ViewById(R.id.en_label)
    Button englishLabel;

    @ViewById(R.id.pl_label)
    Button polishLabel;

    Locale myLocale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FontsOverride.setDefaultFont(this, "SERIF", "fonts/Roboto-Light.ttf");
    }

    @Click({R.id.de_label,R.id.en_label,R.id.pl_label})
    void chooseLanguage(View view) {

        if (view.getId() == germanyLabel.getId()) {
            setLocale("de");
        } else if (view.getId() == englishLabel.getId()) {
            setLocale("en");
        } else if (view.getId() == polishLabel.getId()){
            setLocale("pl");
        }
    }
    public void setLocale(String lang) {
        myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent mainActivity = new Intent(getApplicationContext(),MainResumeActivity_.class);
        mainActivity.putExtra("lng",lang);
        startActivity(mainActivity);

        this.finish();
    }


}
