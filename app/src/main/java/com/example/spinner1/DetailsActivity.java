package com.example.spinner1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsActivity  extends Activity{
    String id = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ImageView iv = findViewById(R.id.imageView);
        TextView tv = findViewById(R.id.textView);

        Intent intent = getIntent();
        id = intent.getStringExtra("carChoice");

        Toast.makeText(getApplicationContext(), "Car id => " + id, Toast.LENGTH_LONG).show();

        if (id.equals("5")) {
            iv.setImageResource(R.drawable.car5);
            String s = "Shelby\n";
            s += "HP 640\n";
            tv.setText(s);
        }

       /* if (id.equals("5") {
            iv.setImageResource(R.drawable.car2);
            tv.append("Mercedes Y \n");
            tv.append("HP 660\n");
        }
        */
    }

}
