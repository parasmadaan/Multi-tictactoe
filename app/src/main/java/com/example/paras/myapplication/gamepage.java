package com.example.paras.myapplication;


import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class gamepage extends AppCompatActivity {

    TextView tv;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,button;
    int i=0,a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,j=0;
    ImageView img6;
    String names1="",names2="";
    TextView ed;
    char z='d';
    boolean player1=false;
    boolean player2=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamepage);
     img6=(ImageView)findViewById(R.id.circleImageView6);
        ed = (TextView) findViewById(R.id.et);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);
        bt5 = (Button) findViewById(R.id.bt5);
        bt6 = (Button) findViewById(R.id.bt6);
        bt7 = (Button) findViewById(R.id.bt7);
        bt8 = (Button) findViewById(R.id.bt8);
        bt9 = (Button) findViewById(R.id.bt9);

        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speechinput();

            }});
        names1=getIntent().getStringExtra("Player1");
        names2=getIntent().getStringExtra("Player2");
        names1=names1.toUpperCase();
        names2=names2.toUpperCase();
    }


    void onclick1()
    {
        if (ed.getText().toString().equals("one") || ed.getText().toString().equals("1")) {


            if (!(bt1.getText().equals("0")) && !(bt1.getText().equals("x"))) {
                if (player1 == false && player2 == false) {
                    bt1.setText("0");
                    player2 = true;
                    player1 = false;
                    a = 1;
                } else if (player2 == true && player1 == false) {
                    bt1.setText("x");
                    player1 = false;
                    player2 = false;
                    a = 1;
                }
                i++;
            }
            ed.setText("");
        } else if (ed.getText().equals("two") || ed.getText().equals("Tu")) {
            if (!(bt2.getText().equals("0")) && !(bt2.getText().equals("x"))) {
                if (player1 == false && player2 == false) {
                    bt2.setText("0");
                    player2 = true;
                    player1 = false;
                    a = 1;
                }
                else if (player2 == true && player1 == false) {
                    bt2.setText("x");
                    player1 = false;
                    player2 = false;
                    a = 1;
                }
                i++;
            }
            ed.setText("");
        } else if (ed.getText().equals("3") || ed.getText().equals("free")) {
            if (!(bt3.getText().equals("0")) && !(bt3.getText().equals("x"))) {
                if (player1 == false && player2 == false) {
                    bt3.setText("0");
                    player2 = true;
                    player1 = false;
                    a = 1;
                } else if (player2 == true && player1 == false) {
                    bt3.setText("x");
                    player1 = false;
                    player2 = false;
                    a = 1;
                }
                i++;
            }
            ed.setText("");
        } else if (ed.getText().equals("four") || ed.getText().equals("4")) {
            if (!(bt4.getText().equals("0")) && !(bt4.getText().equals("x"))) {
                if (player1 == false && player2 == false) {
                    bt4.setText("0");
                    player2 = true;
                    player1 = false;
                    a = 1;
                } else if (player2 == true && player1 == false) {
                    bt4.setText("x");
                    player1 = false;
                    player2 = false;
                    a = 1;
                }
                i++;
            }
            ed.setText("");
        } else if (ed.getText().equals("5") || ed.getText().equals("five")) {
            if (!bt5.getText().equals("0") && !bt5.getText().equals("x")) {
                if (player1 == false && player2 == false) {
                    bt5.setText("0");
                    player2 = true;
                    player1 = false;
                    a = 1;
                } else if (player2 == true && player1 == false) {
                    bt5.setText("x");
                    player1 = false;
                    player2 = false;
                    a = 1;
                }
                i++;
            }
            ed.setText("");
        } else if (ed.getText().equals("6") || ed.getText().equals("six")||ed.getText().equals("sex")) {
            if (!bt6.getText().equals("0") && !bt6.getText().equals("x")) {

                if (player1 == false && player2 == false) {
                    bt6.setText("0");
                    player2 = true;
                    player1 = false;
                    a = 1;
                } else if (player2 == true && player1 == false) {
                    bt6.setText("x");
                    player1 = false;
                    player2 = false;
                    a = 1;
                }
                i++;
            }
            ed.setText("");
        }
        else if (ed.getText().equals("seven") || ed.getText().equals("7"))
        {
            if (!bt7.getText().equals("0") && !bt7.getText().equals("x"))
            {
                if (player1 == false && player2 == false)
                {
                    bt7.setText("0");
                    player2 = true;
                    player1 = false;
                    a = 1;
                }
                else if (player2 == true && player1 == false)
                {
                    bt7.setText("x");
                    player1 = false;
                    player2 = false;
                    a = 1;
                }
                i++;
            }
            ed.setText("");
        }
        else if (ed.getText().equals("8") || ed.getText().equals("eight"))
        {
            if (!bt8.getText().equals("0") && !bt8.getText().equals("x")) {
                if (player1 == false && player2 == false) {
                    bt8.setText("0");
                    player2 = true;
                    player1 = false;
                    a = 1;
                } else if (player2 == true && player1 == false) {
                    bt8.setText("x");
                    player1 = false;
                    player2 = false;
                    a = 1;
                }
                i++;
            }
            ed.setText("");
        }
        else if (ed.getText().equals("9") || ed.getText().equals("nine"))
        {
            if (!bt9.getText().equals("0") && !bt9.getText().equals("x")) {
                if (player1 == false && player2 == false) {
                    bt9.setText("0");
                    player2 = true;
                    player1 = false;
                    a = 1;
                } else if (player2 == true && player1 == false) {
                    bt9.setText("x");
                    player1 = false;
                    player2 = false;
                    a = 1;
                }
                i++;
            }
            ed.setText("");
        }
        if ((bt1.getText().toString() == bt2.getText().toString() && bt2.getText().toString() == bt3.getText().toString() && bt1.getText().toString() != "") || (bt1.getText().toString() == bt5.getText().toString() && bt5.getText().toString() == bt9.getText().toString() && bt1.getText().toString() != "") || (bt3.getText().toString() == bt5.getText().toString() && bt5.getText().toString() == bt7.getText().toString() && bt3.getText().toString() != "") || (bt1.getText().toString() == bt4.getText().toString() && bt4.getText().toString() == bt7.getText().toString() && bt1.getText().toString() != "") || (bt4.getText().toString() == bt5.getText().toString() && bt5.getText().toString() == bt6.getText().toString() && bt4.getText().toString() != "") || (bt7.getText() == bt8.getText().toString() && bt8.getText().toString() == bt9.getText().toString() && bt7.getText().toString() != "") || (bt3.getText().toString() == bt6.getText().toString() && bt6.getText().toString() == bt9.getText().toString() && bt3.getText().toString() != "") || (bt2.getText().toString() == bt5.getText().toString() && bt5.getText().toString() == bt8.getText().toString() && bt2.getText().toString() != "")) {
            if (player2 == true && player1 == false) {

                Toast.makeText(gamepage.this, names1 + " IS WINNER", Toast.LENGTH_SHORT).show();
                back();
            } else {
                Toast.makeText(gamepage.this, names2+" IS WINNER", Toast.LENGTH_SHORT).show();
                back();
            }
        } if (i > 8) {
        Toast.makeText(gamepage.this, "DRAW", Toast.LENGTH_SHORT).show();
        back();
    }
    }

    public void back() {

        player1 = false;
        player2 = false;
        i = 0;
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
        Toast.makeText(gamepage.this, names1+" PLEASE START THE GAME", Toast.LENGTH_SHORT).show();
    }

    public void speechinput() {
        Intent i = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        i.putExtra(RecognizerIntent.EXTRA_PROMPT, "SAY SOMETHING");

        startActivityForResult(i, 100);
    }


    public void onActivityResult(int requestcode, int resultcode, Intent i) {
        super.onActivityResult(requestcode, resultcode, i);
        switch (requestcode) {
            case 100:
                if (i != null && resultcode == RESULT_OK) {
                    ArrayList<String> st = i.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    ed.setText(st.get(0));
                    onclick1();

                }
        }
    }

}
