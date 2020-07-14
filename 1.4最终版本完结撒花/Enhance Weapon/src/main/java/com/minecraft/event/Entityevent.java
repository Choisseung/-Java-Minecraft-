package com.minecraft.event;

import com.minecraft.main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Entityevent implements Listener {
    @EventHandler
//    public void PlayerDamage(EntityDamageByEntityEvent event){
//        Entity damager = event.getDamager();
//        main.plugin.getLogger().info("攻击事件监听到");
//        if(damager.getType()== EntityType.PLAYER){
//            //攻击的人是玩家
//            Entity entity =event.getEntity();
//            Player player = (Player) damager;
//            if (player.getName().equalsIgnoreCase("b")){
//                event.setDamage(1000);
//            }else {
////                Bukkit.getServer()
//                event.setCancelled(true);
//            }
//            if (event.getEntityType()==EntityType.PIG){
//                double damage = event.getDamage();
//                event.setDamage(damage+100);
//            }
//        }
//    }

    public void MonsterDeath(EntityDeathEvent e){

        //所有强化石
        ItemStack itemStack1111 = new ItemStack(Material.EMERALD);//青金石块
        ItemMeta itemMeta1111 = itemStack1111.getItemMeta();
        itemMeta1111.setDisplayName("§e普通强化石");
        itemMeta1111.setLore(Arrays.asList("§6§l[功能]","§2提升武器攻击力/装备等级","§e提升15%的强化几率","[§6§l用法]","§2放到熔炉，燃烧武器/装备"));
        itemStack1111.setItemMeta(itemMeta1111);

        ItemStack itemStack2222 = new ItemStack(Material.EMERALD);
        ItemMeta itemMeta2222 = itemStack2222.getItemMeta();
        itemMeta2222.setDisplayName("§d幸运强化石");
        itemMeta2222.setLore(Arrays.asList("§6§l[功能]","§2提升武器攻击力/装备等级","§e提升25%的强化几率","[§6§l用法]","§2放到熔炉，燃烧武器/装备"));
        itemStack2222.setItemMeta(itemMeta2222);


        ItemStack itemStack3333 = new ItemStack(Material.EMERALD);//青金石块
        ItemMeta itemMeta3333 = itemStack3333.getItemMeta();
        itemMeta3333.setDisplayName("§8厄运强化石");
        itemMeta3333.setLore(Arrays.asList("§6§l[功能]", "§2提升武器攻击力/装备等级", "§e提升60%的强化几率", "§8有%50的几率武器碎裂", "[§6§l用法]", "§2放到熔炉，燃烧武器/装备"));
        itemStack3333.setItemMeta(itemMeta3333);


        ItemStack itemStack5555 = new ItemStack(Material.EMERALD);//青金石块
        ItemMeta itemMeta5555 = itemStack5555.getItemMeta();
        itemMeta5555.setDisplayName("§9管理强化石");
        itemMeta5555.setLore(Arrays.asList("§6§l[功能]", "§9直接强化到最高等级", "[§6§l用法]", "§2放到熔炉，燃烧武器/装备"));
        itemStack5555.setItemMeta(itemMeta5555);


        Random random = new Random();
        int gl1 = 20;
        int gl2 = 50;
        int gl3 = 90;
        int gl4 = 95;
        int gl5 = 80;
        int gl6 = 60;
        int gl7 = 45;
        int gl8 = 75;
        int gl9 = 100;
        int gl10 = 55;
        int gl11 = 30;
        int gl12 = 10;
        //牛羊猪马蝙蝠驴狼 蜘蛛 洞穴蜘蛛
        if (e.getEntityType()==EntityType.PIG||e.getEntityType()==EntityType.COW||e.getEntityType()==EntityType.DONKEY||e.getEntityType()==EntityType.BAT||e.getEntityType()==EntityType.CHICKEN||e.getEntityType()==EntityType.SHEEP||e.getEntityType()==EntityType.MUSHROOM_COW||e.getEntityType()==EntityType.WOLF||e.getEntityType()==EntityType.SPIDER||e.getEntityType()==EntityType.CAVE_SPIDER){

            if (gl5 >= random.nextInt(100)) {//获得普通强化石的几率80
                e.getDrops().add(itemStack1111);
            }
            if (gl7 >=random.nextInt(100)){ //获得幸运强化石的几率 45
                e.getDrops().add(itemStack2222);
            }
            if (gl1 >= random.nextInt(100)){ //获得厄运强化石的几率 20
                e.getDrops().add(itemStack3333);
            }
        }

        //爬行者 僵尸 僵尸村民 僵尸猪 骷髅 骷髅马
        if (e.getEntityType()==EntityType.CREEPER||e.getEntityType()==EntityType.ZOMBIE_VILLAGER||e.getEntityType()==EntityType.ZOMBIE||e.getEntityType()==EntityType.PIG_ZOMBIE||e.getEntityType()==EntityType.SKELETON||e.getEntityType()==EntityType.SKELETON_HORSE||e.getEntityType()==EntityType.HUSK){
            if (gl3 >= random.nextInt(100)){//获得普通强化石的几率90
                e.getDrops().add(itemStack1111);
                }
            if (gl6 >=random.nextInt(100)){ //获得幸运强化石的几率 60
                    e.getDrops().add(itemStack2222);
                }
            if (gl7 >= random.nextInt(100)){ //获得厄运强化石的几率 45
                    e.getDrops().add(itemStack5555);
                }

        }

        //恶魂 末影人 蠹虫 末影螨 史莱姆 岩浆史莱姆
        if (e.getEntityType()==EntityType.GHAST||e.getEntityType()==EntityType.ENDERMAN||e.getEntityType()==EntityType.SILVERFISH||e.getEntityType()==EntityType.SLIME){
            if (gl4 >= random.nextInt(100)){//获得普通强化石的几率95
                e.getDrops().add(itemStack1111);
            }
            if (gl8 >=random.nextInt(100)){ //获得幸运强化石的几率 75
                e.getDrops().add(itemStack2222);
            }
            if (gl2 >= random.nextInt(100)){ //获得厄运强化石的几率 50
                e.getDrops().add(itemStack3333);
            }
            if (gl12 >= random.nextInt(100)){ //获得管理强化石的几率 10
                e.getDrops().add(itemStack5555);
            }

        }
        //女巫 水下守卫 远古守卫 烈焰人
        if (e.getEntityType()==EntityType.WITCH||e.getEntityType()==EntityType.GUARDIAN||e.getEntityType()==EntityType.ELDER_GUARDIAN||e.getEntityType()==EntityType.BLAZE){
            if (gl9 >= random.nextInt(100)){//获得普通强化石的几率 100
                e.getDrops().add(itemStack1111);
            }
            if (gl5 >=random.nextInt(100)){ //获得幸运强化石的几率 80
                e.getDrops().add(itemStack2222);
            }
            if (gl6 >= random.nextInt(100)){ //获得厄运强化石的几率 60
                e.getDrops().add(itemStack3333);
            }
            if (gl11 >= random.nextInt(100)){ //获得管理强化石的几率 30
                e.getDrops().add(itemStack5555);
            }

        }
        //末影龙BOSS 凋零BOSS 巨型僵尸
        if (e.getEntityType()==EntityType.ENDER_DRAGON||e.getEntityType()==EntityType.WITHER||e.getEntityType()==EntityType.GIANT){
            if (gl9 >= random.nextInt(100)){//获得普通强化石的几率 100
                e.getDrops().add(itemStack1111);
            }
            if (gl9 >=random.nextInt(100)){ //获得幸运强化石的几率 100
                e.getDrops().add(itemStack2222);
            }
            if (gl3 >= random.nextInt(100)){ //获得厄运强化石的几率 90
                e.getDrops().add(itemStack3333);
            }
            if (gl10 >= random.nextInt(100)){ //获得管理强化石的几率 55
                e.getDrops().add(itemStack5555);
            }
        }


        }



        }











