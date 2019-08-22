package com.mrbengonio.first;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.mrbengonio.first.gui.TechStatusBarRenderer;
import com.mrbengonio.first.handlers.CommonEventHandler;
import com.mrbengonio.first.handlers.GuiEventHandler;
import com.mrbengonio.first.networking.PacketDispatcher;
import com.mrbengonio.first.proxy.ClientProxy;
import com.mrbengonio.first.proxy.IProxy;
import com.mrbengonio.first.proxy.ServerProxy;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.event.server.FMLServerStoppingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

//@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS, value = "")
@Mod(value = Reference.MOD_ID)
public class Mfm {

	public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

	public static IProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> ServerProxy::new);

	// @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide =
	// * Reference.SERVER_PROXY_CLASS) public static CommonProxy proxy;

	public Mfm() {
		// Register the setup method for modloading
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

		// Register the doClientStuff method for modloading
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		proxy.init();

		MinecraftForge.EVENT_BUS.register(new CommonEventHandler());
		PacketDispatcher.registerPackets();
	}

	private static TechStatusBarRenderer TechstatusBarRenderer;

	private void doClientStuff(final FMLClientSetupEvent event) {
		TechstatusBarRenderer = new TechStatusBarRenderer(Minecraft.getInstance());
		MinecraftForge.EVENT_BUS.register(new GuiEventHandler(TechstatusBarRenderer));
	}

	@SubscribeEvent
	public void serverStarting(FMLServerStartingEvent event) {
		// event.registerServerCommand(new CommandLukasdragon());
		// event.registerServerCommand(new CommandLightning());
	}

	@SubscribeEvent
	public void serverStopping(FMLServerStoppingEvent event) {
	}

}