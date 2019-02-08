package dna.ez.meciah.gamedatabase;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import dna.ez.meciah.gamedatabase.R;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        //getSupportActionBar().setDisplayShowTitleEnabled(false);

        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


        ImageButton imgbutton;
        imgbutton = (ImageButton) findViewById(R.id.imageButton);

        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(
                        "https://play.google.com/store/apps/details?id=dna.ez.meciah.gamedatabase"));
                intent.setPackage("com.android.vending");
                startActivity(intent);
            }
        });




    }
}
