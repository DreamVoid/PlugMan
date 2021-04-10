# MineBlockPluginManager
基于Plugman修改，专用于MineBlock服务器

<h1 align="center">PlugMan不再维护</h1>

# PlugMan

PlugMan is a simple, easy to use plugin that lets server admins manage plugins from either in-game or console without the need to restart the server.

## 特性
* Enable, disable, restart, load, reload, and unload plugins from in-game or console.
* List plugins alphabetically, with version if specified.
* Get useful information on plugins such as commands, version, author(s), etc.
* Easily manage plugins without having to constantly restart your server.
* List commands a plugin has registered.
* Find the plugin a command is registered to.
* Tab completion for command names and plugin names.
* Dump plugin list with versions to a file.
* Check if a plugin is up-to-date with dev.bukkit.org
* Permissions Support - All commands default to OP.

## 命令
| 命令 | 描述 |
| --------------- | ---------------- |
| /mpm help | Show help information. |
| /mpm list [-v] | List plugins in alphabetical order. Use "-v" to include versions. |
| /mpm info [plugin] | Displays information about a plugin. |
| /mpm dump | Dump plugin names and version to a file. |
| /mpm usage [plugin] | List commands that a plugin has registered. |
| /mpm lookup [command] | Find the plugin a command is registered to. |
| /mpm enable [plugin&#124;all] | Enable a plugin. |
| /mpm disable [plugin&#124;all] | Disable a plugin. |
| /mpm restart [plugin&#124;all] | Restart (disable/enable) a plugin. |
| /mpm load [plugin] | Load a plugin. |
| /mpm reload [plugin&#124;all] | Reload (unload/load) a plugin. |
| /mpm unload [plugin] | Unload a plugin. |
| /mpm check [plugin&#124;all] [-f] | Check if a plugin is up-to-date. |

## 权限
| 权限节点 | 默认 | 描述 |
| ------------------------- | ---------- | ---------------- |
| mineblock.pluginmanager.admin | OP | Allows use of all PlugMan commands. |
| mineblock.pluginmanager.update | OP | Allows user to see update messages. |
| mineblock.pluginmanager.help | OP | Allow use of the help command. |
| mineblock.pluginmanager.list | OP | Allow use of the list command. |
| mineblock.pluginmanager.info | OP | Allow use of the info command. |
| mineblock.pluginmanager.dump | OP | Allow use of the dump command. |
| mineblock.pluginmanager.usage | OP | Allow use of the usage command. |
| mineblock.pluginmanager.lookup | OP | Allow use of the lookup command. |
| mineblock.pluginmanager.enable | OP | Allow use of the enable command. |
| mineblock.pluginmanager.enable.all | OP | Allow use of the enable all command. |
| mineblock.pluginmanager.disable | OP | Allow use of the disable command. |
| mineblock.pluginmanager.disable.all | OP | Allow use of the disable all command. |
| mineblock.pluginmanager.restart | OP | Allow use of the restart command. |
| mineblock.pluginmanager.restart.all | OP | Allow use of the restart all command. |
| mineblock.pluginmanager.load | OP | Allow use of the load command. |
| mineblock.pluginmanager.reload | OP | Allow use of the reload command. |
| mineblock.pluginmanager.reload.all | OP | Allow use of the reload all command. |
| mineblock.pluginmanager.unload | OP | Allow use of the unload command. |
| mineblock.pluginmanager.check | OP | Allow use of the check command. |
| mineblock.pluginmanager.check.all | OP | Allow use of the check command. |

## 配置文件
| 文件 | URL |
| ----- | ------- |
| config.yml | https://github.com/MineBlockMC/MineBlockPluginManager/blob/master/src/main/resources/config.yml |
