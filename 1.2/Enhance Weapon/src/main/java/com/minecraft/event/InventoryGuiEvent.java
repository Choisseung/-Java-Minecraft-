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


//            ItemStack itemStack6 = new ItemStack(Material.EMERALD);//青金石块
//            ItemMeta itemMeta6 = itemStack6.getItemMeta();
//            itemMeta6.setDisplayName("§9安全强化石");
//            itemMeta6.setLore(Arrays.asList("[§6§l功能]", "§4强化失败武器不会碎裂","§e提升40%的强化几率", "[§6§l用法]", "§2放到熔炉，燃烧武器/装备"));
//            itemStack6.setItemMeta(itemMeta6);




            //钻石武器系列：
            //钻石剑系列：
            ItemStack itemStack01 = new ItemStack(Material.DIAMOND_SWORD);

            ItemStack itemStack02 = new ItemStack(Material.DIAMOND_SWORD);
            itemStack02.addEnchantment(Enchantment.DAMAGE_ALL,1);

            ItemStack itemStack03 = new ItemStack(Material.DIAMOND_SWORD);
            itemStack03.addEnchantment(Enchantment.DAMAGE_ALL,2);

            ItemStack itemStack04 = new ItemStack(Material.DIAMOND_SWORD);
            itemStack04.addEnchantment(Enchantment.DAMAGE_ALL,3);

            ItemStack itemStack05 = new ItemStack(Material.DIAMOND_SWORD);
            itemStack05.addEnchantment(Enchantment.DAMAGE_ALL,4);


