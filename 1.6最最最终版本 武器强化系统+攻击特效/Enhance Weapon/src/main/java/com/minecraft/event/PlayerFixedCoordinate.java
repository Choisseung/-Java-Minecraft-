package com.minecraft.event;

import org.bukkit.Location;

public class PlayerFixedCoordinate {

    private final Location zeroDot;
    private final double rotateAngle;

    public PlayerFixedCoordinate(Location playerLocation) {
        // 旋转的角度
        rotateAngle = playerLocation.getYaw();
        zeroDot = playerLocation.clone();
        zeroDot.setPitch(0);
        // 重设仰俯角, 防止出现仰头后旋转角度不正确的问题
    }

    public Location getZeroDot() {
        return zeroDot;
    }

    public Location newLocation(double x, double z) {
        return rotateLocationAboutPoint(zeroDot.clone().add(-x, 0, z), rotateAngle, zeroDot);
    }

    /**
     * 在二维平面上利用给定的中心点逆时针旋转一个点
     *
     * @param location 待旋转的点
     * @param angle    旋转角度
     * @param point    中心点
     * @return {@link Location}
     */
    public static Location rotateLocationAboutPoint(Location location, double angle, Location point) {
        double radians = Math.toRadians(angle);
        double dx = location.getX() - point.getX();
        double dz = location.getZ() - point.getZ();

        double newX = dx * Math.cos(radians) - dz * Math.sin(radians) + point.getX();
        double newZ = dz * Math.cos(radians) + dx * Math.sin(radians) + point.getZ();
        return new Location(location.getWorld(), newX, location.getY(), newZ);
    }
}
