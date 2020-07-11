package com.minecraft.command;


import com.connorlinfoot.titleapi.TitleAPI;
import com.minecraft.gui.smelterInventory;
//import com.minecraft.vexview.IntensifyGui;
import lk.vexview.api.VexViewAPI;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;


public class getSmelter implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;

            if (!player.hasPermission("Weaponplugin.smelter")){
                return true;
            }
            if (label.equalsIgnoreCase("smelter")){

                if (args[0].equalsIgnoreCase("get")){
                    if (player.hasPermission("smelter.get")){

//                        VexViewAPI.openGui(player, IntensifyGui.enhanceGui(player.getUniqueId()));
//                        player.sendMessage("成功打开Gui");
//                        TitleAPI.sendTitle(player, 5, 4, 5, "恭喜打开Gui");

                        smelterInventory.SmelterGui(player);

                        ItemStack itemStack5 = new ItemStack(Material.DIAMOND_SWORD);
                        player.getInventory().addItem(itemStack5);//加进背包
//                        ItemStack itemStack = new ItemStack(Material.DIAMOND_AXE);
//                        player.getInventory().addItem(itemStack);//加进背包
                    }
                }
            }
        }else {
            sender.sendMessage("你不是玩家");
        }
        return true;
    }
}
