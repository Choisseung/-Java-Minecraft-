package com.minecraft;

import com.minecraft.command.enhance;
import com.minecraft.command.getSmelter;
import com.minecraft.event.InventoryGuiEvent;
import com.minecraft.event.PlayerEvent;

import com.minecraft.util.VaultUtil;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class main extends JavaPlugin {
    public static JavaPlugin plugin;
//    public static FileConfiguration config;

    @Override
    public void onEnable() {
//       if (!getDataFolder().exists()){
//           getDataFolder().mkdir();
//       }
//       File file =new File(getDataFolder(),"config.yml");
//       if (!file.exists()){
//           saveDefaultConfig();
//       }



        plugin = this;
        if (VaultUtil.setupEconomy()){
            getLogger().info("初始化vault插件成功");
        }else{
            getLogger().info("初始化vault插件失败");
        }



        this.getCommand("enhance").setExecutor(new enhance());
        this.getCommand("smelter").setExecutor(new getSmelter());
//        Bukkit.getPluginManager().registerEvents(new SmelterEvent(),this);
        Bukkit.getPluginManager().registerEvents(new InventoryGuiEvent(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerEvent(),this);
        getLogger().info("_____________");
        getLogger().info("MineCraft插件");
        getLogger().info("_____________");
        getLogger().info("强化武器插件已启动");
        getLogger().info("如果有Bug，请汇报给_b!");

        super.onEnable();
    }

    @Override
    public void onDisable() {
        System.out.println("哈哈不会吧不会吧不会吧");
        super.onDisable();
    }

//    public static FileConfiguration config;
//    public static ItemStack normalItem;
//    public static ItemStack superluckItem;
//    public static ItemStack luckItem;
//    public static ItemStack safeItem;
//    public static ItemStack riskItem;
//    public static ItemStack vipItem;
//    public static ItemStack adminItem;
//
//    public void Initialize(){
//        normalItem = config.getItemStack("items.main_normal");
//        luckItem = config.getItemStack("items.main_luck");
//        superluckItem = config.getItemStack("items.main_superluck");
//        safeItem = config.getItemStack("items.main_safe");
//        riskItem = config.getItemStack("items.main_risk");
//        vipItem = config.getItemStack("items.main_vip");
//        adminItem = config.getItemStack("items.main_admin");

//    Initialize();
//    }
}
