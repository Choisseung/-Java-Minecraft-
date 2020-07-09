package com.minecraft.event;

import com.minecraft.gui.smelterInventory;
import com.minecraft.main;
import com.minecraft.util.VaultUtil;
import org.bukkit.Material;
import org.bukkit.block.Furnace;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import com.minecraft.command.enhance;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.List;

public class InventoryGuiEvent implements Listener {
    public static FileConfiguration config;
    public static ItemStack normalItem;
    public static ItemStack superluckItem;
    public static ItemStack luckItem;
    public static ItemStack safeItem;
    public static ItemStack riskItem;
    public static ItemStack vipItem;
    public static ItemStack adminItem;

    public void Initialize(){
        normalItem = config.getItemStack("items.main_normal");
        luckItem = config.getItemStack("items.main_luck");
        superluckItem = config.getItemStack("items.main_superluck");
        safeItem = config.getItemStack("items.main_safe");
        riskItem = config.getItemStack("items.main_risk");
        vipItem = config.getItemStack("items.main_vip");
        adminItem = config.getItemStack("items.main_admin");
    }


    @EventHandler
    public void InventorysmelterClick(InventoryClickEvent event){

        Inventory inventory = event.getInventory();
        String title = inventory.getTitle();//得到强化熔炉这个容器

        if (title.equalsIgnoreCase(smelterInventory.SmelterGui)){
            HumanEntity whoClicked = event.getWhoClicked();
            Player player = (Player) whoClicked;
            int rawSlot = event.getRawSlot();//获得点击哪个格子事件
            main.plugin.getLogger().info(String.valueOf(rawSlot));

            ItemStack ItemStack3 = event.getCurrentItem();
            main.plugin.getLogger().info(String.valueOf(ItemStack3));

//            for (int i=54;i<=89;i++){
//                inventory.getItem(i);
//            }
            if (rawSlot==49){
                //todo 进行强化
                event.setCancelled(true);
                player.sendMessage("强化成功");
                VaultUtil.give(player.getUniqueId(),50);
                player.closeInventory();

            }else if (rawSlot==32){
                if (inventory.contains(Material.DIAMOND_SWORD)){
                    player.sendMessage("添加武器/装备成功");
                }else {
                    player.sendMessage("强化炉内无武器/装备");
                }
                event.setCancelled(true);
            }

            else if (rawSlot==41){
                if (inventory.contains(Material.EMERALD)){
                    player.sendMessage("添加强化石成功");
                }else {
                player.sendMessage("强化炉内无强化石");
            }
                event.setCancelled(true);
            }

            else if (rawSlot>=0&&rawSlot<=17||rawSlot<=53&&rawSlot>=45||rawSlot>=18&&rawSlot<=26||rawSlot>=27&&rawSlot<=30||rawSlot>=32&&rawSlot<=35||rawSlot>=36&&rawSlot<=39||rawSlot>=41&&rawSlot<=44){
                event.setCancelled(true);
                player.sendMessage("这个不能点击");
            }

             else if (rawSlot==40){
                 player.sendMessage("这个格子只能放强化石");
            }
            else if (rawSlot==31){
                player.sendMessage("这个格子只能放武器/装备");
            }

        }

    }
}



