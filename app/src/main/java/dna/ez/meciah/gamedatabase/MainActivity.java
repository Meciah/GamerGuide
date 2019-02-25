package dna.ez.meciah.gamedatabase;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.ExpandableListView;
import android.widget.Switch;

import dna.ez.meciah.gamedatabase.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private static final String PREFS_NAME = "prefs";
    private static final String PREF_DARK_THEME = "dark_theme";

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listhash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SharedPreferences preferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE);
        boolean useDarkTheme = preferences.getBoolean(PREF_DARK_THEME, false);
        if(useDarkTheme) {
            setTheme(R.style.AppTheme_Dark);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ExpandableListView) findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this, listDataHeader, listhash);
        listView.setAdapter(listAdapter);

        Switch toggle = (Switch) findViewById(R.id.theme_switch);
        toggle.setChecked(useDarkTheme);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                toggleTheme(isChecked);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.about:
                Intent about = new Intent(this, AboutActivity.class);
                startActivity(about);

                break;
            case R.id.feedback:
                Intent fb = new Intent(this, FeedbackActivity.class);
                startActivity(fb);
                break;


        }
        return super.onOptionsItemSelected(item);
    }

    private void toggleTheme(boolean darkTheme) {
        SharedPreferences.Editor editor = getSharedPreferences(PREFS_NAME, MODE_PRIVATE).edit();
        editor.putBoolean(PREF_DARK_THEME, darkTheme);
        editor.apply();

        Intent intent = getIntent();
        finish();

        startActivity(intent);
    }






    private void initData() {
        listDataHeader = new ArrayList<>();
        listhash = new HashMap<>();

        listDataHeader.add("Assasins Creed Odyssey");
        listDataHeader.add("Battlefield V");
        listDataHeader.add("Call of Duty BO4");
        listDataHeader.add("CSGO");
        listDataHeader.add("Dark Souls III");
        listDataHeader.add("Destiny 2");
        listDataHeader.add("Dota2");
        listDataHeader.add("Far Cry 5");
        listDataHeader.add("FIFA 19");
        listDataHeader.add("Fortnite");
        listDataHeader.add("God of War");
        listDataHeader.add("GTA V");
        listDataHeader.add("HearthStone");
        listDataHeader.add("League of Legends");
        listDataHeader.add("Madden 2019");
        listDataHeader.add("Minecraft");
        listDataHeader.add("NBA 2019");
        listDataHeader.add("NHL 2019");
        listDataHeader.add("PUBG");
        listDataHeader.add("Overwatch");
        listDataHeader.add("Rainbow 6 Seige");
        listDataHeader.add("Red Dead Redemption II");
        listDataHeader.add("RocketLeague");
        listDataHeader.add("SmashUltimate");
        listDataHeader.add("Super Mario Odyssey");
        listDataHeader.add("Warframe");
        listDataHeader.add("World of Warcraft");

        List<String> asosites = new ArrayList<>();
        asosites.add("Game Site");
        asosites.add("Reddit");
        asosites.add("Forums and Guides");
        List<String> bf5sites = new ArrayList<>();
        bf5sites.add("Game Site");
        bf5sites.add("Reddit");
        bf5sites.add("Guides and Tips");
        List<String> ds3sites = new ArrayList<>();
        ds3sites.add("Steam Link");
        ds3sites.add("Forums, Builds, and Walkthroughs");
        List<String> dest2sites = new ArrayList<>();
        dest2sites.add("Game Site");
        dest2sites.add("Forums");
        dest2sites.add("Guides");
        dest2sites.add("Destiny Item Manager");
        List<String> fc5sites = new ArrayList<>();
        fc5sites.add("Game Site");
        fc5sites.add("Reddit");
        fc5sites.add("Guides");
        List<String> gowsites = new ArrayList<>();
        gowsites.add("Game Site");
        gowsites.add("Forums and Discussions");
        gowsites.add("Gameplay Guides");
        List<String> gtavsites = new ArrayList<>();
        gtavsites.add("Steam Link");
        gtavsites.add("Forums and Discussions");
        gtavsites.add("Singleplayer Guides");
        gtavsites.add("Multiplayer Guides");
        List<String> mad19sites = new ArrayList<>();
        mad19sites.add("Game Site");
        mad19sites.add("Reddit");
        mad19sites.add("Madden School");
        mad19sites.add("Ultimate Team Guide");
        mad19sites.add("Ultimate Team Builing Guide");
        mad19sites.add("IGN Wiki");
        List<String> nhl19sites = new ArrayList<>();
        nhl19sites.add("Game Site");
        nhl19sites.add("Reddit");
        nhl19sites.add("Strategies and Tips");
        nhl19sites.add("Complete Strategy Guide");
        List<String> nba19sites = new ArrayList<>();
        nba19sites.add("Game Site");
        nba19sites.add("Reddit");
        nba19sites.add("Beginner's Guide");
        nba19sites.add("Scoring Guide");
        nba19sites.add("Mega Guide");
        List<String> reddeadsites = new ArrayList<>();
        reddeadsites.add("Game Site");
        reddeadsites.add("Reddit");
        reddeadsites.add("IGN Wiki");
        reddeadsites.add("Beginner's Guide");
        reddeadsites.add("Multiplayer Guide");
        List<String> smosites = new ArrayList<>();
        smosites.add("Game Site");
        smosites.add("Reddit");
        smosites.add("IGN Wiki");
        smosites.add("Polygon Guide");
        List<String> warframesites = new ArrayList<>();
        warframesites.add("Game Site");
        warframesites.add("Reddit");
        warframesites.add("Beginner's Guide");
        warframesites.add("Track Stats");
        warframesites.add("Nexus Stats");


        List<String> csgosites = new ArrayList<>();
        csgosites.add("Reddit");
        csgosites.add("Steam Market");
        csgosites.add("List of All Betting and Trading Sites");

        List<String> RLsites = new ArrayList<>();
        RLsites.add("Reddit");
        RLsites.add("Official Site");
        RLsites.add("Price List and Trading");
        RLsites.add("RL Garage");
        RLsites.add("Buy RocketLeague Items");

        List<String> lolsites = new ArrayList<>();
        lolsites.add("Game Site");
        lolsites.add("Forums and Discussions");
        lolsites.add("Champion and Build Guides");
        lolsites.add("Stat Tracking");



        List<String> fortsites = new ArrayList<>();
        fortsites.add("Epic Games");
        fortsites.add("Forums and Discussions");
        fortsites.add("Guides");
        fortsites.add("Tournaments and Coaching");
        fortsites.add("Fortnite Skins");

        List<String> pubgsites = new ArrayList<>();
        pubgsites.add("Game Site");
        pubgsites.add("Reddit");
        pubgsites.add("Steam Market");
        pubgsites.add("Bet,Trade,Sell PUBG Skins");

        List<String> hssites = new ArrayList<>();
        hssites.add("Game Site");
        hssites.add("Forums and Dicussions");
        hssites.add("Class and Build Guides");
        List<String> owsites = new ArrayList<>();
        owsites.add("Game Site");
        owsites.add("Reddit");
        owsites.add("OverBuff");
        owsites.add("MasterOW");
        owsites.add("OW Tracker");
        List<String> wowsites = new ArrayList<>();
        wowsites.add("Game Site");
        wowsites.add("Reddit");
        wowsites.add("MMO Champion");
        wowsites.add("Noxxic");
        wowsites.add("GamePedia");
        List<String> dotasites = new ArrayList<>();
        dotasites.add("Store Link");
        dotasites.add("Steam Market");
        dotasites.add("Forums and Discussions");
        dotasites.add("Guides and Hero Builds");
        dotasites.add("Dota2 Gambling/Betting");
        List<String> R6sites = new ArrayList<>();
        R6sites.add("Ubisoft Game Page");
        R6sites.add("Reddit");
        R6sites.add("R6Tracker");
        R6sites.add("R6Stats");
        R6sites.add("ESL Gaming");
        List<String> bo4sites = new ArrayList<>();
        bo4sites.add("Forums and Discussions");
        bo4sites.add("Track your BO4 Stats");
        List<String> mcsites = new ArrayList<>();
        mcsites.add("Mojang Site");
        mcsites.add("Reddit");
        mcsites.add("SnapshotMC");
        mcsites.add("9Minecraft");
        mcsites.add("MSPE DL");
        mcsites.add("Learn to Mod");
        List<String> fifasites = new ArrayList<>();
        fifasites.add("EA Game Link");
        fifasites.add("Forums and Discussions");
        fifasites.add("FUT Guides");
        fifasites.add("FUT Stat Tracking");

        List<String> smashsites = new ArrayList<>();
        smashsites.add("Game Site");
        smashsites.add("Reddit");
        smashsites.add("Tier List");
        smashsites.add("IGN Wiki");
        smashsites.add("Guides");


        listhash.put(listDataHeader.get(0), asosites);
        listhash.put(listDataHeader.get(1), bf5sites);
        listhash.put(listDataHeader.get(2), bo4sites);
        listhash.put(listDataHeader.get(3), csgosites);
        listhash.put(listDataHeader.get(4), ds3sites);
        listhash.put(listDataHeader.get(5), dest2sites);
        listhash.put(listDataHeader.get(6), dotasites);
        listhash.put(listDataHeader.get(7), fc5sites);
        listhash.put(listDataHeader.get(8), fifasites);
        listhash.put(listDataHeader.get(9), fortsites);
        listhash.put(listDataHeader.get(10), gowsites);
        listhash.put(listDataHeader.get(11), gtavsites);
        listhash.put(listDataHeader.get(12), hssites);
        listhash.put(listDataHeader.get(13), lolsites);
        listhash.put(listDataHeader.get(14), mad19sites);
        listhash.put(listDataHeader.get(15), mcsites);
        listhash.put(listDataHeader.get(16), nba19sites);
        listhash.put(listDataHeader.get(17), nhl19sites);
        listhash.put(listDataHeader.get(18), pubgsites);
        listhash.put(listDataHeader.get(19), owsites);
        listhash.put(listDataHeader.get(20), R6sites);
        listhash.put(listDataHeader.get(21), reddeadsites);
        listhash.put(listDataHeader.get(22), RLsites);
        listhash.put(listDataHeader.get(23), smashsites);
        listhash.put(listDataHeader.get(24), smosites);
        listhash.put(listDataHeader.get(25), warframesites);
        listhash.put(listDataHeader.get(26), wowsites);


    }
}

