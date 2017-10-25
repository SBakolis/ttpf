package com.ttpf.sickstatup.tabletoppartyfinder;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;


public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle item selection
        switch (item.getItemId()) {
            case R.id.website:

                return true;
            case R.id.about:
                return true;

            case R.id.tutorial:

                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void findGroup(View view){
        startActivity(new Intent(Main.this, FindGroup.class));
    }

    public void hostGroup(View view){
        startActivity(new Intent(Main.this, HostGroup.class));
    }
}
