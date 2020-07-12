//package com.minecraft.event;
//
//
//import org.bukkit.event.Listener;
//import org.bukkit.event.inventory.FurnaceSmeltEvent;
//import org.bukkit.inventory.ItemStack;
//
//import java.util.HashMap;
//import java.util.Iterator;
//
//
//public class onFurnaceSmelt implements Listener {
//    public HashMap<Integer, ItemStack> fuelItem = new HashMap<>();
//    public static ItemStack normalItem;
//    public static ItemStack luckItem;
//    public static ItemStack safeItem;
//    public static ItemStack vipItem;
//    public static ItemStack adminItem;
//
//
//
//
//
//
//
//
//    public onFurnaceSmelt(FurnaceSmeltEvent e){
//        boolean flag = false;
//        int hash = e.getBlock().hashCode();
//        ItemStack source = e.getSource();
//        ItemStack fuel = this.fuelItem.get(Integer.valueOf(hash));
//        ItemStack enhance = source;
//
//        Iterator<String> locallIterator = getConfig().get
//
//    }
//}
