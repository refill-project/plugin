package org.modget.plugin;


import java.util.logging.Logger;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class ModGet extends JavaPlugin {
    Logger log = Logger.getLogger("Minecraft");

    public void onEnable(){
        log.info("WhatVer is enabled.");
    }

    public void onDisable(){
        log.info("WhatVer has been unloaded.");
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("mod-get")){
            sender.sendMessage("Hello!");
            return true;
        }
        return false;

    }
}