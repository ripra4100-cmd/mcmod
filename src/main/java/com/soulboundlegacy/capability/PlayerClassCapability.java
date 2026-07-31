package com.soulboundlegacy.capability;

import com.soulboundlegacy.entity.ClassType;
import net.minecraft.nbt.CompoundTag;

public class PlayerClassCapability {
    private ClassType currentClass = ClassType.NONE;
    private float mana = 100.0F;
    private float maxMana = 100.0F;
    private int fallbackTimer = 0; // 30 minuta nakon pada
    private int clanLegacyPoints = 0;
    
    public ClassType getCurrentClass() {
        return currentClass;
    }
    
    public void setCurrentClass(ClassType classType) {
        this.currentClass = classType;
    }
    
    public float getMana() {
        return mana;
    }
    
    public void setMana(float mana) {
        this.mana = Math.min(mana, maxMana);
    }
    
    public float getMaxMana() {
        return maxMana;
    }
    
    public int getFallbackTimer() {
        return fallbackTimer;
    }
    
    public void setFallbackTimer(int ticks) {
        this.fallbackTimer = ticks;
    }
    
    public int getClanLegacyPoints() {
        return clanLegacyPoints;
    }
    
    public void addLegacyPoints(int points) {
        this.clanLegacyPoints += points;
    }
    
    public CompoundTag serializeNBT() {
        CompoundTag tag = new CompoundTag();
        tag.putString("class", currentClass.name());
        tag.putFloat("mana", mana);
        tag.putInt("fallbackTimer", fallbackTimer);
        tag.putInt("legacyPoints", clanLegacyPoints);
        return tag;
    }
    
    public void deserializeNBT(CompoundTag tag) {
        currentClass = ClassType.valueOf(tag.getString("class"));
        mana = tag.getFloat("mana");
        fallbackTimer = tag.getInt("fallbackTimer");
        clanLegacyPoints = tag.getInt("legacyPoints");
    }
}