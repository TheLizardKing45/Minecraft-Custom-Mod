package com.mrbengonio.first.proxy;

import init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		
		
	}

}
