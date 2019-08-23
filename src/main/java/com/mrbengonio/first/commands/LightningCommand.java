package com.mrbengonio.first.commands;

import com.mojang.brigadier.CommandDispatcher;

import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.util.math.BlockPos;

public class LightningCommand {

	public static void register(CommandDispatcher<CommandSource> dispatcher) {

		dispatcher.register(Commands.literal("lightning").requires((p_198727_0_) -> {
			return p_198727_0_.hasPermissionLevel(2);
		}).executes((p_198726_0_) -> {
			CommandSource source = p_198726_0_.getSource();
			BlockPos Coord = source.getEntity().getPosition();
			LightningBoltEntity lightningboltentity = new LightningBoltEntity(source.getWorld(), Coord.getX(),
					Coord.getY(), Coord.getZ(), false);
			source.getWorld().addLightningBolt(lightningboltentity);

			return 1;
		}));
	}

}
