package dna.ez.meciah.gamedatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dna.ez.meciah.gamedatabase.R;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        //getSupportActionBar().setDisplayShowTitleEnabled(false);

        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

    }
}
