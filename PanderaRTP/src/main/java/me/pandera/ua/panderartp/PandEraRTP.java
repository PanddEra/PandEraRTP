package me.pandera.ua.panderartp;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class PandEraRTP extends JavaPlugin {

    @Override
    public void onEnable() {
        Objects.requireNonNull(getCommand("rtp")).setExecutor(new Command(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
