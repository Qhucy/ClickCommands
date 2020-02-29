# ClickCommands
Open source spigot plugin for minecraft. Create commands that execute when you interact with blocks!

# Commands
  - **/clickcommands info**: Shows information about the click commands block you're looking at.  
  - **/clickcommands add [command]**: Adds a click command to the block you're looking at.  
    - Add **-console** at the end to execute the command from console, or **-player** by a player.  
    - Add **-rightclick** at the end to activate the click command from a right click, **-leftclick** from a left click.  
    - Add **-jump** at the end to activate the click command from jumping.  
    - Add **-cooldown [time]** at the end to set cooldown on using this click commands block. By default this is per-player.  
    - Add **-cooldowntype [type]** at the end to change the type of cooldown it is. Options are **player**, **global**, and **none**.  
    - Add **-block [block]** at the end to make this command activate only when the block at this location is a certain type. If this isn't an option, it will work on all block types.  
    - Add **weight [number]** at the end to give this command a permission weight. Only players with this weight permission can use the command.
    - Example: **/clickcommands add broadcast Hello World! -console -rightclick -jump -playercooldown 10seconds**.  
  - **/clickcommands clear**: Clears all commands to the click command block you're looking at.  
  - **/clickcommands remove [number/command]**: Removes a certain command from the click command block you're looking at.  
    - Example: **/clickcommands remove 1**, **/clickcommands remove Hello World!**.  
  - **/clickcommands edit [number] command [command]**: Change a command in the click commands block you're looking at to another one.  
    - Example: **/clickcommands edit 1 broadcast Goodbye World!**.  
  - **/clickcommands edit [number] trigger [trigger]**: Change a list of triggers in a command in the click commands block you're looking at to another list of triggers.  
    - Note: You don't need the '-' to signify the triggers, but you can use it.  
    - Example: **/clickcommands edit 1 trigger rightclick jump**.  
  - **/clickcommands edit [number] cooldown [time:type]**: Change the duration or type of cooldown in a command in the click commands block you're looking at to another cooldown duration or type.  
    - Example: **/clickcommands edit 1 cooldown player**, **/clickcommands edit 1 cooldown 30seconds**.  
  - **/clickcommands edit [number] block [block]**: Change the type of block needed to activate this command. Put 'none' to have it work on all block types.
    - Example: **/clickcommands edit 1 block stone**.
  - **/clickcommands edit [number] weight [number]**: Change the permission weight of this command. Only players with this weight permission can use the command. Put **0** to have none.  
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
  - **clickcommands.use.[weight]**: Access to use signs with the specified weight number.

# GitHub Open Source
If you want to contribute to improving this plugin any way, feel free to visit the GitHub for this plugin: **https://github.com/Qhucy/ClickCommands**.

# Help
If you need help with this plugin join my discord: **https://discord.gg/a5bhCHa** and use the **general-support** channel.
