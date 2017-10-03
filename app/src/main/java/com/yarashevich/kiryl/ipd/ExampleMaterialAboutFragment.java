package com.yarashevich.kiryl.ipd;

import android.content.Context;

import com.example.library.MaterialAboutFragment;
import com.example.library.model.MaterialAboutList;


public class ExampleMaterialAboutFragment extends MaterialAboutFragment {

    @Override
    protected MaterialAboutList getMaterialAboutList(final Context c) {
        return Demo.createMaterialAboutList(c, R.color.colorIconLight, THEME_LIGHT);
    }

    @Override
    protected int getTheme() {
        return THEME_LIGHT;
    }
}
