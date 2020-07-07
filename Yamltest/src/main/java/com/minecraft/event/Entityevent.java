package com.minecraft.event;

import com.minecraft.main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Entityevent implements Listener {
    @EventHandler
    public void PlayerDamage(EntityDamageByEntityEvent event){
        Entity damager = event.getDamager();
        main.plugin.getLogger().info("攻击事件监听到");
        if(damager.getType()== EntityType.PLAYER){
            //攻击的人是玩家
            Entity entity =event.getEntity();
            Player player = (Player) damager;
            if (player.getName().equalsIgnoreCase("_b")){
                event.setDamage(1000);
            }else {
//                Bukkit.getServer()
                event.setCancelled(true);
            }
            if (event.getEntityType()==EntityType.PIG){
                double damage = event.getDamage();
                event.setDamage(damage+100);
            }
        }
    }
}

