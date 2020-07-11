package com.minecraft.command;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class enhance implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
       //判断是不是玩家
        if (sender instanceof Player){
            //强转玩家类型
            Player player = (Player) sender;

            //判断玩家有没有使用命令的权限
            if (!player.hasPermission("Weaponplugin.enhance")){
                return true;
            }
//            sender.sendMessage("你好");
            //判断命令是否输入正确

            if (label.equalsIgnoreCase("enhance")){
                //enhance normal <Playname>
                //判断是不是输入normal命令
                    if (args[0].equalsIgnoreCase("normal")){

                        if (player.hasPermission("enhance.normal")){
                            //获得普通强化石
                            ItemStack itemStack = new ItemStack(Material.EMERALD);//青金石块
                                //添加属性描述
                                ItemMeta itemMeta = itemStack.getItemMeta();
                                //显示名字
                                itemMeta.setDisplayName("§e普通强化石");
                                itemMeta.setLore(Arrays.asList("[§6§l功能]","§2提升武器攻击力/装备等级","§e提升15%的强化几率","[§6§l用法]","§2放到熔炉，燃烧武器/装备"));
                                itemStack.setItemMeta(itemMeta);
                                player.getInventory().addItem(itemStack);//加进背包
                        }else {
                            player.sendMessage("§你没获得普通强化石的权限");
                        }
                    }else if(args[0].equalsIgnoreCase("luck")){
                        if (player.hasPermission("enhance.luck")){
                            //获得幸运强化石
                            ItemStack itemStack1 = new ItemStack(Material.EMERALD);//青金石块
                            //添加属性描述
                            ItemMeta itemMeta1 = itemStack1.getItemMeta();
                            //显示名字
                            itemMeta1.setDisplayName("§d幸运强化石");
                            itemMeta1.setLore(Arrays.asList("[§6§l功能]","§2提升武器攻击力/装备等级","§e提升25%的强化几率","[§6§l用法]","§2放到熔炉，燃烧武器/装备"));
                            itemStack1.setItemMeta(itemMeta1);
                            player.getInventory().addItem(itemStack1);//加进背包
                        }else {
                            player.sendMessage("§3你没得enhance.luck权限");
                        }
                    }
                else if (args[0].equalsIgnoreCase("superluck")){
                        if (player.hasPermission("enhance.superluck")){
                            //获得厄运强化石
                            ItemStack itemStack2 = new ItemStack(Material.EMERALD);//青金石块
                            //添加属性描述
                            ItemMeta itemMeta2 = itemStack2.getItemMeta();
                            //显示名字
                            itemMeta2.setDisplayName("§b超级幸运强化石");
                            itemMeta2.setLore(Arrays.asList("[§6§l功能]","§2提升武器攻击力/装备等级","§e提升40%的强化几率","[§6§l用法]","§2放到熔炉，燃烧武器/装备"));
                            itemStack2.setItemMeta(itemMeta2);
                            player.getInventory().addItem(itemStack2);//加进背包
                        }else {
                            player.sendMessage("§3你没得enhance.superluck权限");
                        }
                    }else if (args[0].equalsIgnoreCase("risk")){
                        if (player.hasPermission("enhance.risk")){
                            //获得厄运运强化石
                            ItemStack itemStack3 = new ItemStack(Material.EMERALD);//青金石块
                            //添加属性描述
                            ItemMeta itemMeta3 = itemStack3.getItemMeta();
                            //显示名字
                            itemMeta3.setDisplayName("§8厄运强化石");
                            itemMeta3.setLore(Arrays.asList("[§6§l功能]", "§2提升武器攻击力/装备等级", "§e提升60%的强化几率", "§8有%50的几率武器碎裂", "[§6§l用法]", "§2放到熔炉，燃烧武器/装备"));
                            itemStack3.setItemMeta(itemMeta3);
                            player.getInventory().addItem(itemStack3);//加进背包
                        }else {
                            player.sendMessage("§3你没得enhance.risk权限");
                        }
                    }else if (args[0].equalsIgnoreCase("vip")){
                        if (player.hasPermission("enhance.vip")){
                            //获得vip强化石
                            ItemStack itemStack4 = new ItemStack(Material.EMERALD);//青金石块
                            //添加属性描述
                            ItemMeta itemMeta4 = itemStack4.getItemMeta();
                            //显示名字
                            itemMeta4.setDisplayName("§4vip强化石");
                            itemMeta4.setLore(Arrays.asList("[§6§l功能]","§2提升武器攻击力/装备等级","§e超高50%的强化几率","§4vip用户专用","[§6§l用法]","§2放到熔炉，燃烧武器/装备"));
                            itemStack4.setItemMeta(itemMeta4);
                            player.getInventory().addItem(itemStack4);//加进背包
                        }else {
                            player.sendMessage("§3你没得enhance.vip权限");
                        }
                    }else if (args[0].equalsIgnoreCase("admin")){
                        if (player.hasPermission("enhance.admin")){
                            //获得管理强化石
                            ItemStack itemStack5 = new ItemStack(Material.EMERALD);//青金石块
                            //添加属性描述
                            ItemMeta itemMeta5 = itemStack5.getItemMeta();
                            //显示名字
                            itemMeta5.setDisplayName("§9管理强化石");
                            itemMeta5.setLore(Arrays.asList("[§6§l功能]", "§9直接强化到最高等级", "[§6§l用法]", "§2放到熔炉，燃烧武器/装备"));
                            itemStack5.setItemMeta(itemMeta5);
                            player.getInventory().addItem(itemStack5);//加进背包
                        }else {
                            player.sendMessage("§3你没得enhance.admin权限");
                        }
                    }else if (args[0].equalsIgnoreCase("safe")){
                        if (player.hasPermission("enhance.safe")){
                            //获得管理强化石
                            ItemStack itemStack6 = new ItemStack(Material.EMERALD);//青金石块
                            //添加属性描述
                            ItemMeta itemMeta6 = itemStack6.getItemMeta();
                            //显示名字
                            itemMeta6.setDisplayName("§9安全强化石");
                            itemMeta6.setLore(Arrays.asList("[§6§l功能]", "§4强化失败武器不会碎裂","§e提升40%的强化几率", "[§6§l用法]", "§2放到熔炉，燃烧武器/装备"));
                            itemStack6.setItemMeta(itemMeta6);
                            player.getInventory().addItem(itemStack6);//加进背包
                        }
                    }



//                if (args.length==4){
//                    //判断是不是输入luck命令
//                    if (args[0].equalsIgnoreCase("luck")){
//                        if (player.hasPermission("enhance.luck")){
//                        //获得幸运强化石
//                        ItemStack itemStack = new ItemStack(Material.LAPIS_BLOCK);//青金石块
//                        //添加属性描述
//                        ItemMeta itemMeta = itemStack.getItemMeta();
//                        //显示名字
//                        itemMeta.setDisplayName("§d幸运强化石");
//                        itemMeta.setLore(Arrays.asList("[§6§l功能]","§1提升武器攻击力/装备等级","§e提升25%的强化几率","[§6§l用法]","§2放到熔炉，燃烧武器/装备"));
//                        itemStack.setItemMeta(itemMeta);
//                        player.getInventory().addItem(itemStack);//加进背包
//                    }else {
//                        player.sendMessage("§你没获得幸运强化石的权限");
//                    }
//                }}


//                if (args.length==9){
//                    //判断是不是输入superluck命令
//                    if (args[0].equalsIgnoreCase("superluck")){
//                        if (player.hasPermission("enhance.superluck")){
//                        //获得幸运强化石
//                        ItemStack itemStack = new ItemStack(Material.LAPIS_BLOCK);//青金石块
//                        //添加属性描述
//                        ItemMeta itemMeta = itemStack.getItemMeta();
//                        //显示名字
//                        itemMeta.setDisplayName("§b超级幸运强化石");
//                        itemMeta.setLore(Arrays.asList("[§6§l功能]","§1提升武器攻击力/装备等级","§e提升40%的强化几率","[§6§l用法]","§2放到熔炉，燃烧武器/装备"));
//                        itemStack.setItemMeta(itemMeta);
//                        player.getInventory().addItem(itemStack);//加进背包
//                    }else {
//                        player.sendMessage("§你没获得超级幸运强化石的权限");
//                    }
//                }
//                }

//                if (args.length==4) {
//                    //判断是不是输入risk命令
//                    if (args[0].equalsIgnoreCase("risk")) {
//                        if (player.hasPermission("enhance.normal")) {
//                            //获得风险强化石
//                            ItemStack itemStack = new ItemStack(Material.LAPIS_BLOCK);//青金石块
//                            //添加属性描述
//                            ItemMeta itemMeta = itemStack.getItemMeta();
//                            //显示名字
//                            itemMeta.setDisplayName("§8风险强化石");
//                            itemMeta.setLore(Arrays.asList("[§6§l功能]", "§1提升武器攻击力/装备等级", "§e提升60%的强化几率", "§8有%50的几率武器碎裂", "[§6§l用法]", "§2放到熔炉，燃烧武器/装备"));
//                            itemStack.setItemMeta(itemMeta);
//                            player.getInventory().addItem(itemStack);//加进背包
//                        } else {
//                            player.sendMessage("§你没获得风险强化石的权限");
//                        }
//                    }
//                }

//                if (args.length==3){
//                    //判断是不是输入risk命令
//                    if (args[0].equalsIgnoreCase("vip")){
//                        if (player.hasPermission("enhance.vip")){
//                        //获得vip强化石
//                        ItemStack itemStack = new ItemStack(Material.LAPIS_BLOCK);//青金石块
//                        //添加属性描述
//                        ItemMeta itemMeta = itemStack.getItemMeta();
//                        //显示名字
//                        itemMeta.setDisplayName("§4风险强化石");
//                        itemMeta.setLore(Arrays.asList("[§6§l功能]","§1提升武器攻击力/装备等级","§4vip用户专用","§e超高50%的强化几率","[§6§l用法]","§2放到熔炉，燃烧武器/装备"));
//                        itemStack.setItemMeta(itemMeta);
//                        player.getInventory().addItem(itemStack);//加进背包
//                    }else {
//                        player.sendMessage("§你没获得vip强化石的权限");
//                    }
//                }}

//                if (args.length==5) {
//                    //判断是不是输入risk命令
//                    if (args[0].equalsIgnoreCase("admin")) {
//                        if (player.hasPermission("enhance.normal")) {
//                            //获得管理强化石
//                            ItemStack itemStack = new ItemStack(Material.LAPIS_BLOCK);//青金石块
//                            //添加属性描述
//                            ItemMeta itemMeta = itemStack.getItemMeta();
//                            //显示名字
//                            itemMeta.setDisplayName("§9管理强化石");
//                            itemMeta.setLore(Arrays.asList("[§6§l管理强化石]", "§9直接强化到最高等级", "[§6§l用法]", "§4放到熔炉，燃烧武器/装备"));
//                            itemStack.setItemMeta(itemMeta);
//                            player.getInventory().addItem(itemStack);//加进背包
//                        } else {
//                            player.sendMessage("§你没获得管理强化石的权限");
//                        }
//                    }
//                }
            }

        }else {
            sender.sendMessage("你没有获得任何强化石的权限");
        }
        return true;
    }
}