//            //钻石斧系列：
            ItemStack itemStack011 = new ItemStack(Material.DIAMOND_AXE);

            ItemStack itemStack012 = new ItemStack(Material.DIAMOND_AXE);
            itemStack012.addEnchantment(Enchantment.DAMAGE_ALL,1);

            ItemStack itemStack013 = new ItemStack(Material.DIAMOND_AXE);
            itemStack013.addEnchantment(Enchantment.DAMAGE_ALL,2);

            ItemStack itemStack014 = new ItemStack(Material.DIAMOND_AXE);
            itemStack014.addEnchantment(Enchantment.DAMAGE_ALL,3);

            ItemStack itemStack015 = new ItemStack(Material.DIAMOND_AXE);
            itemStack015.addEnchantment(Enchantment.DAMAGE_ALL,4);


           //金武器系列
         //金剑
            ItemStack itemStack111 = new ItemStack(Material.GOLD_SWORD);

            ItemStack itemStack112 = new ItemStack(Material.GOLD_SWORD);
            itemStack112.addEnchantment(Enchantment.DAMAGE_ALL,1);

            ItemStack itemStack113 = new ItemStack(Material.GOLD_SWORD);
            itemStack113.addEnchantment(Enchantment.DAMAGE_ALL,2);

            ItemStack itemStack114 = new ItemStack(Material.GOLD_SWORD);
            itemStack114.addEnchantment(Enchantment.DAMAGE_ALL,3);

            ItemStack itemStack115 = new ItemStack(Material.GOLD_SWORD);
            itemStack115.addEnchantment(Enchantment.DAMAGE_ALL,4);


            //金斧
            ItemStack itemStack121 = new ItemStack(Material.GOLD_AXE);

            ItemStack itemStack122 = new ItemStack(Material.GOLD_AXE);
            itemStack122.addEnchantment(Enchantment.DAMAGE_ALL,1);

            ItemStack itemStack123 = new ItemStack(Material.GOLD_AXE);
            itemStack123.addEnchantment(Enchantment.DAMAGE_ALL,2);

            ItemStack itemStack124 = new ItemStack(Material.GOLD_AXE);
            itemStack124.addEnchantment(Enchantment.DAMAGE_ALL,3);

            ItemStack itemStack125 = new ItemStack(Material.GOLD_AXE);
            itemStack125.addEnchantment(Enchantment.DAMAGE_ALL,4);

            //铁武器
            ItemStack itemStack211 = new ItemStack(Material.IRON_SWORD);

            ItemStack itemStack212 = new ItemStack(Material.IRON_SWORD);
            itemStack212.addEnchantment(Enchantment.DAMAGE_ALL,1);

            ItemStack itemStack213 = new ItemStack(Material.IRON_SWORD);
            itemStack213.addEnchantment(Enchantment.DAMAGE_ALL,2);

            ItemStack itemStack214 = new ItemStack(Material.IRON_SWORD);
            itemStack214.addEnchantment(Enchantment.DAMAGE_ALL,3);

            ItemStack itemStack215 = new ItemStack(Material.IRON_SWORD);
            itemStack215.addEnchantment(Enchantment.DAMAGE_ALL,4);


            //铁斧
            ItemStack itemStack221 = new ItemStack(Material.IRON_AXE);

            ItemStack itemStack222 = new ItemStack(Material.IRON_AXE);
            itemStack222.addEnchantment(Enchantment.DAMAGE_ALL,1);

            ItemStack itemStack223 = new ItemStack(Material.IRON_AXE);
            itemStack223.addEnchantment(Enchantment.DAMAGE_ALL,2);

            ItemStack itemStack224 = new ItemStack(Material.IRON_AXE);
            itemStack224.addEnchantment(Enchantment.DAMAGE_ALL,3);

            ItemStack itemStack225 = new ItemStack(Material.IRON_AXE);
            itemStack225.addEnchantment(Enchantment.DAMAGE_ALL,4);


            //石剑
            ItemStack itemStack231 = new ItemStack(Material.STONE_SWORD);

            ItemStack itemStack232 = new ItemStack(Material.STONE_SWORD);
            itemStack232.addEnchantment(Enchantment.DAMAGE_ALL,1);

            ItemStack itemStack233 = new ItemStack(Material.STONE_SWORD);
            itemStack233.addEnchantment(Enchantment.DAMAGE_ALL,2);

            ItemStack itemStack234 = new ItemStack(Material.STONE_SWORD);
            itemStack234.addEnchantment(Enchantment.DAMAGE_ALL,3);

            ItemStack itemStack235 = new ItemStack(Material.STONE_SWORD);
            itemStack235.addEnchantment(Enchantment.DAMAGE_ALL,4);

            //石斧
            ItemStack itemStack241 = new ItemStack(Material.STONE_AXE);

            ItemStack itemStack242 = new ItemStack(Material.STONE_AXE);
            itemStack242.addEnchantment(Enchantment.DAMAGE_ALL,1);

            ItemStack itemStack243 = new ItemStack(Material.STONE_AXE);
            itemStack243.addEnchantment(Enchantment.DAMAGE_ALL,2);

            ItemStack itemStack244 = new ItemStack(Material.STONE_AXE);
            itemStack244.addEnchantment(Enchantment.DAMAGE_ALL,3);

            ItemStack itemStack245 = new ItemStack(Material.STONE_AXE);
            itemStack245.addEnchantment(Enchantment.DAMAGE_ALL,4);

            //木剑
            ItemStack itemStack251 = new ItemStack(Material.WOOD_SWORD);

            ItemStack itemStack252 = new ItemStack(Material.WOOD_SWORD);
            itemStack252.addEnchantment(Enchantment.DAMAGE_ALL,1);

            ItemStack itemStack253 = new ItemStack(Material.WOOD_SWORD);
            itemStack253.addEnchantment(Enchantment.DAMAGE_ALL,2);

            ItemStack itemStack254 = new ItemStack(Material.WOOD_SWORD);
            itemStack254.addEnchantment(Enchantment.DAMAGE_ALL,3);

            ItemStack itemStack255 = new ItemStack(Material.WOOD_SWORD);
            itemStack255.addEnchantment(Enchantment.DAMAGE_ALL,4);

            //木斧
            ItemStack itemStack261 = new ItemStack(Material.WOOD_AXE);

            ItemStack itemStack262 = new ItemStack(Material.WOOD_AXE);
            itemStack262.addEnchantment(Enchantment.DAMAGE_ALL,1);

            ItemStack itemStack263 = new ItemStack(Material.WOOD_AXE);
            itemStack263.addEnchantment(Enchantment.DAMAGE_ALL,2);

            ItemStack itemStack264 = new ItemStack(Material.WOOD_AXE);
            itemStack264.addEnchantment(Enchantment.DAMAGE_ALL,3);

            ItemStack itemStack265 = new ItemStack(Material.WOOD_AXE);
            itemStack265.addEnchantment(Enchantment.DAMAGE_ALL,4);


            if (rawSlot==49){
                //todo 进行强化

                //todo 普通强化石
                if (inventory.contains(itemStack)){
                    Random random = new Random();
                        int gl1 = 80;
                        int gl2 = 65;
                        int gl3 = 45;
                        int gl4 = 30;
                        int gl5 = 10;
                    //钻石剑
                    if (inventory.contains(itemStack01)){
                        if (gl1 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack7 = new ItemStack(Material.DIAMOND_SWORD);
                            itemStack7.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack7);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            ItemStack itemStack8 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            itemStack8.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack8);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack9.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack9);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack10.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack10);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack11.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack11);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack12.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack12);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack13.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack13);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack14.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack14);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack15.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack15);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack16.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack16);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack27.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack27);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack28.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack28);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack29.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack29);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack30.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack30);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack31.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack31);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack32.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack32);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack33.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack33);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack34.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack34);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack35.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack35);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack36.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack36);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack47.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack47);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack48.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack48);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack49.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack49);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack50.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack50);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack51.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack51);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                            itemStack52.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack52);//加进背包
                            player.sendMessage("使用普通强化石强化成功");
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
                if (inventory.contains(itemStack1)){
                    Random random = new Random();
                    int gl11 = 95;
                    int gl21 = 78;
                    int gl31 = 58;
                    int gl41 = 45;
                    int gl51 = 25;
                    //钻石剑
                    if (inventory.contains(itemStack01)){
                        if (gl11 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack7 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            itemStack7.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack7);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack01);//加进背包
                            player.sendMessage("强化失败");

                        }
                    }
                    if (inventory.contains(itemStack02)){
                        if (gl21 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack8 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            itemStack8.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack8);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack02);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack03)){
                        if (gl31 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack9 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            itemStack9.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack9);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack03);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack04)){
                        if (gl41 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack10 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            itemStack10.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack10);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack04);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack05)){
                        if (gl51 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack11 = new ItemStack(Material.DIAMOND_SWORD);
                            itemStack11.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack11);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //钻石斧
                    if (inventory.contains(itemStack011)){
                        if (gl11 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack12 = new ItemStack(Material.DIAMOND_AXE);
                            itemStack12.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack12);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack011);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack012)){
                        if (gl21 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack13 = new ItemStack(Material.DIAMOND_AXE);
                            itemStack13.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack13);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack012);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack013)){
                        if (gl31 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack14 = new ItemStack(Material.DIAMOND_AXE);
                            itemStack14.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack14);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack013);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack014)){
                        if (gl41 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack15 = new ItemStack(Material.DIAMOND_AXE);
                            itemStack15.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack15);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack014);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack015)){
                        if (gl51 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack16 = new ItemStack(Material.DIAMOND_AXE);
                            itemStack16.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack16);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
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
                        if (gl11 >= random.nextInt(100)){
                            ItemStack itemStack27 = new ItemStack(Material.GOLD_SWORD);
                            itemStack27.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack27);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack111);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack112)){
                        if (gl21 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack28 = new ItemStack(Material.GOLD_SWORD);
                            itemStack28.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack28);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack112);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack113)){
                        if (gl31 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack29 = new ItemStack(Material.GOLD_SWORD);
                            itemStack29.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack29);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack113);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack114)){
                        if (gl41 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack30 = new ItemStack(Material.GOLD_SWORD);
                            itemStack30.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack30);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack114);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack115)){
                        if (gl51 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack31 = new ItemStack(Material.GOLD_SWORD);
                            itemStack31.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack31);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //金斧
                    if (inventory.contains(itemStack121)){
                        if (gl11 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack32 = new ItemStack(Material.GOLD_AXE);
                            itemStack32.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack32);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack121);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack122)){
                        if (gl21 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack33 = new ItemStack(Material.GOLD_AXE);
                            itemStack33.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack33);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack122);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack123)){
                        if (gl31 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack34 = new ItemStack(Material.GOLD_AXE);
                            itemStack34.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack34);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack123);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack124)){
                        if (gl41 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack35 = new ItemStack(Material.GOLD_AXE);
                            itemStack35.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack35);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack124);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack125)){
                        if (gl51 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack36 = new ItemStack(Material.GOLD_AXE);
                            itemStack36.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack36);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //铁剑
                    if (inventory.contains(itemStack211)){
                        if (gl11 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack47 = new ItemStack(Material.IRON_SWORD);
                            itemStack47.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack47);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack211);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack212)){
                        if (gl21 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack48 = new ItemStack(Material.IRON_SWORD);
                            itemStack48.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack48);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack212);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack213)){
                        if (gl31 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack49 = new ItemStack(Material.IRON_SWORD);
                            itemStack49.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack49);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack213);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack214)){
                        if (gl41 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack50 = new ItemStack(Material.IRON_SWORD);
                            itemStack50.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack50);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack214);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack215)){
                        if (gl51 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack51 = new ItemStack(Material.IRON_SWORD);
                            itemStack51.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack51);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //铁斧
                    if (inventory.contains(itemStack221)){
                        if (gl11 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack52 = new ItemStack(Material.IRON_AXE);
                            itemStack52.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack52);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack221);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack222)){
                        if (gl21 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack53 = new ItemStack(Material.IRON_AXE);
                            itemStack53.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack53);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack222);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack223)){
                        if (gl31 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack54 = new ItemStack(Material.IRON_AXE);
                            itemStack54.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack54);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack223);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack224)){
                        if (gl41>= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack55 = new ItemStack(Material.IRON_AXE);
                            itemStack55.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack55);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack224);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack225)){
                        if (gl51 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack56 = new ItemStack(Material.IRON_AXE);
                            itemStack56.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack56);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //石剑
                    if (inventory.contains(itemStack231)){
                        if (gl11 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack512 = new ItemStack(Material.STONE_SWORD);
                            itemStack512.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack512);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack231);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack232)){
                        if (gl21 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack513 = new ItemStack(Material.STONE_SWORD);
                            itemStack513.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack513);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack232);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack233)){
                        if (gl31 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack514 = new ItemStack(Material.STONE_SWORD);
                            itemStack514.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack514);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack233);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack234)){
                        if (gl41 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack515 = new ItemStack(Material.STONE_SWORD);
                            itemStack515.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack515);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack234);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack235)){
                        if (gl51 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack516 = new ItemStack(Material.STONE_SWORD);
                            itemStack516.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack516);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //石斧
                    if (inventory.contains(itemStack241)){
                        if (gl11 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack522 = new ItemStack(Material.STONE_AXE);
                            itemStack522.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack522);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack241);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack242)){
                        if (gl21 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack523 = new ItemStack(Material.STONE_AXE);
                            itemStack523.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack523);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack242);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack243)){
                        if (gl31 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack524 = new ItemStack(Material.STONE_AXE);
                            itemStack524.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack524);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack243);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack244)){
                        if (gl41 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack525 = new ItemStack(Material.STONE_AXE);
                            itemStack525.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack525);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack244);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack245)){
                        if (gl51 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack526 = new ItemStack(Material.STONE_AXE);
                            itemStack526.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack526);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //木剑
                    if (inventory.contains(itemStack251)){
                        if (gl11 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack532 = new ItemStack(Material.WOOD_SWORD);
                            itemStack532.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack532);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack251);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack252)){
                        if (gl21 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack533 = new ItemStack(Material.WOOD_SWORD);
                            itemStack533.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack533);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack252);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack253)){
                        if (gl31 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack534 = new ItemStack(Material.WOOD_SWORD);
                            itemStack534.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack534);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack253);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack254)){
                        if (gl41 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack535 = new ItemStack(Material.WOOD_SWORD);
                            itemStack535.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack535);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack254);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack255)){
                        if (gl51 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack536 = new ItemStack(Material.WOOD_SWORD);
                            itemStack536.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack536);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.sendMessage("强化失败 你的武器碎裂并消失");
                        }
                    }

                    //木斧
                    if (inventory.contains(itemStack261)){
                        if (gl11 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack542 = new ItemStack(Material.WOOD_AXE);
                            itemStack542.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack542);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack261);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack262)){
                        if (gl21 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack543 = new ItemStack(Material.WOOD_AXE);
                            itemStack543.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack543);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack262);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack263)){
                        if (gl31 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack544 = new ItemStack(Material.WOOD_AXE);
                            itemStack544.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack544);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack263);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack264)){
                        if (gl41 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack545 = new ItemStack(Material.WOOD_AXE);
                            itemStack545.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack545);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }else {
                            inventory.clear(31);
                            inventory.clear(40);
                            player.getInventory().addItem(itemStack264);//加进背包
                            player.sendMessage("强化失败");
                        }
                    }
                    if (inventory.contains(itemStack265)){
                        if (gl51 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack546 = new ItemStack(Material.WOOD_AXE);
                            itemStack546.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack546);//加进背包
                            player.sendMessage("使用幸运强化石强化成功");
                        }
                        else {
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
                            itemStack7.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack7);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack8.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack8);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack9.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack9);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack10.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack10);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack11.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack11);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack12.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack12);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack13.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack13);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack14.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack14);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack15.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack15);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack16.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack16);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack27.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack27);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack28.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack28);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack29.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack29);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack30.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack30);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack31.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack31);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack32.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack32);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack33.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack33);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack34.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack34);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack35.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack35);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack36.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack36);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack47.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack47);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack48.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack48);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack49.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack49);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack50.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack50);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack51.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack51);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack52.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack52);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack53.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack53);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack54.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack54);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack55.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack55);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack56.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack56);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack512.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack512);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack513.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack513);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack514.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack514);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack515.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack515);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack516.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack516);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack522.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack522);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack523.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack523);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack524.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack524);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack525.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack525);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack526.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack526);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack532.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack532);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack533.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack533);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack534.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack534);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack535.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack535);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack536.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack536);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack542.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack542);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack543.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack543);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack544.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack544);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack545.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack545);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            itemStack546.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack546);//加进背包
                            player.sendMessage("使用厄运强化石强化成功");
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
                            ItemStack itemStack7 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
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
                            ItemStack itemStack8 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
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
                        if (gl13 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack522 = new ItemStack(Material.STONE_AXE);
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
                        if (gl13 >= random.nextInt(100)){
                            inventory.clear(31);
                            inventory.clear(40);
                            ItemStack itemStack542 = new ItemStack(Material.WOOD_AXE);
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
                    //todo 管理员强化石
                    Random random = new Random();
                   int gl14 =100;
                    //钻石剑
                    if (inventory.contains(itemStack01)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack7 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            itemStack7.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack7);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack02)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack8 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            itemStack8.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack8);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack03)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack9 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            itemStack9.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack9);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack04)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack10 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                            itemStack10.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack10);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack05)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack11 = new ItemStack(Material.DIAMOND_SWORD);
                            itemStack11.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack11);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }

                    //钻石斧
                    if (inventory.contains(itemStack011)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack12 = new ItemStack(Material.DIAMOND_AXE);
                            itemStack12.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack12);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }

                    if (inventory.contains(itemStack012)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack13 = new ItemStack(Material.DIAMOND_AXE);
                            itemStack13.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack13);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }if (inventory.contains(itemStack013)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack14 = new ItemStack(Material.DIAMOND_AXE);
                            itemStack14.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack14);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }if (inventory.contains(itemStack014)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack15 = new ItemStack(Material.DIAMOND_AXE);
                            itemStack15.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack15);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack015)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack16 = new ItemStack(Material.DIAMOND_AXE);
                            itemStack16.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack16);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    //金剑
                    if (inventory.contains(itemStack111)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack27 = new ItemStack(Material.GOLD_SWORD);
                            itemStack27.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack27);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }if (inventory.contains(itemStack112)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack28 = new ItemStack(Material.GOLD_SWORD);
                            itemStack28.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack28);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }if (inventory.contains(itemStack113)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack29 = new ItemStack(Material.GOLD_SWORD);
                            itemStack29.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack29);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack114)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack30 = new ItemStack(Material.GOLD_SWORD);
                            itemStack30.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack30);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    //金斧
                    if (inventory.contains(itemStack115)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack31 = new ItemStack(Material.GOLD_SWORD);
                            itemStack31.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack31);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack121)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack32 = new ItemStack(Material.GOLD_AXE);
                            itemStack32.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack32);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack122)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack33 = new ItemStack(Material.GOLD_AXE);
                            itemStack33.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack33);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack123)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack34 = new ItemStack(Material.GOLD_AXE);
                            itemStack34.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack34);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack124)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack35 = new ItemStack(Material.GOLD_AXE);
                            itemStack35.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack35);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack125)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack36 = new ItemStack(Material.GOLD_AXE);
                            itemStack36.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack36);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
