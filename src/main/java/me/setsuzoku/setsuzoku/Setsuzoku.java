package me.setsuzoku.setsuzoku;

import me.setsuzoku.setsuzoku.Events.onMessage;
import org.bukkit.plugin.java.JavaPlugin;

public final class Setsuzoku extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new onMessage(), this);
    }

}
