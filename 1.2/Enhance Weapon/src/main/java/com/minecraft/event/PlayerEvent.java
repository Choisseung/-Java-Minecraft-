package com.minecraft.event;

import com.minecraft.main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.entity.ShulkerBullet;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PlayerEvent implements Listener {
    @EventHandler
    public void PlayerJoin(PlayerJoinEvent event){
//        int num = main.plugin.getConfig().getInt(event.getPlayer().getName());
//        if (num==0){
//            num++;
//            main.plugin.getConfig().set(event.getPlayer().getName(), 1);
//            main.plugin.saveConfig();
//        }else {
//            num++;
//            main.plugin.getConfig().set(event.getPlayer().getName(), num);
//            main.plugin.saveConfig();
//        }
//        event.getPlayer().sendMessage("你是第"+num+"次进入游戏");
        //main.plugin.getLogger().info("触发了加入服务器事件"+event.);
//        event.getPlayer().getLocation().getYaw()
        event.getPlayer().teleport(new Location(Bukkit.getWorld("world"),0,100,0));
        event.getPlayer().sendMessage("§4欢迎至尊Vip进来");
    }

//    @EventHandler
//    public void PlayerMove(PlayerMoveEvent event){
//        event.getPlayer().sendMessage("你不能移动");
//        event.setCancelled(true);
////        if (event.getPlayer().hasPermission())
//    }


    @EventHandler
    public void PlayerUse(PlayerInteractEvent event){
        Player player = event.getPlayer();
//        if (event.getAction()== Action.RIGHT_CLICK_BLOCK||event.getAction()==Action.RIGHT_CLICK_AIR) {
        if (event.getAction()==Action.RIGHT_CLICK_AIR) {
//            Player player = event.getPlayer();
//            ItemStack itemInHand = player.getItemInHand();
//            if (itemInHand!=null){
//                int amount = itemInHand.getAmount();
//                itemInHand.setAmount(amount+1);
//                player.setItemInHand(itemInHand);
//                player.sendMessage("数量增加一个");
            //}
//            Bukkit.getWorld("world");

//            Block clickedBlock = event.getClickedBlock();
//            BlockState state = clickedBlock.getState();//得到方块
//            state.setType(Material.AIR);
//            state.update();
            //自动掉落箱子
            Bukkit.getWorld("world").spawnFallingBlock(player.getLocation(),Material.GOLD_BLOCK,(byte) 1);

            //在箱子得到物品
//            Block clickedBlock = event.getClickedBlock();
//            if (clickedBlock.getType()== Material.CHEST){
            //判断是不是箱子
//                BlockState state = clickedBlock.getState();//得到方块
//                state.setType(Material.AIR);
//                state.update();

//                Chest chest = (Chest) state;
//                Inventory blockInventory = chest.getBlockInventory();
//                ItemStack itemStack = new ItemStack(Material.APPLE);
//                ItemMeta itemMeta = itemStack.getItemMeta();
//                itemMeta.setDisplayName("§e§1超级大苹果");
//                itemStack.setItemMeta(itemMeta);
//                blockInventory.addItem(itemStack);

//            }else {
//                player.sendMessage("§e你右键不是箱子，无法进行物品添加");
//            }
        }
    }

}
