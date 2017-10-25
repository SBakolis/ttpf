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
    public void showPopup(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.options_menu, popup.getMenu());
        popup.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.website:
                Website();
                return true;
            case R.id.tutorial:
                Tutorial();
                return true;
            case R.id.about:
                About();
            default:
                return super.onOptionsItemSelected(item);
        }
    }*/

    public void findGroup(View view){
        startActivity(new Intent(Main.this, FindGroup.class));
    }

    public void hostGroup(View view){
        startActivity(new Intent(Main.this, HostGroup.class));
    }
}