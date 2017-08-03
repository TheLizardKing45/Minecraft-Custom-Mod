package com.mrbengonio.first.handlers;

import com.mrbengonio.first.gui.TechStatusBarRenderer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GuiEventHandler {
	public GuiEventHandler(TechStatusBarRenderer i_HUDrenderer) {
		techStatusBarRenderer = i_HUDrenderer;
	}

	private TechStatusBarRenderer techStatusBarRenderer;

	@SubscribeEvent(receiveCanceled = true)
	public void onEvent(RenderGameOverlayEvent.Pre event) {
		EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
		if (entityPlayerSP == null)
			return; // just in case

		switch (event.getType()) {
		case HEALTH:
			techStatusBarRenderer.renderStatusBar(event.getResolution().getScaledWidth(),
					event.getResolution().getScaledHeight());
			event.setCanceled(true);
			break;
		case ARMOR:
			event.setCanceled(true);
			break;
		case FOOD:
			event.setCanceled(true);
			break;
		default:
			break;
		}
	}

	@SubscribeEvent(receiveCanceled = true)
	public void onEvent(RenderGameOverlayEvent.Post event) {

		switch (event.getType()) {
		case HEALTH:
			break;
		default: // If it's not one of the above cases, do nothing
			break;
		}
	}
}