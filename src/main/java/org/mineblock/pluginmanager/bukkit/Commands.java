package org.mineblock.pluginmanager.bukkit;

import org.bukkit.command.*;
import org.bukkit.util.StringUtil;
import org.mineblock.pluginmanager.bukkit.command.*;
import org.mineblock.pluginmanager.bukkit.util.PluginUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Listen for commands and execute them.
 *
 * @author rylinaux
 */
public class Commands implements TabExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        AbstractCommand cmd = new HelpCommand(sender);

        // No args, show help.
        if (args.length == 0) {
            cmd.execute(sender, command, label, args);
            return true;
        }

        switch (args[0].toLowerCase()) {
            case "help":
                cmd = new HelpCommand(sender);
                break;
            case "list":
                cmd = new ListCommand(sender);
                break;
            case "dump":
                cmd = new DumpCommand(sender);
                break;
            case "info":
                cmd = new InfoCommand(sender);
                break;
            case "lookup":
                cmd = new LookupCommand(sender);
                break;
            case "usage":
                cmd = new UsageCommand(sender);
                break;
            case "enable":
                cmd = new EnableCommand(sender);
                break;
            case "disable":
                cmd = new DisableCommand(sender);
                break;
            case "restart":
                cmd = new RestartCommand(sender);
                break;
            case "load":
                cmd = new LoadCommand(sender);
                break;
            case "reload":
                cmd = new ReloadCommand(sender);
                break;
            case "unload":
                cmd = new UnloadCommand(sender);
                break;
            case "check":
                cmd = new CheckCommand(sender);
                break;
        }

        cmd.execute(sender, command, label, args);
        return true;

    }

    private static final String[] COMMANDS = {"check", "disable", "dump", "enable", "help", "info", "list", "load", "lookup", "reload", "restart", "unload", "usage"};

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        if (sender.isOp() || sender.hasPermission("mineblock.command.pluginmanager." + args[0])) {
            List<String> completions = new ArrayList<>();

            if (args.length == 1) {
                String partialCommand = args[0];
                List<String> commands = new ArrayList<>(Arrays.asList(COMMANDS));
                StringUtil.copyPartialMatches(partialCommand, commands, completions);
            }

            if (args.length == 2) {
                String partialPlugin = args[1];
                List<String> plugins = PluginUtil.getPluginNames(false);
                StringUtil.copyPartialMatches(partialPlugin, plugins, completions);
            }
            Collections.sort(completions);
            return completions;
        }
        return null;
    }
}
