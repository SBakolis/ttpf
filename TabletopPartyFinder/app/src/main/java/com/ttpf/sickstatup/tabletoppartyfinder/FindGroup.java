package com.ttpf.sickstatup.tabletoppartyfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FindGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_group);
    }

    public void returnToMain(View view){
        startActivity(new Intent(FindGroup.this, Main.class));
    }
}
