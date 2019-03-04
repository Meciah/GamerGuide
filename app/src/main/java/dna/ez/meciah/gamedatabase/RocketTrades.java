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

public class RocketTrades extends AppCompatActivity {

    String[] data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rocket_trades);
        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        data = new String[]{"Rocket Prices", "RLT Prices", "RL Insider", "RL Insider Trades", "RL Garage", "RLTracker.pro", "TraderFlip", "Steam Community Trading", "TradeCentral Discord", "Aoeah", "Lolga", "g2g", "PlayerAuctions", "Mmogah"};
        final ListView listView = (ListView) findViewById(R.id.rltlist);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.custom_textview, data);
        listView.setAdapter(adapter);
        listView.setDivider(new ColorDrawable(0xFFFF0000));
        listView.setDividerHeight(1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String[] links = getResources().getStringArray(R.array.rltLink);
                Uri uri = Uri.parse(links[position]);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}