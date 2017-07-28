package com.mrbengonio.first.init;

import com.mrbengonio.first.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class ModSounds {

	public static final SoundEvent elvis1 = new SoundEvent(ResourceLocation("elvis1"));

	private static ResourceLocation ResourceLocation(String Key) {
		return new ResourceLocation(Reference.MOD_ID, Key);
	}
}
