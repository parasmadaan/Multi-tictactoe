package com.example.paras.myapplication;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity  {
    Button btplay;
    ImageView img1,img2;
    Button btabout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         img1=(ImageView)findViewById(R.id.circleImageView2);
          img2=(ImageView)findViewById(R.id.circleImageView);
        img1.setOnClickListener(new View.OnClickListener() {
                      @Override
                      public void onClick(View view) {
                  Intent i =new Intent(MainActivity.this,getname.class);
                startActivity(i);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,about.class);
                startActivity(i);
            }
        });
    }


}

