package com.example.android.maternityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OutcomeActivity extends AppCompatActivity {
Button outcome,followup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_outcome);

        followup=(Button)findViewById (R.id.button3);
        outcome=(Button)findViewById (R.id.button16);

        outcome.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {

                Toast.makeText (getApplicationContext (), "Add outcomes here",Toast.LENGTH_LONG).show ();
            }
        });


        followup.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {

                Toast.makeText (getApplicationContext (), "Add follow up reports here",Toast.LENGTH_LONG).show ();
            }
        });
    }
}
