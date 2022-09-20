package me.roxmine.minecraft.plugins.gamemode;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class HelpCommand implements CommandExecutor {

    public static final String COMMAND_NAME = "help";

    private static final String MESSAGE = "----- Hilfe zu den Commands -----\n \ngm 1 = Creativ Modus\ngm 0 = Survival Modus\ngm 3 = Spectator Modus\n ";

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage(ChatColor.YELLOW + MESSAGE);
        return false;
    }
}
