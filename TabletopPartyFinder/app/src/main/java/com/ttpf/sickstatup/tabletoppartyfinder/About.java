package com.ttpf.sickstatup.tabletoppartyfinder;

/**
 * Created by zapatistas on 10/25/2017.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;


public class About extends Main{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_about);



    }
    public void returnToMain(View view){
        startActivity(new Intent(About.this, Main.class));
    }


}
