package com.useful.uCarsAPI;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Minecart;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class uCarCrashEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled = false;
    private Minecart car = null;
    private Entity hit;
    private double damageToEntity = 0;

    public uCarCrashEvent(Minecart vehicle, Entity hit, double damageToEntity) {
        this.car = vehicle;
        this.hit = hit;
        this.damageToEntity = damageToEntity;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public void setCancelled(boolean arg0) {
        this.cancelled = arg0;
    }

    public Minecart getCar() {
        return car;
    }

    public Entity getEntityCrashedInto() {
        return this.hit;
    }

    public double getDamageToBeDoneToTheEntity() {
        return this.damageToEntity;
    }

    public void setDamageToBeDoneToTheEntity(double dmg) {
        this.damageToEntity = dmg;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
}
