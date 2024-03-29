package com.example.dungeonmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    // References to front-end controls
    ImageView iv_name;
    ImageButton ibtn_race, ibtn_class;
    TextView tv_race, tv_class;
    EditText et_name;
    FrameLayout fl_race;



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_creation);

        ibtn_race = findViewById(R.id.ibtn_race);
        ibtn_class = findViewById(R.id.ibtn_class);
        tv_race = findViewById(R.id.tv_race);
        tv_class = findViewById(R.id.tv_class);
        et_name = findViewById(R.id.et_name);
        fl_race = findViewById(R.id.fl_race);

        ibtn_race.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRacePopup();
            }
        });

        tv_race.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRacePopup();
            }
        });

        ibtn_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "class button clicked", Toast.LENGTH_SHORT).show();
            }
        });

        tv_class.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "class text clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private void openRacePopup(){
        Intent intent = new Intent(MainActivity.this, PopupRace.class);
        startActivity(intent);
    }
}