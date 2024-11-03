package dev.expx.papiSys;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;

public class PAPIExpansion extends PlaceholderExpansion {

    @Override
    @NotNull
    public String getAuthor() {
        return "cammyzed";
    }

    @Override
    @NotNull
    public String getIdentifier() {
        return "sys";
    }

    @Override
    @NotNull
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String onRequest(OfflinePlayer player, @NotNull String id) {
        if(id.split("_")[0].equals("env")) {
            return System.getenv(id.replace("env_", ""));
        }
        if(id.split("_")[0].equals("prop")) {
            return System.getProperty(id.replace("prop_", ""));
        }

        return id;
    }

}
