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

public class BO4Stats extends AppCompatActivity {


    String[] data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bo4_stats);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        data = new String[]{"MyCallofDuty","Tracker Network","CODCompStats","COD Tracker"};
        final ListView listView = (ListView)findViewById(R.id.bo4slist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.custom_textview, data);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(0xFFFF0000));
        listView.setDividerHeight(1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String[] links = getResources().getStringArray(R.array.BO4SLink);
                Uri uri = Uri.parse(links[position]);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                //intent.putExtra("key", data[position]);
                startActivity(intent);
            }
        });
    }
}
