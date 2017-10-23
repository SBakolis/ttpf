package com.ttpf.sickstatup.tabletoppartyfinder;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class Main extends AppCompatActivity {

    Button FindGroupBtn = (Button)findViewById(R.id.menu_item_1);
    Button HostGroupBtn = (Button)findViewById(R.id.menu_item_2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FindGroupBtn = (Button)findViewById(R.id.menu_item_1);
        HostGroupBtn = (Button)findViewById(R.id.menu_item_2);

        FindGroupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                passToFindGroup();
            }
        });

        HostGroupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                passToHostGroup();
            }
        });

    }

    public void passToFindGroup()
    {
        Intent findGrpActivity = new Intent(this, FindGroup.class);
        startActivity(findGrpActivity);
    }

    public void passToHostGroup()
    {
        Intent hostGrpActivity = new Intent(this, HostGroup.class);
        startActivity(hostGrpActivity);
    }
}
