package com.example.shaun.eventcalendar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * This is now the master branch
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calendar cal = new GregorianCalendar();
        //Toast to display current date
        Toast.makeText(getApplicationContext(), cal.getTime()+"", Toast.LENGTH_LONG).show();
        login();
    }

    public void login(){
        Toast.makeText(getApplicationContext(), "You logged in successfully", Toast.LENGTH_LONG).show();
        loginBranch();
    }

    public void loginBranch(){
        //Display a toast message
        Toast.makeText(getApplicationContext(), "We are now in the master branch", Toast.LENGTH_LONG).show();
    }
}
