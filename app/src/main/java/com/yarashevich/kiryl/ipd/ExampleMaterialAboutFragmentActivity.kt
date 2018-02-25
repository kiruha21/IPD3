package com.yarashevich.kiryl.ipd

import android.os.Bundle
import android.support.v4.app.NavUtils
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View

class ExampleMaterialAboutFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_example_material_about_fragment)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        supportFragmentManager.beginTransaction()
                .replace(R.id.container,(ExampleMaterialAboutFragment()))
                .commit()

        title = "Информация"

        if (NavUtils.getParentActivityName(this) != null) {
            val actionBar = supportActionBar
            actionBar?.setDisplayHomeAsUpEnabled(true)
        }

    }

}
