package me.setsuzoku.setsuzoku;

import me.setsuzoku.setsuzoku.Commands.Help;
import me.setsuzoku.setsuzoku.Events.onMessage;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Setsuzoku extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("help").setExecutor(new Help());
        getServer().getPluginManager().registerEvents(new onMessage(), this);


    }

}
