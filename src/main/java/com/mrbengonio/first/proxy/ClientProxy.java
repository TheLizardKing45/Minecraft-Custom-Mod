package com.mrbengonio.first.proxy;

import com.mrbengonio.first.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
		
		
	}

}
