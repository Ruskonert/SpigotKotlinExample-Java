package com.ruskonert.example.entity;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class ExampleObject
{
    public static void send(CommandSender s)
    {
        if(s instanceof ConsoleCommandSender) {
            Bukkit.getConsoleSender().sendMessage("Console called");
        }
        else if(s instanceof Player) {
            s.sendMessage("Player called");
        }
        else {
            try {
                throw new Exception("Cannot resolve sender type: s");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
