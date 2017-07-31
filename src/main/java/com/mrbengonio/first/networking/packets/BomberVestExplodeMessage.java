package com.mrbengonio.first.networking.packets;

import com.mrbengonio.first.First;
import com.mrbengonio.first.init.ModItems;
import com.mrbengonio.first.networking.AbstractServerMessageHandler;

import io.netty.buffer.ByteBuf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class BomberVestExplodeMessage implements IMessage {

	// The basic, no-argument constructor MUST be included to use the new automated
	// handling
	public BomberVestExplodeMessage() {
	}

	@Override
	public void fromBytes(ByteBuf buf) {

	}

	@Override
	public void toBytes(ByteBuf buf) {

	}

	public static class Handler extends AbstractServerMessageHandler<BomberVestExplodeMessage> {

		@Override
		public IMessage handleServerMessage(EntityPlayer player, BomberVestExplodeMessage message, MessageContext ctx) {

			if (player.inventory.armorItemInSlot(2) != null
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.BomberVest) {
				player.inventory.removeStackFromSlot(38);
				player.getEntityWorld().createExplosion(null, player.posX, player.posY, player.posZ, 6F, true);

			} else {
				First.LOGGER.warn(player.getName()
						+ " tried to send a bombervest explosion packet without a vest! Either a hacker or a bug!");
			}
			return null;
		}

	}
}
