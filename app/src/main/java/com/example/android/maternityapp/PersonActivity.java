package com.example.android.maternityapp;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;

public class PersonActivity extends AppCompatActivity  {
    DatabaseReference rootRef,demoRef,h;
    Button i,b;

    EditText name,Hn,Age,LMP,Ch;
    private int mYear, mMonth, mDay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_person);
        Button b = findViewById (R.id.button13);
        rootRef = FirebaseDatabase.getInstance ( ).getReference ( );
        //database reference pointing to demo node
        demoRef = rootRef.child ("Pregnant Lady Details").child ("info");
        h = rootRef.child ("Risk").child ("LR Pregnant Women");
        name = findViewById (R.id.editText);
        Hn = findViewById (R.id.editText2);
        Age = findViewById (R.id.editText3);
        LMP = findViewById (R.id.editText4);
        Ch = findViewById (R.id.editText5);


        b.setOnClickListener (v -> {
            String value = name.getText ( ).toString ( );
            String value2 = Hn.getText ( ).toString ( );
            String value4 = Age.getText ( ).toString ( );
            String value3 = LMP.getText ( ).toString ( );
            String value5 = Ch.getText ( ).toString ( );

            demoRef.child (value).child ("Name").setValue (value);
            demoRef.child (value).child ("Husband Name").setValue (value2);
            demoRef.child (value).child ("Age").setValue (value4);
            demoRef.child (value).child ("LMP").setValue (value3);
            demoRef.child (value).child ("Number of children").setValue (value5);

            h.child (value).child ("Name").setValue (value);
            h.child (value).child ("Husband Name").setValue (value2);
            h.child (value).child ("Age").setValue (value4);
            h.child (value).child ("LMP").setValue (value3);
            h.child (value).child ("Number of children").setValue (value5);

            startActivity (new Intent (PersonActivity.this, PLActivity.class));
        });


        }



}