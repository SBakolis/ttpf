package com.ttpf.sickstatup.tabletoppartyfinder;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
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

    }

       @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
         return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.website:

                return true;
            case R.id.tutorial:

                return true;
            case R.id.about:
                About(item);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



    public void About(MenuItem item){
        startActivity(new Intent(Main.this, About.class));
    }
    public void findGroup(View view){
        startActivity(new Intent(Main.this, FindGroup.class));
    }

    public void hostGroup(View view){
        startActivity(new Intent(Main.this, HostGroup.class));
    }


}
