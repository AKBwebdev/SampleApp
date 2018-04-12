package com.example.android.sampleapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.example.android.sampleapp.R;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private Button mButtonFirst;    // for fragment onAttach
    private Button mButtonSecond;    // for tiled background
    private Button mButtonThird;    // for various fragments
    private Button mButtonFourth;    // for snackbar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get View references
        mButtonFirst = findViewById(R.id.button_onattach);
        mButtonSecond = findViewById(R.id.button_tiled);
        mButtonThird = findViewById(R.id.button_various);
        mButtonFourth = findViewById(R.id.button_snackbar);

        // set onclick listeners
       setOnClickListeners();
    }

    /**
     * Method to set onclick listeners on buttons
     */
    public void setOnClickListeners() {
        mButtonFirst.setOnClickListener(this);
        mButtonSecond.setOnClickListener(this);
        mButtonThird.setOnClickListener(this);
        mButtonFourth.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_onattach:
                startActivity(new Intent(this, FirstActivity.class));
                break;
            case R.id.button_tiled:
                startActivity(new Intent(this, SecondActivity.class));
                break;
            case R.id.button_various:
                startActivity(new Intent(this, ThirdActivity.class));
                break;
            case R.id.button_snackbar:
                startActivity(new Intent(this, FourthActivity.class));
                break;
        }
    }
}
