package com.mrbengonio.first.proxy;

import com.mrbengonio.first.First;
import com.mrbengonio.first.gui.TechStatusBarRenderer;
import com.mrbengonio.first.handlers.GuiEventHandler;
import com.mrbengonio.first.handlers.KeybindHandler;
import com.mrbengonio.first.renderer.layers.LayerLukasdragonHead;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
		KeybindHandler.RegisterKeyBindings();

		for (RenderPlayer render : Minecraft.getMinecraft().getRenderManager().getSkinMap().values()) {
			render.addLayer(new LayerLukasdragonHead(render));
		}

		First.LOGGER.debug("added lukasdragon head");

	}

	private static TechStatusBarRenderer TechstatusBarRenderer;

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
		TechstatusBarRenderer = new TechStatusBarRenderer(Minecraft.getMinecraft());
		MinecraftForge.EVENT_BUS.register(new GuiEventHandler(TechstatusBarRenderer));
	}

	@Override
	public void serverStarting(FMLServerStartingEvent e) {
		super.serverStarting(e);
	}

	@Override
	public void serverStopping(FMLServerStoppingEvent e) {
		super.serverStopping(e);
	}

	@Override
	public EntityPlayer getPlayerEntity(MessageContext ctx) {
		return (ctx.side.isClient() ? Minecraft.getMinecraft().player : super.getPlayerEntity(ctx));
	}

}
