package com.example.rawal.edureka31;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    leftFrag leftF;
    rightFrag rightF;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        leftF = new leftFrag();
        rightF = new rightFrag();
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add( R.id.rightFrag,rightF ).commit();
        fragmentManager.beginTransaction().add( R.id.leftFrag,leftF ).commit();

    }
}
