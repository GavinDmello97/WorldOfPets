package com.imperials.worldofpets;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton img1,img2,img3,img4;
    TextView tv1,tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = (ImageButton)findViewById(R.id.imageButton1);
        img2 = (ImageButton)findViewById(R.id.imageButton2);
        img3 = (ImageButton)findViewById(R.id.imageButton26);
        img4 = (ImageButton)findViewById(R.id.imageButton27);
        tv1 = (TextView)findViewById(R.id.textView1);
        tv2 = (TextView)findViewById(R.id.textView2);


    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder adbuilder = new AlertDialog.Builder(MainActivity.this);
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

    public void dogpage(View v)
    {
        Toast.makeText(MainActivity.this,"We are redirecting you to the dog section for selection",Toast.LENGTH_LONG).show();


                Intent i=new Intent(MainActivity.this,Dogpage.class);
                startActivity(i);

    }

    public void catpage(View v)
    {
        Toast.makeText(MainActivity.this,"We are redirecting you to the cat section for selection",Toast.LENGTH_SHORT).show();


                Intent i=new Intent(MainActivity.this,Catpage.class);
                startActivity(i);

    }

    public void birdpage(View v)
    {
        Toast.makeText(MainActivity.this,"We are redirecting you to the bird section for selection",Toast.LENGTH_SHORT).show();


                Intent i=new Intent(MainActivity.this, Birdpage.class);
                startActivity(i);

    }

    public void fishpage(View v)
    {
        Toast.makeText(MainActivity.this,"We are redirecting you to the fish section for selection",Toast.LENGTH_SHORT).show();


                Intent i=new Intent(MainActivity.this,Fishpage.class);
                startActivity(i);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return true;
    }





}
