package com.minecraft.command;

import com.minecraft.main;
import com.minecraft.util.JsonMessage;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class MyCommand implements CommandExecutor {
//    private JavaPlugin plugin;
//    public MyCommand(JavaPlugin plugin){
//        this.plugin=plugin;
//    }
// //构造器传入plugin对象

        @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        main.plugin.getLogger().info(label+"-----"+ Arrays.toString(args));//日志打印 这是JAVA plguin的方法
        sender.sendMessage("你好"+sender.getName());
        if(sender instanceof Player){
            Player player = (Player) sender;
            sender.sendMessage("你是个玩家");
            if (args.length==1){
                sender.sendMessage("你是个参数"+args[0]);
            }else {
                sender.sendMessage("你这是一个多参数或者没有");
            }
        }else {
            sender.sendMessage("你命令行没有这个功能");
        }

        return false;
    }
}
