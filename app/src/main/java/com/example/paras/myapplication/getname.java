package com.example.paras.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class getname extends AppCompatActivity {
    TextView message1,message2;
    EditText text1,text2;
    ImageView img4,img5;
    String names1,names2,name1,name2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getname);
        message1 = (TextView) findViewById(R.id.message);
        message2 = (TextView) findViewById(R.id.message2);
        text1 = (EditText) findViewById(R.id.name1);
        text2 = (EditText) findViewById(R.id.name2);
        img4 = (ImageView) findViewById(R.id.circleImageView4);
        img5 = (ImageView) findViewById(R.id.circleImageView5);
        message1.setText("Player 1");
        message2.setText("Player 2");

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                names1=text1.getText().toString();
                if (text1==null)
                {
                    names1="Player1";
                }
                names2=text2.getText().toString();
                if (text2==null)
                {
                    names2="Player2";
                }
                Intent i=new Intent(getname.this,gameselector.class);

                {
                    i.putExtra("Player1", names1);
                    i.putExtra("Player2", names2);
                    startActivity(i);
                }    }});
img4.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(getname.this,MainActivity.class);
            startActivity(i);
    }
});
    }

}
