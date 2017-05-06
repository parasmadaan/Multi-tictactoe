package com.example.paras.myapplication;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by paras on 29-01-2017.
 */
public class tictactao extends Activity implements View.OnClickListener {
    TextView tv;
        Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;
        int i = 0, a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, j = 0;
String names1="",names2="";
        String et;
        char z = 'd';
        boolean player1 = false;
        boolean player2 = false;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tictactao);
            tv = (TextView) findViewById(R.id.textView);

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


            bt1.setOnClickListener(this);
            bt2.setOnClickListener(this);
            bt3.setOnClickListener(this);
            bt4.setOnClickListener(this);
            bt5.setOnClickListener(this);
            bt6.setOnClickListener(this);
            bt7.setOnClickListener(this);
            bt8.setOnClickListener(this);
            bt9.setOnClickListener(this);
        }

        public void onClick(View v) {
            names1=getIntent().getStringExtra("Player1");
            names2=getIntent().getStringExtra("Player2");
            switch (v.getId()) {
                case R.id.bt1:
                    if (!((Button) v).getText().equals("0") && !((Button) v).getText().equals("x")) {
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
                        break;
                    }
                case R.id.bt2:
                    if (!((Button) v).getText().equals("0") && !((Button) v).getText().equals("x")) {
                        if (player1 == false && player2 == false) {
                            bt2.setText("0");
                            player2 = true;
                            player1 = false;
                            b = 1;
                        } else if (player2 == true && player1 == false) {
                            bt2.setText("x");
                            player1 = false;
                            player2 = false;
                            b = 1;
                        }
                        i++;
                        break;
                    }
                case R.id.bt3:
                    if (!((Button) v).getText().equals("0") && !((Button) v).getText().equals("x")) {
                        if (player1 == false && player2 == false) {
                            bt3.setText("0");
                            player2 = true;
                            player1 = false;
                            c = 1;
                        } else if (player2 == true && player1 == false) {
                            bt3.setText("x");
                            player1 = false;
                            player2 = false;
                            c = 1;
                        }
                        i++;
                        break;
                    }
                case R.id.bt4:
                    if (!((Button) v).getText().equals("0") && !((Button) v).getText().equals("x")) {
                        if (player1 == false && player2 == false) {
                            bt4.setText("0");
                            player2 = true;
                            player1 = false;

                        } else if (player2 == true && player1 == false) {
                            bt4.setText("x");
                            player1 = false;
                            player2 = false;
                            d = 1;
                        }
                        i++;
                        break;
                    }
                case R.id.bt5:
                    if (!((Button) v).getText().equals("0") && !((Button) v).getText().equals("x")) {

                        if (player1 == false && player2 == false) {
                            bt5.setText("0");
                            player2 = true;
                            player1 = false;
                            e = 1;
                        } else if (player2 == true && player1 == false) {
                            bt5.setText("x");
                            player1 = false;
                            player2 = false;
                            e = 1;
                        }
                        i++;
                        break;
                    }
                case R.id.bt6:
                    if (!((Button) v).getText().equals("0") && !((Button) v).getText().equals("x")) {
                        if (player1 == false && player2 == false) {
                            bt6.setText("0");
                            player2 = true;
                            player1 = false;
                            f = 1;
                        } else if (player2 == true && player1 == false) {
                            bt6.setText("x");
                            player1 = false;
                            player2 = false;
                            f = 1;
                        }
                        i++;
                        break;
                    }
                case R.id.bt7:
                    if (!((Button) v).getText().equals("0") && !((Button) v).getText().equals("x")) {
                        if (player1 == false && player2 == false) {
                            bt7.setText("0");
                            player2 = true;
                            player1 = false;
                            g = 1;
                        } else if (player2 == true && player1 == false) {
                            bt7.setText("x");
                            player1 = false;
                            player2 = false;
                            g = 1;

                        }
                        i++;
                        break;
                    }
                case R.id.bt8:
                    if (!((Button) v).getText().equals("0") && !((Button) v).getText().equals("x")) {
                        if (player1 == false && player2 == false) {
                            bt8.setText("0");
                            player2 = true;
                            player1 = false;
                            h = 1;
                        } else if (player2 == true && player1 == false) {
                            bt8.setText("x");
                            player1 = false;
                            player2 = false;
                            h = 1;
                        }
                        i++;
                        break;
                    }
                case R.id.bt9:
                    if (!((Button) v).getText().equals("0") && !((Button) v).getText().equals("x")) {
                        if (player1 == false && player2 == false) {
                            bt9.setText("0");
                            player2 = true;
                            player1 = false;
                            j = 1;
                        } else if (player2 == true && player1 == false) {
                            bt9.setText("x");
                            player1 = false;
                            player2 = false;
                            j = 1;
                        }
                        i++;
                        break;
                    }
            }
            if ((bt1.getText().toString() == bt2.getText().toString() && bt2.getText().toString() == bt3.getText().toString() && bt1.getText().toString() != "") || (bt1.getText().toString() == bt5.getText().toString() && bt5.getText().toString() == bt9.getText().toString() && bt1.getText().toString() != "") || (bt3.getText().toString() == bt5.getText().toString() && bt5.getText().toString() == bt7.getText().toString() && bt3.getText().toString() != "") || (bt1.getText().toString() == bt4.getText().toString() && bt4.getText().toString() == bt7.getText().toString() && bt1.getText().toString() != "") || (bt4.getText().toString() == bt5.getText().toString() && bt5.getText().toString() == bt6.getText().toString() && bt4.getText().toString() != "") || (bt7.getText() == bt8.getText().toString() && bt8.getText().toString() == bt9.getText().toString() && bt7.getText().toString() != "") || (bt3.getText().toString() == bt6.getText().toString() && bt6.getText().toString() == bt9.getText().toString() && bt3.getText().toString() != "") || (bt2.getText().toString() == bt5.getText().toString() && bt5.getText().toString() == bt8.getText().toString() && bt2.getText().toString() != "")) {
                if (player2 == true && player1 == false) {
                    Toast.makeText(this,  names1.toUpperCase()+"IS WINNER", Toast.LENGTH_SHORT).show();
                    back();
                } else {
                    Toast.makeText(this, names2.toUpperCase()+" IS WINNER", Toast.LENGTH_SHORT).show();
                    back();
                }
            } else if (i > 8) {
                Toast.makeText(this, " DRAW", Toast.LENGTH_SHORT).show();
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
            Toast.makeText(this, names1.toUpperCase()+" PLEASE START THE GAME", Toast.LENGTH_SHORT).show();
        }
    }




