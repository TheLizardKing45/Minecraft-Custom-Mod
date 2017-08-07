package com.mrbengonio.first.handlers;

import java.util.Random;

import com.mrbengonio.first.init.ModAchievements;
import com.mrbengonio.first.init.ModItems;
import com.mrbengonio.first.networking.PacketDispatcher;
import com.mrbengonio.first.networking.packets.BomberVestExplodeMessage;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CommonEventHandler {

	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onEvent(HarvestDropsEvent event) {
		Random rnd = new Random();
		if (event.getState().getBlock() == Blocks.OBSIDIAN) {
			event.getDrops().add(new ItemStack(ModItems.obsidianshard, 1 + rnd.nextInt(2)));
			event.getDrops().remove(0);

			if (event.getHarvester() != null) {
				event.getHarvester().addStat(ModAchievements.achievementObsidianShard, 1);
			}
		}
	}

	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onEvent(PlayerLoggedInEvent event) {
		EntityPlayer player = event.player;
		NBTTagCompound entityData = player.getEntityData();
		if (!entityData.getBoolean("kreuthilHasJoined")) {
			entityData.setBoolean("kreuthilHasJoined", true);
			player.addStat(ModAchievements.achievementLaunch, 1);
		}
	}

	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onEvent(ItemSmeltedEvent event) {
		if (event.smelting.getItem() == ModItems.TechAlloy) {
			EntityPlayer player = event.player;
			player.addStat(ModAchievements.achievementTHelm);
		}
	}

	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onEvent(ItemCraftedEvent event) {
		if (event.crafting.getItem() == ModItems.tech_helmet) {
			EntityPlayer player = event.player;
			player.addStat(ModAchievements.achievementTHelm);
		}
	}

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

}
