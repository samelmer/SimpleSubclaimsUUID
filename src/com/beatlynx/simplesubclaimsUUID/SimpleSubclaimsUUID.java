//SimpleSubclaimsUUID v0.1.0 for FactionsUUID - Copyright 2017 Sam Elmer

package com.beatlynx.simplesubclaimsUUID;

import org.bukkit.event.HandlerList;
import org.bukkit.plugin.java.JavaPlugin;

public class SimpleSubclaimsUUID extends JavaPlugin {

	@Override
	public void onEnable() {
		
		getServer().getPluginManager().registerEvents(new SubclaimListenerUUID(), this);
		
	}
	
	@Override
	public void onDisable() {
		
		HandlerList.unregisterAll();
		
	}
	
}
