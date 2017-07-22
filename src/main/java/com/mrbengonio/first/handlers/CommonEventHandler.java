package com.mrbengonio.first.handlers;

import java.util.Random;

import com.mrbengonio.first.init.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class CommonEventHandler {

	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onEvent(HarvestDropsEvent event) {
		Random rnd = new Random();
		if (event.getState().getBlock() == Blocks.OBSIDIAN) {
			event.getDrops().add(new ItemStack(ModItems.obsidianshard, 1 + rnd.nextInt(2)));
			event.getDrops().remove(0);
		}

	}
}
