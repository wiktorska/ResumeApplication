package com.swiss.app.resume.preference;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;

import java.lang.reflect.Field;

/**
 * Created by avelife on 2014-10-10.
 */
public class FontsOverride {
    public static void setDefaultFont(Context context,
                                      String staticTypefaceFieldName, String fontAssetName) {
        final Typeface regular = Typeface.createFromAsset(context.getAssets(),
                fontAssetName);
        replaceFont(staticTypefaceFieldName, regular);
    }

    protected static void replaceFont(String staticTypefaceFieldName,
                                      final Typeface newTypeface) {
        try {
            final Field staticField = Typeface.class
                    .getDeclaredField(staticTypefaceFieldName);
            staticField.setAccessible(true);
            staticField.set(null, newTypeface);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static Typeface setFontHeader(AssetManager assetManager){
        return Typeface.createFromAsset(assetManager, "fonts/Roboto-Medium.ttf");
    }
}
