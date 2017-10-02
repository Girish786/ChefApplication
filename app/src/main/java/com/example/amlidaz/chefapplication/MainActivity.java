package com.example.amlidaz.chefapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView image_order,image_accept,image_profile,image_Query;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {super.onStart();

        image_order=(ImageView)findViewById(R.id.OrderList);
        image_accept=(ImageView)findViewById(R.id.AcceptOrderList);
        image_profile=(ImageView)findViewById(R.id.Chef_Profile);
        image_Query=(ImageView)findViewById(R.id.ChefQuery);
        image_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,CardDemo.class));

            }
        });
        image_accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,NotifyFoodCookingActivity.class));
            }
        });
        image_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Profile_chef.class));
            }
        });
        image_Query.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,QueryChef.class));
            }
        });

    }
}
