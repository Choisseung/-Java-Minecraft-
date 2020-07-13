package com.minecraft.event;

import com.minecraft.main;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
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
import org.bukkit.scheduler.BukkitRunnable;
import org.omg.CORBA.TypeCodePackage.BadKind;

public class PlayerEvent implements Listener {
    @EventHandler
    public void PlayerJoin(PlayerJoinEvent event){
        event.getPlayer().teleport(new Location(Bukkit.getWorld("world"),0,100,0));
        event.getPlayer().sendMessage("§4欢迎至尊Vip进来");
    }

    @EventHandler
    public void PlayerUse(PlayerInteractEvent event){
        Player player = event.getPlayer();
//        if (event.getAction()== Action.RIGHT_CLICK_BLOCK||event.getAction()==Action.RIGHT_CLICK_AIR) {
        if (event.getAction()==Action.LEFT_CLICK_AIR||event.getAction()==Action.LEFT_CLICK_BLOCK||event.getAction()==Action.PHYSICAL) {

            ItemStack itemStack = new ItemStack(Material.DIAMOND_SWORD);
            itemStack.addEnchantment(Enchantment.DAMAGE_ALL,1);

            ItemStack itemInHand = player.getItemInHand();

            if (itemInHand.equals(itemStack)){
                new BukkitRunnable(){
                    int s = 3;
                    @Override
                    public void run() {
                        s++;
                        Location location = player.getLocation();
                        for (int degree = 0; degree < 360; degree++) {
                            double radians = Math.toRadians(degree);
                            double x = s*Math.cos(radians);
                            double y = s*Math.sin(radians);
                            location.add(x, 0, y);
                            //下面的location是add后的坐标
                            Bukkit.getWorld("world").createExplosion(location, 1);
                            location.subtract(x, 0, y);
                        }
                        if (s == 10) {
                            cancel();
                        }
                    }
                }.runTaskTimer(main.plugin, 0L, 20L);

        }
    }

}
}

//   if (itemInHand.equals(itemStack)){
//
//           new BukkitRunnable(){
//           int s = 1;
//@Override
//public void run() {
//        s--;
//        Location location = player.getLocation();
//        double k = location.getYaw();
//        double q = location.getPitch();
////                        double m = 1;//稀疏度
//        double d = 15;
//        double x1 = location.getX();
//        double x2 = location.getX() + d;
//        double y1 = location.getY();
//        double y2 = location.getY() + d;
//        double z1 = location.getZ();
//        double z2 = location.getZ() + d;
//        double temp = x1;
//
//
//        for (int i = 0; i<d ; i++){
//        double X = 1 + temp;
//        double Y = (((X-x1)*(y2-y1))/(x2-x1) + y1);
//        double Z = (((X-x1)*(z2-z1))/(x2-x1) + z1);//Z是随X变化而变化的因变量
//        temp = X;
//        location.add(X,Y,Z);
//        //下面的location是add后的坐标
//
//        Bukkit.getWorld("world").createExplosion(location, 1);
//        location.subtract(X, Y, Z);
//        }
//
////                        for (int degree = 0; degree < 360; degree++) {
////                            double radians = Math.toRadians(degree);
////                            double x = Math.cos(radians);
////                            double y = Math.sin(radians);
////                        }
//        //在玩家周围加一圈特效
//
//        if (s == 0) {
//        cancel();
//        }
//        }
//        }.runTaskTimer(main.plugin, 0L, 20L);
//
//        }