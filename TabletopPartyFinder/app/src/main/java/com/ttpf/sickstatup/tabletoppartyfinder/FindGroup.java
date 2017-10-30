package com.ttpf.sickstatup.tabletoppartyfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class FindGroup extends Main {

   /* CheckBox mondayAvailable = (CheckBox)findViewById(R.id.checkbox_monday);
    CheckBox tuesdayAvailable = (CheckBox)findViewById(R.id.checkbox_tuesday);
    CheckBox wednesdayAvailable = (CheckBox)findViewById(R.id.checkbox_wed);
    CheckBox thursdayAvailable = (CheckBox)findViewById(R.id.checkbox_th);
    CheckBox fridayAvailable = (CheckBox)findViewById(R.id.checkbox_fr);
    CheckBox saturdayAvailable = (CheckBox)findViewById(R.id.checkbox_sa);
    CheckBox sundayAvailable = (CheckBox)findViewById(R.id.checkbox_sun);
    Button findpartyBtn = (Button)findViewById(R.id.findPartyBtn);
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_group);
    }

    public void returnToMain(View view){
        startActivity(new Intent(FindGroup.this, Main.class));
    }
}
