package com.minecraft.util;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;
import sun.applet.Main;

public class renqiExpansion extends PlaceholderExpansion {
    @Override
    public String getIdentifier() {
        return "renqi";

    }

    @Override
    public String getAuthor() {
        return "ljl";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }
    /*
   Use this method to setup placeholders
   This is somewhat similar to EZPlaceholderhook
    */
    public String onPlaceholderRequest(Player player, String identifier) {


        /*
        Check if the player is online,
        You should do this before doing anything regarding players
         */
        if(player == null){
            return "";
        }

        /*
        %tutorial_name%
        Returns the player name
         */
        //输入人气 可以查看玩家有多少钱 %renqi_renqi%
        if(identifier.equalsIgnoreCase("renqi")){
            return String.valueOf(VaultUtil.seemoney(player.getUniqueId()));
        }
        return null;
    }
}
