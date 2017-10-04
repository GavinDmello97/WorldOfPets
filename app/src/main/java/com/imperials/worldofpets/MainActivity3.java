package com.imperials.worldofpets;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    ImageButton ib1,ib2,ib3,ib4;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ib1 = (ImageButton)findViewById(R.id.imageButton1);
        ib2 = (ImageButton)findViewById(R.id.imageButton2);
        ib3 = (ImageButton)findViewById(R.id.imageButton3);
        ib4 = (ImageButton)findViewById(R.id.imageButton4);

        tv =(TextView)findViewById(R.id.textView1);

        Bundle b = getIntent().getExtras();

        String fname1 = b.getString("keyname1");
        String fname2 = b.getString("keyname2");


        tv.setText(fname2);



    }
    public void food(View v)
    {

        Bundle b = getIntent().getExtras();

        String fname1 = b.getString("keyname1");
        String fname2 = b.getString("keyname2");

       Intent in = new Intent(MainActivity3.this,petfood.class);
        startActivity(in);

        Intent intent = new Intent(MainActivity3.this,petfood.class);
        Bundle bu = new Bundle();

        bu.putString("keyname3",fname1);
        bu.putString("keyname4",fname2);

        intent.putExtras(bu);

        startActivity(intent);

    }

    public void play(View v)
    {

        Intent in = new Intent(MainActivity3.this,petplay.class);
        startActivity(in);

    }

    public void vaccine(View v)
    {

        Intent in = new Intent(MainActivity3.this,petvaccine.class);
        startActivity(in);

    }

    public void toys(View v)
    {

        Intent in = new Intent(MainActivity3.this,pettoys.class);
        startActivity(in);

    }

    @Override
    public void onBackPressed() {
        Intent in = new Intent(MainActivity3.this,MainActivity2.class);
        startActivity(in);
    }
}
