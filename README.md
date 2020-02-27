# ClickCommands
Open source spigot plugin for minecraft. Create commands that execute when you interact with blocks!

# Commands
  - **/clickcommands info**: Shows information about the click commands block you're looking at.  
  - **/clickcommands add [command]**: Adds a click command to the block you're looking at.  
    - Add **-console** at the end to execute the command from console, or **-player** by a player.  
    - Add **-rightclick** at the end to activate the click command from a right click, **-leftclick** from a left click, or **'-bothclicks'** from either right or left click.  
    - Add **-jump** at the end to activate the click command from jumping.  
    - Add **-playercooldown [time]** at the end to set a per-player cooldown on using this click commands block. This will override any current cooldown setting.  
    - Add **-globalcooldown [time]** at the end to set a global cooldown on using the click commands block. This will override any current cooldown setting.  
    - Example: **/clickcommands add broadcast Hello World! -console -bothclicks -jump -playercooldown 10seconds**.  
  - **/clickcommands clear**: Clears all commands to the click command block you're looking at.  
  - **/clickcommands remove [number/command]**: Removes a certain command from the click command block you're looking at.  
    - Example: **/clickcommands remove 1**, **/clickcommands remove Hello World!**.  
  - **/clickcommands edit [number] command [command]**: Change a command in the click commands block you're looking at to another one.  
    - Example: **/clickcommands edit 1 broadcast Goodbye World!**  
  - **/clickcommands edit [number] trigger [trigger]**: Change a list of triggers in a command in the click commands block you're looking at to another list of triggers.  
    - Note: You don't need the '-' to signify the triggers, but you can use it.  
    - Example: **/clickcommands edit 1 trigger rightclick jump**  
  - **/clickcommands edit [number] cooldown [time:type]**: Change the duration or type of cooldown in a command in the click commands block you're looking at to another cooldown duration or type.  
    - Example: **/clickcommands edit 1 cooldown playercooldown**, **/clickcommands edit 1 cooldown 30seconds**  
  - **/clickcommands editor**: Go into ClickCommands Editor mode. ClickCommands Blocks display as emerald blocks. Left click to select a ClickCommands Block. Use the normal commands to modify it or right click in a new location to move its location. Use this command again to disable this mode.  
  - **/clickcommands select [location]**: Select a ClickCommands block at the target location. Use the normal commands to modify it. After 5 minutes it will automatically be deselected.  
    - Example: **/clickcommands select world -492 64 91**, **/clickcommands select -492 64 91**.  
  - **/clickcommands deselect**: Deselect your current ClickCommands Block so you can modify blocks you're looking at again.  
  - **/clickcommands list**: Show a list of all coordinates where a click commands block is.  
  - **/clickcommands save**: Save all current click commands block data.  
  - **/clickcommands load**: Load all click commands block data from the current **/plugins/ClickCommands/data.yml** file.  

# Permissions
**Note: Use 'clickcommands.*' to give someone all ClickCommands permissions.**  
  - **clickcommands.info**: Access to '/clickcommands info'.  
  - **clickcommands.add**: Access to '/clickcommands add'.  
  - **clickcommands.clear**: Access to '/clickcommands clear'.  
  - **clickcommands.remove**: Access to '/clickcommands remove'.  
  - **clickcommands.edit**: Access to '/clickcommands edit'.  
  - **clickcommands.list**: Access to '/clickcommands list'.  
  - **clickcommands.save**: Access to '/clickcommands save'.  
  - **clickcommands.load**: Access to '/clickcommands load'.  

# GitHub Open Source
If you want to contribute to improving this plugin any way, feel free to visit the GitHub for this plugin: **https://github.com/Qhucy/ClickCommands**.

# Help
If you need help with this plugin join my discord: **https://discord.gg/a5bhCHa** and use the 'general-support' channel.
