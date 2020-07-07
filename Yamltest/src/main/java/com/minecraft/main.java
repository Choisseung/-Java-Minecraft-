package com.minecraft;

import com.minecraft.command.GetWeapon;
import com.minecraft.command.GetWeapon;

import com.minecraft.command.MyCommand;
import com.minecraft.command.OverWatch;

import com.minecraft.event.Entityevent;
import com.minecraft.event.InventoryGuiEvent;
import com.minecraft.event.PlayerEvent;
import com.minecraft.util.VaultUtil;
import com.minecraft.util.renqiExpansion;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class main extends JavaPlugin {
    public static JavaPlugin plugin;//构造器 用初始化

    @Override
    public void onEnable() {
        plugin = this;
        if (VaultUtil.setupEconomy()){
            getLogger().info("初始化vault插件成功");
        }else{
            getLogger().info("初始化vault插件失败");
        }
        //只要不为空就可以得到插件了 进行注册
        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI")!=null){
            new renqiExpansion().register();
            getLogger().info("Papi插件已经注册");
        }
        //实现命令注册
        this.getCommand("show").setExecutor(new MyCommand());
        this.getCommand("ow").setExecutor(new OverWatch());
        this.getCommand("renqi").setExecutor(new GetWeapon());
        Bukkit.getPluginManager().registerEvents(new PlayerEvent(),this);
        Bukkit.getPluginManager().registerEvents(new Entityevent(),this);
        Bukkit.getPluginManager().registerEvents(new InventoryGuiEvent(), this);
        getLogger().info("_____________");
        getLogger().info("MineCraft插件");
        getLogger().info("_____________");
        System.out.println("我的第一个插件开始");
        super.onEnable();
    }

    @Override
    public void onDisable() {
        System.out.println("哈哈我的第一个插件结束");
        super.onDisable();
    }

   /*不推荐*/
//    @Override
//    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
//        getLogger().info(label+"-----"+ Arrays.toString(args));
//        sender.sendMessage("你好"+sender.getName());
//        if(sender instanceof Player){
//            sender.sendMessage("你是个玩家");
//            if (args.length==1){
//                sender.sendMessage("你是个参数"+args[0]);
//            }else {
//                sender.sendMessage("你这是一个多参数或者没有");
//            }
//        }else {
//            sender.sendMessage("你命令行没有这个功能");
//        }
//
//        return false;
//    }
}
