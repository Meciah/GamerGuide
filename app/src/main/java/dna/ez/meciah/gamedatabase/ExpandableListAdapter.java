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
import android.widget.LinearLayout;
import android.widget.TextView;

import dna.ez.meciah.gamedatabase.R;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

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

    //private int[] colors = {Color.parseColor("#b8dbd3"), Color.parseColor("#ffe975"), Color.parseColor("#dbdcff"), Color.parseColor("#f5f5f5"), Color.parseColor("#ccd6dd")};

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String headerTitle = (String) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_group, null);
        }

        if(groupPosition == 0){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.apexlist));
        }
        else if(groupPosition == 1){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.acolist));
        }
        else if(groupPosition == 2){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.bf5list));
        }
        else if(groupPosition == 3){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.bo423));
        }
        else if(groupPosition == 4){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.csgolist));
        }
        else if(groupPosition == 5){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.ds3list));
        }
        else if(groupPosition == 6){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.dest2list));
        }
        else if(groupPosition == 7){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.dota2list));
        }
        else if(groupPosition == 8){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.fc5list));
        }
        else if(groupPosition == 9){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.fifalist));
        }
        else if(groupPosition == 10){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.fortlist));
        }
        else if(groupPosition == 11){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.gowlist));
        }
        else if(groupPosition == 12){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.gtalist));
        }
        else if(groupPosition == 13){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.hslist));
        }
        else if(groupPosition == 14){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.lollist));
        }
        else if(groupPosition == 15){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.maddenlist));
        }
        else if(groupPosition == 16){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.mclist));
        }
        else if(groupPosition == 17){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.nbalist));
        }
        else if(groupPosition == 18){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.pubglist));
        }
        else if(groupPosition == 19){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.owlist));
        }
        else if(groupPosition == 20){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.r6list));
        }
        else if(groupPosition == 21){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.rdlist));
        }
        else if(groupPosition == 22){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.rllist));
        }
        else if(groupPosition == 23){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.smashlist));
        }
        else if(groupPosition == 24){
            convertView.setBackground(convertView.getResources().getDrawable(R.drawable.wowlist));
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
        txtListChild.setLinkTextColor(Color.RED);
        txtListChild.setText(childText);


        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (groupPosition == 0) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ea.com/games/apex-legends"));
                        context.startActivity(i);
                    }
                    if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), ApexForums.class));
                    }
                    if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), ApexGuides.class));
                    }
                    if (childPosition == 3) {
                        context.startActivity(new Intent(context.getApplicationContext(), ApexStats.class));
                    }
                }

                if (groupPosition == 3) {
                    if (childPosition == 0) {
                        context.startActivity(new Intent(context.getApplicationContext(), BO4Forum.class));
                    }
                    if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), BO4Stats.class));
                    }
                }


                if (groupPosition == 4) {
                    if (childPosition == 0) {
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
                if (groupPosition == 7) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.steampowered.com/app/570/Dota_2/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://steamcommunity.com/market/search?appid=570"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), Dota2Forums.class));
                    } else if (childPosition == 3) {
                        context.startActivity(new Intent(context.getApplicationContext(), Dota2Guides.class));
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://csbets.org/dota2-betting-sites"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 9) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.easports.com/fifa"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), FifaForums.class));
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), FifaGuides.class));
                    } else if (childPosition == 3) {
                        context.startActivity(new Intent(context.getApplicationContext(), FifaStats.class));
                    }
                }
                if (groupPosition == 10) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.epicgames.com/fortnite/en-US/home"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), FortniteForums.class));
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), FortniteGuides.class));
                    } else if (childPosition == 3) {
                        context.startActivity(new Intent(context.getApplicationContext(), FortniteEsports.class));
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://skin-tracker.com/fortnite/skins"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 13) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://playhearthstone.com/en-us/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), HSForums.class));
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), HSGuides.class));
                    }
                }

                if (groupPosition == 14) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://leagueoflegends.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), LolForums.class));
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), LolGuides.class));
                    } else if (childPosition == 3) {
                        context.startActivity(new Intent(context.getApplicationContext(), LolStats.class));
                    }
                }
                if (groupPosition == 16) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mojang.com/category/minecraft/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), MinecraftForums.class));
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), MinecraftGuides.class));
                    } else if (childPosition == 3) {
                        context.startActivity(new Intent(context.getApplicationContext(), MinecraftMods.class));
                    }
                }


                if (groupPosition == 18) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pubg.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://steamcommunity.com/market/search?appid=578080"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), PUBGForums.class));
                    } else if (childPosition == 3) {
                        context.startActivity(new Intent(context.getApplicationContext(), PUBGGuides.class));
                    } else if (childPosition == 4) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pubgsites.com/"));
                        context.startActivity(i);
                    }
                }


                if (groupPosition == 19) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://playoverwatch.com/en-us/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), OWForums.class));
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), OWGuides.class));
                    } else if (childPosition == 3) {
                        context.startActivity(new Intent(context.getApplicationContext(), OWStats.class));
                    }
                }

                if (groupPosition == 20) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.ubi.com/us/tom-clancys-rainbow-six-siege/575ffdbaa3be1633568b4ef6.html?lang=en_US"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), R6Forums.class));
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), R6Guides.class));
                    } else if (childPosition == 3) {
                        context.startActivity(new Intent(context.getApplicationContext(), R6Stats.class));
                    }
                }
                if (groupPosition == 22) {
                    if (childPosition == 0) {
                        context.startActivity(new Intent(context.getApplicationContext(), RocketForums.class));
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), RocketGuides.class));
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), RocketTrades.class));
                    }

                }
                if (groupPosition == 23) {
                    if (childPosition == 0) {
                        context.startActivity(new Intent(context.getApplicationContext(), SmashForums.class));
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), SmashGuides.class));
                    }
                }
                if (groupPosition == 24) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://worldofwarcraft.com/en-us/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), WowForums.class));
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), WowGuides.class));
                    }
                }
                if (groupPosition == 2) {
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
                if (groupPosition == 1) {
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
                if (groupPosition == 5) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.steampowered.com/app/374320/DARK_SOULS_III/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), DS3Guides.class));
                    }
                }
                if (groupPosition == 6) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.destinythegame.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), Dest2Forums.class));
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), Dest2Guides.class));
                    } else if (childPosition == 3) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bungie.net/en/Companion?bru=%252Fen%252FCollections"));
                        context.startActivity(i);
                    }
                }
                if (groupPosition == 8) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://far-cry.ubisoft.com/game/en-us/home"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.reddit.com/r/farcry/"));
                        context.startActivity(i);
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), FarCryGuides.class));
                    }
                }
                if (groupPosition == 11) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://godofwar.playstation.com/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), GOWForums.class));
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), GOWGuides.class));
                    }
                }
                if (groupPosition == 12) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.steampowered.com/app/271590/Grand_Theft_Auto_V/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), GTAForums.class));
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), GTASGuides.class));
                    } else if (childPosition == 3) {
                        context.startActivity(new Intent(context.getApplicationContext(), GTAMGuides.class));
                    }
                }
                if (groupPosition == 15) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.easports.com/madden-nfl"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), MaddenForums.class));
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), MaddenGuides.class));
                    }
                }
                if (groupPosition == 17) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://nba.2k.com/2k19/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), NBAForums.class));
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), NBAGuides.class));
                    }
                }
                if (groupPosition == 21) {
                    if (childPosition == 0) {
                        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rockstargames.com/reddeadredemption2/"));
                        context.startActivity(i);
                    } else if (childPosition == 1) {
                        context.startActivity(new Intent(context.getApplicationContext(), RDForums.class));
                    } else if (childPosition == 2) {
                        context.startActivity(new Intent(context.getApplicationContext(), RDSG.class));
                    } else if (childPosition == 3) {
                        context.startActivity(new Intent(context.getApplicationContext(), RDMG.class));
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


