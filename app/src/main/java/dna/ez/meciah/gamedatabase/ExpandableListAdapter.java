package dna.ez.meciah.gamedatabase;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import dna.ez.meciah.gamedatabase.R;

import java.util.HashMap;
import java.util.List;

public class ExpandableListAdapter extends BaseExpandableListAdapter {
    private Context context;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHashMap;

    public ExpandableListAdapter(Context context, List<String> listDataHeader, HashMap<String, List<String>> listHashMap) {
        this.context = context;
        this.listDataHeader = listDataHeader;
        this.listHashMap = listHashMap;
    }


    @Override
    public int getGroupCount() {
        return listDataHeader.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listHashMap.get(listDataHeader.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listDataHeader.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return listHashMap.get(listDataHeader.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_group, null);
        }

        TextView lblListHeader = (TextView) convertView.findViewById(R.id.lblListHeader);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);
        return convertView;
    }

    @Override
    public View getChildView(final int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        final String childText = (String) getChild(groupPosition, childPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, null);
        }
        TextView txtListChild = (TextView) convertView.findViewById(R.id.lblListItem);
        txtListChild.setTextColor(Color.BLACK);
        txtListChild.setText(childText);


        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (groupPosition == 2) {
                    if (childPosition == 0) {
                        context.startActivity(new Intent(context.getApplicationContext(), BO4Forum.class));
                    }
                    if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), BO4Stats.class));
                    }
                }


                if (groupPosition == 3) {
                    if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/GlobalOffensive/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://steamcommunity.com/market/search?appid=730"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://csbets.org/"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 6) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.steampowered.com/app/570/Dota_2/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://steamcommunity.com/market/search?appid=570"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.joindota.com/en/start"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/DotA2/"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dotabuff.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 5) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://liquipedia.net/dota2/Main_Page"));
                        context.startActivity(i);
                    } else if (childPosition == 6) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dota2.com/international/overview/"));
                        context.startActivity(i);
                    } else if (childPosition == 7) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://csbets.org/dota2-betting-sites"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 8) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.easports.com/fifa"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/FIFA/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.futwiz.com/en/"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://futchief.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.futbin.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 5) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.futhead.com/"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 9) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.epicgames.com/fortnite/en-US/home"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/FortNiteBR/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bestfortnitesettings.com/fortnite-guides/"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://fortniteskins.net/all/"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://fortnitetracker.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 5) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://fortniteintel.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 6) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.u4gm.com/fortnite"));
                        context.startActivity(i);
                    } else if (childPosition == 7) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gamersensei.com/senseis/searches?sort_by=relevance&game=fortnite&page=1"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 12) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://playhearthstone.com/en-us/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/hearthstone/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hearthpwn.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://hsreplay.net/"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vicioussyndicate.com/"));
                        context.startActivity(i);
                    }
                }

                if (groupPosition == 13) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/leagueoflegends/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://na.leagueoflegends.com/en/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://champion.gg/"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mobafire.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://lolcounter.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 5) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://probuilds.net/"));
                        context.startActivity(i);
                    } else if (childPosition == 6) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.fanbyte.com/features/league-of-legends-model-viewer/#W1swLDAsMCwiMjY2IiwwLDBdXQ=="));
                        context.startActivity(i);
                    } else if (childPosition == 7) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lolesports.com/en_US/"));
                        context.startActivity(i);
                    } else if (childPosition == 8) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://lol.gamepedia.com/League_of_Legends_Esports_Wiki"));
                        context.startActivity(i);
                    } else if (childPosition == 9) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.lolskill.net/"));
                        context.startActivity(i);
                    } else if (childPosition == 10) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.surrenderat20.net/"));
                        context.startActivity(i);
                    } else if (childPosition == 11) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nerfplz.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 12) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.leagueofgraphs.com/"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 15) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mojang.com/category/minecraft/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/Minecraft/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://snapshotmc.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.9minecraft.net/"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://mcpedl.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 5) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.learntomod.com/"));
                        context.startActivity(i);
                    }
                }


                if (groupPosition == 18) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pubg.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/PUBATTLEGROUNDS/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://steamcommunity.com/market/search?appid=578080"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pubgsites.com/"));
                        context.startActivity(i);
                    }
                }


                if (groupPosition == 19) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://playoverwatch.com/en-us/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/Overwatch/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.overbuff.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://masteroverwatch.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://overwatchtracker.com/"));
                        context.startActivity(i);
                    }
                }

                if (groupPosition == 20) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.ubi.com/us/tom-clancys-rainbow-six-siege/575ffdbaa3be1633568b4ef6.html?lang=en_US"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/Rainbow6/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://r6.tracker.network/"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://r6stats.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.eslgaming.com/rainbowsix"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 22) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/RocketLeague/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rl.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rocket-league.com/trading"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://rl.insider.gg/"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aoeah.com/rocket-league-items"));
                        context.startActivity(i);
                    }

                }
                if (groupPosition == 23) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.smashbros.com/en_US/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/SmashBrosUltimate/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.eventhubs.com/news/2019/jan/09/jtails-releases-his-most-depth-super-smash-bros-ultimate-tier-list/"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ign.com/games/super-smash-bros-ultimate"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.polygon.com/super-smash-bros-ultimate-guide"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 26) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://worldofwarcraft.com/en-us/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/wow/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mmo-champion.com/content/?"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.noxxic.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wow.gamepedia.com/Wowpedia"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 1) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ea.com/games/battlefield/battlefield-5"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/BattlefieldV/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), BF5guides.class));
                    }
                }
                if (groupPosition == 0) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://assassinscreed.ubisoft.com/game/en-us/home"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/assassinscreed/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), ASOForums.class));
                    }
                }
                if (groupPosition == 4) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.steampowered.com/app/374320/DARK_SOULS_III/"));
                        context.startActivity(i);
                    }
                    else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), DS3Guides.class));
                    }
                }
                if (groupPosition == 5) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.destinythegame.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/destiny2/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://destinyitemmanager.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bungie.net/en/Companion?bru=%252Fen%252FCollections"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.polygon.com/destiny-2-guide-walkthrough"));
                        context.startActivity(i);
                    } else if (childPosition == 5) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pcgamesn.com/destiny-2/destiny-2-class-guide"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 7) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://far-cry.ubisoft.com/game/en-us/home"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/farcry/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ign.com/wikis/far-cry-5"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.polygon.com/far-cry-5-guide"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gamerguides.com/far-cry-5/gameplay/introduction/version-history"));
                        context.startActivity(i);
                    } else if (childPosition == 5) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gamespot.com/gallery/far-cry-5-guide-9-essential-tips-to-know-before-pl/2900-1906/"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 10) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://godofwar.playstation.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/GodofWar/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ign.com/wikis/god-of-war-2018"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ign.com/wikis/god-of-war-2018/God_of_War_Complete_Walkthrough"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.polygon.com/guides/2018/4/19/17212904/god-of-war-guide-walkthrough"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 11) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.steampowered.com/app/271590/Grand_Theft_Auto_V/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/GTAV/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ign.com/wikis/gta-5"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/gtaonline/comments/7ohgg5/the_gta_online_mega_guide/"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.igta5.com/multiplayer"));
                        context.startActivity(i);
                    } else if (childPosition == 5) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ign.com/wikis/gta-5/Walkthrough"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 14) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.easports.com/madden-nfl"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/Madden/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.madden-school.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.gameinformer.com/the-sports-desk/2018/08/13/the-madden-19-ultimate-team-guide"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.usgamer.net/articles/17-12-2018-madden-19-ultimate-team-guide-player-upgrades/improve-your-team"));
                        context.startActivity(i);
                    } else if (childPosition == 5) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ign.com/wikis/madden-nfl-19/Tips_%26_Tricks"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 17) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.easports.com/nhl"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/EA_NHL/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://cheltips.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://realsport101.com/news/sports/nhl/nhl-19-complete-team-strategies-guide-line-strategies-guide-best-team-strategies/"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 16) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nba.2k.com/2k19/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/NBA2k/wiki/2k19"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://realsport101.com/news/sports/nba/nba-2k19-mycareer-tips-and-guide-for-beginners/"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.usgamer.net/articles/18-12-2018-nba-2k19-tips-and-tricks-guide/scoring-points-easily"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://gamingbolt.com/nba-2k19-mega-guide-fast-and-easy-virtual-currency-reaching-level-99-tips-tricks-and-more"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 21) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rockstargames.com/reddeadredemption2/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/reddeadredemption/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ign.com/wikis/red-dead-redemption-2"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.usgamer.net/articles/10-01-2019-red-dead-redemption-2-guide"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.vg247.com/2019/01/10/red-dead-online-guide-tips-tricks/"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 24) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://supermario.nintendo.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/SuperMarioOdyssey/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ign.com/wikis/super-mario-odyssey"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.polygon.com/super-mario-odyssey-guide-walkthrough"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 25) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.warframe.com/landing"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/Warframe/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.polygon.com/guides/2017/12/1/16721024/warframe-beginners-guide"));
                        context.startActivity(i);
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://hub.warframestat.us/"));
                        context.startActivity(i);
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nexus-stats.com/"));
                        context.startActivity(i);
                    }
                }


            }
        });


        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
 }


