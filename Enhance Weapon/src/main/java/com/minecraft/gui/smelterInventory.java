package com.minecraft.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class smelterInventory {
    public static String SmelterGui="§4强化熔炉";
    public static void SmelterGui(Player player){
        Inventory inventory = Bukkit.createInventory(null, 54,SmelterGui);
        ItemStack itemStack = new ItemStack(Material.STAINED_GLASS);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName("§e界面图");
        itemStack.setItemMeta(itemMeta);



        for (int i=0;i<=17;i++){
            inventory.setItem(i, itemStack);
        }

        inventory.setItem(9, itemStack);
        inventory.setItem(18, itemStack);
        inventory.setItem(19, itemStack);
        inventory.setItem(20, itemStack);
        inventory.setItem(21, itemStack);
        inventory.setItem(22, itemStack);
        inventory.setItem(23, itemStack);
        inventory.setItem(24, itemStack);
        inventory.setItem(25, itemStack);
        inventory.setItem(26, itemStack);
        inventory.setItem(27, itemStack);
        inventory.setItem(28, itemStack);
        inventory.setItem(29, itemStack);
        inventory.setItem(30, itemStack);
        inventory.setItem(36, itemStack);
        inventory.setItem(37, itemStack);
        inventory.setItem(38, itemStack);
        inventory.setItem(33, itemStack);
        inventory.setItem(34, itemStack);
        inventory.setItem(35, itemStack);
        inventory.setItem(39, itemStack);
        inventory.setItem(42, itemStack);
        inventory.setItem(43, itemStack);
        inventory.setItem(44, itemStack);


        for (int i =45;i<=53;i++){
            inventory.setItem(i,itemStack);
        }
        player.openInventory(inventory);

        ItemStack itemStack3 =new ItemStack(Material.DIAMOND);
        itemMeta.setDisplayName("§4检查是否为武器/装备");
        itemStack3.setItemMeta(itemMeta);
        inventory.setItem(32, itemStack3);

        ItemStack itemStack2 =new ItemStack(Material.DIAMOND);
        itemMeta.setDisplayName("§4检查是否为强化石");
        itemStack2.setItemMeta(itemMeta);
        inventory.setItem(41, itemStack2);

        ItemStack itemStack1 =new ItemStack(Material.DIAMOND);
        itemMeta.setDisplayName("§4强化");
        itemStack1.setItemMeta(itemMeta);
        inventory.setItem(49, itemStack1);





    }}
