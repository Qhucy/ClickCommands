package com.qhucy.clickcommands.util;

import com.qhucy.clickcommands.ClickCommands;
import com.qhucy.clickcommands.clickdata.ClickCommand;
import com.qhucy.clickcommands.clickdata.ClickCommandBlock;
import com.qhucy.clickcommands.clickdata.CooldownType;
import com.qhucy.clickcommands.clickdata.InteractionType;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VariableManager
{

    public static ArrayList<ClickCommandBlock> clickCommandBlocks = new ArrayList<>();

    public static void loadData(ClickCommands main)
    {
        if(!main.getDataFolder().exists() && !main.getDataFolder().mkdirs())
            return;

        File dataYml = new File(main.getDataFolder(), "data.yml");

        if(!dataYml.exists() || dataYml.length() == 0)
            return;

        FileConfiguration fileConfiguration = YamlConfiguration.loadConfiguration(dataYml);

        if(!fileConfiguration.contains("clickcommandblocks")
                || fileConfiguration.getConfigurationSection("clickcommandblocks") == null
                || fileConfiguration.getConfigurationSection("clickcommandblocks").getKeys(false) == null)
            return;

        ArrayList<ClickCommandBlock> newClickCommandBlocks = new ArrayList<>();

        for(String key : fileConfiguration.getConfigurationSection("clickcommandblocks").getKeys(false))
        {
            List<String> clickCommandsList = fileConfiguration.getStringList("clickcommandblocks." + key);

            if(clickCommandsList == null
                    || clickCommandsList.isEmpty())
                continue;

            ArrayList<ClickCommand> tempClickCommands = new ArrayList<>();

            for(String str : clickCommandsList)
            {
                String[] clickCommandData = str.split(",");

                if(clickCommandData.length < 3)
                    continue;

                InteractionType interactionType = InteractionType.RIGHT_CLICK;

                try
                {
                    interactionType = InteractionType.values()[Integer.parseInt(clickCommandData[1])];
                } catch(Exception ignore)
                {

                }

                tempClickCommands.add(new ClickCommand(String.join(",", Arrays.copyOfRange(clickCommandData, 2, clickCommandData.length)), clickCommandData[0].equals("1"), interactionType));
            }

            String[] clickCommandBlockData = key.split(",");

            if(clickCommandBlockData.length < 6)
                continue;

            int x, y, z;
            long cooldown;

            try
            {
                x = Integer.parseInt(clickCommandBlockData[1]);
                y = Integer.parseInt(clickCommandBlockData[2]);
                z = Integer.parseInt(clickCommandBlockData[3]);

                cooldown = Long.parseLong(clickCommandBlockData[5]);
            } catch(Exception e)
            {
                continue;
            }

            CooldownType cooldownType = CooldownType.NONE;

            try
            {
                cooldownType = CooldownType.values()[Integer.parseInt(clickCommandBlockData[4])];
            } catch(Exception ignore)
            {

            }

            newClickCommandBlocks.add(new ClickCommandBlock(clickCommandBlockData[0], x, y, z, cooldownType, cooldown, tempClickCommands.toArray(new ClickCommand[0])));
        }

        clickCommandBlocks = newClickCommandBlocks;
    }

    public static void saveData(ClickCommands main)
    {
        if(clickCommandBlocks.isEmpty() || (!main.getDataFolder().exists() && !main.getDataFolder().mkdirs()))
            return;

        File dataYml = new File(main.getDataFolder(), "data.yml");

        try
        {
            if(!dataYml.exists() && !dataYml.createNewFile())
                return;
        } catch(Exception e)
        {
            e.printStackTrace();
            return;
        }

        FileConfiguration fileConfiguration = YamlConfiguration.loadConfiguration(dataYml);

        fileConfiguration.set("clickcommandblocks", null);

        for(ClickCommandBlock clickCommandBlock : clickCommandBlocks)
        {
            ArrayList<String> clickCommandData = new ArrayList<>();

            for(ClickCommand clickCommand : clickCommandBlock.getClickCommands())
            {
                clickCommandData.add((clickCommand.isPlayerSender() ? "1," : "0,") + clickCommand.getInteractionType().ordinal() + "," + clickCommand.getCommand());
            }

            fileConfiguration.set("clickcommandblocks.'" + clickCommandBlock.getWorldName()
                    + "," + clickCommandBlock.getX()
                    + "," + clickCommandBlock.getY()
                    + "," + clickCommandBlock.getZ()
                    + "," + clickCommandBlock.getCooldownType().ordinal()
                    + "," + clickCommandBlock.getCooldown() + "'", clickCommandData);
        }
    }

}