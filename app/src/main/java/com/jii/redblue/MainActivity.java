package com.jii.redblue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    CardView card;
    Button change;

    String currentColor = "Red";
    Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res = getResources();

        text = findViewById(R.id.displayText);
        card = findViewById(R.id.cardView);
        change = findViewById(R.id.changeBtn);

        change.setOnClickListener(new View.OnClickListener() {
            //            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                switch (currentColor) {
                    case "Blue":
                        currentColor = "Red";
                        text.setText(currentColor);
                        card.setCardBackgroundColor(res.getColor(R.color.red, null));
                        break;
                    case "Red":
                        currentColor = "Blue";
                        text.setText(currentColor);
                        card.setCardBackgroundColor(res.getColor(R.color.blue, null));
                        break;
                    default:
                }
            }
        });

    }
}