//        铁剑
                    if (inventory.contains(itemStack211)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack47 = new ItemStack(Material.IRON_SWORD);
                            itemStack47.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack47);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }

                    if (inventory.contains(itemStack212)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack48 = new ItemStack(Material.IRON_SWORD);
                            itemStack48.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack48);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack213)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack49 = new ItemStack(Material.IRON_SWORD);
                            itemStack49.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack49);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack214)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack50 = new ItemStack(Material.IRON_SWORD);
                            itemStack50.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack50);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack215)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack51 = new ItemStack(Material.IRON_SWORD);
                            itemStack51.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack51);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }

                    //铁斧
                    if (inventory.contains(itemStack221)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack52 = new ItemStack(Material.IRON_AXE);
                            itemStack52.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack52);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }

                    if (inventory.contains(itemStack222)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack53 = new ItemStack(Material.IRON_AXE);
                            itemStack53.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack53);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack223)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack54 = new ItemStack(Material.IRON_AXE);
                            itemStack54.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack54);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack224)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack55 = new ItemStack(Material.IRON_AXE);
                            itemStack55.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack55);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }

                    if (inventory.contains(itemStack225)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack56 = new ItemStack(Material.IRON_AXE);
                            itemStack56.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack56);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }


