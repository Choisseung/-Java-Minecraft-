//package com.minecraft.command;
//
//import com.minecraft.util.JsonMessage;
//import org.bukkit.Bukkit;
//import org.bukkit.Location;
//import org.bukkit.Material;
//import org.bukkit.OfflinePlayer;
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandExecutor;
//import org.bukkit.command.CommandSender;
//import org.bukkit.entity.Player;
//import org.bukkit.inventory.ItemStack;
//import org.bukkit.inventory.meta.ItemMeta;
//
//import java.util.Arrays;
//import java.util.UUID;
//
//public class RenQi implements CommandExecutor {
//    @Override
//
//    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
//        if(sender instanceof Player){
//            Player player = (Player) sender;
//            if (label.equalsIgnoreCase("renqi")){
//                //renqi up <Playername>
//                    if (args.length==2)
//                        if (args[0].equalsIgnoreCase("up")){
//                            //玩家增加人气
//                            if (player.hasPermission("renqi.up")){
//                                //有权限进行玩家增加人气
////                                OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(args[1]);
////                                if (offlinePlayer.isOnline())){
////                                    Player player1 = offlinePlayer.getPlayer();
////                                }
//
//                                ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD);
//                                ItemMeta itemMeta = itemStack.getItemMeta();
//                                itemMeta.setDisplayName("这是一个神剑");
//                                itemMeta.setLore(Arrays.asList("第一行数据","第二行数据"));
//                                itemStack.setItemMeta(itemMeta);
////                                itemStack.setAmount(10);
//                               // player.setItemInHand(itemStack);
//                                player.getInventory().addItem(itemStack);//加进背包
//                            }else {
//                                player.sendMessage("你没得权限renqi.up");
//                            }
//
//
//
//                        }else  if(args[0].equalsIgnoreCase("down")){
//                            if (player.hasPermission("renqi.down")){
//                                //有权限进行玩家减少人气
//                                // 获取玩家坐标
//                                Location location= player.getLocation();
//                                player.sendMessage("X坐标："+player.getLocation().getX() +"Y坐标："+player.getLocation().getY()+"Z坐标："+player.getLocation().getZ());
//                                Location world = new Location(Bukkit.getWorld("world"),10,100,10);
//                                player.teleport(world);
//                            }else{
//                                player.sendMessage("你没得权限renqi.down");
//                            }
//
//                        }
//                    //if(args[0].equalsIgnoreCase("add")){
//                        //增加人气
//                        //遍历所有玩家
////                        for (Player player1:Bukkit.getServer().getOnlinePlayers()){
////                            player1.getName()
////                        }
//                //JsonMessage.sendRawJson("[\"\",{\"text\":\"\",\"bold\":true,\"color\":\"black\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"www.baidu.com\"},\"hoverEvent\":{\"action\":\"show_text\",\"contents\":[\"\",{\"text\":\"哈哈哈哈\",\"bold\":true,\"color\":\"dark_blue\"}]}}]",player);
////                        sender.sendMessage("§d增加人气在§e末日铁拳的世界");
//                    }else if (args[0].equalsIgnoreCase("remove")){
//                        sender.sendMessage("§e消除人气你被末日铁拳§e击杀");
//                    }
//                }
//
//        return false;
//    }
//}
