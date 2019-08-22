package com.mrbengonio.first.proxy;

import com.mrbengonio.first.handlers.KeybindHandler;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {

	@Override
	public void init() {
		KeybindHandler.RegisterKeyBindings();

		// for (RenderPlayer render :
		// Minecraft.getMinecraft().getRenderManager().getSkinMap().values()) {
		// render.addLayer(new LayerLukasdragonHead(render));
		// }

		// Mfm.LOGGER.debug("added lukasdragon head");
	}

	@Override
	public World getClientWorld() {
		return Minecraft.getInstance().world;
	}

	@Override
	public PlayerEntity getClientPlayer() {
		return Minecraft.getInstance().player;
	}
}
