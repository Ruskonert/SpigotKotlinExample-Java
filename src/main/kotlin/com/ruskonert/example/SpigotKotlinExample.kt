package com.ruskonert.example

import com.ruskonert.example.entity.ExampleObject

import org.bukkit.Bukkit
import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

class SpigotKotlinExample : JavaPlugin(), Listener
{
    override fun onEnable()
    {
        Bukkit.getConsoleSender().sendMessage("Hello, my server!")
        Bukkit.getConsoleSender().sendMessage("${this.description.name} v${this.description.version} was loaded successfully.")
    }

    override fun onDisable()
    {
        Bukkit.getConsoleSender().sendMessage("Good bye, my server!")
    }

    override fun onCommand(sender: CommandSender?, command: Command?, label: String?, args: Array<out String>?): Boolean
    {
        if(label.equals("example", true))
        {
            ExampleObject.send(sender)
            return true
        }
        return false
    }
}