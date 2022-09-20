package me.roxmine.minecraft.plugins.gamemode;

import org.bukkit.plugin.java.JavaPlugin;

public final class GameModePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand(GameModeCommand.COMMAND_NAME).setExecutor(new GameModeCommand());
        getCommand(HelpCommand.COMMAND_NAME).setExecutor(new HelpCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