//石剑
                    if (inventory.contains(itemStack231)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack512 = new ItemStack(Material.STONE_SWORD);
                            itemStack512.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack512);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }

                    if (inventory.contains(itemStack232)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack513 = new ItemStack(Material.STONE_SWORD);
                            itemStack513.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack513);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack233)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack514 = new ItemStack(Material.STONE_SWORD);
                            itemStack514.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack514);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack234)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack515 = new ItemStack(Material.STONE_SWORD);
                            itemStack515.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack515);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }

                    if (inventory.contains(itemStack235)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack516 = new ItemStack(Material.STONE_SWORD);
                            itemStack516.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack516);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }


//石斧
                    if (inventory.contains(itemStack241)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack522 = new ItemStack(Material.STONE_AXE);
                            itemStack522.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack522);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }

                    if (inventory.contains(itemStack242)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack523 = new ItemStack(Material.STONE_AXE);
                            itemStack523.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack523);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack243)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack524 = new ItemStack(Material.STONE_AXE);
                            itemStack524.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack524);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack244)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack525 = new ItemStack(Material.STONE_AXE);
                            itemStack525.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack525);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }

                    if (inventory.contains(itemStack245)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack526 = new ItemStack(Material.STONE_AXE);
                            itemStack526.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack526);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }


                    //木剑
                    if (inventory.contains(itemStack251)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack532 = new ItemStack(Material.WOOD_SWORD);
                            itemStack532.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack532);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }

                    if (inventory.contains(itemStack252)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack533 = new ItemStack(Material.WOOD_SWORD);
                            itemStack533.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack533);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack253)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack534 = new ItemStack(Material.WOOD_SWORD);
                            itemStack534.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack534);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack254)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack535 = new ItemStack(Material.WOOD_SWORD);
                            itemStack535.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack535);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }

                    if (inventory.contains(itemStack255)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack536 = new ItemStack(Material.WOOD_SWORD);
                            itemStack536.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack536);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }


                    //木斧
                    if (inventory.contains(itemStack261)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack542 = new ItemStack(Material.WOOD_AXE);
                            itemStack542.addEnchantment(Enchantment.DAMAGE_ALL,1);
                            player.getInventory().addItem(itemStack542);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }

                    if (inventory.contains(itemStack262)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack543 = new ItemStack(Material.WOOD_AXE);
                            itemStack543.addEnchantment(Enchantment.DAMAGE_ALL,2);
                            player.getInventory().addItem(itemStack543);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack263)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack544 = new ItemStack(Material.WOOD_AXE);
                            itemStack544.addEnchantment(Enchantment.DAMAGE_ALL,3);
                            player.getInventory().addItem(itemStack544);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }
                    if (inventory.contains(itemStack264)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack545 = new ItemStack(Material.WOOD_AXE);
                            itemStack545.addEnchantment(Enchantment.DAMAGE_ALL,4);
                            player.getInventory().addItem(itemStack545);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }

                    if (inventory.contains(itemStack265)){
                        if (gl14 >= random.nextInt(100)){
                            ItemStack itemStack546 = new ItemStack(Material.WOOD_AXE);
                            itemStack546.addEnchantment(Enchantment.DAMAGE_ALL,5);
                            player.getInventory().addItem(itemStack546);//加进背包
                            player.sendMessage("使用管理员专属强化石强化成功");
                        }
                    }

                }


                if (inventory.contains(Material.EMERALD)){
                if (!inventory.contains(Material.DIAMOND_SWORD)||!inventory.contains(Material.DIAMOND_AXE)||!inventory.contains(Material.GOLD_SWORD)||!inventory.contains(Material.GOLD_AXE)||!inventory.contains(Material.IRON_SWORD)||!inventory.contains(Material.IRON_AXE)||!inventory.contains(Material.STONE_SWORD)||!inventory.contains(Material.STONE_AXE)||!inventory.contains(Material.WOOD_SWORD)||!inventory.contains(Material.WOOD_AXE)){
                    player.sendMessage("你没有放置武器");
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

