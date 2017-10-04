package com.imperials.worldofpets;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
RadioGroup radioGroup;
    RadioButton rb1,rb2,rb3,rb4;
    String choice;
    String name;
    EditText ed1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        ed1 = (EditText)findViewById(R.id.editText2);




        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override

            public void onCheckedChanged(RadioGroup group, int checkedId) {

                // find which radio button is selected

                if(checkedId == R.id.radioButton) {

                    Toast.makeText(getApplicationContext(), "choice: Fish",Toast.LENGTH_SHORT).show();

                    choice = "Fish";

                } else if(checkedId == R.id.radioButton2) {

                    Toast.makeText(getApplicationContext(), "choice: Bird",Toast.LENGTH_SHORT).show();
                    choice = "Bird";

                } else if(checkedId == R.id.radioButton3) {
                    Toast.makeText(getApplicationContext(), "choice: Cat",Toast.LENGTH_SHORT).show();
                    choice = "Cat";

                }

                else {

                    Toast.makeText(getApplicationContext(), "choice: Dog",Toast.LENGTH_SHORT).show();

                    choice = "Dog";

                }

            }



        });

    }

    public void proceed(View v)
    {
        name = ed1.getText().toString();

            Intent in = new Intent(MainActivity2.this,MainActivity3.class);
            startActivity(in);

            Intent i = new Intent(MainActivity2.this,MainActivity3.class);
            Bundle b = new Bundle();

            b.putString("keyname1",choice);
            b.putString("keyname2",name);

            i.putExtras(b);

            startActivity(i);




    }



}
