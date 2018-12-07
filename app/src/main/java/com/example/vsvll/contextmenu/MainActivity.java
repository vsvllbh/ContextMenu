package com.example.vsvll.contextmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        relativeLayout = findViewById(R.id.RelativeLayout);
        textView = findViewById(R.id.TextView);

        registerForContextMenu(textView);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View view, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, view, menuInfo);

        menu.add(0,view.getId(),0,"Yellow");
        menu.add(0,view.getId(),0,"Red");
        menu.add(0,view.getId(),0,"Green");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if(item.getTitle() == "Yellow"){
            relativeLayout.setBackgroundColor(Color.YELLOW);

        }
        else if (item.getTitle() == "Red"){
            relativeLayout.setBackgroundColor(Color.RED);
        }
        else if (item.getTitle() == "Green"){
            relativeLayout.setBackgroundColor(Color.GREEN);
        }

        return true;
    }
}
