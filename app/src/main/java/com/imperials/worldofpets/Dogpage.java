package com.imperials.worldofpets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Dogpage extends AppCompatActivity {

    ImageButton ib1,ib2,ib3,ib4,ib5,ib6;
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogpage);

        ib1 = (ImageButton)findViewById(R.id.ibboxer);
        ib2 = (ImageButton)findViewById(R.id.ibgermanshepard);
        ib3 = (ImageButton)findViewById(R.id.ibgreatdane);
        ib4 = (ImageButton)findViewById(R.id.iblabrador);
        ib5 = (ImageButton)findViewById(R.id.ibsyberianhusky);
        ib6 = (ImageButton)findViewById(R.id.ibgoldenretriever);

        tv1 = (TextView) findViewById(R.id.tvboxer);
        tv2 = (TextView)findViewById(R.id.tvgermanshepard);
        tv3 = (TextView)findViewById(R.id.tvgreatdane);
        tv4 = (TextView)findViewById(R.id.tvlabrador);
        tv5 = (TextView)findViewById(R.id.tvsyberianhuskey);
        tv6 = (TextView)findViewById(R.id.tvgoldenretriever);
    }

    public void boxer(View v){

        Intent in = new Intent(Dogpage.this, Boxer.class);
        startActivity(in);


    }


    public void germanshepard(View v){

        Intent in = new Intent(Dogpage.this, Germanshepard.class);
        startActivity(in);


    }

    public void greatdane(View v){

        Intent in = new Intent(Dogpage.this, Greatdane.class);
        startActivity(in);


    }

    public void labrador(View v){

        Intent in = new Intent(Dogpage.this, Labrador.class);
        startActivity(in);


    }

    public void syberianhusky(View v){

        Intent in = new Intent(Dogpage.this, Syberianhusky.class);
        startActivity(in);


    }

    public void goldenretriever(View v){

        Intent in = new Intent(Dogpage.this, Goldenretriver.class);
        startActivity(in);


    }


}
