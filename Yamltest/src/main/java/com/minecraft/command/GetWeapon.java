package com.minecraft.command;

import com.connorlinfoot.titleapi.TitleAPI;
import com.minecraft.gui.renqiInventory;
import com.minecraft.main;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Arrays;

import static sun.misc.PostVMInitHook.run;

public class GetWeapon implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;

            if (!player.hasPermission("Myplugin.renqi")){
                return true;
            }
            //sender.sendMessage("你好");
            if(label.equalsIgnoreCase("renqi")){
                //renqi up <Playername>
                if (args.length==2){
                    //判断是不是输入up命令
                    if (args[0].equalsIgnoreCase("up")){
                        //玩家增加人气
                        //判断这个玩家有没有权限使用up命令
                        if(player.hasPermission("renqi.up")){
                            //有权限进行增加人气

                            ItemStack itemStack = new ItemStack(Material.COBBLESTONE);
                                //添加属性描述
                                itemStack.setAmount(10);
                               // player.setItemInHand(itemStack);
                                player.getInventory().addItem(itemStack);//加进背包



                            //判断参数1是不是1 显示标题
//                            if (args[1].equalsIgnoreCase("1")){
//                                //小标题
//                                TitleAPI.sendSubtitle(player,5,5,4,"傻逼滕珊");
//                            }else if (args[1].equalsIgnoreCase("2")){
//                                //大标题
//                                TitleAPI.sendTitle(player,4,5,5,"傻逼滕珊");
//
//                            }
                            //获得交易界面的GUI
//                            renqiInventory.PlayerrenqiGui(player);



                            //得到离线玩家 并判断最后一次在线时间
//                            OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(args[1]) ;
//                            if (offlinePlayer.isOnline()){//判断玩家是否在线
//                                Player player1 = offlinePlayer.getPlayer();//强转得到离线玩家
//                                //可以对离线玩家的东西进行操作
//                                //player1.getLevel();
//                            }

                            // 获取玩家坐标和瞬移到指定坐标
//                                Location location= player.getLocation();
//                                player.sendMessage("X坐标："+player.getLocation().getX() +"Y坐标："+player.getLocation().getY()+"Z坐标："+player.getLocation().getZ());
//                                Location world = new Location(Bukkit.getWorld("world"),10,100,10);
//                                player.teleport(world);

                            //获取物品实例
//                            ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD);
//                                //添加属性描述
//                                ItemMeta itemMeta = itemStack.getItemMeta();
//                                //显示名字
//                                itemMeta.setDisplayName("这是一把§e钻石剑");
//                                itemMeta.setLore(Arrays.asList("+攻击力：1000","+硬直：200","+体力：300","+智力：300"));
//                                itemStack.setItemMeta(itemMeta);
////                                itemStack.setAmount(10);
//                               // player.setItemInHand(itemStack);
//                                player.getInventory().addItem(itemStack);//加进背包
//
//                            ItemStack itemStack1 = new ItemStack(Material.DIAMOND_AXE);
//                                ItemMeta itemMeta1 = itemStack1.getItemMeta();
//                                //显示名字
//                                itemMeta1.setDisplayName("这是一把§e钻石斧");
//                                itemMeta1.setLore(Arrays.asList("+攻击力：2000","+硬直：300","+体力：400","+智力：400"));
//                                itemStack1.setItemMeta(itemMeta1);
//    //                                itemStack.setAmount(10);
//                                // player.setItemInHand(itemStack);
//                                player.getInventory().addItem(itemStack1);//加进背包
//
//                            ItemStack itemStack2 = new ItemStack(Material.DIAMOND_BOOTS);
//                            ItemMeta itemMeta2 = itemStack2.getItemMeta();
//                            //显示名字
//                            itemMeta2.setDisplayName("这是一把§e钻石斧");
//                            itemMeta2.setLore(Arrays.asList("+攻击力：500","+硬直：300","+体力：400","+智力：400"));
//                            itemStack2.setItemMeta(itemMeta2);
//                            //                                itemStack.setAmount(10);
//                            // player.setItemInHand(itemStack);
//                            player.getInventory().addItem(itemStack2);//加进背包

                            



                    }else {
                            player.sendMessage("§你没得renqi.up权限");
                        }

                    }else if(args[0].equalsIgnoreCase("down")){//不是up就判断是不是down
                        //玩家减少人气
                        if(player.hasPermission("renqi.down")){
                            //有权限进行减少人气

                            new BukkitRunnable(){
                                int s = 10 ;

                                @Override
                                public void run() {
                                    s--;
                                    Location location = player.getLocation();
                                    for (int degree = 0; degree < 360; degree++) {
                                        double radians = Math.toRadians(degree);
                                        double x = Math.cos(radians);
                                        double y = Math.sin(radians);
                                        //在玩家周围加一圈特效
                                        location.add(x, s, y);
                                        //下面的location是add后的坐标
                                        location.getWorld().playEffect(location, Effect.HAPPY_VILLAGER,1);
                                        location.subtract(x, s, y);
                                    }
                                    if (s==0){
                                        cancel();
                                    }
                                }
                            }.runTaskTimer(main.plugin, 0L, 20L);





                            //显示renqi down %renqi_renqi% 的内容
                            //player.sendMessage(PlaceholderAPI.setPlaceholders(player,args[1]));//返回一个字符串


//                            World world = player.getWorld();
//                            Pig pig = (Pig) world.spawnEntity(player.getLocation(), EntityType.PIG);
//                            pig.setCustomNameVisible(true);
//                            pig.setCustomName("§e滕珊");

                        }else {
                            player.sendMessage("§你没得renqi.down权限");
                        }
                    }
                } else if (args.length==3){
                    //renqi add <PlayerName> 1
                    if (args[0].equalsIgnoreCase("add")){
                    //遍历查询在线玩家数量,并获取他们的位置和名字
//                        for (Player player1:Bukkit.getServer().getOnlinePlayers()){
//                            player1.getLocation();
//                            player1.getName();
//                        }

                        //增加人气
                        if(player.hasPermission("renqi.add")){
                            //有权限进行管理员增加人气
                        }else {
                            player.sendMessage("§你没得renqi.add权限,该权限管理员才有");
                        }

                    }else if (args[0].equalsIgnoreCase("remove")){
                        if(player.hasPermission("renqi.remove")){
                            //有权限进行增加人气
                        }else {
                            player.sendMessage("§你没得renqi.remove权限,该权限管理员才有");
                        }
                    }else if (args[0].equalsIgnoreCase("set")){
                        if(player.hasPermission("renqi.set")){
                            //有权限进行管理员设置人气
                        }else {
                            player.sendMessage("§你没得renqi.set权限,该权限管理员才有");
                        }
                    }
                }
            }
        }else {
            sender.sendMessage("你不是玩家，不可以操作");
        }
        return true;
    }
}
