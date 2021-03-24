package org.flyingteam.mineblock.pluginmanager.messaging;

import java.io.InputStreamReader;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

/**
 * Class that allows reading from a YAML file embedded in the JAR.
 *
 * @author rylinaux
 */
public class MessageFile {

    /**
     * The configuration.
     */
    private FileConfiguration config = null;

    /**
     * Construct the object.
     *
     * @param name the name of the file.
     */
    public MessageFile(String name) {
        this.config = YamlConfiguration.loadConfiguration(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream(name)));
    }

    /**
     * Get the FileConfiguration.
     *
     * @return the FileConfiguration.
     */
    public FileConfiguration getConfig() {
        return config;
    }

    /**
     * Get a key from the file.
     *
     * @param key the key.
     * @return the value.
     */
    public String get(String key) {
        return config.getString(key);
    }

}
