package me.setsuzoku.setsuzoku.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class onMessage implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        System.out.println("[Setsuzoku] " + player.getDisplayName() + ": " + e.getMessage());

    }
}
