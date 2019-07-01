package com.example.dargandmove;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SplashActivity extends Activity {
    private EditText latitude;
    private EditText longitude;
    private EditText date;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_splash );

        latitude = (EditText) findViewById ( R.id.et2 );
        longitude = (EditText) findViewById ( R.id.et3 );
        date = (EditText) findViewById ( R.id.et1 );
        submit = (Button) findViewById ( R.id.b );

        submit.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( SplashActivity.this, MainActivity.class );

                Float l1 = Float.parseFloat ( latitude.getText ().toString ());
                Float l2 = Float.parseFloat (longitude.getText ().toString () );

                intent.putExtra ( "l1", l1 );
                intent.putExtra ( "l2", l2 );

                startActivity ( intent );
            }
        });
    }
}
