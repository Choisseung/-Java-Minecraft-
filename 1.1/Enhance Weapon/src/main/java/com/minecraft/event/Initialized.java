//package com.minecraft.event;
//
//import org.bukkit.configuration.file.FileConfiguration;
//import org.bukkit.event.Listener;
//import org.bukkit.inventory.ItemStack;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class Initialized implements Listener {
//    public static FileConfiguration config;
//    public HashMap<Integer, Integer> random = new HashMap<>();
////    private static List<String> BlockId = new ArrayList<>();
////    private static List<String> MobId = new ArrayList<>();
//
//    public String cg;
//    public String sb;
//
//    public static ItemStack normalItem;
//    public static ItemStack luckItem;
//    public static ItemStack safeItem;
//    public static ItemStack vipItem;
//    public static ItemStack adminItem;
//    public static ItemStack superluckItem;
//    public static ItemStack riskItem;
//
//    public int normalchance;
//    public int luckchance;
//    public int safechance;
//    public int vipchance;
//
////初始化
//
//    public void Initialize(){
//        normalItem = config.getItemStack("items.main_normal");
//        luckItem = config.getItemStack("items.main_luck");
//        safeItem = config.getItemStack("items.main_safe");
//        superluckItem = config.getItemStack("items.main_superluck");
//        vipItem = config.getItemStack("items.main_vip");
//        adminItem = config.getItemStack("items.main_admin");
//        riskItem = config.getItemStack("items.main_risk");
//        for (int i = 0; i < 11; i++) {
//            int a = Integer.valueOf(config.getString("chance.default").split(",")[i]).intValue();
//            this.random.put(Integer.valueOf(i), Integer.valueOf(a));
//        }
////        for (String s : config.getStringList("drop.blocks"))
////            BlockId.add(s);
////        for (String s : config.getStringList("drop.mobs"))
////            MobId.add(s);
//        this.cg = config.getString("style.a");
//        this.sb = config.getString("style.b");
//        this.normalchance = config.getInt("chance.normal");
//        this.luckchance = config.getInt("chance.luck");
//        this.safechance = config.getInt("chance.safe");
//        this.vipchance = config.getInt("chance.vip");
//    }
//
//    public String style(int level) {
//        String str = "";
//        if (level != 11) {
//            int j;
//            for (j = 0; j < level; j++)
//                str = str + this.cg;
//            for (j = 0; j < 10 - level; j++)
//                str = str + this.sb;
//            return str;
//        }
//        for (int i = 0; i < level; i++)
//            str = str + this.cg;
//        return str;
//    }
//}
