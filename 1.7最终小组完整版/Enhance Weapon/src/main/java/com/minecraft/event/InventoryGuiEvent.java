package com.minecraft.event;
import com.minecraft.gui.smelterInventory;
import com.minecraft.main;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.Arrays;
import java.util.Random;
import java.lang.*;

public class InventoryGuiEvent implements Listener {

    @EventHandler
    public void InventorysmelterClick(InventoryClickEvent event){

        Inventory inventory = event.getInventory();
        String title = inventory.getTitle();//得到强化熔炉这个容器

        if (title.equalsIgnoreCase(smelterInventory.SmelterGui)){
            HumanEntity whoClicked = event.getWhoClicked();
            Player player = (Player) whoClicked;
            int rawSlot = event.getRawSlot();//获得点击哪个格子事件
            main.plugin.getLogger().info(String.valueOf(rawSlot));


            //所有强化石
            ItemStack itemStack = new ItemStack(Material.EMERALD);//青金石块
            ItemMeta itemMeta = itemStack.getItemMeta();
            itemMeta.setDisplayName("§e普通强化石");
            itemMeta.setLore(Arrays.asList("§6§l[功能]","§2提升武器攻击力/装备等级","§e提升15%的强化几率","[§6§l用法]","§2放到熔炉，燃烧武器/装备"));
            itemStack.setItemMeta(itemMeta);

            ItemStack itemStack1 = new ItemStack(Material.EMERALD);
            ItemMeta itemMeta1 = itemStack1.getItemMeta();
            itemMeta1.setDisplayName("§d幸运强化石");
            itemMeta1.setLore(Arrays.asList("§6§l[功能]","§2提升武器攻击力/装备等级","§e提升25%的强化几率","[§6§l用法]","§2放到熔炉，燃烧武器/装备"));
            itemStack1.setItemMeta(itemMeta1);


            ItemStack itemStack3 = new ItemStack(Material.EMERALD);//青金石块
            ItemMeta itemMeta3 = itemStack3.getItemMeta();
            itemMeta3.setDisplayName("§8厄运强化石");
            itemMeta3.setLore(Arrays.asList("§6§l[功能]", "§2提升武器攻击力/装备等级", "§e提升60%的强化几率", "§8有%50的几率武器碎裂", "[§6§l用法]", "§2放到熔炉，燃烧武器/装备"));
            itemStack3.setItemMeta(itemMeta3);

            ItemStack itemStack4 = new ItemStack(Material.EMERALD);//青金石块
            ItemMeta itemMeta4 = itemStack4.getItemMeta();
            itemMeta4.setDisplayName("§4vip强化石");
            itemMeta4.setLore(Arrays.asList("§6§l[功能]","§2提升武器攻击力/装备等级","§e超高50%的强化几率","§4vip用户专用","[§6§l用法]","§2放到熔炉，燃烧武器/装备"));
            itemStack4.setItemMeta(itemMeta4);


            ItemStack itemStack5 = new ItemStack(Material.EMERALD);//青金石块
            ItemMeta itemMeta5 = itemStack5.getItemMeta();
            itemMeta5.setDisplayName("§9管理强化石");
            itemMeta5.setLore(Arrays.asList("§6§l[功能]", "§9直接强化到最高等级", "[§6§l用法]", "§2放到熔炉，燃烧武器/装备"));
            itemStack5.setItemMeta(itemMeta5);


            //钻石剑：
            ItemStack itemStack01 = new ItemStack(Material.DIAMOND_SWORD);

            ItemStack itemStack02 = new ItemStack(Material.DIAMOND_SWORD);
            itemStack02.addEnchantment(Enchantment.DAMAGE_ALL,1);
            ItemMeta itemMeta02 = itemStack02.getItemMeta();
            itemMeta02.setDisplayName("§e+1钻石剑");
            itemStack02.setItemMeta(itemMeta02);

            ItemStack itemStack03 = new ItemStack(Material.DIAMOND_SWORD);
            itemStack03.addEnchantment(Enchantment.DAMAGE_ALL,2);
            ItemMeta itemMeta03 = itemStack03.getItemMeta();
            itemMeta03.setDisplayName("§e+2钻石剑");
            itemStack03.setItemMeta(itemMeta03);

            ItemStack itemStack04 = new ItemStack(Material.DIAMOND_SWORD);
            itemStack04.addEnchantment(Enchantment.DAMAGE_ALL,3);
            ItemMeta itemMeta04 = itemStack04.getItemMeta();
            itemMeta04.setDisplayName("§e+3钻石剑");
            itemStack04.setItemMeta(itemMeta04);

            ItemStack itemStack05 = new ItemStack(Material.DIAMOND_SWORD);
            itemStack05.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta05 = itemStack05.getItemMeta();
            itemMeta05.setDisplayName("§e+4钻石剑");
            itemStack05.setItemMeta(itemMeta05);


             //钻石斧：
            ItemStack itemStack011 = new ItemStack(Material.DIAMOND_AXE);

            ItemStack itemStack012 = new ItemStack(Material.DIAMOND_AXE);
            itemStack012.addEnchantment(Enchantment.DAMAGE_ALL,1);
            ItemMeta itemMeta012 = itemStack012.getItemMeta();
            itemMeta012.setDisplayName("§e+1钻石斧");
            itemStack012.setItemMeta(itemMeta012);

            ItemStack itemStack013 = new ItemStack(Material.DIAMOND_AXE);
            itemStack013.addEnchantment(Enchantment.DAMAGE_ALL,2);
            ItemMeta itemMeta013 = itemStack013.getItemMeta();
            itemMeta013.setDisplayName("§e+2钻石斧");
            itemStack013.setItemMeta(itemMeta013);

            ItemStack itemStack014 = new ItemStack(Material.DIAMOND_AXE);
            itemStack014.addEnchantment(Enchantment.DAMAGE_ALL,3);
            ItemMeta itemMeta014 = itemStack014.getItemMeta();
            itemMeta014.setDisplayName("§e+3钻石斧");
            itemStack014.setItemMeta(itemMeta014);

            ItemStack itemStack015 = new ItemStack(Material.DIAMOND_AXE);
            itemStack015.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta015 = itemStack015.getItemMeta();
            itemMeta015.setDisplayName("§e+4钻石斧");
            itemStack015.setItemMeta(itemMeta015);

         //金剑
            ItemStack itemStack111 = new ItemStack(Material.GOLD_SWORD);

            ItemStack itemStack112 = new ItemStack(Material.GOLD_SWORD);
            itemStack112.addEnchantment(Enchantment.DAMAGE_ALL,1);
            ItemMeta itemMeta112 = itemStack112.getItemMeta();
            itemMeta112.setDisplayName("§e+1金剑");
            itemStack112.setItemMeta(itemMeta112);

            ItemStack itemStack113 = new ItemStack(Material.GOLD_SWORD);
            itemStack113.addEnchantment(Enchantment.DAMAGE_ALL,2);
            ItemMeta itemMeta113 = itemStack113.getItemMeta();
            itemMeta113.setDisplayName("§e+2金剑");
            itemStack113.setItemMeta(itemMeta113);

            ItemStack itemStack114 = new ItemStack(Material.GOLD_SWORD);
            itemStack114.addEnchantment(Enchantment.DAMAGE_ALL,3);
            ItemMeta itemMeta114 = itemStack114.getItemMeta();
            itemMeta114.setDisplayName("§e+3金剑");
            itemStack114.setItemMeta(itemMeta114);

            ItemStack itemStack115 = new ItemStack(Material.GOLD_SWORD);
            itemStack115.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta115 = itemStack115.getItemMeta();
            itemMeta115.setDisplayName("§e+4金剑");
            itemStack115.setItemMeta(itemMeta115);


            //金斧
            ItemStack itemStack121 = new ItemStack(Material.GOLD_AXE);

            ItemStack itemStack122 = new ItemStack(Material.GOLD_AXE);
            itemStack122.addEnchantment(Enchantment.DAMAGE_ALL,1);
            ItemMeta itemMeta122 = itemStack122.getItemMeta();
            itemMeta122.setDisplayName("§e+1金斧");
            itemStack122.setItemMeta(itemMeta122);

            ItemStack itemStack123 = new ItemStack(Material.GOLD_AXE);
            itemStack123.addEnchantment(Enchantment.DAMAGE_ALL,2);
            ItemMeta itemMeta123 = itemStack123.getItemMeta();
            itemMeta123.setDisplayName("§e+2金斧");
            itemStack123.setItemMeta(itemMeta123);

            ItemStack itemStack124 = new ItemStack(Material.GOLD_AXE);
            itemStack124.addEnchantment(Enchantment.DAMAGE_ALL,3);
            ItemMeta itemMeta124 = itemStack124.getItemMeta();
            itemMeta124.setDisplayName("§e+3金斧");
            itemStack124.setItemMeta(itemMeta124);


            ItemStack itemStack125 = new ItemStack(Material.GOLD_AXE);
            itemStack125.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta125 = itemStack125.getItemMeta();
            itemMeta125.setDisplayName("§e+4金斧");
            itemStack125.setItemMeta(itemMeta125);

            //铁武器
            ItemStack itemStack211 = new ItemStack(Material.IRON_SWORD);

            ItemStack itemStack212 = new ItemStack(Material.IRON_SWORD);
            itemStack212.addEnchantment(Enchantment.DAMAGE_ALL,1);
            ItemMeta itemMeta212 = itemStack212.getItemMeta();
            itemMeta212.setDisplayName("§e+1铁剑");
            itemStack212.setItemMeta(itemMeta212);

            ItemStack itemStack213 = new ItemStack(Material.IRON_SWORD);
            itemStack213.addEnchantment(Enchantment.DAMAGE_ALL,2);
            ItemMeta itemMeta213 = itemStack213.getItemMeta();
            itemMeta213.setDisplayName("§e+2铁剑");
            itemStack213.setItemMeta(itemMeta213);

            ItemStack itemStack214 = new ItemStack(Material.IRON_SWORD);
            itemStack214.addEnchantment(Enchantment.DAMAGE_ALL,3);
            ItemMeta itemMeta214 = itemStack214.getItemMeta();
            itemMeta214.setDisplayName("§e+3铁剑");
            itemStack214.setItemMeta(itemMeta214);

            ItemStack itemStack215 = new ItemStack(Material.IRON_SWORD);
            itemStack215.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta215 = itemStack215.getItemMeta();
            itemMeta215.setDisplayName("§e+4铁剑");
            itemStack215.setItemMeta(itemMeta215);


            //铁斧
            ItemStack itemStack221 = new ItemStack(Material.IRON_AXE);

            ItemStack itemStack222 = new ItemStack(Material.IRON_AXE);
            itemStack222.addEnchantment(Enchantment.DAMAGE_ALL,1);
            ItemMeta itemMeta222 = itemStack222.getItemMeta();
            itemMeta222.setDisplayName("§e+1铁斧");
            itemStack222.setItemMeta(itemMeta222);

            ItemStack itemStack223 = new ItemStack(Material.IRON_AXE);
            itemStack223.addEnchantment(Enchantment.DAMAGE_ALL,2);
            ItemMeta itemMeta223 = itemStack223.getItemMeta();
            itemMeta223.setDisplayName("§e+2铁斧");
            itemStack223.setItemMeta(itemMeta223);

            ItemStack itemStack224 = new ItemStack(Material.IRON_AXE);
            itemStack224.addEnchantment(Enchantment.DAMAGE_ALL,3);
            ItemMeta itemMeta224 = itemStack224.getItemMeta();
            itemMeta224.setDisplayName("§e+3铁斧");
            itemStack224.setItemMeta(itemMeta224);

            ItemStack itemStack225 = new ItemStack(Material.IRON_AXE);
            itemStack225.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta225 = itemStack225.getItemMeta();
            itemMeta225.setDisplayName("§e+4铁斧");
            itemStack225.setItemMeta(itemMeta225);


            //石剑
            ItemStack itemStack231 = new ItemStack(Material.STONE_SWORD);

            ItemStack itemStack232 = new ItemStack(Material.STONE_SWORD);
            itemStack232.addEnchantment(Enchantment.DAMAGE_ALL,1);
            ItemMeta itemMeta232 = itemStack232.getItemMeta();
            itemMeta232.setDisplayName("§e+1石剑");
            itemStack232.setItemMeta(itemMeta232);

            ItemStack itemStack233 = new ItemStack(Material.STONE_SWORD);
            itemStack233.addEnchantment(Enchantment.DAMAGE_ALL,2);
            ItemMeta itemMeta233 = itemStack233.getItemMeta();
            itemMeta233.setDisplayName("§e+2石剑");
            itemStack233.setItemMeta(itemMeta233);

            ItemStack itemStack234 = new ItemStack(Material.STONE_SWORD);
            itemStack234.addEnchantment(Enchantment.DAMAGE_ALL,3);
            ItemMeta itemMeta234 = itemStack234.getItemMeta();
            itemMeta234.setDisplayName("§e+3石剑");
            itemStack234.setItemMeta(itemMeta234);

            ItemStack itemStack235 = new ItemStack(Material.STONE_SWORD);
            itemStack235.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta235 = itemStack235.getItemMeta();
            itemMeta235.setDisplayName("§e+4石剑");
            itemStack235.setItemMeta(itemMeta235);

            //石斧
            ItemStack itemStack241 = new ItemStack(Material.STONE_AXE);

            ItemStack itemStack242 = new ItemStack(Material.STONE_AXE);
            itemStack242.addEnchantment(Enchantment.DAMAGE_ALL,1);
            ItemMeta itemMeta242 = itemStack242.getItemMeta();
            itemMeta242.setDisplayName("§e+1石斧");
            itemStack242.setItemMeta(itemMeta242);

            ItemStack itemStack243 = new ItemStack(Material.STONE_AXE);
            itemStack243.addEnchantment(Enchantment.DAMAGE_ALL,2);
            ItemMeta itemMeta243 = itemStack243.getItemMeta();
            itemMeta243.setDisplayName("§e+2石斧");
            itemStack243.setItemMeta(itemMeta243);

            ItemStack itemStack244 = new ItemStack(Material.STONE_AXE);
            itemStack244.addEnchantment(Enchantment.DAMAGE_ALL,3);
            ItemMeta itemMeta244 = itemStack244.getItemMeta();
            itemMeta244.setDisplayName("§e+3石斧");
            itemStack244.setItemMeta(itemMeta244);

            ItemStack itemStack245 = new ItemStack(Material.STONE_AXE);
            itemStack245.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta245 = itemStack245.getItemMeta();
            itemMeta245.setDisplayName("§e+4石斧");
            itemStack245.setItemMeta(itemMeta245);

            //木剑
            ItemStack itemStack251 = new ItemStack(Material.WOOD_SWORD);

            ItemStack itemStack252 = new ItemStack(Material.WOOD_SWORD);
            itemStack252.addEnchantment(Enchantment.DAMAGE_ALL,1);
            ItemMeta itemMeta252 = itemStack252.getItemMeta();
            itemMeta252.setDisplayName("§e+1木剑");
            itemStack252.setItemMeta(itemMeta252);

            ItemStack itemStack253 = new ItemStack(Material.WOOD_SWORD);
            itemStack253.addEnchantment(Enchantment.DAMAGE_ALL,2);
            ItemMeta itemMeta253 = itemStack253.getItemMeta();
            itemMeta253.setDisplayName("§e+2木剑");
            itemStack253.setItemMeta(itemMeta253);

            ItemStack itemStack254 = new ItemStack(Material.WOOD_SWORD);
            itemStack254.addEnchantment(Enchantment.DAMAGE_ALL,3);
            ItemMeta itemMeta254 = itemStack254.getItemMeta();
            itemMeta254.setDisplayName("§e+3木剑");
            itemStack254.setItemMeta(itemMeta254);

            ItemStack itemStack255 = new ItemStack(Material.WOOD_SWORD);
            itemStack255.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta255 = itemStack255.getItemMeta();
            itemMeta255.setDisplayName("§e+4木剑");
            itemStack255.setItemMeta(itemMeta255);

            //木斧
            ItemStack itemStack261 = new ItemStack(Material.WOOD_AXE);

            ItemStack itemStack262 = new ItemStack(Material.WOOD_AXE);
            itemStack262.addEnchantment(Enchantment.DAMAGE_ALL,1);
            ItemMeta itemMeta262 = itemStack262.getItemMeta();
            itemMeta262.setDisplayName("§e+1木斧");
            itemStack262.setItemMeta(itemMeta262);

            ItemStack itemStack263 = new ItemStack(Material.WOOD_AXE);
            itemStack263.addEnchantment(Enchantment.DAMAGE_ALL,2);
            ItemMeta itemMeta263 = itemStack263.getItemMeta();
            itemMeta263.setDisplayName("§e+2木斧");
            itemStack263.setItemMeta(itemMeta263);


            ItemStack itemStack264 = new ItemStack(Material.WOOD_AXE);
            itemStack264.addEnchantment(Enchantment.DAMAGE_ALL,3);
            ItemMeta itemMeta264 = itemStack264.getItemMeta();
            itemMeta264.setDisplayName("§e+3木斧");
            itemStack264.setItemMeta(itemMeta264);

            ItemStack itemStack265 = new ItemStack(Material.WOOD_AXE);
            itemStack265.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta265 = itemStack265.getItemMeta();
            itemMeta265.setDisplayName("§e+4木斧");
            itemStack265.setItemMeta(itemMeta265);



            if (rawSlot==49){
                //todo 进行强化

                //todo 普通强化石
                if (inventory.contains(itemStack)){
                    Random random = new Random();
                        int gl1 = 80;
                        int gl2 = 65;
                        int gl3 = 35;
                        int gl4 = 25;
                        int gl5 = 10;
                    //钻石剑
                    if (inventory.contains(itemStack01)){
                        if (gl1 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack7 = new ItemStack(Material.DIAMOND_SWORD);
                            ItemMeta itemMeta7 = itemStack7.getItemMeta();
                            itemMeta7.setDisplayName("§e+1钻石剑");
                            itemStack7.setItemMeta(itemMeta7);
                            itemStack7.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack7);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack01);//加进背包
                            player.sendMessage("强化失败");

                        }
                    }
                    if (inventory.contains(itemStack02)){
                        if (gl2 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack8 = new ItemStack(Material.DIAMOND_SWORD);
                            ItemMeta itemMeta8 = itemStack8.getItemMeta();
                            itemMeta8.setDisplayName("§e+2钻石剑");
                            itemStack8.setItemMeta(itemMeta8);
                            itemStack8.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack8);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack02);//加进背包
                            player.sendMessage("强化失败");

                        }
                    }
                    if (inventory.contains(itemStack03)){
                        if (gl3 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack9 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            ItemMeta itemMeta9 = itemStack9.getItemMeta();
                            itemMeta9.setDisplayName("§e+3钻石剑");
                            itemStack9.setItemMeta(itemMeta9);
                            itemStack9.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack9);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack03);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack04)){
                        if (gl4 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack10 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            ItemMeta itemMeta10 = itemStack10.getItemMeta();
                            itemMeta10.setDisplayName("§e+4钻石剑");
                            itemStack10.setItemMeta(itemMeta10);
                            itemStack10.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack10);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack04);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack05)){
                        if (gl5 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack11 = new ItemStack(Material.DIAMOND_SWORD);
                            ItemMeta itemMeta11 = itemStack11.getItemMeta();
                            itemMeta11.setDisplayName("§e+5钻石剑");
                            itemStack11.setItemMeta(itemMeta11);
                            itemStack11.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack11);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //钻石斧
                    if (inventory.contains(itemStack011)){
                        if (gl1 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack12 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta12 = itemStack12.getItemMeta();
                            itemMeta12.setDisplayName("§e+1钻石斧");
                            itemStack12.setItemMeta(itemMeta12);
                            itemStack12.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack12);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack011);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack012)){
                        if (gl2 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack13 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta13 = itemStack13.getItemMeta();
                            itemMeta13.setDisplayName("§e+2钻石斧");
                            itemStack13.setItemMeta(itemMeta13);
                            itemStack13.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack13);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack012);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack013)){
                        if (gl3 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack14 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta14 = itemStack14.getItemMeta();
                            itemMeta14.setDisplayName("§e+3钻石斧");
                            itemStack14.setItemMeta(itemMeta14);
                            itemStack14.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack14);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack013);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack014)){
                        if (gl4 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack15 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta15 = itemStack15.getItemMeta();
                            itemMeta15.setDisplayName("§e+4钻石斧");
                            itemStack15.setItemMeta(itemMeta15);
                            itemStack15.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack15);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack014);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack015)){
                        if (gl5 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack16 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta16 = itemStack16.getItemMeta();
                            itemMeta16.setDisplayName("§e+5钻石斧");
                            itemStack16.setItemMeta(itemMeta16);
                            itemStack16.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack16);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //金剑
                    if (inventory.contains(itemStack111)){
                        inventory.clear(31);
                        inventory.clear(40);
                        if (gl1 >= random.nextInt(100)){
                            ItemStack itemStack27 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta27 = itemStack27.getItemMeta();
                            itemMeta27.setDisplayName("§e+1金剑");
                            itemStack27.setItemMeta(itemMeta27);
                            itemStack27.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack27);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack111);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack112)){
                        if (gl2 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack28 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta28 = itemStack28.getItemMeta();
                            itemMeta28.setDisplayName("§e+2金剑");
                            itemStack28.setItemMeta(itemMeta28);
                            itemStack28.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack28);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack112);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack113)){
                        if (gl3 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack29 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta29 = itemStack29.getItemMeta();
                            itemMeta29.setDisplayName("§e+3金剑");
                            itemStack29.setItemMeta(itemMeta29);
                            itemStack29.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack29);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack113);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack114)){
                        if (gl4 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack30 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta30 = itemStack30.getItemMeta();
                            itemMeta30.setDisplayName("§e+4金剑");
                            itemStack30.setItemMeta(itemMeta30);
                            itemStack30.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack30);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack114);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack115)){
                        if (gl5 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack31 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta31 = itemStack31.getItemMeta();
                            itemMeta31.setDisplayName("§e+5金剑");
                            itemStack31.setItemMeta(itemMeta31);
                            itemStack31.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack31);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //金斧
                    if (inventory.contains(itemStack121)){
                        if (gl1 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack32 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta32 = itemStack32.getItemMeta();
                            itemMeta32.setDisplayName("§e+1金斧");
                            itemStack32.setItemMeta(itemMeta32);
                            itemStack32.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack32);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack121);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack122)){
                        if (gl2 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack33 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta33 = itemStack33.getItemMeta();
                            itemMeta33.setDisplayName("§e+2金斧");
                            itemStack33.setItemMeta(itemMeta33);
                            itemStack33.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack33);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack122);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack123)){
                        if (gl3 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack34 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta34 = itemStack34.getItemMeta();
                            itemMeta34.setDisplayName("§e+3金斧");
                            itemStack34.setItemMeta(itemMeta34);
                            itemStack34.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack34);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack123);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack124)){
                        if (gl4 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack35 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta35 = itemStack35.getItemMeta();
                            itemMeta35.setDisplayName("§e+4金斧");
                            itemStack35.setItemMeta(itemMeta35);
                            itemStack35.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack35);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack124);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack125)){
                        if (gl5 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack36 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta36 = itemStack36.getItemMeta();
                            itemMeta36.setDisplayName("§e+5金斧");
                            itemStack36.setItemMeta(itemMeta36);
                            itemStack36.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack36);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //铁剑
                    if (inventory.contains(itemStack211)){
                        if (gl1 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack47 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta47 = itemStack47.getItemMeta();
                            itemMeta47.setDisplayName("§e+1铁剑");
                            itemStack47.setItemMeta(itemMeta47);
                            itemStack47.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack47);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack211);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack212)){
                        if (gl2 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack48 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta48 = itemStack48.getItemMeta();
                            itemMeta48.setDisplayName("§e+2铁剑");
                            itemStack48.setItemMeta(itemMeta48);
                            itemStack48.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack48);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack212);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack213)){
                        if (gl3 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack49 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta49 = itemStack49.getItemMeta();
                            itemMeta49.setDisplayName("§e+3铁剑");
                            itemStack49.setItemMeta(itemMeta49);
                            itemStack49.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack49);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack213);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack214)){
                        if (gl4 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack50 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta50 = itemStack50.getItemMeta();
                            itemMeta50.setDisplayName("§e+4铁剑");
                            itemStack50.setItemMeta(itemMeta50);
                            itemStack50.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack50);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack214);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack215)){
                        if (gl5 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack51 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta51 = itemStack51.getItemMeta();
                            itemMeta51.setDisplayName("§e+5铁剑");
                            itemStack51.setItemMeta(itemMeta51);
                            itemStack51.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack51);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //铁斧
                    if (inventory.contains(itemStack221)){
                        if (gl1 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack52 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta52 = itemStack52.getItemMeta();
                            itemMeta52.setDisplayName("§e+1铁斧");
                            itemStack52.setItemMeta(itemMeta52);
                            itemStack52.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack52);//加进背包
                            player.sendMessage("§e使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack221);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack222)){
                        if (gl2 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack53 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta53 = itemStack53.getItemMeta();
                            itemMeta53.setDisplayName("§e+2铁斧");
                            itemStack53.setItemMeta(itemMeta53);
                            itemStack53.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack53);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack222);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack223)){
                        if (gl3 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack54 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta54 = itemStack54.getItemMeta();
                            itemMeta54.setDisplayName("§e+3铁斧");
                            itemStack54.setItemMeta(itemMeta54);
                            itemStack54.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack54);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack223);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack224)){
                        if (gl4 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack55 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta55 = itemStack55.getItemMeta();
                            itemMeta55.setDisplayName("§e+4铁斧");
                            itemStack55.setItemMeta(itemMeta55);
                            itemStack55.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack55);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack224);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack225)){
                        if (gl5 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack56 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta56 = itemStack56.getItemMeta();
                            itemMeta56.setDisplayName("§e+5铁斧");
                            itemStack56.setItemMeta(itemMeta56);
                            itemStack56.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack56);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //石剑
                    if (inventory.contains(itemStack231)){
                        if (gl1 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack512 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta512 = itemStack512.getItemMeta();
                            itemMeta512.setDisplayName("§e+1石剑");
                            itemStack512.setItemMeta(itemMeta512);
                            itemStack512.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack512);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack231);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack232)){
                        if (gl2 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack513 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta513 = itemStack513.getItemMeta();
                            itemMeta513.setDisplayName("§e+2石剑");
                            itemStack513.setItemMeta(itemMeta513);
                            itemStack513.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack513);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack232);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack233)){
                        if (gl3 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack514 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta514 = itemStack514.getItemMeta();
                            itemMeta514.setDisplayName("§e+3石剑");
                            itemStack514.setItemMeta(itemMeta514);
                            itemStack514.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack514);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack233);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack234)){
                        if (gl4 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack515 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta515 = itemStack515.getItemMeta();
                            itemMeta515.setDisplayName("§e+4石剑");
                            itemStack515.setItemMeta(itemMeta515);
                            itemStack515.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack515);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack234);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack235)){
                        if (gl5 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack516 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta516 = itemStack516.getItemMeta();
                            itemMeta516.setDisplayName("§e+5石剑");
                            itemStack516.setItemMeta(itemMeta516);
                            itemStack516.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack516);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //石斧
                    if (inventory.contains(itemStack241)){
                        if (gl1 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack522 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta522 = itemStack522.getItemMeta();
                            itemMeta522.setDisplayName("§e+1石斧");
                            itemStack522.setItemMeta(itemMeta522);
                            itemStack522.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack522);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack241);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack242)){
                        if (gl2 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack523 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta523 = itemStack523.getItemMeta();
                            itemMeta523.setDisplayName("§e+2石斧");
                            itemStack523.setItemMeta(itemMeta523);
                            itemStack523.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack523);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack242);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack243)){
                        if (gl3 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack524 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta524 = itemStack524.getItemMeta();
                            itemMeta524.setDisplayName("§e+3石斧");
                            itemStack524.setItemMeta(itemMeta524);
                            itemStack524.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack524);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack243);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack244)){
                        if (gl4 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack525 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta525 = itemStack525.getItemMeta();
                            itemMeta525.setDisplayName("§e+4石斧");
                            itemStack525.setItemMeta(itemMeta525);
                            itemStack525.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack525);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack244);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack245)){
                        if (gl5 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack526 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta526 = itemStack526.getItemMeta();
                            itemMeta526.setDisplayName("§e+5石斧");
                            itemStack526.setItemMeta(itemMeta526);
                            itemStack526.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack526);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //木剑
                    if (inventory.contains(itemStack251)){
                        if (gl1 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack532 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta532 = itemStack532.getItemMeta();
                            itemMeta532.setDisplayName("§e+1木剑");
                            itemStack532.setItemMeta(itemMeta532);
                            itemStack532.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack532);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack251);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack252)){
                        if (gl2 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack533 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta533 = itemStack533.getItemMeta();
                            itemMeta533.setDisplayName("§e+2木剑");
                            itemStack533.setItemMeta(itemMeta533);
                            itemStack533.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack533);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack252);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack253)){
                        if (gl3 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack534 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta534 = itemStack534.getItemMeta();
                            itemMeta534.setDisplayName("§e+3木剑");
                            itemStack534.setItemMeta(itemMeta534);
                            itemStack534.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack534);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack253);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack254)){
                        if (gl4 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack535 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta535 = itemStack535.getItemMeta();
                            itemMeta535.setDisplayName("§e+4木剑");
                            itemStack535.setItemMeta(itemMeta535);
                            itemStack535.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack535);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack254);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack255)){
                        if (gl5 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack536 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta536 = itemStack536.getItemMeta();
                            itemMeta536.setDisplayName("§e+5木剑");
                            itemStack536.setItemMeta(itemMeta536);
                            itemStack536.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack536);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //木斧
                    if (inventory.contains(itemStack261)){
                        if (gl1 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack542 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta542 = itemStack542.getItemMeta();
                            itemMeta542.setDisplayName("§e+1木斧");
                            itemStack542.setItemMeta(itemMeta542);
                            itemStack542.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack542);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack261);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack262)){
                        if (gl2 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack543 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta543 = itemStack543.getItemMeta();
                            itemMeta543.setDisplayName("§e+2木斧");
                            itemStack543.setItemMeta(itemMeta543);
                            itemStack543.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack543);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack262);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack263)){
                        if (gl3 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack544 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta544 = itemStack544.getItemMeta();
                            itemMeta544.setDisplayName("§e+3木斧");
                            itemStack544.setItemMeta(itemMeta544);
                            itemStack544.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack544);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack263);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack264)){
                        if (gl4 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack545 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta545 = itemStack545.getItemMeta();
                            itemMeta545.setDisplayName("§e+4木斧");
                            itemStack545.setItemMeta(itemMeta545);
                            itemStack545.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack545);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack264);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack265)){
                        if (gl5 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack546 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta546 = itemStack546.getItemMeta();
                            itemMeta546.setDisplayName("§e+5木斧");
                            itemStack546.setItemMeta(itemMeta546);
                            itemStack546.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack546);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }
                }

                //todo 幸运强化石
                if (inventory.contains(itemStack1)) {
                    Random random = new Random();
                    int gl11 = 95;
                    int gl21 = 70;
                    int gl31 = 48;
                    int gl41 = 35;
                    int gl51 = 25;
                    //钻石剑
                    if (inventory.contains(itemStack01)) {
                        if (gl11 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack7 = new ItemStack(Material.DIAMOND_SWORD);
                            ItemMeta itemMeta7 = itemStack7.getItemMeta();
                            itemMeta7.setDisplayName("§e+1钻石剑");
                            itemStack7.setItemMeta(itemMeta7);
                            itemStack7.addEnchantment(Enchantment.DAMAGE_ALL, 1);
                            player.getInventory().addItem(itemStack7);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack01);//加进背包
                            player.sendMessage("强化失败");

                        }
                    }
                    if (inventory.contains(itemStack02)) {
                        if (gl21 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack8 = new ItemStack(Material.DIAMOND_SWORD);
                            ItemMeta itemMeta8 = itemStack8.getItemMeta();
                            itemMeta8.setDisplayName("§e+2钻石剑");
                            itemStack8.setItemMeta(itemMeta8);
                            itemStack8.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                            player.getInventory().addItem(itemStack8);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack02);//加进背包
                            player.sendMessage("强化失败");

                        }
                    }
                    if (inventory.contains(itemStack03)) {
                        if (gl31 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack9 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            ItemMeta itemMeta9 = itemStack9.getItemMeta();
                            itemMeta9.setDisplayName("§e+3钻石剑");
                            itemStack9.setItemMeta(itemMeta9);
                            itemStack9.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                            player.getInventory().addItem(itemStack9);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack03);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack04)) {
                        if (gl41 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack10 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            ItemMeta itemMeta10 = itemStack10.getItemMeta();
                            itemMeta10.setDisplayName("§e+4钻石剑");
                            itemStack10.setItemMeta(itemMeta10);
                            itemStack10.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                            player.getInventory().addItem(itemStack10);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack04);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack05)) {
                        if (gl51 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack11 = new ItemStack(Material.DIAMOND_SWORD);
                            ItemMeta itemMeta11 = itemStack11.getItemMeta();
                            itemMeta11.setDisplayName("§e+5钻石剑");
                            itemStack11.setItemMeta(itemMeta11);
                            itemStack11.addEnchantment(Enchantment.DAMAGE_ALL, 5);
                            player.getInventory().addItem(itemStack11);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //钻石斧
                    if (inventory.contains(itemStack011)) {
                        if (gl11 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack12 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta12 = itemStack12.getItemMeta();
                            itemMeta12.setDisplayName("§e+1钻石斧");
                            itemStack12.setItemMeta(itemMeta12);
                            itemStack12.addEnchantment(Enchantment.DAMAGE_ALL, 1);
                            player.getInventory().addItem(itemStack12);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack011);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack012)) {
                        if (gl21 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack13 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta13 = itemStack13.getItemMeta();
                            itemMeta13.setDisplayName("§e+2钻石斧");
                            itemStack13.setItemMeta(itemMeta13);
                            itemStack13.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                            player.getInventory().addItem(itemStack13);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack012);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack013)) {
                        if (gl31 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack14 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta14 = itemStack14.getItemMeta();
                            itemMeta14.setDisplayName("§e+3钻石斧");
                            itemStack14.setItemMeta(itemMeta14);
                            itemStack14.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                            player.getInventory().addItem(itemStack14);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack013);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack014)) {
                        if (gl41 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack15 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta15 = itemStack15.getItemMeta();
                            itemMeta15.setDisplayName("§e+4钻石斧");
                            itemStack15.setItemMeta(itemMeta15);
                            itemStack15.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                            player.getInventory().addItem(itemStack15);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack014);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack015)) {
                        if (gl51 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack16 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta16 = itemStack16.getItemMeta();
                            itemMeta16.setDisplayName("§e+5钻石斧");
                            itemStack16.setItemMeta(itemMeta16);
                            itemStack16.addEnchantment(Enchantment.DAMAGE_ALL, 5);
                            player.getInventory().addItem(itemStack16);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //金剑
                    if (inventory.contains(itemStack111)) {
                        inventory.clear(31);
                        inventory.clear(40);
                        if (gl11 >= random.nextInt(100)) {
                            ItemStack itemStack27 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta27 = itemStack27.getItemMeta();
                            itemMeta27.setDisplayName("§e+1金剑");
                            itemStack27.setItemMeta(itemMeta27);
                            itemStack27.addEnchantment(Enchantment.DAMAGE_ALL, 1);
                            player.getInventory().addItem(itemStack27);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack111);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack112)) {
                        if (gl21 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack28 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta28 = itemStack28.getItemMeta();
                            itemMeta28.setDisplayName("§e+2金剑");
                            itemStack28.setItemMeta(itemMeta28);
                            itemStack28.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                            player.getInventory().addItem(itemStack28);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack112);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack113)) {
                        if (gl31 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack29 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta29 = itemStack29.getItemMeta();
                            itemMeta29.setDisplayName("§e+3金剑");
                            itemStack29.setItemMeta(itemMeta29);
                            itemStack29.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                            player.getInventory().addItem(itemStack29);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack113);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack114)) {
                        if (gl41 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack30 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta30 = itemStack30.getItemMeta();
                            itemMeta30.setDisplayName("§e+4金剑");
                            itemStack30.setItemMeta(itemMeta30);
                            itemStack30.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                            player.getInventory().addItem(itemStack30);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack114);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack115)) {
                        if (gl51 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack31 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta31 = itemStack31.getItemMeta();
                            itemMeta31.setDisplayName("§e+5金剑");
                            itemStack31.setItemMeta(itemMeta31);
                            itemStack31.addEnchantment(Enchantment.DAMAGE_ALL, 5);
                            player.getInventory().addItem(itemStack31);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //金斧
                    if (inventory.contains(itemStack121)) {
                        if (gl11 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack32 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta32 = itemStack32.getItemMeta();
                            itemMeta32.setDisplayName("§e+1金斧");
                            itemStack32.setItemMeta(itemMeta32);
                            itemStack32.addEnchantment(Enchantment.DAMAGE_ALL, 1);
                            player.getInventory().addItem(itemStack32);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack121);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack122)) {
                        if (gl21 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack33 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta33 = itemStack33.getItemMeta();
                            itemMeta33.setDisplayName("§e+2金斧");
                            itemStack33.setItemMeta(itemMeta33);
                            itemStack33.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                            player.getInventory().addItem(itemStack33);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack122);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack123)) {
                        if (gl31 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack34 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta34 = itemStack34.getItemMeta();
                            itemMeta34.setDisplayName("§e+3金斧");
                            itemStack34.setItemMeta(itemMeta34);
                            itemStack34.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                            player.getInventory().addItem(itemStack34);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack123);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack124)) {
                        if (gl41 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack35 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta35 = itemStack35.getItemMeta();
                            itemMeta35.setDisplayName("§e+4金斧");
                            itemStack35.setItemMeta(itemMeta35);
                            itemStack35.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                            player.getInventory().addItem(itemStack35);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack124);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack125)) {
                        if (gl51 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack36 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta36 = itemStack36.getItemMeta();
                            itemMeta36.setDisplayName("§e+5金斧");
                            itemStack36.setItemMeta(itemMeta36);
                            itemStack36.addEnchantment(Enchantment.DAMAGE_ALL, 5);
                            player.getInventory().addItem(itemStack36);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //铁剑
                    if (inventory.contains(itemStack211)) {
                        if (gl11 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack47 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta47 = itemStack47.getItemMeta();
                            itemMeta47.setDisplayName("§e+1铁剑");
                            itemStack47.setItemMeta(itemMeta47);
                            itemStack47.addEnchantment(Enchantment.DAMAGE_ALL, 1);
                            player.getInventory().addItem(itemStack47);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack211);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack212)) {
                        if (gl21 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack48 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta48 = itemStack48.getItemMeta();
                            itemMeta48.setDisplayName("§e+2铁剑");
                            itemStack48.setItemMeta(itemMeta48);
                            itemStack48.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                            player.getInventory().addItem(itemStack48);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack212);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack213)) {
                        if (gl31 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack49 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta49 = itemStack49.getItemMeta();
                            itemMeta49.setDisplayName("§e+3铁剑");
                            itemStack49.setItemMeta(itemMeta49);
                            itemStack49.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                            player.getInventory().addItem(itemStack49);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack213);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack214)) {
                        if (gl41 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack50 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta50 = itemStack50.getItemMeta();
                            itemMeta50.setDisplayName("§e+4铁剑");
                            itemStack50.setItemMeta(itemMeta50);
                            itemStack50.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                            player.getInventory().addItem(itemStack50);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack214);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack215)) {
                        if (gl51 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack51 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta51 = itemStack51.getItemMeta();
                            itemMeta51.setDisplayName("§e+5铁剑");
                            itemStack51.setItemMeta(itemMeta51);
                            itemStack51.addEnchantment(Enchantment.DAMAGE_ALL, 5);
                            player.getInventory().addItem(itemStack51);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //铁斧
                    if (inventory.contains(itemStack221)) {
                        if (gl11 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack52 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta52 = itemStack52.getItemMeta();
                            itemMeta52.setDisplayName("§e+1铁斧");
                            itemStack52.setItemMeta(itemMeta52);
                            itemStack52.addEnchantment(Enchantment.DAMAGE_ALL, 1);
                            player.getInventory().addItem(itemStack52);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack221);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack222)) {
                        if (gl21 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack53 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta53 = itemStack53.getItemMeta();
                            itemMeta53.setDisplayName("§e+2铁斧");
                            itemStack53.setItemMeta(itemMeta53);
                            itemStack53.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                            player.getInventory().addItem(itemStack53);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack222);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack223)) {
                        if (gl31 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack54 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta54 = itemStack54.getItemMeta();
                            itemMeta54.setDisplayName("§e+3铁斧");
                            itemStack54.setItemMeta(itemMeta54);
                            itemStack54.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                            player.getInventory().addItem(itemStack54);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack223);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack224)) {
                        if (gl41 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack55 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta55 = itemStack55.getItemMeta();
                            itemMeta55.setDisplayName("§e+4铁斧");
                            itemStack55.setItemMeta(itemMeta55);
                            itemStack55.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                            player.getInventory().addItem(itemStack55);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack224);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack225)) {
                        if (gl51 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack56 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta56 = itemStack56.getItemMeta();
                            itemMeta56.setDisplayName("§e+5铁斧");
                            itemStack56.setItemMeta(itemMeta56);
                            itemStack56.addEnchantment(Enchantment.DAMAGE_ALL, 5);
                            player.getInventory().addItem(itemStack56);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //石剑
                    if (inventory.contains(itemStack231)) {
                        if (gl11 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack512 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta512 = itemStack512.getItemMeta();
                            itemMeta512.setDisplayName("§e+1石剑");
                            itemStack512.setItemMeta(itemMeta512);
                            itemStack512.addEnchantment(Enchantment.DAMAGE_ALL, 1);
                            player.getInventory().addItem(itemStack512);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack231);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack232)) {
                        if (gl21 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack513 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta513 = itemStack513.getItemMeta();
                            itemMeta513.setDisplayName("§e+2石剑");
                            itemStack513.setItemMeta(itemMeta513);
                            itemStack513.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                            player.getInventory().addItem(itemStack513);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack232);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack233)) {
                        if (gl31 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack514 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta514 = itemStack514.getItemMeta();
                            itemMeta514.setDisplayName("§e+3石剑");
                            itemStack514.setItemMeta(itemMeta514);
                            itemStack514.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                            player.getInventory().addItem(itemStack514);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack233);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack234)) {
                        if (gl41 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack515 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta515 = itemStack515.getItemMeta();
                            itemMeta515.setDisplayName("§e+4石剑");
                            itemStack515.setItemMeta(itemMeta515);
                            itemStack515.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                            player.getInventory().addItem(itemStack515);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack234);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack235)) {
                        if (gl51 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack516 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta516 = itemStack516.getItemMeta();
                            itemMeta516.setDisplayName("§e+5石剑");
                            itemStack516.setItemMeta(itemMeta516);
                            itemStack516.addEnchantment(Enchantment.DAMAGE_ALL, 5);
                            player.getInventory().addItem(itemStack516);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //石斧
                    if (inventory.contains(itemStack241)) {
                        if (gl11 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack522 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta522 = itemStack522.getItemMeta();
                            itemMeta522.setDisplayName("§e+1石斧");
                            itemStack522.setItemMeta(itemMeta522);
                            itemStack522.addEnchantment(Enchantment.DAMAGE_ALL, 1);
                            player.getInventory().addItem(itemStack522);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack241);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack242)) {
                        if (gl21 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack523 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta523 = itemStack523.getItemMeta();
                            itemMeta523.setDisplayName("§e+2石斧");
                            itemStack523.setItemMeta(itemMeta523);
                            itemStack523.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                            player.getInventory().addItem(itemStack523);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack242);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack243)) {
                        if (gl31 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack524 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta524 = itemStack524.getItemMeta();
                            itemMeta524.setDisplayName("§e+3石斧");
                            itemStack524.setItemMeta(itemMeta524);
                            itemStack524.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                            player.getInventory().addItem(itemStack524);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack243);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack244)) {
                        if (gl41 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack525 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta525 = itemStack525.getItemMeta();
                            itemMeta525.setDisplayName("§e+4石斧");
                            itemStack525.setItemMeta(itemMeta525);
                            itemStack525.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                            player.getInventory().addItem(itemStack525);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack244);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack245)) {
                        if (gl51 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack526 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta526 = itemStack526.getItemMeta();
                            itemMeta526.setDisplayName("§e+5石斧");
                            itemStack526.setItemMeta(itemMeta526);
                            itemStack526.addEnchantment(Enchantment.DAMAGE_ALL, 5);
                            player.getInventory().addItem(itemStack526);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //木剑
                    if (inventory.contains(itemStack251)) {
                        if (gl11 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack532 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta532 = itemStack532.getItemMeta();
                            itemMeta532.setDisplayName("§e+1木剑");
                            itemStack532.setItemMeta(itemMeta532);
                            itemStack532.addEnchantment(Enchantment.DAMAGE_ALL, 1);
                            player.getInventory().addItem(itemStack532);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack251);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack252)) {
                        if (gl21 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack533 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta533 = itemStack533.getItemMeta();
                            itemMeta533.setDisplayName("§e+2木剑");
                            itemStack533.setItemMeta(itemMeta533);
                            itemStack533.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                            player.getInventory().addItem(itemStack533);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack252);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack253)) {
                        if (gl31 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack534 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta534 = itemStack534.getItemMeta();
                            itemMeta534.setDisplayName("§e+3木剑");
                            itemStack534.setItemMeta(itemMeta534);
                            itemStack534.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                            player.getInventory().addItem(itemStack534);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack253);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack254)) {
                        if (gl41 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack535 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta535 = itemStack535.getItemMeta();
                            itemMeta535.setDisplayName("§e+4木剑");
                            itemStack535.setItemMeta(itemMeta535);
                            itemStack535.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                            player.getInventory().addItem(itemStack535);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack254);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack255)) {
                        if (gl51 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack536 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta536 = itemStack536.getItemMeta();
                            itemMeta536.setDisplayName("§e+5木剑");
                            itemStack536.setItemMeta(itemMeta536);
                            itemStack536.addEnchantment(Enchantment.DAMAGE_ALL, 5);
                            player.getInventory().addItem(itemStack536);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //木斧
                    if (inventory.contains(itemStack261)) {
                        if (gl11 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack542 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta542 = itemStack542.getItemMeta();
                            itemMeta542.setDisplayName("§e+1木斧");
                            itemStack542.setItemMeta(itemMeta542);
                            itemStack542.addEnchantment(Enchantment.DAMAGE_ALL, 1);
                            player.getInventory().addItem(itemStack542);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack261);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack262)) {
                        if (gl21 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack543 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta543 = itemStack543.getItemMeta();
                            itemMeta543.setDisplayName("§e+2木斧");
                            itemStack543.setItemMeta(itemMeta543);
                            itemStack543.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                            player.getInventory().addItem(itemStack543);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack262);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack263)) {
                        if (gl31 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack544 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta544 = itemStack544.getItemMeta();
                            itemMeta544.setDisplayName("§e+3木斧");
                            itemStack544.setItemMeta(itemMeta544);
                            itemStack544.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                            player.getInventory().addItem(itemStack544);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack263);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack264)) {
                        if (gl41 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack545 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta545 = itemStack545.getItemMeta();
                            itemMeta545.setDisplayName("§e+4木斧");
                            itemStack545.setItemMeta(itemMeta545);
                            itemStack545.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                            player.getInventory().addItem(itemStack545);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack264);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack265)) {
                        if (gl51 >= random.nextInt(100)) {
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack546 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta546 = itemStack546.getItemMeta();
                            itemMeta546.setDisplayName("§e+5木斧");
                            itemStack546.setItemMeta(itemMeta546);
                            itemStack546.addEnchantment(Enchantment.DAMAGE_ALL, 5);
                            player.getInventory().addItem(itemStack546);//加进背包
                            player.sendMessage("§d使用幸运强化石强化成功");
                        } else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }
                }

                //todo 厄运强化石
                if (inventory.contains(itemStack3)){
                    Random random = new Random();
                    int gl12 = 98;
                    int gl22 = 80;
                    int gl32 = 60;
                    int gl42 = 48;
                    int gl52 = 40;

                    //碎裂概率
                    int gl122 = 50;
                    //钻石剑

                    if (inventory.contains(itemStack01)){
                        if (gl12 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack7 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            ItemMeta itemMeta7 = itemStack7.getItemMeta();
                            itemMeta7.setDisplayName("§e+1钻石剑");
                            itemStack7.setItemMeta(itemMeta7);
                            itemStack7.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack7);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack01);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack02)){
                        if (gl22 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack8 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            ItemMeta itemMeta8 = itemStack8.getItemMeta();
                            itemMeta8.setDisplayName("§e+2钻石剑");
                            itemStack8.setItemMeta(itemMeta8);
                            itemStack8.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack8);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack02);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack03)){
                        if (gl32 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack9 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            ItemMeta itemMeta9 = itemStack9.getItemMeta();
                            itemMeta9.setDisplayName("§e+3钻石剑");
                            itemStack9.setItemMeta(itemMeta9);
                            itemStack9.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack9);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack03);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack04)){
                        if (gl42 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack10 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            ItemMeta itemMeta10 = itemStack10.getItemMeta();
                            itemMeta10.setDisplayName("§e+4钻石剑");
                            itemStack10.setItemMeta(itemMeta10);
                            itemStack10.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack10);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack04);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack05)){
                        if (gl52 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack11 = new ItemStack(Material.DIAMOND_SWORD);
                            ItemMeta itemMeta11 = itemStack11.getItemMeta();
                            itemMeta11.setDisplayName("§e+5钻石剑");
                            itemStack11.setItemMeta(itemMeta11);
                            itemStack11.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack11);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack05);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }

                    //钻石斧
                    if (inventory.contains(itemStack011)){
                        if (gl12 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack12 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta12 = itemStack12.getItemMeta();
                            itemMeta12.setDisplayName("§e+1钻石斧");
                            itemStack12.setItemMeta(itemMeta12);
                            itemStack12.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack12);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack011);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack012)){
                        if (gl22 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack13 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta13 = itemStack13.getItemMeta();
                            itemMeta13.setDisplayName("§e+2钻石斧");
                            itemStack13.setItemMeta(itemMeta13);
                            itemStack13.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack13);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack012);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack013)){
                        if (gl32 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack14 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta14 = itemStack14.getItemMeta();
                            itemMeta14.setDisplayName("§e+3钻石斧");
                            itemStack14.setItemMeta(itemMeta14);
                            itemStack14.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack14);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack013);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack014)){
                        if (gl42 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack15 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta15 = itemStack15.getItemMeta();
                            itemMeta15.setDisplayName("§e+4钻石斧");
                            itemStack15.setItemMeta(itemMeta15);
                            itemStack15.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack15);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack014);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack015)){
                        if (gl52 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack16 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta16 = itemStack16.getItemMeta();
                            itemMeta16.setDisplayName("§e+5钻石斧");
                            itemStack16.setItemMeta(itemMeta16);
                            itemStack16.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack16);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack015);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }

                    //金剑
                    if (inventory.contains(itemStack111)){
                        inventory.clear(31);
                        inventory.clear(40);
                        if (gl12 >= random.nextInt(100)){
                            ItemStack itemStack27 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta27 = itemStack27.getItemMeta();
                            itemMeta27.setDisplayName("§e+1金剑");
                            itemStack27.setItemMeta(itemMeta27);
                            itemStack27.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack27);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack111);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack112)){
                        if (gl22 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack28 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta28 = itemStack28.getItemMeta();
                            itemMeta28.setDisplayName("§e+2金剑");
                            itemStack28.setItemMeta(itemMeta28);
                            itemStack28.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack28);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack112);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack113)){
                        if (gl32 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack29 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta29 = itemStack29.getItemMeta();
                            itemMeta29.setDisplayName("§e+3金剑");
                            itemStack29.setItemMeta(itemMeta29);
                            itemStack29.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack29);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack113);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack114)){
                        if (gl42 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack30 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta30 = itemStack30.getItemMeta();
                            itemMeta30.setDisplayName("§e+4金剑");
                            itemStack30.setItemMeta(itemMeta30);
                            itemStack30.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack30);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack114);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack115)){
                        if (gl52 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack31 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta31 = itemStack31.getItemMeta();
                            itemMeta31.setDisplayName("§e+5金剑");
                            itemStack31.setItemMeta(itemMeta31);
                            itemStack31.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack31);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack115);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }

                    //金斧
                    if (inventory.contains(itemStack121)){
                        if (gl12 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack32 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta32 = itemStack32.getItemMeta();
                            itemMeta32.setDisplayName("§e+1金斧");
                            itemStack32.setItemMeta(itemMeta32);
                            itemStack32.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack32);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack121);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack122)){
                        if (gl22 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack33 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta33 = itemStack33.getItemMeta();
                            itemMeta33.setDisplayName("§e+2金斧");
                            itemStack33.setItemMeta(itemMeta33);
                            itemStack33.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack33);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack122);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack123)){
                        if (gl32 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack34 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta34 = itemStack34.getItemMeta();
                            itemMeta34.setDisplayName("§e+3金斧");
                            itemStack34.setItemMeta(itemMeta34);
                            itemStack34.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack34);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack123);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack124)){
                        if (gl42 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack35 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta35 = itemStack35.getItemMeta();
                            itemMeta35.setDisplayName("§e+4金斧");
                            itemStack35.setItemMeta(itemMeta35);
                            itemStack35.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack35);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack124);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack125)){
                        if (gl52 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack36 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta36 = itemStack36.getItemMeta();
                            itemMeta36.setDisplayName("§e+5金斧");
                            itemStack36.setItemMeta(itemMeta36);
                            itemStack36.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack36);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack125);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }

                    //铁剑
                    if (inventory.contains(itemStack211)){
                        if (gl12 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack47 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta47 = itemStack47.getItemMeta();
                            itemMeta47.setDisplayName("§e+1铁剑");
                            itemStack47.setItemMeta(itemMeta47);
                            itemStack47.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack47);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack211);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack212)){
                        if (gl22 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack48 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta48 = itemStack48.getItemMeta();
                            itemMeta48.setDisplayName("§e+2铁剑");
                            itemStack48.setItemMeta(itemMeta48);
                            itemStack48.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack48);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack212);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack213)){
                        if (gl32 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack49 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta49 = itemStack49.getItemMeta();
                            itemMeta49.setDisplayName("§e+3铁剑");
                            itemStack49.setItemMeta(itemMeta49);
                            itemStack49.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack49);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack213);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack214)){
                        if (gl42 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack50 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta50 = itemStack50.getItemMeta();
                            itemMeta50.setDisplayName("§e+4铁剑");
                            itemStack50.setItemMeta(itemMeta50);
                            itemStack50.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack50);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack214);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack215)){
                        if (gl52 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack51 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta51 = itemStack51.getItemMeta();
                            itemMeta51.setDisplayName("§e+5铁剑");
                            itemStack51.setItemMeta(itemMeta51);
                            itemStack51.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack51);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack215);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }

                    //铁斧
                    if (inventory.contains(itemStack221)){
                        if (gl12 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack52 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta52 = itemStack52.getItemMeta();
                            itemMeta52.setDisplayName("§e+1铁斧");
                            itemStack52.setItemMeta(itemMeta52);
                            itemStack52.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack52);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack221);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack222)){
                        if (gl22 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack53 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta53 = itemStack53.getItemMeta();
                            itemMeta53.setDisplayName("§e+2铁斧");
                            itemStack53.setItemMeta(itemMeta53);
                            itemStack53.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack53);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack222);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack223)){
                        if (gl32 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack54 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta54 = itemStack54.getItemMeta();
                            itemMeta54.setDisplayName("§e+3铁斧");
                            itemStack54.setItemMeta(itemMeta54);
                            itemStack54.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack54);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack223);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack224)){
                        if (gl42 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack55 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta55 = itemStack55.getItemMeta();
                            itemMeta55.setDisplayName("§e+4铁斧");
                            itemStack55.setItemMeta(itemMeta55);
                            itemStack55.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack55);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack224);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack225)){
                        if (gl52 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack56 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta56 = itemStack56.getItemMeta();
                            itemMeta56.setDisplayName("§e+5铁斧");
                            itemStack56.setItemMeta(itemMeta56);
                            itemStack56.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack56);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack225);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }

                    //石剑
                    if (inventory.contains(itemStack231)){
                        if (gl12 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack512 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta512 = itemStack512.getItemMeta();
                            itemMeta512.setDisplayName("§e+1石剑");
                            itemStack512.setItemMeta(itemMeta512);
                            itemStack512.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack512);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack231);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack232)){
                        if (gl22 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack513 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta513 = itemStack513.getItemMeta();
                            itemMeta513.setDisplayName("§e+2石剑");
                            itemStack513.setItemMeta(itemMeta513);
                            itemStack513.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack513);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack232);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack233)){
                        if (gl32 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack514 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta514 = itemStack514.getItemMeta();
                            itemMeta514.setDisplayName("§e+3石剑");
                            itemStack514.setItemMeta(itemMeta514);
                            itemStack514.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack514);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack233);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack234)){
                        if (gl42 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack515 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta515 = itemStack515.getItemMeta();
                            itemMeta515.setDisplayName("§e+4石剑");
                            itemStack515.setItemMeta(itemMeta515);
                            itemStack515.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack515);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack234);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack235)){
                        if (gl52 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack516 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta516 = itemStack516.getItemMeta();
                            itemMeta516.setDisplayName("§e+5石剑");
                            itemStack516.setItemMeta(itemMeta516);
                            itemStack516.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack516);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack235);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }

                    //石斧
                    if (inventory.contains(itemStack241)){
                        if (gl12 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack522 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta522 = itemStack522.getItemMeta();
                            itemMeta522.setDisplayName("§e+1石斧");
                            itemStack522.setItemMeta(itemMeta522);
                            itemStack522.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack522);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack241);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack242)){
                        if (gl22 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack523 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta523 = itemStack523.getItemMeta();
                            itemMeta523.setDisplayName("§e+2石斧");
                            itemStack523.setItemMeta(itemMeta523);
                            itemStack523.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack523);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack242);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack243)){
                        if (gl32 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack524 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta524 = itemStack524.getItemMeta();
                            itemMeta524.setDisplayName("§e+3石斧");
                            itemStack524.setItemMeta(itemMeta524);
                            itemStack524.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack524);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack243);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack244)){
                        if (gl42 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack525 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta525 = itemStack525.getItemMeta();
                            itemMeta525.setDisplayName("§e+4石斧");
                            itemStack525.setItemMeta(itemMeta525);
                            itemStack525.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack525);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack244);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack245)){
                        if (gl52 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack526 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta526 = itemStack526.getItemMeta();
                            itemMeta526.setDisplayName("§e+5石斧");
                            itemStack526.setItemMeta(itemMeta526);
                            itemStack526.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack526);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack245);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }

                    //木剑
                    if (inventory.contains(itemStack251)){
                        if (gl12 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack532 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta532 = itemStack532.getItemMeta();
                            itemMeta532.setDisplayName("§e+1木剑");
                            itemStack532.setItemMeta(itemMeta532);
                            itemStack532.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack532);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack251);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack252)){
                        if (gl22 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack533 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta533 = itemStack533.getItemMeta();
                            itemMeta533.setDisplayName("§e+2木剑");
                            itemStack533.setItemMeta(itemMeta533);
                            itemStack533.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack533);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack252);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack253)){
                        if (gl32 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack534 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta534 = itemStack534.getItemMeta();
                            itemMeta534.setDisplayName("§e+3木剑");
                            itemStack534.setItemMeta(itemMeta534);
                            itemStack534.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack534);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack253);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack254)){
                        if (gl42 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack535 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta535 = itemStack535.getItemMeta();
                            itemMeta535.setDisplayName("§e+4木剑");
                            itemStack535.setItemMeta(itemMeta535);
                            itemStack535.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack535);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack254);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack255)){
                        if (gl52 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack536 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta536 = itemStack536.getItemMeta();
                            itemMeta536.setDisplayName("§e+5木剑");
                            itemStack536.setItemMeta(itemMeta536);
                            itemStack536.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack536);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack255);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }

                    //木斧
                    if (inventory.contains(itemStack261)){
                        if (gl12 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack542 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta542 = itemStack542.getItemMeta();
                            itemMeta542.setDisplayName("§e+1木斧");
                            itemStack542.setItemMeta(itemMeta542);
                            itemStack542.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack542);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack261);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack262)){
                        if (gl22 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack543 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta543 = itemStack543.getItemMeta();
                            itemMeta543.setDisplayName("§e+2木斧");
                            itemStack543.setItemMeta(itemMeta543);
                            itemStack543.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack543);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack261);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack263)){
                        if (gl32 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack544 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta544 = itemStack544.getItemMeta();
                            itemMeta544.setDisplayName("§e+3木斧");
                            itemStack544.setItemMeta(itemMeta544);
                            itemStack544.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack544);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack263);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack264)){
                        if (gl42 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack545 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta545 = itemStack545.getItemMeta();
                            itemMeta545.setDisplayName("§e+4木斧");
                            itemStack545.setItemMeta(itemMeta545);
                            itemStack545.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack545);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack264);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                    if (inventory.contains(itemStack265)){
                        if (gl52 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack546 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta546 = itemStack546.getItemMeta();
                            itemMeta546.setDisplayName("§e+5木斧");
                            itemStack546.setItemMeta(itemMeta546);
                            itemStack546.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack546);//加进背包
                            player.sendMessage("§8使用厄运强化石强化成功");
                        }
                        else{
                            inventory.clear(31);
                            inventory.clear(40);
                            if (gl122<=random.nextInt(100)){
                                player.sendMessage("强化失败 你的武器碎裂并消失");
                            }else {
                                player.getInventory().addItem(itemStack265);//加进背包
                                player.sendMessage("强化失败");
                            }
                        }
                    }
                }

                //todo vip强化石
                if (inventory.contains(itemStack4)){
                    Random random = new Random();
                    int gl13 = 100;
                    int gl23 = 85;
                    int gl33 = 78;
                    int gl43 = 60;
                    int gl53 = 45;

                    //钻石剑
                    if (inventory.contains(itemStack01)){
                        if (gl13 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack7 = new ItemStack(Material.DIAMOND_SWORD);
                            ItemMeta itemMeta7 = itemStack7.getItemMeta();
                            itemMeta7.setDisplayName("§e+1钻石剑");
                            itemStack7.setItemMeta(itemMeta7);
                            itemStack7.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack7);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack01);//加进背包
                            player.sendMessage("强化失败");

                        }
                    }
                    if (inventory.contains(itemStack02)){
                        if (gl23 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack8 = new ItemStack(Material.DIAMOND_SWORD);
                            ItemMeta itemMeta8 = itemStack8.getItemMeta();
                            itemMeta8.setDisplayName("§e+2钻石剑");
                            itemStack8.setItemMeta(itemMeta8);
                            itemStack8.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack8);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack02);//加进背包
                            player.sendMessage("强化失败");

                        }
                    }
                    if (inventory.contains(itemStack03)){
                        if (gl33 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack9 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            ItemMeta itemMeta9 = itemStack9.getItemMeta();
                            itemMeta9.setDisplayName("§e+3钻石剑");
                            itemStack9.setItemMeta(itemMeta9);
                            itemStack9.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack9);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack03);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack04)){
                        if (gl43 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack10 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            ItemMeta itemMeta10 = itemStack10.getItemMeta();
                            itemMeta10.setDisplayName("§e+4钻石剑");
                            itemStack10.setItemMeta(itemMeta10);
                            itemStack10.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack10);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack04);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack05)){
                        if (gl53 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack11 = new ItemStack(Material.DIAMOND_SWORD);
                            ItemMeta itemMeta11 = itemStack11.getItemMeta();
                            itemMeta11.setDisplayName("§e+5钻石剑");
                            itemStack11.setItemMeta(itemMeta11);
                            itemStack11.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack11);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //钻石斧
                    if (inventory.contains(itemStack011)){
                        if (gl13 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack12 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta12 = itemStack12.getItemMeta();
                            itemMeta12.setDisplayName("§e+1钻石斧");
                            itemStack12.setItemMeta(itemMeta12);
                            itemStack12.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack12);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack011);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack012)){
                        if (gl23 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack13 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta13 = itemStack13.getItemMeta();
                            itemMeta13.setDisplayName("§e+2钻石斧");
                            itemStack13.setItemMeta(itemMeta13);
                            itemStack13.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack13);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack012);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack013)){
                        if (gl33 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack14 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta14 = itemStack14.getItemMeta();
                            itemMeta14.setDisplayName("§e+3钻石斧");
                            itemStack14.setItemMeta(itemMeta14);
                            itemStack14.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack14);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack013);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack014)){
                        if (gl43 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack15 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta15 = itemStack15.getItemMeta();
                            itemMeta15.setDisplayName("§e+4钻石斧");
                            itemStack15.setItemMeta(itemMeta15);
                            itemStack15.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack15);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack014);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack015)){
                        if (gl53 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack16 = new ItemStack(Material.DIAMOND_AXE);
                            ItemMeta itemMeta16 = itemStack16.getItemMeta();
                            itemMeta16.setDisplayName("§e+5钻石斧");
                            itemStack16.setItemMeta(itemMeta16);
                            itemStack16.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack16);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //金剑
                    if (inventory.contains(itemStack111)){
                        inventory.clear(31);
                        inventory.clear(40);
                        if (gl13 >= random.nextInt(100)){
                            ItemStack itemStack27 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta27 = itemStack27.getItemMeta();
                            itemMeta27.setDisplayName("§e+1金剑");
                            itemStack27.setItemMeta(itemMeta27);
                            itemStack27.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack27);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack111);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack112)){
                        if (gl23 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack28 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta28 = itemStack28.getItemMeta();
                            itemMeta28.setDisplayName("§e+2金剑");
                            itemStack28.setItemMeta(itemMeta28);
                            itemStack28.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack28);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack112);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack113)){
                        if (gl33 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack29 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta29 = itemStack29.getItemMeta();
                            itemMeta29.setDisplayName("§e+3金剑");
                            itemStack29.setItemMeta(itemMeta29);
                            itemStack29.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack29);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack113);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack114)){
                        if (gl43 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack30 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta30 = itemStack30.getItemMeta();
                            itemMeta30.setDisplayName("§e+4金剑");
                            itemStack30.setItemMeta(itemMeta30);
                            itemStack30.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack30);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack114);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack115)){
                        if (gl53 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack31 = new ItemStack(Material.GOLD_SWORD);
                            ItemMeta itemMeta31 = itemStack31.getItemMeta();
                            itemMeta31.setDisplayName("§e+5金剑");
                            itemStack31.setItemMeta(itemMeta31);
                            itemStack31.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack31);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //金斧
                    if (inventory.contains(itemStack121)){
                        if (gl13 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack32 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta32 = itemStack32.getItemMeta();
                            itemMeta32.setDisplayName("§e+1金斧");
                            itemStack32.setItemMeta(itemMeta32);
                            itemStack32.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack32);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack121);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack122)){
                        if (gl23 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack33 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta33 = itemStack33.getItemMeta();
                            itemMeta33.setDisplayName("§e+2金斧");
                            itemStack33.setItemMeta(itemMeta33);
                            itemStack33.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack33);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack122);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack123)){
                        if (gl33 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack34 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta34 = itemStack34.getItemMeta();
                            itemMeta34.setDisplayName("§e+3金斧");
                            itemStack34.setItemMeta(itemMeta34);
                            itemStack34.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack34);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack123);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack124)){
                        if (gl43 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack35 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta35 = itemStack35.getItemMeta();
                            itemMeta35.setDisplayName("§e+4金斧");
                            itemStack35.setItemMeta(itemMeta35);
                            itemStack35.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack35);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack124);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack125)){
                        if (gl53 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack36 = new ItemStack(Material.GOLD_AXE);
                            ItemMeta itemMeta36 = itemStack36.getItemMeta();
                            itemMeta36.setDisplayName("§e+5金斧");
                            itemStack36.setItemMeta(itemMeta36);
                            itemStack36.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack36);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //铁剑
                    if (inventory.contains(itemStack211)){
                        if (gl13 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack47 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta47 = itemStack47.getItemMeta();
                            itemMeta47.setDisplayName("§e+1铁剑");
                            itemStack47.setItemMeta(itemMeta47);
                            itemStack47.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack47);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack211);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack212)){
                        if (gl23 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack48 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta48 = itemStack48.getItemMeta();
                            itemMeta48.setDisplayName("§e+2铁剑");
                            itemStack48.setItemMeta(itemMeta48);
                            itemStack48.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack48);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack212);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack213)){
                        if (gl33 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack49 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta49 = itemStack49.getItemMeta();
                            itemMeta49.setDisplayName("§e+3铁剑");
                            itemStack49.setItemMeta(itemMeta49);
                            itemStack49.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack49);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack213);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack214)){
                        if (gl43 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack50 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta50 = itemStack50.getItemMeta();
                            itemMeta50.setDisplayName("§e+4铁剑");
                            itemStack50.setItemMeta(itemMeta50);
                            itemStack50.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack50);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack214);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack215)){
                        if (gl53 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack51 = new ItemStack(Material.IRON_SWORD);
                            ItemMeta itemMeta51 = itemStack51.getItemMeta();
                            itemMeta51.setDisplayName("§e+5铁剑");
                            itemStack51.setItemMeta(itemMeta51);
                            itemStack51.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack51);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //铁斧
                    if (inventory.contains(itemStack221)){
                        if (gl13 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack52 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta52 = itemStack52.getItemMeta();
                            itemMeta52.setDisplayName("§e+1铁斧");
                            itemStack52.setItemMeta(itemMeta52);
                            itemStack52.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack52);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack221);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack222)){
                        if (gl23 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack53 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta53 = itemStack53.getItemMeta();
                            itemMeta53.setDisplayName("§e+2铁斧");
                            itemStack53.setItemMeta(itemMeta53);
                            itemStack53.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack53);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack222);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack223)){
                        if (gl33 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack54 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta54 = itemStack54.getItemMeta();
                            itemMeta54.setDisplayName("§e+3铁斧");
                            itemStack54.setItemMeta(itemMeta54);
                            itemStack54.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack54);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack223);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack224)){
                        if (gl43 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack55 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta55 = itemStack55.getItemMeta();
                            itemMeta55.setDisplayName("§e+4铁斧");
                            itemStack55.setItemMeta(itemMeta55);
                            itemStack55.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack55);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack224);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack225)){
                        if (gl53 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack56 = new ItemStack(Material.IRON_AXE);
                            ItemMeta itemMeta56 = itemStack56.getItemMeta();
                            itemMeta56.setDisplayName("§e+5铁斧");
                            itemStack56.setItemMeta(itemMeta56);
                            itemStack56.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack56);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //石剑
                    if (inventory.contains(itemStack231)){
                        if (gl13 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack512 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta512 = itemStack512.getItemMeta();
                            itemMeta512.setDisplayName("§e+1石剑");
                            itemStack512.setItemMeta(itemMeta512);
                            itemStack512.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack512);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack231);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack232)){
                        if (gl23 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack513 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta513 = itemStack513.getItemMeta();
                            itemMeta513.setDisplayName("§e+2石剑");
                            itemStack513.setItemMeta(itemMeta513);
                            itemStack513.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack513);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack232);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack233)){
                        if (gl33 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack514 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta514 = itemStack514.getItemMeta();
                            itemMeta514.setDisplayName("§e+3石剑");
                            itemStack514.setItemMeta(itemMeta514);
                            itemStack514.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack514);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack233);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack234)){
                        if (gl43 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack515 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta515 = itemStack515.getItemMeta();
                            itemMeta515.setDisplayName("§e+4石剑");
                            itemStack515.setItemMeta(itemMeta515);
                            itemStack515.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack515);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack234);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack235)){
                        if (gl53 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack516 = new ItemStack(Material.STONE_SWORD);
                            ItemMeta itemMeta516 = itemStack516.getItemMeta();
                            itemMeta516.setDisplayName("§e+5石剑");
                            itemStack516.setItemMeta(itemMeta516);
                            itemStack516.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack516);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //石斧
                    if (inventory.contains(itemStack241)){
                        if (gl13>= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack522 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta522 = itemStack522.getItemMeta();
                            itemMeta522.setDisplayName("§e+1石斧");
                            itemStack522.setItemMeta(itemMeta522);
                            itemStack522.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack522);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack241);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack242)){
                        if (gl23 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack523 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta523 = itemStack523.getItemMeta();
                            itemMeta523.setDisplayName("§e+2石斧");
                            itemStack523.setItemMeta(itemMeta523);
                            itemStack523.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack523);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack242);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack243)){
                        if (gl33 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack524 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta524 = itemStack524.getItemMeta();
                            itemMeta524.setDisplayName("§e+3石斧");
                            itemStack524.setItemMeta(itemMeta524);
                            itemStack524.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack524);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack243);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack244)){
                        if (gl43 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack525 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta525 = itemStack525.getItemMeta();
                            itemMeta525.setDisplayName("§e+4石斧");
                            itemStack525.setItemMeta(itemMeta525);
                            itemStack525.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack525);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack244);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack245)){
                        if (gl53 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack526 = new ItemStack(Material.STONE_AXE);
                            ItemMeta itemMeta526 = itemStack526.getItemMeta();
                            itemMeta526.setDisplayName("§e+5石斧");
                            itemStack526.setItemMeta(itemMeta526);
                            itemStack526.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack526);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //木剑
                    if (inventory.contains(itemStack251)){
                        if (gl13 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack532 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta532 = itemStack532.getItemMeta();
                            itemMeta532.setDisplayName("§e+1木剑");
                            itemStack532.setItemMeta(itemMeta532);
                            itemStack532.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack532);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack251);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack252)){
                        if (gl23 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack533 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta533 = itemStack533.getItemMeta();
                            itemMeta533.setDisplayName("§e+2木剑");
                            itemStack533.setItemMeta(itemMeta533);
                            itemStack533.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack533);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack252);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack253)){
                        if (gl33 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack534 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta534 = itemStack534.getItemMeta();
                            itemMeta534.setDisplayName("§e+3木剑");
                            itemStack534.setItemMeta(itemMeta534);
                            itemStack534.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack534);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack253);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack254)){
                        if (gl43 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack535 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta535 = itemStack535.getItemMeta();
                            itemMeta535.setDisplayName("§e+4木剑");
                            itemStack535.setItemMeta(itemMeta535);
                            itemStack535.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack535);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack254);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack255)){
                        if (gl53 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack536 = new ItemStack(Material.WOOD_SWORD);
                            ItemMeta itemMeta536 = itemStack536.getItemMeta();
                            itemMeta536.setDisplayName("§e+5木剑");
                            itemStack536.setItemMeta(itemMeta536);
                            itemStack536.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack536);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //木斧
                    if (inventory.contains(itemStack261)){
                        if (gl13>= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack542 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta542 = itemStack542.getItemMeta();
                            itemMeta542.setDisplayName("§e+1木斧");
                            itemStack542.setItemMeta(itemMeta542);
                            itemStack542.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack542);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack261);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack262)){
                        if (gl23 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack543 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta543 = itemStack543.getItemMeta();
                            itemMeta543.setDisplayName("§e+2木斧");
                            itemStack543.setItemMeta(itemMeta543);
                            itemStack543.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack543);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack262);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack263)){
                        if (gl33 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack544 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta544 = itemStack544.getItemMeta();
                            itemMeta544.setDisplayName("§e+3木斧");
                            itemStack544.setItemMeta(itemMeta544);
                            itemStack544.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack544);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack263);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack264)){
                        if (gl43 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack545 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta545 = itemStack545.getItemMeta();
                            itemMeta545.setDisplayName("§e+4木斧");
                            itemStack545.setItemMeta(itemMeta545);
                            itemStack545.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack545);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack264);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack265)){
                        if (gl53 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack546 = new ItemStack(Material.WOOD_AXE);
                            ItemMeta itemMeta546 = itemStack546.getItemMeta();
                            itemMeta546.setDisplayName("§e+5木斧");
                            itemStack546.setItemMeta(itemMeta546);
                            itemStack546.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack546);//加进背包
                            player.sendMessage("§4使用vip强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }
                }

                //todo 管理员强化石
                if (inventory.contains(itemStack5)){
                    Random random = new Random();
                   int gl14 =100;

                    //钻石剑
                if (inventory.contains(itemStack01)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack7 = new ItemStack(Material.DIAMOND_SWORD);
                        ItemMeta itemMeta7 = itemStack7.getItemMeta();
                        itemMeta7.setDisplayName("§e+1钻石剑");
                        itemStack7.setItemMeta(itemMeta7);
                        itemStack7.addEnchantment(Enchantment.DAMAGE_ALL,1);
                        player.getInventory().addItem(itemStack7);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack02)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack8 = new ItemStack(Material.DIAMOND_SWORD);
                        ItemMeta itemMeta8 = itemStack8.getItemMeta();
                        itemMeta8.setDisplayName("§e+2钻石剑");
                        itemStack8.setItemMeta(itemMeta8);
                        itemStack8.addEnchantment(Enchantment.DAMAGE_ALL,2);
                        player.getInventory().addItem(itemStack8);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack03)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack9 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                        ItemMeta itemMeta9 = itemStack9.getItemMeta();
                        itemMeta9.setDisplayName("§e+3钻石剑");
                        itemStack9.setItemMeta(itemMeta9);
                        itemStack9.addEnchantment(Enchantment.DAMAGE_ALL,3);
                        player.getInventory().addItem(itemStack9);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack04)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack10 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                        ItemMeta itemMeta10 = itemStack10.getItemMeta();
                        itemMeta10.setDisplayName("§e+4钻石剑");
                        itemStack10.setItemMeta(itemMeta10);
                        itemStack10.addEnchantment(Enchantment.DAMAGE_ALL,4);
                        player.getInventory().addItem(itemStack10);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack05)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack11 = new ItemStack(Material.DIAMOND_SWORD);
                        ItemMeta itemMeta11 = itemStack11.getItemMeta();
                        itemMeta11.setDisplayName("§e+5钻石剑");
                        itemStack11.setItemMeta(itemMeta11);
                        itemStack11.addEnchantment(Enchantment.DAMAGE_ALL,5);
                        player.getInventory().addItem(itemStack11);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }

                //钻石斧
                if (inventory.contains(itemStack011)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack12 = new ItemStack(Material.DIAMOND_AXE);
                        ItemMeta itemMeta12 = itemStack12.getItemMeta();
                        itemMeta12.setDisplayName("§e+1钻石斧");
                        itemStack12.setItemMeta(itemMeta12);
                        itemStack12.addEnchantment(Enchantment.DAMAGE_ALL,1);
                        player.getInventory().addItem(itemStack12);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack012)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack13 = new ItemStack(Material.DIAMOND_AXE);
                        ItemMeta itemMeta13 = itemStack13.getItemMeta();
                        itemMeta13.setDisplayName("§e+2钻石斧");
                        itemStack13.setItemMeta(itemMeta13);
                        itemStack13.addEnchantment(Enchantment.DAMAGE_ALL,2);
                        player.getInventory().addItem(itemStack13);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack013)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack14 = new ItemStack(Material.DIAMOND_AXE);
                        ItemMeta itemMeta14 = itemStack14.getItemMeta();
                        itemMeta14.setDisplayName("§e+3钻石斧");
                        itemStack14.setItemMeta(itemMeta14);
                        itemStack14.addEnchantment(Enchantment.DAMAGE_ALL,3);
                        player.getInventory().addItem(itemStack14);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack014)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack15 = new ItemStack(Material.DIAMOND_AXE);
                        ItemMeta itemMeta15 = itemStack15.getItemMeta();
                        itemMeta15.setDisplayName("§e+4钻石斧");
                        itemStack15.setItemMeta(itemMeta15);
                        itemStack15.addEnchantment(Enchantment.DAMAGE_ALL,4);
                        player.getInventory().addItem(itemStack15);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                    else {
                        inventory.clear(31);
                        inventory.clear(40);
                        player.getInventory().addItem(itemStack014);//加进背包
                        player.sendMessage("强化失败");
                    }
                }
                if (inventory.contains(itemStack015)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack16 = new ItemStack(Material.DIAMOND_AXE);
                        ItemMeta itemMeta16 = itemStack16.getItemMeta();
                        itemMeta16.setDisplayName("§e+5钻石斧");
                        itemStack16.setItemMeta(itemMeta16);
                        itemStack16.addEnchantment(Enchantment.DAMAGE_ALL,5);
                        player.getInventory().addItem(itemStack16);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }

                //金剑
                if (inventory.contains(itemStack111)){
                    inventory.clear(31);
                    inventory.clear(40);
                    if (gl14 >= random.nextInt(100)){
                        ItemStack itemStack27 = new ItemStack(Material.GOLD_SWORD);
                        ItemMeta itemMeta27 = itemStack27.getItemMeta();
                        itemMeta27.setDisplayName("§e+1金剑");
                        itemStack27.setItemMeta(itemMeta27);
                        itemStack27.addEnchantment(Enchantment.DAMAGE_ALL,1);
                        player.getInventory().addItem(itemStack27);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack112)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack28 = new ItemStack(Material.GOLD_SWORD);
                        ItemMeta itemMeta28 = itemStack28.getItemMeta();
                        itemMeta28.setDisplayName("§e+2金剑");
                        itemStack28.setItemMeta(itemMeta28);
                        itemStack28.addEnchantment(Enchantment.DAMAGE_ALL,2);
                        player.getInventory().addItem(itemStack28);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack113)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack29 = new ItemStack(Material.GOLD_SWORD);
                        ItemMeta itemMeta29 = itemStack29.getItemMeta();
                        itemMeta29.setDisplayName("§e+3金剑");
                        itemStack29.setItemMeta(itemMeta29);
                        itemStack29.addEnchantment(Enchantment.DAMAGE_ALL,3);
                        player.getInventory().addItem(itemStack29);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack114)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack30 = new ItemStack(Material.GOLD_SWORD);
                        ItemMeta itemMeta30 = itemStack30.getItemMeta();
                        itemMeta30.setDisplayName("§e+4金剑");
                        itemStack30.setItemMeta(itemMeta30);
                        itemStack30.addEnchantment(Enchantment.DAMAGE_ALL,4);
                        player.getInventory().addItem(itemStack30);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack115)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack31 = new ItemStack(Material.GOLD_SWORD);
                        ItemMeta itemMeta31 = itemStack31.getItemMeta();
                        itemMeta31.setDisplayName("§e+5金剑");
                        itemStack31.setItemMeta(itemMeta31);
                        itemStack31.addEnchantment(Enchantment.DAMAGE_ALL,5);
                        player.getInventory().addItem(itemStack31);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }

                //金斧
                if (inventory.contains(itemStack121)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack32 = new ItemStack(Material.GOLD_AXE);
                        ItemMeta itemMeta32 = itemStack32.getItemMeta();
                        itemMeta32.setDisplayName("§e+1金斧");
                        itemStack32.setItemMeta(itemMeta32);
                        itemStack32.addEnchantment(Enchantment.DAMAGE_ALL,1);
                        player.getInventory().addItem(itemStack32);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack122)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack33 = new ItemStack(Material.GOLD_AXE);
                        ItemMeta itemMeta33 = itemStack33.getItemMeta();
                        itemMeta33.setDisplayName("§e+2金斧");
                        itemStack33.setItemMeta(itemMeta33);
                        itemStack33.addEnchantment(Enchantment.DAMAGE_ALL,2);
                        player.getInventory().addItem(itemStack33);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack123)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack34 = new ItemStack(Material.GOLD_AXE);
                        ItemMeta itemMeta34 = itemStack34.getItemMeta();
                        itemMeta34.setDisplayName("§e+3金斧");
                        itemStack34.setItemMeta(itemMeta34);
                        itemStack34.addEnchantment(Enchantment.DAMAGE_ALL,3);
                        player.getInventory().addItem(itemStack34);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack124)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack35 = new ItemStack(Material.GOLD_AXE);
                        ItemMeta itemMeta35 = itemStack35.getItemMeta();
                        itemMeta35.setDisplayName("§e+4金斧");
                        itemStack35.setItemMeta(itemMeta35);
                        itemStack35.addEnchantment(Enchantment.DAMAGE_ALL,4);
                        player.getInventory().addItem(itemStack35);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack125)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack36 = new ItemStack(Material.GOLD_AXE);
                        ItemMeta itemMeta36 = itemStack36.getItemMeta();
                        itemMeta36.setDisplayName("§e+5金斧");
                        itemStack36.setItemMeta(itemMeta36);
                        itemStack36.addEnchantment(Enchantment.DAMAGE_ALL,5);
                        player.getInventory().addItem(itemStack36);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }

                //铁剑
                if (inventory.contains(itemStack211)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack47 = new ItemStack(Material.IRON_SWORD);
                        ItemMeta itemMeta47 = itemStack47.getItemMeta();
                        itemMeta47.setDisplayName("§e+1铁剑");
                        itemStack47.setItemMeta(itemMeta47);
                        itemStack47.addEnchantment(Enchantment.DAMAGE_ALL,1);
                        player.getInventory().addItem(itemStack47);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack212)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack48 = new ItemStack(Material.IRON_SWORD);
                        ItemMeta itemMeta48 = itemStack48.getItemMeta();
                        itemMeta48.setDisplayName("§e+2铁剑");
                        itemStack48.setItemMeta(itemMeta48);
                        itemStack48.addEnchantment(Enchantment.DAMAGE_ALL,2);
                        player.getInventory().addItem(itemStack48);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack213)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack49 = new ItemStack(Material.IRON_SWORD);
                        ItemMeta itemMeta49 = itemStack49.getItemMeta();
                        itemMeta49.setDisplayName("§e+3铁剑");
                        itemStack49.setItemMeta(itemMeta49);
                        itemStack49.addEnchantment(Enchantment.DAMAGE_ALL,3);
                        player.getInventory().addItem(itemStack49);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack214)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack50 = new ItemStack(Material.IRON_SWORD);
                        ItemMeta itemMeta50 = itemStack50.getItemMeta();
                        itemMeta50.setDisplayName("§e+4铁剑");
                        itemStack50.setItemMeta(itemMeta50);
                        itemStack50.addEnchantment(Enchantment.DAMAGE_ALL,4);
                        player.getInventory().addItem(itemStack50);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack215)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack51 = new ItemStack(Material.IRON_SWORD);
                        ItemMeta itemMeta51 = itemStack51.getItemMeta();
                        itemMeta51.setDisplayName("§e+5铁剑");
                        itemStack51.setItemMeta(itemMeta51);
                        itemStack51.addEnchantment(Enchantment.DAMAGE_ALL,5);
                        player.getInventory().addItem(itemStack51);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }

                //铁斧
                if (inventory.contains(itemStack221)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack52 = new ItemStack(Material.IRON_AXE);
                        ItemMeta itemMeta52 = itemStack52.getItemMeta();
                        itemMeta52.setDisplayName("§e+1铁斧");
                        itemStack52.setItemMeta(itemMeta52);
                        itemStack52.addEnchantment(Enchantment.DAMAGE_ALL,1);
                        player.getInventory().addItem(itemStack52);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack222)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack53 = new ItemStack(Material.IRON_AXE);
                        ItemMeta itemMeta53 = itemStack53.getItemMeta();
                        itemMeta53.setDisplayName("§e+2铁斧");
                        itemStack53.setItemMeta(itemMeta53);
                        itemStack53.addEnchantment(Enchantment.DAMAGE_ALL,2);
                        player.getInventory().addItem(itemStack53);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack223)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack54 = new ItemStack(Material.IRON_AXE);
                        ItemMeta itemMeta54 = itemStack54.getItemMeta();
                        itemMeta54.setDisplayName("§e+3铁斧");
                        itemStack54.setItemMeta(itemMeta54);
                        itemStack54.addEnchantment(Enchantment.DAMAGE_ALL,3);
                        player.getInventory().addItem(itemStack54);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack224)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack55 = new ItemStack(Material.IRON_AXE);
                        ItemMeta itemMeta55 = itemStack55.getItemMeta();
                        itemMeta55.setDisplayName("§e+4铁斧");
                        itemStack55.setItemMeta(itemMeta55);
                        itemStack55.addEnchantment(Enchantment.DAMAGE_ALL,4);
                        player.getInventory().addItem(itemStack55);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack225)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack56 = new ItemStack(Material.IRON_AXE);
                        ItemMeta itemMeta56 = itemStack56.getItemMeta();
                        itemMeta56.setDisplayName("§e+5铁斧");
                        itemStack56.setItemMeta(itemMeta56);
                        itemStack56.addEnchantment(Enchantment.DAMAGE_ALL,5);
                        player.getInventory().addItem(itemStack56);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }

                //石剑
                if (inventory.contains(itemStack231)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack512 = new ItemStack(Material.STONE_SWORD);
                        ItemMeta itemMeta512 = itemStack512.getItemMeta();
                        itemMeta512.setDisplayName("§e+1石剑");
                        itemStack512.setItemMeta(itemMeta512);
                        itemStack512.addEnchantment(Enchantment.DAMAGE_ALL,1);
                        player.getInventory().addItem(itemStack512);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack232)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack513 = new ItemStack(Material.STONE_SWORD);
                        ItemMeta itemMeta513 = itemStack513.getItemMeta();
                        itemMeta513.setDisplayName("§e+2石剑");
                        itemStack513.setItemMeta(itemMeta513);
                        itemStack513.addEnchantment(Enchantment.DAMAGE_ALL,2);
                        player.getInventory().addItem(itemStack513);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack233)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack514 = new ItemStack(Material.STONE_SWORD);
                        ItemMeta itemMeta514 = itemStack514.getItemMeta();
                        itemMeta514.setDisplayName("§e+3石剑");
                        itemStack514.setItemMeta(itemMeta514);
                        itemStack514.addEnchantment(Enchantment.DAMAGE_ALL,3);
                        player.getInventory().addItem(itemStack514);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack234)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack515 = new ItemStack(Material.STONE_SWORD);
                        ItemMeta itemMeta515 = itemStack515.getItemMeta();
                        itemMeta515.setDisplayName("§e+4石剑");
                        itemStack515.setItemMeta(itemMeta515);
                        itemStack515.addEnchantment(Enchantment.DAMAGE_ALL,4);
                        player.getInventory().addItem(itemStack515);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack235)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack516 = new ItemStack(Material.STONE_SWORD);
                        ItemMeta itemMeta516 = itemStack516.getItemMeta();
                        itemMeta516.setDisplayName("§e+5石剑");
                        itemStack516.setItemMeta(itemMeta516);
                        itemStack516.addEnchantment(Enchantment.DAMAGE_ALL,5);
                        player.getInventory().addItem(itemStack516);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }

                //石斧
                if (inventory.contains(itemStack241)){
                    if (gl14>= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack522 = new ItemStack(Material.STONE_AXE);
                        ItemMeta itemMeta522 = itemStack522.getItemMeta();
                        itemMeta522.setDisplayName("§e+1石斧");
                        itemStack522.setItemMeta(itemMeta522);
                        itemStack522.addEnchantment(Enchantment.DAMAGE_ALL,1);
                        player.getInventory().addItem(itemStack522);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack242)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack523 = new ItemStack(Material.STONE_AXE);
                        ItemMeta itemMeta523 = itemStack523.getItemMeta();
                        itemMeta523.setDisplayName("§e+2石斧");
                        itemStack523.setItemMeta(itemMeta523);
                        itemStack523.addEnchantment(Enchantment.DAMAGE_ALL,2);
                        player.getInventory().addItem(itemStack523);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack243)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack524 = new ItemStack(Material.STONE_AXE);
                        ItemMeta itemMeta524 = itemStack524.getItemMeta();
                        itemMeta524.setDisplayName("§e+3石斧");
                        itemStack524.setItemMeta(itemMeta524);
                        itemStack524.addEnchantment(Enchantment.DAMAGE_ALL,3);
                        player.getInventory().addItem(itemStack524);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack244)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack525 = new ItemStack(Material.STONE_AXE);
                        ItemMeta itemMeta525 = itemStack525.getItemMeta();
                        itemMeta525.setDisplayName("§e+4石斧");
                        itemStack525.setItemMeta(itemMeta525);
                        itemStack525.addEnchantment(Enchantment.DAMAGE_ALL,4);
                        player.getInventory().addItem(itemStack525);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack245)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack526 = new ItemStack(Material.STONE_AXE);
                        ItemMeta itemMeta526 = itemStack526.getItemMeta();
                        itemMeta526.setDisplayName("§e+5石斧");
                        itemStack526.setItemMeta(itemMeta526);
                        itemStack526.addEnchantment(Enchantment.DAMAGE_ALL,5);
                        player.getInventory().addItem(itemStack526);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }

                //木剑
                if (inventory.contains(itemStack251)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack532 = new ItemStack(Material.WOOD_SWORD);
                        ItemMeta itemMeta532 = itemStack532.getItemMeta();
                        itemMeta532.setDisplayName("§e+1木剑");
                        itemStack532.setItemMeta(itemMeta532);
                        itemStack532.addEnchantment(Enchantment.DAMAGE_ALL,1);
                        player.getInventory().addItem(itemStack532);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack252)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack533 = new ItemStack(Material.WOOD_SWORD);
                        ItemMeta itemMeta533 = itemStack533.getItemMeta();
                        itemMeta533.setDisplayName("§e+2木剑");
                        itemStack533.setItemMeta(itemMeta533);
                        itemStack533.addEnchantment(Enchantment.DAMAGE_ALL,2);
                        player.getInventory().addItem(itemStack533);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack253)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack534 = new ItemStack(Material.WOOD_SWORD);
                        ItemMeta itemMeta534 = itemStack534.getItemMeta();
                        itemMeta534.setDisplayName("§e+3木剑");
                        itemStack534.setItemMeta(itemMeta534);
                        itemStack534.addEnchantment(Enchantment.DAMAGE_ALL,3);
                        player.getInventory().addItem(itemStack534);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack254)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack535 = new ItemStack(Material.WOOD_SWORD);
                        ItemMeta itemMeta535 = itemStack535.getItemMeta();
                        itemMeta535.setDisplayName("§e+4木剑");
                        itemStack535.setItemMeta(itemMeta535);
                        itemStack535.addEnchantment(Enchantment.DAMAGE_ALL,4);
                        player.getInventory().addItem(itemStack535);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack255)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack536 = new ItemStack(Material.WOOD_SWORD);
                        ItemMeta itemMeta536 = itemStack536.getItemMeta();
                        itemMeta536.setDisplayName("§e+5木剑");
                        itemStack536.setItemMeta(itemMeta536);
                        itemStack536.addEnchantment(Enchantment.DAMAGE_ALL,5);
                        player.getInventory().addItem(itemStack536);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }

                //木斧
                if (inventory.contains(itemStack261)){
                    if (gl14>= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack542 = new ItemStack(Material.WOOD_AXE);
                        ItemMeta itemMeta542 = itemStack542.getItemMeta();
                        itemMeta542.setDisplayName("§e+1木斧");
                        itemStack542.setItemMeta(itemMeta542);
                        itemStack542.addEnchantment(Enchantment.DAMAGE_ALL,1);
                        player.getInventory().addItem(itemStack542);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack262)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack543 = new ItemStack(Material.WOOD_AXE);
                        ItemMeta itemMeta543 = itemStack543.getItemMeta();
                        itemMeta543.setDisplayName("§e+2木斧");
                        itemStack543.setItemMeta(itemMeta543);
                        itemStack543.addEnchantment(Enchantment.DAMAGE_ALL,2);
                        player.getInventory().addItem(itemStack543);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack263)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack544 = new ItemStack(Material.WOOD_AXE);
                        ItemMeta itemMeta544 = itemStack544.getItemMeta();
                        itemMeta544.setDisplayName("§e+3木斧");
                        itemStack544.setItemMeta(itemMeta544);
                        itemStack544.addEnchantment(Enchantment.DAMAGE_ALL,3);
                        player.getInventory().addItem(itemStack544);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack264)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack545 = new ItemStack(Material.WOOD_AXE);
                        ItemMeta itemMeta545 = itemStack545.getItemMeta();
                        itemMeta545.setDisplayName("§e+4木斧");
                        itemStack545.setItemMeta(itemMeta545);
                        itemStack545.addEnchantment(Enchantment.DAMAGE_ALL,4);
                        player.getInventory().addItem(itemStack545);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                if (inventory.contains(itemStack265)){
                    if (gl14 >= random.nextInt(100)){
                        inventory.clear(31);
                        inventory.clear(40);
                        ItemStack itemStack546 = new ItemStack(Material.WOOD_AXE);
                        ItemMeta itemMeta546 = itemStack546.getItemMeta();
                        itemMeta546.setDisplayName("§e+5木斧");
                        itemStack546.setItemMeta(itemMeta546);
                        itemStack546.addEnchantment(Enchantment.DAMAGE_ALL,5);
                        player.getInventory().addItem(itemStack546);//加进背包
                        player.sendMessage("§9使用管理员专属强化石强化成功");
                    }
                }
                }







                if (inventory.contains(Material.EMERALD)){
                if (!inventory.contains(Material.DIAMOND_SWORD)||!inventory.contains(Material.DIAMOND_AXE)||!inventory.contains(Material.GOLD_SWORD)||!inventory.contains(Material.GOLD_AXE)||!inventory.contains(Material.IRON_SWORD)||!inventory.contains(Material.IRON_AXE)||!inventory.contains(Material.STONE_SWORD)||!inventory.contains(Material.STONE_AXE)||!inventory.contains(Material.WOOD_SWORD)||!inventory.contains(Material.WOOD_AXE)){
                    player.sendMessage("§7你没有放置武器/§e你的武器已经达到最高等级/§4你的武器耐久度不是最大值");
                }
            }
                if (inventory.contains(Material.DIAMOND_SWORD)){
                    if (!inventory.contains(Material.EMERALD)){
                        player.sendMessage("你没有放置强化石");
                    }
                }
                if (inventory.contains(Material.DIAMOND_AXE)){
                    if (!inventory.contains(Material.EMERALD)){
                        player.sendMessage("你没有放置强化石");
                    }
                }
                if (inventory.contains(Material.GOLD_SWORD)){
                    if (!inventory.contains(Material.EMERALD)){
                        player.sendMessage("你没有放置强化石");
                    }
                }
                if (inventory.contains(Material.GOLD_AXE)){
                    if (!inventory.contains(Material.EMERALD)){
                        player.sendMessage("你没有放置强化石");
                    }
                }
                if (inventory.contains(Material.IRON_SWORD)){
                    if (!inventory.contains(Material.EMERALD)){
                        player.sendMessage("你没有放置强化石");
                    }
                }
                if (inventory.contains(Material.IRON_AXE)){
                    if (!inventory.contains(Material.EMERALD)){
                        player.sendMessage("你没有放置强化石");
                    }
                }
                if (inventory.contains(Material.STONE_AXE)){
                    if (!inventory.contains(Material.EMERALD)){
                        player.sendMessage("你没有放置强化石");
                    }
                }
                if (inventory.contains(Material.STONE_SWORD)){
                    if (!inventory.contains(Material.EMERALD)){
                        player.sendMessage("你没有放置强化石");
                    }
                }
                if (inventory.contains(Material.WOOD_SWORD)){
                    if (!inventory.contains(Material.EMERALD)){
                        player.sendMessage("你没有放置强化石");
                    }
                }
                if (inventory.contains(Material.WOOD_AXE)){
                    if (!inventory.contains(Material.EMERALD)){
                        player.sendMessage("你没有放置强化石");
                    }
                }

                event.setCancelled(true);
//                VaultUtil.give(player.getUniqueId(),50);
//                player.closeInventory();

             }

            else if (rawSlot>=0&&rawSlot<=17||rawSlot<=53&&rawSlot>=45||rawSlot>=18&&rawSlot<=26||rawSlot>=27&&rawSlot<=30||rawSlot>=32&&rawSlot<=35||rawSlot>=36&&rawSlot<=39||rawSlot>=41&&rawSlot<=44){
                event.setCancelled(true);
                player.sendMessage("这个不能点击");
            }

        }
    }
}

