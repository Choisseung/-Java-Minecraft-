//package com.minecraft.command;
//
//import com.minecraft.event.Initialized;
//import org.bukkit.Material;
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandExecutor;
//import org.bukkit.command.CommandSender;
//import org.bukkit.configuration.file.FileConfiguration;
//import org.bukkit.entity.Player;
//import org.bukkit.inventory.FurnaceRecipe;
//import org.bukkit.inventory.ItemStack;
//import org.bukkit.inventory.Recipe;
//
//import java.util.HashMap;
//import java.util.Iterator;
//
//import static org.bukkit.Bukkit.getServer;
//
//public class reloaded implements CommandExecutor {
//    public HashMap<Integer, Integer> random = new HashMap<>();
//    public static FileConfiguration config;
//
//    public void reload(){
////        reloadConfig();
//        this.random.clear();
//        new Initialized();
//        Iterator<String> localIterator = config.getConfigurationSection("id.items").getKeys(false).iterator();
//        while (localIterator.hasNext()) {
//            String i = localIterator.next();
//            FurnaceRecipe recipe = new FurnaceRecipe(new ItemStack(Material.getMaterial(Integer.parseInt(i))), Material.EMERALD);
//            recipe.setInput(Material.getMaterial(Integer.parseInt(i)));
//            getServer().addRecipe((Recipe)recipe);
//        }
//    }
//
//
//
//
//    @Override
//    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
//        if (sender instanceof Player){
//            Player player = (Player) sender;
//
//            if (!player.hasPermission("Weaponplugin.reload")){
//                return true;
//            }
//            if (label.equalsIgnoreCase("reload")){
//
//                if (args[0].equalsIgnoreCase("set")){
//                    if (player.hasPermission("reload.set")){
//                       reload();//重载插件
//                    }
//                }
//            }
//        }else {
//            sender.sendMessage("你不是玩家");
//        }
//        return true;
//    }
//}
