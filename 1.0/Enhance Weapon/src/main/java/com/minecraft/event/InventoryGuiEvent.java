package com.minecraft.event;

import com.minecraft.gui.smelterInventory;
import com.minecraft.main;
import com.minecraft.util.VaultUtil;
import org.bukkit.Material;
import org.bukkit.block.Furnace;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import com.minecraft.command.enhance;
import org.bukkit.inventory.meta.ItemMeta;
import com.minecraft.main;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class InventoryGuiEvent implements Listener {
    public static FileConfiguration config;
    public static ItemStack normalItem;
    public static ItemStack superluckItem;
    public static ItemStack luckItem;
    public static ItemStack safeItem;
    public static ItemStack riskItem;
    public static ItemStack vipItem;
    public static ItemStack adminItem;



    @EventHandler
    public void InventorysmelterClick(InventoryClickEvent event){

        Inventory inventory = event.getInventory();
        String title = inventory.getTitle();//得到强化熔炉这个容器

        if (title.equalsIgnoreCase(smelterInventory.SmelterGui)){
            HumanEntity whoClicked = event.getWhoClicked();
            Player player = (Player) whoClicked;
            int rawSlot = event.getRawSlot();//获得点击哪个格子事件
            main.plugin.getLogger().info(String.valueOf(rawSlot));




            ItemStack itemStack = new ItemStack(Material.EMERALD);//青金石块
            ItemMeta itemMeta = itemStack.getItemMeta();
            itemMeta.setDisplayName("§e普通强化石");
            itemMeta.setLore(Arrays.asList("[§6§l功能]","§2提升武器攻击力/装备等级","§e提升15%的强化几率","[§6§l用法]","§2放到熔炉，燃烧武器/装备"));
            itemStack.setItemMeta(itemMeta);

            ItemStack itemStack1 = new ItemStack(Material.EMERALD);//青金石块
            ItemMeta itemMeta1 = itemStack1.getItemMeta();
            itemMeta1.setDisplayName("§d幸运强化石");
            itemMeta1.setLore(Arrays.asList("[§6§l功能]","§2提升武器攻击力/装备等级","§e提升25%的强化几率","[§6§l用法]","§2放到熔炉，燃烧武器/装备"));
            itemStack1.setItemMeta(itemMeta1);

            ItemStack itemStack2 = new ItemStack(Material.EMERALD);//青金石块
            ItemMeta itemMeta2 = itemStack2.getItemMeta();
            itemMeta2.setDisplayName("§b超级幸运强化石");
            itemMeta2.setLore(Arrays.asList("[§6§l功能]","§2提升武器攻击力/装备等级","§e提升40%的强化几率","[§6§l用法]","§2放到熔炉，燃烧武器/装备"));
            itemStack2.setItemMeta(itemMeta2);

            ItemStack itemStack3 = new ItemStack(Material.EMERALD);//青金石块
            ItemMeta itemMeta3 = itemStack3.getItemMeta();
            itemMeta3.setDisplayName("§8厄运强化石");
            itemMeta3.setLore(Arrays.asList("[§6§l功能]", "§2提升武器攻击力/装备等级", "§e提升60%的强化几率", "§8有%50的几率武器碎裂", "[§6§l用法]", "§2放到熔炉，燃烧武器/装备"));
            itemStack3.setItemMeta(itemMeta3);

            ItemStack itemStack4 = new ItemStack(Material.EMERALD);//青金石块
            ItemMeta itemMeta4 = itemStack4.getItemMeta();
            itemMeta4.setDisplayName("§4vip强化石");
            itemMeta4.setLore(Arrays.asList("[§6§l功能]","§2提升武器攻击力/装备等级","§e超高50%的强化几率","§4vip用户专用","[§6§l用法]","§2放到熔炉，燃烧武器/装备"));
            itemStack4.setItemMeta(itemMeta4);


            ItemStack itemStack5 = new ItemStack(Material.EMERALD);//青金石块
            ItemMeta itemMeta5 = itemStack5.getItemMeta();
            itemMeta5.setDisplayName("§9管理强化石");
            itemMeta5.setLore(Arrays.asList("[§6§l功能]", "§9直接强化到最高等级", "[§6§l用法]", "§2放到熔炉，燃烧武器/装备"));
            itemStack5.setItemMeta(itemMeta5);


            ItemStack itemStack6 = new ItemStack(Material.EMERALD);//青金石块
            ItemMeta itemMeta6 = itemStack6.getItemMeta();
            itemMeta6.setDisplayName("§9安全强化石");
            itemMeta6.setLore(Arrays.asList("[§6§l功能]", "§4强化失败武器不会碎裂","§e提升40%的强化几率", "[§6§l用法]", "§2放到熔炉，燃烧武器/装备"));
            itemStack6.setItemMeta(itemMeta6);




//            HashMap<Integer, Integer> hasHMap = new HashMap<>();
//            //产生200个随机整数并赋值
//            for(int i=0; i<97; i++){
//                int random = (int)(Math.random()*100);
//                if(hasHMap.containsKey(random)){
//                    hasHMap.put(random, hasHMap.get(random)+1);  //替换旧值
//                }else{
//                    hasHMap.put(random, 1);
//                }
//            }




            if (rawSlot==49){
                //todo 进行强化
                if (inventory.contains(itemStack)){
                    int[] arr = new int[97];//10个数的数组
                    for (int i = 0; i < arr.length; i++) {
                        //生产一个1-20的随机数
                        int index = (int)(Math.random() * 100 + 1);
                        arr[i] = index;//把随机数赋值给下标为数组下标为i的值
                        //（遍历数组中储存进去的值，i中有几个值则循环几次）
                        for (int j = 0; j < i; j++)
                        {
                            //把储存在数组中的值j 和 随机出的值i 做比较
                            if (arr[j] ==arr[i])
                            {
                                i--; //数组的值下标-1，i的循环次数回到上次
                                break;
                            }
                        }
                    }
                    int []arr2 = { 1, 2, 3,55,45,66,88,9,7,8,13,57,33,20,21,22,24,25,23};

                    if (Arrays.equals(arr, arr2)){
                        player.sendMessage("强化失败");
                    }else {
                        ItemStack itemStack7 = new ItemStack(Material.DIAMOND_SWORD);//青金石块
                        itemStack7.addEnchantment(Enchantment.DAMAGE_ALL,5);
                        player.getInventory().addItem(itemStack7);//加进背包
                        player.sendMessage("使用普通强化石强化成功");
                    }


                }else if (inventory.contains(itemStack1)){
                    player.sendMessage("使用幸运强化石强化成功");
                }else if (inventory.contains(itemStack2)){
                    player.sendMessage("使用超级幸运强化石强化成功");
                }else if (inventory.contains(itemStack3)){
                    player.sendMessage("使用厄运强化石强化成功");
                }else if (inventory.contains(itemStack4)){
                    player.sendMessage("使用vip强化石强化成功");
                }else if (inventory.contains(itemStack5)){
                    player.sendMessage("使用管理强化石强化成功");
                }else if (inventory.contains(itemStack6)){
                    player.sendMessage("使用安全强化石强化成功");
                }else {
                    player.sendMessage("强化失败");
                }
                event.setCancelled(true);
//                VaultUtil.give(player.getUniqueId(),50);
                player.closeInventory();

            }
            else if (rawSlot>=0&&rawSlot<=17||rawSlot<=53&&rawSlot>=45||rawSlot>=18&&rawSlot<=26||rawSlot>=27&&rawSlot<=30||rawSlot>=32&&rawSlot<=35||rawSlot>=36&&rawSlot<=39||rawSlot>=41&&rawSlot<=44){
                event.setCancelled(true);
                player.sendMessage("这个不能点击");
            }

             else if (rawSlot==40){

                 player.sendMessage("这个格子只能放强化石");
            }
            else if (rawSlot==31){
                player.sendMessage("这个格子只能放武器/装备");
            }

        }

    }
}



 //if (inventory.contains(main.normalItem)&&inventory.contains(Material.DIAMOND_SWORD)){
//                    player.sendMessage("强化成功");
//                }else if (inventory.contains(main.luckItem)&&inventory.contains(Material.DIAMOND_SWORD)){
//                    player.sendMessage("强化成功");
//                }
