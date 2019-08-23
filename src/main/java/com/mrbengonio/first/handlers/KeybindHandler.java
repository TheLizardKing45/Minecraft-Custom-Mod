package com.mrbengonio.first.handlers;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class KeybindHandler {

	private static KeyBinding[] keyBindings = new KeyBinding[1];

	public static KeyBinding[] getKeyBindings() {
		return keyBindings;
	}

	public static void RegisterKeyBindings() {
		// declare an array of key bindings

		// instantiate the key bindings
		keyBindings[0] = new KeyBinding("key.armorutil.desc", 0, "key.kreuthil.category");

		// register all the key bindings
		for (int i = 0; i < keyBindings.length; ++i) {
			ClientRegistry.registerKeyBinding(keyBindings[i]);
		}
	}

}
