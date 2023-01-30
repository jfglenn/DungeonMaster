package com.example.dungeonmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class PopupRace extends AppCompatActivity {

    // References to front-end controls
    RelativeLayout rl_popup_race;
    ImageButton ibtn_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_race);

        rl_popup_race = findViewById(R.id.rl_popup_race);
        ibtn_close = findViewById(R.id.ibtn_close);

        ibtn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(getApplicationContext(), "close clicked", Toast.LENGTH_SHORT).show();
            }
        });

        rl_popup_race.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(PopupRace.this, "clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void closePopup(){
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.popup_race);
        dialog.cancel();
    }
}