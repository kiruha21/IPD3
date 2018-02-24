package com.yarashevich.kiryl.ipd

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import android.view.View

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById<View>(R.id.intern) as FloatingActionButton
        fab.setOnClickListener { view ->
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uoipd.by/ru/news/" + ""))
            startActivity(browserIntent)
            Snackbar.make(view, "Переход на сайт: uoipd.by новости", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        val toggle = ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()

        val navigationView = findViewById<View>(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        if (id == R.id.title_activity_scrolling) {
            startActivity(Intent(this, ExampleMaterialAboutFragmentActivity::class.java))
        }



        if (id == R.id.activiti_scrolling) {
            startActivity(Intent(this, ScrollingActivity2::class.java))
        }

        return super.onOptionsItemSelected(item)
    }

    // Меню(навигация):

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val id = item.itemId

        if (id == R.id.nav_1) {
            startActivity(Intent(this, Nav_A::class.java))

        } else if (id == R.id.nav_2) {
            startActivity(Intent(this, Nav_B::class.java))

        } else if (id == R.id.nav_3) {
            startActivity(Intent(this, Nav_C::class.java))

        } else if (id == R.id.nav_4) {
            startActivity(Intent(this, Nav_D::class.java))

        } else if (id == R.id.zaochnoe_a) {
            startActivity(Intent(this, Zaochnoe_A::class.java))

        } else if (id == R.id.zaochnoe_b) {
            startActivity(Intent(this, Zaochnoe_B::class.java))

        } else if (id == R.id.zaochnoe_c) {
            startActivity(Intent(this, Zaochnoe_C::class.java))

        } else if (id == R.id.zaochnoe_d) {
            startActivity(Intent(this, Zaochnoe_D::class.java))

        } else if (id == R.id.nav_share) {
            val sendIntent = Intent()
            sendIntent.action = Intent.ACTION_SEND
            sendIntent.putExtra(Intent.EXTRA_TEXT, "Расписание ИПД можно смотреть на смартфоне | Скачать: https://play.google.com/store/apps/details?id=com.yarashevich.kiryl.ipd")
            sendIntent.type = "text/plain"
            startActivity(sendIntent)

        } else if (id == R.id.rating) {
            val uri = Uri.parse("https://play.google.com/store/apps/details?id=com.yarashevich.kiryl.ipd")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)

        } else if (id == R.id.activiti_scrolling) {
            startActivity(Intent(this, ScrollingActivity2::class.java))

        } else if (id == R.id.timing) {
            startActivity(Intent(this, SrokOplata::class.java))

        } else if (id == R.id.phonebookipd1) {
            startActivity(Intent(this, PhoneBookIpd::class.java))

        } else if (id == R.id.arenda) {
            val uri = Uri.parse("https://play.google.com/store/apps/details?id=by.nikolaenko.ineedaflat")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)

        } else if (id == R.id.activiti_scrol) {
            startActivity(Intent(this, ExampleMaterialAboutFragmentActivity::class.java))

        } else if (id == R.id.intern) {
            val uri = Uri.parse("http://www.uoipd.by/ru/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)

        } else if (id == R.id.parsenewcontent1) {
            startActivity(Intent(this, ParseNewContent::class.java))

        }

        val drawer = findViewById<View>(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true

    }
}
