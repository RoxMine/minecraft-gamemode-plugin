package me.roxmine.minecraft.plugins.gamemode;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameModeCommand implements CommandExecutor {

    public static final String COMMAND_NAME = "gm";

    private static final String MODE_SURVIVAL = "0";
    private static final String MODE_CREATIVE = "1";
    private static final String MODE_SPECTATOR = "3";
    private static final String USAGE = ChatColor.RED + String.format("Benutze: /%s <%s | %s | %s>",
            COMMAND_NAME, MODE_SURVIVAL, MODE_CREATIVE, MODE_SPECTATOR);

    public static final  String PIXEL_EMPIRE = (ChatColor.BLUE + "" + ChatColor.BOLD + "PIXELEMPIRE" + ChatColor.GRAY +  " | " );

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if (!(sender instanceof Player)){
            sender.sendMessage(ChatColor.RED + "Du musst ein Spieler sein!");
            return false;
        }

        Player player = (Player) sender;

        if (args.length == 1) {
            if (args[0].equalsIgnoreCase(MODE_CREATIVE)) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage (PIXEL_EMPIRE + ChatColor.GRAY + "Der Gamemode wurde für " +ChatColor.AQUA +  ( player.getName()) + " " + ChatColor.GRAY + "auf" + ChatColor.AQUA + " Creative" + ChatColor.GRAY +  " gesetzt." );
            } else if (args[0].equalsIgnoreCase(MODE_SURVIVAL)) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(PIXEL_EMPIRE + ChatColor.GRAY + "Der Gamemode wurde für " + ChatColor.AQUA + ( player.getName()) + " " + ChatColor.GRAY +  "auf" + ChatColor.AQUA + " Survival" + ChatColor.GRAY + " gesetzt." );
            } else if (args[0].equalsIgnoreCase(MODE_SPECTATOR)) {
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage(PIXEL_EMPIRE + ChatColor.GRAY + "Der Gamemode wurde für " + ChatColor.AQUA +  ( player.getName()) + " " + ChatColor.GRAY + "auf" + ChatColor.AQUA + " Spectator" + ChatColor.GRAY + " gesetzt." );
            } else {
                sender.sendMessage(USAGE);
            }
        } else {
            sender.sendMessage(USAGE);
        }

        return false;
    }

    }