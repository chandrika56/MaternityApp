package com.example.android.maternityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RaActivity extends AppCompatActivity {
    DatabaseReference rootRef,demoRef;
    CheckBox mFirstCheckBox,mSecondCheckBox,mThirdCheckBox,fo,fi,si;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_ra);
        mFirstCheckBox = findViewById(R.id.checkBox);
        mSecondCheckBox = findViewById(R.id.checkBox2);
        mThirdCheckBox = findViewById(R.id.checkBox3);
        fo=findViewById (R.id.checkBox4);
        fi=findViewById (R.id.checkBox5);
        si=findViewById (R.id.checkBox6);
        Button saveButton=findViewById (R.id.button);


        rootRef = FirebaseDatabase.getInstance().getReference();
        //database reference pointing to demo node
        demoRef = rootRef.child("Risk");
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(mFirstCheckBox.isChecked()) {
                    demoRef.child("1").setValue("Bleeding occuring");
                }

                if(mSecondCheckBox.isChecked()) {
                    demoRef.child("2").setValue("A sickle cell Patient");
                }

                if(mThirdCheckBox.isChecked()) {
                    demoRef.child("3").setValue("Abortion happened");
                }
                if(fo.isChecked()) {
                    demoRef.child("4").setValue("Took C-Section");
                }
                if(fi.isChecked()) {
                    demoRef.child("5").setValue("Taken treatment for Infertility");
                }
                if(si.isChecked()) {
                    demoRef.child("6").setValue("3/more abortions");
                }




                Intent interestIntent = new Intent(RaActivity.this, PLActivity.class);
                interestIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(interestIntent);
            }
        });
    }
}
