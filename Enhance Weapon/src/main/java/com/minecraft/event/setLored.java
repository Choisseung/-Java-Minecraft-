//package com.minecraft.event;
//
//import net.minecraft.server.v1_12_R1.ItemStack;
//import org.bukkit.event.Listener;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class setLored implements Listener {
//    public List<String> getLore(ItemStack item) {
//        return item.
//    }
//
//    public List<String> setLore(ItemStack item, int level) {
//        List<String> lore = getLore(item);
//        String iepline = getIEPLoreLine(lore);
//        if (!hasQHedItem(item)) {
//            lore = new ArrayList<>();
//            lore.add(get(13));
//            lore.add(get(14).replace("{0}", String.valueOf(level)));
//            lore.add(config.getString("style.color").replace("&", ") +
//                    style(level));
//            if (iepline != null)
//                lore.add(iepline);
//            return lore;
//        }
//        if (level != 11) {
//            lore.set(0, get(13));
//            lore.set(1, get(14).replace("{0}", String.valueOf(level)));
//            lore.set(2, config.getString("style.color").replace("&", ") +
//                    style(level));
//            if (iepline != null)
//                lore.set(3, iepline);
//        } else {
//            lore.set(0, get(13));
//            lore.set(1, get(15));
//            lore.set(2, config.getString("style.color").replace("&", ") +
//                    style(level));
//            if (iepline != null)
//                lore.set(3, iepline);
//        }
//        return lore;
//    }
//    private boolean hasQHedItem(ItemStack item) {
//        if (!item.getEnchantments().isEmpty()) {
//            if (item.hasItemMeta() && item.getItemMeta().hasLore())
//                for (String lore : item.getItemMeta().getLore()) {
//                    if (lore.contains("【强化信息】"))
//                    return true;
//                }
//        } else {
//            return true;
//        }
//        return false;
//    }
//
//}
