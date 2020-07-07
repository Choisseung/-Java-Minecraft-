package com.minecraft.event;

import com.minecraft.gui.renqiInventory;
import com.minecraft.main;
import com.minecraft.util.VaultUtil;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class InventoryGuiEvent implements Listener {

    @EventHandler
    //只要点击容器的事件都被我们拦截下来
    public void InventoryrenqiClick(InventoryClickEvent event){
        Inventory inventory = event.getInventory();
        String title = inventory.getTitle();//得到容器
        if (title.equalsIgnoreCase(renqiInventory.PlayerrenqiGui)){
            HumanEntity whoClicked = event.getWhoClicked();
            Player player = (Player)whoClicked;
            int rawSlot = event.getRawSlot();
            main.plugin.getLogger().info(String.valueOf(rawSlot));
            if (rawSlot==49){
                //todo 进行收购
                event.setCancelled(true);
                player.sendMessage("收购成功");
                VaultUtil.give(player.getUniqueId(),50);
                player.closeInventory();

                //inventory.getItem()//遍历物品获得价值
            }else if (rawSlot>=0&&rawSlot<=8||rawSlot<=53&&rawSlot>=45||rawSlot==9||rawSlot==18||rawSlot==27||rawSlot==36||rawSlot==26||rawSlot==35||rawSlot==44){
                event.setCancelled(true);
                player.sendMessage("这个不能点击");
            }

        }

    }

}
