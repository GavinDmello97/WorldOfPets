package com.imperials.worldofpets;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class petfood extends AppCompatActivity {

    ImageView ib;
    String fname11,fname12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petfood);

        ib = (ImageView) findViewById(R.id.imageView4);



       Bundle bu = getIntent().getExtras();

      fname11 = bu.getString("keyname3");
      fname12 = bu.getString("keyname4");

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
        Intent intent = new Intent(petfood.this,MainActivity3.class);
        startActivity(intent);

        Intent i = new Intent(petfood.this,MainActivity3.class);
        Bundle b = new Bundle();

        b.putString("keyname14",fname11);
        b.putString("keyname15",fname12);

        i.putExtras(b);

        startActivity(i);
    }

}
