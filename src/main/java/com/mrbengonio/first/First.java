package com.mrbengonio.first;

import com.mrbengonio.first.proxy.CommonProxy;

import init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class First {
	
	@Instance
	public static First instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		ModItems.init();
		ModItems.register();
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		
		proxy.init();
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event)
	{
		
	}
}

