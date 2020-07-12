//package com.minecraft.event;
//
//import org.bukkit.block.Furnace;
//import org.bukkit.configuration.file.FileConfiguration;
//import org.bukkit.enchantments.Enchantment;
//import org.bukkit.entity.Player;
//import org.bukkit.event.Listener;
//import org.bukkit.event.inventory.FurnaceBurnEvent;
//import org.bukkit.inventory.ItemStack;
//
//import java.util.HashMap;
//import java.util.Iterator;
//
//public class SmelterEvent implements Listener {
//    public static FileConfiguration config;
//
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
//    public HashMap<Integer, Player> player = new HashMap<>();
//    public HashMap<Integer, ItemStack> fuelItem = new HashMap<>();
//
//
//    public void show(Player p, String msg) {
//        p.sendMessage(msg);
//    }
//
//    public String get(int id) {
//        return config.getString("lang_" + id).replace("&", "§");
//    }
//
//
//
//
//
//    public boolean furnCheck (Furnace furn){
//        boolean flag = false;
//        Player p = this.player.get(furn.getBlock().hashCode());
//        ItemStack smelt = furn.getInventory().getSmelting();
//        ItemStack fuel = furn.getInventory().getFuel();
//        //附魔
//        if (smelt.getEnchantmentLevel(Enchantment.getById(config.getInt("id.items." + smelt.getTypeId()))) == 10) {
//            show(p, get(11));
//            return false;
//        }
//        if ((fuel.hasItemMeta() && fuel.getItemMeta().equals(normalItem.getItemMeta())) || fuel
//                .getItemMeta().equals(luckItem.getItemMeta()) || fuel
//                .getItemMeta().equals(safeItem.getItemMeta()) || fuel
//                .getItemMeta().equals(vipItem.getItemMeta()) || fuel
//                .getItemMeta().equals(adminItem.getItemMeta())) {
//            Iterator<String> localIterator = config.getConfigurationSection("id.items").getKeys(false).iterator();
//            while (localIterator.hasNext()) {
//                String i = localIterator.next();
//                int a = Integer.parseInt(i);
//                if (a == smelt.getTypeId() && smelt
//                        .getAmount() == 1) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag) {
//                int hash = furn.getBlock().hashCode();
//                this.fuelItem.put(hash, fuel);
//                return true;
//            }
//            return false;
//        }
//        return false;
//
//
//    }
//
//    public void onFurnaceBurn(FurnaceBurnEvent e) {
//        if (furnCheck((Furnace)e.getBlock().getState())) {
//            e.setBurning(true);
//            e.setBurnTime(240);
//        }
//    }
//
//}
//
