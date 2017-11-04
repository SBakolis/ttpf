package com.ttpf.sickstatup.tabletoppartyfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class HostGroup extends Main {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_group);

        Spinner gameSpinner = (Spinner)findViewById(R.id.games_spinner);
        Spinner numberSpinner = (Spinner)findViewById(R.id.player_number_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.tabletop_games,R.layout.spinner_item_layout);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,R.array.number_of_players,R.layout.spinner_item_layout);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        gameSpinner.setAdapter(adapter);
        numberSpinner.setAdapter(adapter2);
    }

    public void returnToMain(View view){
        startActivity(new Intent(HostGroup.this, Main.class));
    }
}
