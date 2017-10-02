package com.example.amlidaz.chefapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.amlidaz.chefapplication.Adapter.CardDemoAdapter;
import com.example.amlidaz.chefapplication.model.CardDemoModel;

import java.util.ArrayList;
import java.util.List;

public class CardDemo extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;
    List<CardDemoModel> arrayList;
    private String[] titles = {"Chapter One",
            "Chapter Two",
            "Chapter Three",
            "Chapter Four",
            "Chapter Five",
            "Chapter Six",
            "Chapter Seven",
            "Chapter Eight"};

    private String[] details = {"Item one details",
            "Item two details", "Item three details",
            "Item four details", "Item file details",
            "Item six details", "Item seven details",
            "Item eight details"};

    private int[] images = { R.drawable.android_image_1,
            R.drawable.android_image_2,
            R.drawable.android_image_3,
            R.drawable.android_image_4,
            R.drawable.android_image_5,
            R.drawable.android_image_6,
            R.drawable.android_image_7,
            R.drawable.android_image_8 };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_demo);

    }

    @Override
    protected void onResume() {
        super.onResume();
        recyclerView =
                (RecyclerView) findViewById(R.id.recycler_view);
        arrayList= new ArrayList<>();
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        for(int i=0;i<titles.length;i++)
        {
            Log.e("Mytag","titlesize"+titles.length);
            CardDemoModel cardDemoModel = new CardDemoModel(titles,details,images);
            arrayList.add(cardDemoModel);
        }

        adapter = new CardDemoAdapter(CardDemo.this,arrayList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_card_demo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
//RECEIVE DATA

        //BIND DATA

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

