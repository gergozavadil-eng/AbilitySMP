package me.abilitysmp;

import org.bukkit.plugin.java.JavaPlugin;

public class AbilitySMP extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("AbilitySMP enabled!");
        getCommand("spawn").setExecutor(new SpawnCommand());
    }
}
