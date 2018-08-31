package com.songoda.epicanchors.command;

import com.songoda.epicanchors.EpicAnchorsPlugin;
import org.bukkit.command.CommandSender;

public abstract class AbstractCommand {

    private final AbstractCommand parent;

    private final String permissionNode;

    private final String command;

    protected AbstractCommand(String command, String permissionNode, AbstractCommand parent) {
        this.command = command;
        this.parent = parent;
        this.permissionNode = permissionNode;
    }

    public AbstractCommand getParent() {
        return parent;
    }


    public String getCommand() {
        return command;
    }

    public String getPermissionNode() {
        return permissionNode;
    }

    protected abstract boolean runCommand(EpicAnchorsPlugin instance, CommandSender sender, String... args);
}
