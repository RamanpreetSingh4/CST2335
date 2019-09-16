package com.example.androidlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button linearLayoutButton;
    private Button gridLayoutButton;
    private Button relativeLayoutButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayoutButton = (Button)findViewById(R.id.linearLayoutButton);

        linearLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linearIntent = new Intent(MainActivity.this, LinearLayout.class);
                startActivity(linearIntent);
            }
        });


        gridLayoutButton = (Button)findViewById(R.id.gridLayoutButton);

        gridLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gridIntent = new Intent(MainActivity.this, GridLayout.class);
                startActivity(gridIntent);
            }
        });

        relativeLayoutButton = (Button)findViewById(R.id.relativeLayoutButton);
        relativeLayoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent relativeIntent = new Intent(MainActivity.this, RelativeLayout.class);
                startActivity(relativeIntent);
            }
        });





    }
}
