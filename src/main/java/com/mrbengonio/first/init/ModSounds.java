package com.mrbengonio.first.init;

import com.mrbengonio.first.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class ModSounds {

	public static final SoundEvent miracle = new SoundEvent(ResourceLocation("miracle"));

	private static ResourceLocation ResourceLocation(String Key) {
		return new ResourceLocation(Reference.MOD_ID, Key);
	}
}
