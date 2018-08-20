package com.example.android.maternityapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DangerActivity extends AppCompatActivity {
ImageButton i3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_danger);
        i3=(ImageButton)findViewById (R.id.imageButton3);
        i3.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String phone = "9480501650";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
    }
}
