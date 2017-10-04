package com.imperials.worldofpets;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainPage extends AppCompatActivity {
ImageButton ib1,ib2;
    TextView tv1,tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        ib1 = (ImageButton)findViewById(R.id.imageButton1);
        ib2 = (ImageButton)findViewById(R.id.imageButton2);
        tv1 =  (TextView)findViewById(R.id.textView);
        tv2 =  (TextView)findViewById(R.id.textView2);

    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder adbuilder = new AlertDialog.Builder(MainPage.this);
        adbuilder.setMessage("You are about to exit the application!\nExit?")
                .setCancelable(false)
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .setTitle("Exit!!");
        adbuilder.show();
    }

    public  void care(View v)
    {
        Intent in = new Intent(MainPage.this,MainActivity2.class);
        startActivity(in);

    }


    public  void wiki(View v)
    {
        Intent in = new Intent(MainPage.this,MainActivity.class);
        startActivity(in);

    }


}
