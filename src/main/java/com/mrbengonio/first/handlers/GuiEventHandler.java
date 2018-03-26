package com.mrbengonio.first.handlers;

import com.mrbengonio.first.gui.TechStatusBarRenderer;
import com.mrbengonio.first.init.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
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

		if (entityPlayerSP.inventory.armorItemInSlot(3) != null
				&& entityPlayerSP.inventory.armorItemInSlot(3).getItem() == ModItems.ITEMS.get("helmet_tech")) {
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
	}

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onEvent(RenderLivingEvent.Specials.Pre event) {
		EntityPlayerSP entityPlayerSP = Minecraft.getMinecraft().player;
		if (event.isCancelable() && event.getEntity() instanceof EntityPlayer) {
			if (entityPlayerSP.inventory.armorItemInSlot(3) != null
					&& entityPlayerSP.inventory.armorItemInSlot(3).getItem() == ModItems.ITEMS.get("helmet_tech")) {
				event.setCanceled(false);
			} else {
				event.setCanceled(true);
			}
		}
	}

}