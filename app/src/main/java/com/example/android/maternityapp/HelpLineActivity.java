package com.example.android.maternityapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HelpLineActivity extends AppCompatActivity {
ImageButton i,i2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_help_line);
        i=(ImageButton)findViewById (R.id.imageButton);
        i2=(ImageButton)findViewById (R.id.imageButton2);
        i.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String phone = "9742817456";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
        i2.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                String phone = "9480501605";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
    }
}
