package com.qhucy.clickcommands;

import com.qhucy.clickcommands.util.VariableManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class ClickCommands extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        VariableManager.loadData(this);

        //getServer().getPluginManager().registerEvents(new SignManager(), this);
        //Objects.requireNonNull(getServer().getPluginCommand("risensigns")).setExecutor(new CmdSign(this));

        //getServer().getScheduler().runTaskTimerAsynchronously(this, () -> VariableManager.saveSigns(this), 1800, 1800);
    }

    @Override
    public void onDisable()
    {
        VariableManager.saveData(this);
    }

}