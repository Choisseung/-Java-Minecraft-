package com.minecraft.command;

import com.minecraft.main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;



public class OverWatch implements CommandExecutor {
    @Override
    //控制台的输出：
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        main.plugin.getLogger().info(label+"-----"+ Arrays.toString(args));//日志打印 这是JAVA plguin的方法
        sender.sendMessage("你好"+sender.getName());
        if(sender instanceof Player){
            sender.sendMessage("欢迎来到§d末日铁拳的世界");
            if (args.length==1){
                sender.sendMessage("你现在是个§d铁拳玩家咯"+args[0]);
            }else {
                sender.sendMessage("由于你的名字长度，你现在是个§e安娜玩家，准备迎接被铁拳曹飞的恐惧吧");
            }
        }else {
            sender.sendMessage("你命令行没有这个功能");
        }

        return false;
    }

}
