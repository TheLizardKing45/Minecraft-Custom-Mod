package com.mrbengonio.first.proxy;

import com.mrbengonio.first.handlers.CommonEventHandler;
import com.mrbengonio.first.handlers.CraftingHandler;
import com.mrbengonio.first.util.RegisterUtil;
import com.mrbengonio.first.world.WorldGenOre;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		RegisterUtil.registerAll(e);
		GameRegistry.registerWorldGenerator(new WorldGenOre(), 0);

	}

	public void init(FMLInitializationEvent e) {
		MinecraftForge.EVENT_BUS.register(new CommonEventHandler());
		CraftingHandler.RegisterCrafting();
		CraftingHandler.RegisterSmelting();
	}

	public void postInit(FMLPostInitializationEvent e) {
	}

	public void serverStarting(FMLServerStartingEvent event) {
	}

	public void serverStopping(FMLServerStoppingEvent event) {
	}

	/**
	 * Returns a side-appropriate EntityPlayer for use during message handling
	 */
	public EntityPlayer getPlayerEntity(MessageContext ctx) {
		return ctx.getServerHandler().playerEntity;
	}

}
