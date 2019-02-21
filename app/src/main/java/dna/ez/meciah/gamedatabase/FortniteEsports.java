package dna.ez.meciah.gamedatabase;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FortniteEsports extends AppCompatActivity {

    String[] data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fortnite_esports);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        data = new String[]{"Competitive Home","Esports News","Toornament", "Esports Wiki", "Gamer Sensei", "Pro Boosting", "EloSoar Coaching"};
        final ListView listView = (ListView) findViewById(R.id.fortelist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.listviewtextwhite, data);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(0xFFFFFFFF));
        listView.setDividerHeight(1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String[] links = getResources().getStringArray(R.array.fortniteLink);
                Uri uri = Uri.parse(links[position]);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}