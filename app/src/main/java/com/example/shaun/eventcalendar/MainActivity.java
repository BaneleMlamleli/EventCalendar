package com.example.shaun.eventcalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calendar cal = new GregorianCalendar();
        //Toast to display current date
        Toast.makeText(getApplicationContext(), cal.getTime()+"", Toast.LENGTH_LONG).show();
    }

    public void loginBranch(){
        Toast.makeText(getApplicationContext(), "Branch code", Toast.LENGTH_LONG).show();
    }
}
