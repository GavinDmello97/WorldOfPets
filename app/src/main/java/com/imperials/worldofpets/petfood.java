package com.imperials.worldofpets;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class petfood extends AppCompatActivity {

    ImageView ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petfood);

        ib = (ImageView) findViewById(R.id.imageView4);



       Bundle bu = getIntent().getExtras();

       String fname11 = bu.getString("keyname3");
       String fname12 = bu.getString("keyname4");

        if(fname11.equals("Dog") ) {

            ib.setImageResource(R.drawable.dogfood);
        }
        else if(fname11.equals("Bird") ) {

            ib.setImageResource(R.drawable.birdfood);
        }
        else if(fname11.equals("Cat") ) {

            ib.setImageResource(R.drawable.catfood);
        }
        else{

            ib.setImageResource(R.drawable.fishfood);
            }



    }

    @Override
    public void onBackPressed() {
        Intent in = new Intent(petfood.this,MainActivity3.class);
        startActivity(in);
    }

}
