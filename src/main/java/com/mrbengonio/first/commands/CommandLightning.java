package com.mrbengonio.first.commands;

import net.minecraft.command.CommandException;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;

public class CommandLightning extends CommandBase {

	public String getName() {
		return "lightning";
	}

	public int getRequiredPermissionLevel() {
		return 2;
	}

	public String getUsage(ICommandSender sender) {
		return "/lightning";
	}

	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		BlockPos Coord = sender.getPosition();
		sender.getEntityWorld().addWeatherEffect(
				new EntityLightningBolt(sender.getEntityWorld(), Coord.getX(), Coord.getY(), Coord.getZ(), false));
	}

}
