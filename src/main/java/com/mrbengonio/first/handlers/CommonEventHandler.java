package com.mrbengonio.first.handlers;

import com.mrbengonio.first.init.ModItems;
import com.mrbengonio.first.networking.PacketDispatcher;
import com.mrbengonio.first.networking.packets.BomberVestExplodeMessage;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.InputEvent.KeyInputEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CommonEventHandler {

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void keyPress(KeyInputEvent event) {

		KeyBinding[] keyBindings = KeybindHandler.getKeyBindings();

		// Armor Utility Button
		if (keyBindings[0].isPressed()) {
			PlayerEntity player = Minecraft.getInstance().player;

			if (player.inventory.armorItemInSlot(2) != null
					&& player.inventory.armorItemInSlot(2).getItem() == ModItems.ITEMS.get("chestplate_explosive")) {

				PacketDispatcher.sendToServer(new BomberVestExplodeMessage());
			}
		}
	}

}
