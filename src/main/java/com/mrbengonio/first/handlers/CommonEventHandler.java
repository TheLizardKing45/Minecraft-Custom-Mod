package com.mrbengonio.first.handlers;

import java.util.Random;

import com.mrbengonio.first.First;
import com.mrbengonio.first.init.ModAchievements;
import com.mrbengonio.first.init.ModItems;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

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
	public void onEvent(KeyInputEvent event) {

		KeyBinding[] keyBindings = KeybindHandler.getKeyBindings();
		if (keyBindings[0].isPressed()) {

			First.LOGGER.info("Explosion");
		}

	}

}
