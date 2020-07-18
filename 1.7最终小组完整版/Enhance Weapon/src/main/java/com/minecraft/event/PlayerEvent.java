package com.minecraft.event;

import com.minecraft.main;
import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.entity.Entity;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.event.entity.EntityDamageByEntityEvent;


public class PlayerEvent implements Listener {
//    @EventHandler
//    public void PlayerJoin(PlayerJoinEvent event){
//        event.getPlayer().teleport(new Location(Bukkit.getWorld("world"),500,100,500));
//        event.getPlayer().sendMessage("§4欢迎至尊Vip进来");
//    }

    @EventHandler
    public void PlayerUse(PlayerInteractEvent event){
        Player player = event.getPlayer();
//        if (event.getAction()== Action.RIGHT_CLICK_BLOCK||event.getAction()==Action.RIGHT_CLICK_AIR) {

        ItemStack itemInHand = player.getItemInHand();


            ItemStack itemStack7777 = new ItemStack(Material.DIAMOND_SWORD);
            itemStack7777.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta7777 = itemStack7777.getItemMeta();
            itemMeta7777.setDisplayName("§e+4钻石剑");
            itemStack7777.setItemMeta(itemMeta7777);

            ItemStack itemStack8888 = new ItemStack(Material.DIAMOND_SWORD);
            itemStack8888.addEnchantment(Enchantment.DAMAGE_ALL,5);
            ItemMeta itemMeta8888 = itemStack8888.getItemMeta();
            itemMeta8888.setDisplayName("§e+5钻石剑");
            itemStack8888.setItemMeta(itemMeta8888);


            ItemStack itemStack9999 = new ItemStack(Material.DIAMOND_AXE);
            itemStack9999.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta9999 = itemStack9999.getItemMeta();
            itemMeta9999.setDisplayName("§e+4钻石斧");
            itemStack9999.setItemMeta(itemMeta9999);

            ItemStack itemStack0000 = new ItemStack(Material.DIAMOND_AXE);
            itemStack0000.addEnchantment(Enchantment.DAMAGE_ALL,5);
            ItemMeta itemMeta0000= itemStack0000.getItemMeta();
            itemMeta0000.setDisplayName("§e+5钻石斧");
            itemStack0000.setItemMeta(itemMeta0000);




            ItemStack itemStack11111 = new ItemStack(Material.GOLD_SWORD);
            itemStack11111.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta11111 = itemStack11111.getItemMeta();
            itemMeta11111.setDisplayName("§e+4金剑");
            itemStack11111.setItemMeta(itemMeta11111);

            ItemStack itemStack22222 = new ItemStack(Material.GOLD_SWORD);
            itemStack22222.addEnchantment(Enchantment.DAMAGE_ALL,5);
            ItemMeta itemMeta22222 = itemStack22222.getItemMeta();
            itemMeta22222.setDisplayName("§e+5金剑");
            itemStack22222.setItemMeta(itemMeta22222);

            ItemStack itemStack33333 = new ItemStack(Material.GOLD_AXE);
            itemStack33333.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta33333 = itemStack33333.getItemMeta();
            itemMeta33333.setDisplayName("§e+4金斧");
            itemStack33333.setItemMeta(itemMeta33333);

            ItemStack itemStack44444 = new ItemStack(Material.GOLD_AXE);
            itemStack44444.addEnchantment(Enchantment.DAMAGE_ALL,5);
            ItemMeta itemMeta44444 = itemStack44444.getItemMeta();
            itemMeta44444.setDisplayName("§e+5金斧");
            itemStack44444.setItemMeta(itemMeta44444);

            ItemStack itemStack215 = new ItemStack(Material.IRON_SWORD);
            itemStack215.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta215 = itemStack215.getItemMeta();
            itemMeta215.setDisplayName("§e+4铁剑");
            itemStack215.setItemMeta(itemMeta215);

            ItemStack itemStack2151 = new ItemStack(Material.IRON_SWORD);
            itemStack2151.addEnchantment(Enchantment.DAMAGE_ALL,5);
            ItemMeta itemMeta2151 = itemStack2151.getItemMeta();
            itemMeta2151.setDisplayName("§e+5铁剑");
            itemStack2151.setItemMeta(itemMeta2151);

            ItemStack itemStack225 = new ItemStack(Material.IRON_AXE);
            itemStack225.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta225 = itemStack225.getItemMeta();
            itemMeta225.setDisplayName("§e+4铁斧");
            itemStack225.setItemMeta(itemMeta225);

            ItemStack itemStack2251 = new ItemStack(Material.IRON_AXE);
            itemStack2251.addEnchantment(Enchantment.DAMAGE_ALL,5);
            ItemMeta itemMeta2251 = itemStack2251.getItemMeta();
            itemMeta2251.setDisplayName("§e+5铁斧");
            itemStack2251.setItemMeta(itemMeta2251);

            ItemStack itemStack235 = new ItemStack(Material.STONE_SWORD);
            itemStack235.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta235 = itemStack235.getItemMeta();
            itemMeta235.setDisplayName("§e+4石剑");
            itemStack235.setItemMeta(itemMeta235);

            ItemStack itemStack2351 = new ItemStack(Material.STONE_SWORD);
            itemStack2351.addEnchantment(Enchantment.DAMAGE_ALL,5);
            ItemMeta itemMeta2351 = itemStack2351.getItemMeta();
            itemMeta2351.setDisplayName("§e+5石剑");
            itemStack2351.setItemMeta(itemMeta2351);

            ItemStack itemStack245 = new ItemStack(Material.STONE_AXE);
            itemStack245.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta245 = itemStack245.getItemMeta();
            itemMeta245.setDisplayName("§e+4石斧");
            itemStack245.setItemMeta(itemMeta245);

            ItemStack itemStack2451 = new ItemStack(Material.STONE_AXE);
            itemStack2451.addEnchantment(Enchantment.DAMAGE_ALL,5);
            ItemMeta itemMeta2451 = itemStack2451.getItemMeta();
            itemMeta2451.setDisplayName("§e+5石斧");
            itemStack2451.setItemMeta(itemMeta2451);

            ItemStack itemStack255 = new ItemStack(Material.WOOD_SWORD);
            itemStack255.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta255 = itemStack255.getItemMeta();
            itemMeta255.setDisplayName("§e+4木剑");
            itemStack255.setItemMeta(itemMeta255);

            ItemStack itemStack2551 = new ItemStack(Material.WOOD_SWORD);
            itemStack2551.addEnchantment(Enchantment.DAMAGE_ALL,5);
            ItemMeta itemMeta2551 = itemStack2551.getItemMeta();
            itemMeta2551.setDisplayName("§e+5木剑");
            itemStack2551.setItemMeta(itemMeta2551);

            ItemStack itemStack265 = new ItemStack(Material.WOOD_AXE);
            itemStack265.addEnchantment(Enchantment.DAMAGE_ALL,4);
            ItemMeta itemMeta265 = itemStack265.getItemMeta();
            itemMeta265.setDisplayName("§e+4木斧");
            itemStack265.setItemMeta(itemMeta265);

            ItemStack itemStack2651 = new ItemStack(Material.WOOD_AXE);
            itemStack2651.addEnchantment(Enchantment.DAMAGE_ALL,5);
            ItemMeta itemMeta2651 = itemStack2651.getItemMeta();
            itemMeta2651.setDisplayName("§e+5木斧");
            itemStack2651.setItemMeta(itemMeta2651);

        if (itemInHand.hasItemMeta()&&itemInHand.getItemMeta().hasDisplayName()){
            //4级钻石武器攻击特效 前火
            if (itemInHand.getItemMeta().getDisplayName().equals(itemStack9999.getItemMeta().getDisplayName())||itemInHand.getItemMeta().getDisplayName().equals(itemStack7777.getItemMeta().getDisplayName())){
                if (event.getAction()==Action.RIGHT_CLICK_AIR||event.getAction()==Action.RIGHT_CLICK_BLOCK) {
                    new BukkitRunnable() {
                        int s = 0;
                        @Override
                        public void run() {
                            s++;
//                            Location location = player.getLocation();
                            PlayerFixedCoordinate coordinate = new PlayerFixedCoordinate(player.getLocation());
                            for (int i= 1;i<3;i++){
//                                double x = s+i;
                                double y = s+i;
//                                location.add(x,0,y);
                                Location location = coordinate.newLocation(0, y);
//                                Bukkit.getWorld("world").strikeLightning(location);
                                Bukkit.getWorld("world").spawnFallingBlock(location, Material.FIRE,(byte) 1);
                                Bukkit.getWorld("world_nether").spawnFallingBlock(location, Material.FIRE,(byte) 1);
                                Bukkit.getWorld("world_the_end").spawnFallingBlock(location, Material.FIRE,(byte) 1);
                            }
                            if (s == 6) {
                                cancel();
                            }
                        }
                    }.runTaskTimer(main.plugin, 0L, 5L);
                }
        }

            //5级钻石武器攻击特效 围火
            if (itemInHand.getItemMeta().getDisplayName().equals(itemStack8888.getItemMeta().getDisplayName())||itemInHand.getItemMeta().getDisplayName().equals(itemStack0000.getItemMeta().getDisplayName())){
                player.setAllowFlight(true);
                if (event.getAction()==Action.RIGHT_CLICK_AIR||event.getAction()==Action.RIGHT_CLICK_BLOCK) {
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
//                            Bukkit.getWorld("world").createExplosion(location, 1);
//                            Bukkit.getWorld("world").createExplosion(location, 1,true);
                            Bukkit.getWorld("world").spawnFallingBlock(location, Material.FIRE,(byte) 1);
                            Bukkit.getWorld("world_nether").spawnFallingBlock(location, Material.FIRE,(byte) 1);
                            Bukkit.getWorld("world_the_end").spawnFallingBlock(location, Material.FIRE,(byte) 1);
                            location.subtract(x, 0, y);
                        }
                        if (s == 8) {
                            cancel();
                        }
                    }
                }.runTaskTimer(main.plugin, 0L, 5L);
            }}else {player.setAllowFlight(false);}

            //4级金武器攻击特效  前电
            if (itemInHand.getItemMeta().getDisplayName().equals(itemStack11111.getItemMeta().getDisplayName())||itemInHand.getItemMeta().getDisplayName().equals(itemStack33333.getItemMeta().getDisplayName())){
                if (event.getAction()==Action.RIGHT_CLICK_AIR||event.getAction()==Action.RIGHT_CLICK_BLOCK) {
                    new BukkitRunnable() {
                        int s = 3;
                        @Override
                        public void run() {
                            s++;
//                            Location location = player.getLocation();
                            PlayerFixedCoordinate coordinate = new PlayerFixedCoordinate(player.getLocation());
                            for (int i= 1;i<3;i++){
//                                double x = s+i;
                                double y = s+i;
//                                location.add(x,0,y);
                                Location location = coordinate.newLocation(0, y);
                                Bukkit.getWorld("world").strikeLightning(location);
                                Bukkit.getWorld("world_nether").strikeLightning(location);
                                Bukkit.getWorld("world_the_end").strikeLightning(location);
//                                Bukkit.getWorld("world").spawnFallingBlock(location, Material.FIRE,(byte) 1);
                            }
                            if (s == 6) {
                                cancel();
                            }
                        }
                    }.runTaskTimer(main.plugin, 0L, 5L);

            }}

            //5级金武器攻击特效  前电
            if (itemInHand.getItemMeta().getDisplayName().equals(itemStack22222.getItemMeta().getDisplayName())||itemInHand.getItemMeta().getDisplayName().equals(itemStack44444.getItemMeta().getDisplayName())){
                if (event.getAction()==Action.RIGHT_CLICK_AIR||event.getAction()==Action.RIGHT_CLICK_BLOCK) {
                    new BukkitRunnable() {
                        int s = 3;
                        @Override
                        public void run() {
                            s++;
//                            Location location = player.getLocation();
                            PlayerFixedCoordinate coordinate = new PlayerFixedCoordinate(player.getLocation());
                            for (int i= 1;i<3;i++){
//                                double x = s+i;
                                double y = s+i;
//                                location.add(x,0,y);
                                Location location = coordinate.newLocation(0, y);
                                Bukkit.getWorld("world").strikeLightning(location);
                                Bukkit.getWorld("world_nether").strikeLightning(location);
                                Bukkit.getWorld("world_the_end").strikeLightning(location);
//                                Bukkit.getWorld("world").spawnFallingBlock(location, Material.FIRE,(byte) 1);
                            }
                            if (s == 8) {
                                cancel();
                            }
                        }
                    }.runTaskTimer(main.plugin, 0L, 10L);

                }}

            //4级铁武器攻击特效  前爆炸
            if (itemInHand.getItemMeta().getDisplayName().equals(itemStack215.getItemMeta().getDisplayName())||itemInHand.getItemMeta().getDisplayName().equals(itemStack225.getItemMeta().getDisplayName())){
                if (event.getAction()==Action.RIGHT_CLICK_AIR||event.getAction()==Action.RIGHT_CLICK_BLOCK) {
                    new BukkitRunnable(){
                        int s = 1;
                        @Override
                        public void run() {
                            s++;
//                            Location location = player.getLocation();
                            PlayerFixedCoordinate coordinate = new PlayerFixedCoordinate(player.getLocation());
                            for (int i= 1;i<3;i++){
//                                double x = s+i;
                                double y = s+i;
//                                location.add(x,0,y);
                                Location location = coordinate.newLocation(0, y);
//                                Bukkit.getWorld("world").strikeLightning(location);
//                                Bukkit.getWorld("world").spawnFallingBlock(location, Material.FIRE,(byte) 1);
//                                Bukkit.getWorld("world").generateTree(location, TreeType.BIG_TREE);
                                Bukkit.getWorld("world").createExplosion(location, 1);
                                Bukkit.getWorld("world_nether").createExplosion(location, 1);
                                Bukkit.getWorld("world_the_end").createExplosion(location, 1);
                            }
                            if (s == 8) {
                                cancel();
                            }
                        }
                    }.runTaskTimer(main.plugin, 0L, 8L);



                }}

            //5级铁武器攻击特效  围爆炸 设置方块着火
            if (itemInHand.getItemMeta().getDisplayName().equals(itemStack2151.getItemMeta().getDisplayName())||itemInHand.getItemMeta().getDisplayName().equals(itemStack2251.getItemMeta().getDisplayName())){
                if (event.getAction()==Action.RIGHT_CLICK_AIR||event.getAction()==Action.RIGHT_CLICK_BLOCK) {
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
//                            Bukkit.getWorld("world").createExplosion(location, 1);
                            Bukkit.getWorld("world").createExplosion(location, 1,true);
                                Bukkit.getWorld("world_nether").createExplosion(location, 1,true);
                                Bukkit.getWorld("world_the_end").createExplosion(location, 1,true);
//                                Bukkit.getWorld("world").spawnFallingBlock(location, Material.FIRE,(byte) 2);
                                location.subtract(x, 0, y);
                            }
                            if (s == 8) {
                                cancel();
                            }
                        }
                    }.runTaskTimer(main.plugin, 0L, 5L);



                }}

            //4级石武器攻击特效 围水
            if (itemInHand.getItemMeta().getDisplayName().equals(itemStack235.getItemMeta().getDisplayName())||itemInHand.getItemMeta().getDisplayName().equals(itemStack245.getItemMeta().getDisplayName())){
                if (event.getAction()==Action.RIGHT_CLICK_AIR||event.getAction()==Action.RIGHT_CLICK_BLOCK) {
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
//                            Bukkit.getWorld("world").createExplosion(location, 1);
//                                Bukkit.getWorld("world").createExplosion(location, 1,true);
                                Bukkit.getWorld("world").spawnFallingBlock(location, Material.WATER,(byte) 1);
                                Bukkit.getWorld("world_nether").spawnFallingBlock(location, Material.WATER,(byte) 1);
                                Bukkit.getWorld("world_the_end").spawnFallingBlock(location, Material.WATER,(byte) 1);
                                location.subtract(x, 0, y);
                            }
                            if (s == 5) {
                                cancel();
                            }
                        }
                    }.runTaskTimer(main.plugin, 0L, 5L);
                }}

            //5级石武器攻击特效 围水
            if (itemInHand.getItemMeta().getDisplayName().equals(itemStack2351.getItemMeta().getDisplayName())||itemInHand.getItemMeta().getDisplayName().equals(itemStack2451.getItemMeta().getDisplayName())){
                if (event.getAction()==Action.RIGHT_CLICK_AIR||event.getAction()==Action.RIGHT_CLICK_BLOCK) {
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
//                            Bukkit.getWorld("world").createExplosion(location, 1);
//                                Bukkit.getWorld("world").createExplosion(location, 1,true);
                                Bukkit.getWorld("world").spawnFallingBlock(location, Material.WATER,(byte) 2);
                                Bukkit.getWorld("world_nether").spawnFallingBlock(location, Material.WATER,(byte) 2);
                                Bukkit.getWorld("world_the_end").spawnFallingBlock(location, Material.WATER,(byte) 2);
                                location.subtract(x, 0, y);
                            }
                            if (s == 10) {
                                cancel();
                            }
                        }
                    }.runTaskTimer(main.plugin, 0L, 5L);




                }}

            //4级木武器攻击特效 前木
            if (itemInHand.getItemMeta().getDisplayName().equals(itemStack255.getItemMeta().getDisplayName())||itemInHand.getItemMeta().getDisplayName().equals(itemStack265.getItemMeta().getDisplayName())){
                if (event.getAction()==Action.RIGHT_CLICK_AIR||event.getAction()==Action.RIGHT_CLICK_BLOCK) {
                    new BukkitRunnable(){
                        int s = 3;
                        @Override
                        public void run() {
                            s++;
//                            Location location = player.getLocation();
                            PlayerFixedCoordinate coordinate = new PlayerFixedCoordinate(player.getLocation());
                            for (int i= 1;i<3;i++){
//                                double x = s+i;
                                double y = s+i;
//                                location.add(x,0,y);
                                Location location = coordinate.newLocation(0, y);
//                                Bukkit.getWorld("world").strikeLightning(location);
//                                Bukkit.getWorld("world").spawnFallingBlock(location, Material.FIRE,(byte) 1);
                                Bukkit.getWorld("world").generateTree(location, TreeType.BIG_TREE);
                                Bukkit.getWorld("world_nether").generateTree(location, TreeType.BIG_TREE);
                                Bukkit.getWorld("world_the_end").generateTree(location, TreeType.BIG_TREE);
//                                Bukkit.getWorld("world").createExplosion(location, 1);
                            }
                            if (s == 5) {
                                cancel();
                            }
                        }
                    }.runTaskTimer(main.plugin, 0L, 5L);



                }}

            //5级木武器攻击特效 前红木
            if (itemInHand.getItemMeta().getDisplayName().equals(itemStack2551.getItemMeta().getDisplayName())||itemInHand.getItemMeta().getDisplayName().equals(itemStack2651.getItemMeta().getDisplayName())){
                if (event.getAction()==Action.RIGHT_CLICK_AIR||event.getAction()==Action.RIGHT_CLICK_BLOCK) {
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
//                            Bukkit.getWorld("world").createExplosion(location, 1);
//                                Bukkit.getWorld("world").createExplosion(location, 1,true);
//                                Bukkit.getWorld("world").spawnFallingBlock(location, Material.WATER,(byte) 2);
                                Bukkit.getWorld("world").generateTree(location, TreeType.BIG_TREE);
                                Bukkit.getWorld("world_nether").generateTree(location, TreeType.BIG_TREE);
                                Bukkit.getWorld("world_the_end").generateTree(location, TreeType.BIG_TREE);
                                location.subtract(x, 0, y);
                            }
                            if (s == 8) {
                                cancel();
                            }
                        }
                    }.runTaskTimer(main.plugin, 0L, 5L);




                }}



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