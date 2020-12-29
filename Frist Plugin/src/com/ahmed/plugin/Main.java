package com.ahmed.plugin;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.CommandSender;
import java.net.http.WebSocket.Listener;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;



public class Main extends JavaPlugin {


	@Override
	public void onEnable() {
		System.out.println("plugin enables!!!!!");
		getCommand("heal").setExecutor(new Healcommand() );
		getCommand("time").setExecutor(new timecommand() );
		
		
		
	}
	
	 
	
	

	
}
