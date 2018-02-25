package com.yarashevich.kiryl.ipd

import android.content.Context

import com.example.library.MaterialAboutFragment
import com.example.library.model.MaterialAboutList


class ExampleMaterialAboutFragment : MaterialAboutFragment() {

    override fun getMaterialAboutList(c: Context): MaterialAboutList {
        return Demo.createMaterialAboutList(c, R.color.colorIconLight, MaterialAboutFragment.THEME_LIGHT)
    }

    override fun getTheme(): Int {
        return MaterialAboutFragment.THEME_LIGHT
    }
}
