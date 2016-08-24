package com.lsukev.highestmountain;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnMountain;
    private TextView txtMountain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMountain = (Button)findViewById(R.id.btnMountain);
        txtMountain = (TextView)findViewById(R.id.txtMountain);

        final String[] mountains = {"Everest", "Kelimanjaro", "Makulu", "Kamet", "Trivor", "K12", "Ultar", "Mana"};

        btnMountain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // handle our events

                // create a random number
                Random rand = new Random();
                int randomNumber = rand.nextInt(mountains.length);

                txtMountain.setText(mountains[randomNumber]);
            }
        });


    }
}
