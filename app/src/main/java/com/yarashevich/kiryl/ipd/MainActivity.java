package com.yarashevich.kiryl.ipd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.intern);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uoipd.by/ru/news/" +
                        ""));
                startActivity(browserIntent);
                Snackbar.make(view, "Переход на сайт: uoipd.by новости", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.title_activity_scrolling) {
            startActivity(new Intent(this, ExampleMaterialAboutFragmentActivity.class));
        }


        //noinspection SimplifiableIfStatement
        if (id == R.id.activiti_scrolling) {
            startActivity(new Intent(this, ScrollingActivity2.class));
        }

        return super.onOptionsItemSelected(item);
    }

    // Меню(навигация):

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_1) {
         startActivity(new Intent(this, Nav_A.class));

        } else if (id == R.id.nav_2) {
            startActivity(new Intent(this, Nav_B.class));

        } else if (id == R.id.nav_3) {
            startActivity(new Intent(this, Nav_C.class));

        } else if (id == R.id.nav_4) {
            startActivity(new Intent(this, Nav_D.class));

        } else if (id == R.id.zaochnoe_a) {
            startActivity(new Intent(this, Zaochnoe_A.class));

        } else if (id == R.id.zaochnoe_b) {
            startActivity(new Intent(this, Zaochnoe_B.class));

        } else if (id == R.id.zaochnoe_c) {
            startActivity(new Intent(this, Zaochnoe_C.class));

        } else if (id == R.id.zaochnoe_d) {
            startActivity(new Intent(this, Zaochnoe_D.class));

        } else if (id == R.id.nav_share) {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "Расписание ИПД можно смотреть на смартфоне | Скачать: https://play.google.com/store/apps/details?id=com.yarashevich.kiryl.ipd");
            sendIntent.setType("text/plain");
            startActivity(sendIntent);

        } else if (id == R.id.rating) {
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.yarashevich.kiryl.ipd");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);

        } else if (id == R.id.activiti_scrolling) {
            startActivity(new Intent(this, ScrollingActivity2.class));

        } else if (id == R.id.timing) {
                startActivity(new Intent(this, SrokOplata.class));

        } else if (id == R.id.phonebookipd1) {
            startActivity(new Intent(this, PhoneBookIpd.class));

        } else if (id == R.id.arenda) {
            Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=by.nikolaenko.ineedaflat");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);

        } else if (id == R.id.activiti_scrol) {
            startActivity(new Intent(this, ExampleMaterialAboutFragmentActivity.class));

        } else if (id == R.id.intern) {
            Uri uri = Uri.parse("http://www.uoipd.by/ru/");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);

        } else if (id == R.id.parsenewcontent1) {
            startActivity(new Intent(this, ParseNewContent.class));

        }

            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }
}
