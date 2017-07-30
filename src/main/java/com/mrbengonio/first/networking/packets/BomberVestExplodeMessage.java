package com.mrbengonio.first.networking.packets;

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
		// TODO Auto-generated method stub

	}

	public static class Handler extends AbstractServerMessageHandler<BomberVestExplodeMessage> {

		@Override
		public IMessage onMessage(BomberVestExplodeMessage message, MessageContext ctx) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public IMessage handleServerMessage(EntityPlayer player, BomberVestExplodeMessage message, MessageContext ctx) {
			// TODO Auto-generated method stub
			return null;
		}

	}
}
