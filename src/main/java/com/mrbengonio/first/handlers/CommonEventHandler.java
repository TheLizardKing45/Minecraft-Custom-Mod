package com.mrbengonio.first.handlers;

import com.mrbengonio.first.init.ModItems;
import com.mrbengonio.first.networking.PacketDispatcher;
import com.mrbengonio.first.networking.packets.BomberVestExplodeMessage;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CommonEventHandler {

	@SideOnly(Side.CLIENT)
	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onEvent(KeyInputEvent event) {

		KeyBinding[] keyBindings = KeybindHandler.getKeyBindings();

		// Armor Utility Button
		if (keyBindings[0].isPressed()) {
			EntityPlayer player = Minecraft.getMinecraft().player;

			if (player.inventory.armorItemInSlot(2) != null
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.BomberVest)
				PacketDispatcher.sendToServer(new BomberVestExplodeMessage());
		}
	}

	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void onEvent(RenderLivingEvent.Specials.Pre event) {
		if (event.isCancelable() && event.getEntity() instanceof EntityPlayer) {
			event.setCanceled(true);
		}

	}

}
