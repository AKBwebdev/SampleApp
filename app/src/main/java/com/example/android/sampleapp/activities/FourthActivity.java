package com.example.android.sampleapp.activities;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import com.example.android.sampleapp.R;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        final CoordinatorLayout coordinatorLayout = findViewById(R.id.coordinator_layout);

        // Simple Snackbar
        Snackbar snackbar = Snackbar
                .make(coordinatorLayout, "This is a Snackbar pop-up", Snackbar.LENGTH_LONG);

        snackbar.show();


        // Snackbar with Action Callback
        /*Snackbar snackbar1 = Snackbar
                .make(coordinatorLayout, "Message deleted", Snackbar.LENGTH_LONG)
                .setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(coordinatorLayout, "Message restored!", Snackbar.LENGTH_LONG);
                        snackbar1.show();
                    }
                });

        snackbar1.show(); */
    }
}
