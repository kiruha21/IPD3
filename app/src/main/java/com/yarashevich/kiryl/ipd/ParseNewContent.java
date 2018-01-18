package com.yarashevich.kiryl.ipd;

/**
 * Created by kiruha_21 on 18.01.2018.
 */

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class ParseNewContent extends AppCompatActivity {

    private ListView ListView;
    private TextView TextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parse_new);

        ListView = (ListView) findViewById(R.id.ListView);
        TextView = (TextView) findViewById(R.id.TextView);

        ParseTitle parseTitle = new ParseTitle();
        parseTitle.execute();

        try {
            final HashMap<String,String> hashMap = parseTitle.get();
            final ArrayList<String> arrayList = new ArrayList<>();
            for (Map.Entry entry : hashMap.entrySet()) {
                arrayList.add(entry.getKey().toString());
            }

            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(ParseNewContent.this
                    ,android.R.layout.simple_list_item_1,arrayList);

            ListView.setAdapter(arrayAdapter);
            ListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    ParseText parseText = new ParseText();
                    parseText.execute(hashMap.get(arrayList.get(position)));

                    try {
                        ListView.setVisibility(View.GONE);
                        TextView.setText(parseText.get());

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onBackPressed() {
        ListView.setVisibility(View.VISIBLE);
        TextView.setVisibility(View.GONE);
    }

    class ParseText extends AsyncTask<String,Void,String> {

        @Override
        protected String doInBackground(String... params) {
            String str = " ";

            try {
                Document document = Jsoup.connect(params[0]).get();
                Element element = document.select(".text").first();
                str = element.text();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    class ParseTitle extends AsyncTask<Void,Void,HashMap<String,String>> {

        @Override
        protected HashMap<String, String> doInBackground(Void... params) {
            HashMap<String,String> hashMap = new HashMap<>();
            try {
                Document document = Jsoup.connect("http://www.uoipd.by/ru/news/").get();
                Elements elements = document.select(".news");
                for (Element element:elements) {
                    Element element1 = element.select("a[href]").first();
                    hashMap.put(element.text(),element1.attr("abs:href"));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return hashMap;
        }
    }
}