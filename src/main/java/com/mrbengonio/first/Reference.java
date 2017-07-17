package com.mrbengonio.first;

public class Reference {
	
	public static final String MOD_ID ="mfm";
	public static final String NAME = "First Mod";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	public static final String CLIENT_PROXY_CLASS = "com.mrbengonio.first.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.mrbengonio.first.proxy.ServerProxy";
	
	public static enum FirstItems {
		OBSIDIANINGOT("obsidianingot", "ItemObsidianingot");
		
		private String unlocalizedName;
		private String registryName;
		
		FirstItems(String unlocalizedName, String registryName) {
		this.unlocalizedName = unlocalizedName;
		this.registryName = registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
			
		}
	
		public String getRegistryName() {
			return registryName;
		}
	}
}
