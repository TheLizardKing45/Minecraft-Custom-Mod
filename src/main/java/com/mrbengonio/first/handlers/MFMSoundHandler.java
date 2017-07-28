package com.mrbengonio.first.handlers;

import com.mrbengonio.first.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class MFMSoundHandler {

	public static int size = 0;

	public static SoundEvent ITEM_ELVIS1_PLAY;

	public static void init() {
		size = SoundEvent.REGISTRY.getKeys().size();

		ITEM_ELVIS1_PLAY = register("item.Elvis1.play");

	}

	public static SoundEvent register(String name) {
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent e = new SoundEvent(location);

		SoundEvent.REGISTRY.register(size, location, e);
		size++;
		return e;
	}

}
