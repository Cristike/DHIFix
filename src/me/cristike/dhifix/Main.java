package me.cristike.dhifix;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new onDamage(), this);
        if (!this.getServer().getPluginManager().getPlugin("ProtocolLib").isEnabled()) {
            this.getPluginLoader().disablePlugin(this);
            return;
        }
        Bukkit.getServer().getConsoleSender().sendMessage(c("&7[&bHOTWParticles&7] &fThe plugin has been &aenabled"));
    }

    @Override
    public void onDisable() {
        Bukkit.getServer().getConsoleSender().sendMessage(c("&7[&bHOTWParticles&7] &fThe plugin has been &cdisabled"));
    }

    String c(String mess) {
        return ChatColor.translateAlternateColorCodes('&', mess);
    }
}
