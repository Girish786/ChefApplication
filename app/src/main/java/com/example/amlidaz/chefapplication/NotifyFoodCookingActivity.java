package com.example.amlidaz.chefapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.amlidaz.chefapplication.Adapter.NotificationFoodAdapterAccept;
import com.example.amlidaz.chefapplication.model.AcceptModel;
import com.example.amlidaz.chefapplication.model.CardDemoModel;

import java.util.ArrayList;
import java.util.List;

public class NotifyFoodCookingActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    TextView nameFood;
    RecyclerView.Adapter adapter;
    public List<AcceptModel> arrayList;
    private String title;
    private String detail;
    private String[] titles,details;
   private int image;
    private int[] images;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notify_food_cooking);
        title=getIntent().getStringExtra("title");
        detail=getIntent().getStringExtra("itemDetail");
        image=getIntent().getIntExtra("image",0);
        Log.e("Mytag","Girirhs"+title);
        Log.e("Mytag","Girirhs1"+detail);
        Log.e("Mytag","Girirhs2"+image);

        titles = new String [1000];
        details = new String [1000];
        images = new int [1000];
        if(titles!=null) {
            for (int i = 0; i < titles.length; i++) {
                titles[i] = title;
                details[i] = detail;
                images[i] = image;
            }
        }
        else
        {
            Log.e("Mytag","Array is null");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        recyclerView =
                (RecyclerView) findViewById(R.id.recycler_Views);
        arrayList= new ArrayList<>();
        for(int i=0;i<titles.length;i++)
        {
            Log.e("Mytag","titlesize"+titles.length);
            AcceptModel acceptModel = new AcceptModel(titles,details,images);
            arrayList.add(acceptModel);
        }
        Log.e("Mytag1", "dataPass" + title);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new NotificationFoodAdapterAccept(NotifyFoodCookingActivity.this,arrayList);
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

