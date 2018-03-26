package com.mrbengonio.first;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mrbengonio.first.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class First {

	@Instance
	public static First instance;

	// Proxy
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LOGGER.info("Starting Pre-initialization");
		proxy.preInit(event);
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent event) {
		LOGGER.info("Starting initialization");
		proxy.init(event);
	}

	@Mod.EventHandler
	public void serverStarting(FMLServerStartingEvent event) {
		LOGGER.info("ServerStarting Event Initialized");
		proxy.serverStarting(event);
	}

	@Mod.EventHandler
	public void serverStopping(FMLServerStoppingEvent event) {
		LOGGER.info("ServerStopping Event Initialized");
		proxy.serverStopping(event);
	}

	public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);
}
