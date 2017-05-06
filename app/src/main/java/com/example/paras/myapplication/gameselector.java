package com.example.paras.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class gameselector extends AppCompatActivity {
    ImageView vctictactoe,tictactoe,back;
    String names1="",names2="";

    TextView selector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameselector);
        selector=(TextView)findViewById(R.id.selector);
        names1=getIntent().getStringExtra("Player1");
        names2=getIntent().getStringExtra("Player2");
        tictactoe=(ImageView) findViewById(R.id.ImageView7);
        vctictactoe=(ImageView) findViewById(R.id.circleImageView8);
        back= (ImageView) findViewById(R.id.circleImageView9);
        selector.setText("SELECT A GAME");
        tictactoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(gameselector.this,tictactao.class);

                i.putExtra("Player1",names1);
                i.putExtra("Player2",names2);
                startActivity(i);    }
        });
        vctictactoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(gameselector.this,gamepage.class);

                i.putExtra("Player1",names1);
                i.putExtra("Player2",names2);
                startActivity(i);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(gameselector.this,getname.class);
                startActivity(i);
            }
        });
    }
}
