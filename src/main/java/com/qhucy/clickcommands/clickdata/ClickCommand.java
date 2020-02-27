package com.qhucy.clickcommands.clickdata;

public class ClickCommand
{

    private String command;

    private boolean playerSender;
    private InteractionType interactionType;

    public ClickCommand(String command, boolean playerSender, InteractionType interactionType)
    {
        this.command = command;

        this.playerSender = playerSender;
        this.interactionType = interactionType;
    }

    public String getCommand()
    {
        return command;
    }

    public void setCommand(String command)
    {
        this.command = command;
    }

    public boolean isPlayerSender()
    {
        return playerSender;
    }

    public void setPlayerSender(boolean playerSender)
    {
        this.playerSender = playerSender;
    }

    public InteractionType getInteractionType()
    {
        return interactionType;
    }

    public void setInteractionType(InteractionType interactionType)
    {
        this.interactionType = interactionType;
    }

}