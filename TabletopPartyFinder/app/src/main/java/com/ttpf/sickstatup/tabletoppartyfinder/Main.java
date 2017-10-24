package com.ttpf.sickstatup.tabletoppartyfinder;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;


public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //test

    }

    public void findGroup(View view){
        startActivity(new Intent(Main.this, FindGroup.class));
    }

    public void hostGroup(View view){
        startActivity(new Intent(Main.this, HostGroup.class));
    }
}
