package com.qhucy.clickcommands.clickdata;

public class ClickCommandBlock
{

    private String worldName;

    private int x;
    private int y;
    private int z;

    private CooldownType cooldownType;
    private long cooldown;

    private ClickCommand[] clickCommands;

    public ClickCommandBlock(String worldName, int x, int y, int z, CooldownType cooldownType, long cooldown, ClickCommand[] clickCommands)
    {
        this.worldName = worldName;

        this.x = x;
        this.y = y;
        this.z = z;

        this.cooldownType = cooldownType;
        this.cooldown = cooldown;

        this.clickCommands = clickCommands;
    }

    public String getWorldName()
    {
        return worldName;
    }

    public void setWorldName(String worldName)
    {
        this.worldName = worldName;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getZ()
    {
        return z;
    }

    public void setZ(int z)
    {
        this.z = z;
    }

    public CooldownType getCooldownType()
    {
        return cooldownType;
    }

    public void setCooldownType(CooldownType cooldownType)
    {
        this.cooldownType = cooldownType;
    }

    public long getCooldown()
    {
        return cooldown;
    }

    public void setCooldown(long cooldown)
    {
        this.cooldown = cooldown;
    }

    public ClickCommand[] getClickCommands()
    {
        return clickCommands;
    }

    public void setClickCommands(ClickCommand[] clickCommands)
    {
        this.clickCommands = clickCommands;
    }

}