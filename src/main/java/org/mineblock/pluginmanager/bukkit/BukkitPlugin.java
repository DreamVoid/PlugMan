package org.mineblock.pluginmanager.bukkit;

import org.mineblock.pluginmanager.bukkit.messaging.MessageFormatter;

import java.util.List;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Plugin manager for Bukkit servers.
 *
 * @author rylinaux
 */
public class BukkitPlugin extends JavaPlugin {

    /**
     * The instance of the plugin
     */
    private static BukkitPlugin INSTANCE = null;

    /**
     * List of plugins to ignore, partially.
     */
    private List<String> ignoredPlugins = null;

    /**
     * The message manager
     */
    private MessageFormatter messageFormatter = null;

    @Override
    public void onEnable() {
        INSTANCE = this;
        messageFormatter = new MessageFormatter();

        getCommand("mpm").setExecutor(new Commands());
        getCommand("mpm").setTabCompleter(new Commands());

        initConfig();
    }

    @Override
    public void onDisable() {
        INSTANCE = null;
        messageFormatter = null;
        ignoredPlugins = null;
    }

    /**
     * Copy default config values
     */
    private void initConfig() {
        this.saveDefaultConfig();
        ignoredPlugins = this.getConfig().getStringList("ignored-plugins");
    }

    /**
     * Returns the instance of the plugin.
     *
     * @return the instance of the plugin
     */
    public static BukkitPlugin getInstance() {
        return INSTANCE;
    }

    /**
     * Returns the list of ignored plugins.
     *
     * @return the ignored plugins
     */
    public List<String> getIgnoredPlugins() {
        return ignoredPlugins;
    }

    /**
     * Returns the message manager.
     *
     * @return the message manager
     */
    public MessageFormatter getMessageFormatter() {
        return messageFormatter;
    }

}