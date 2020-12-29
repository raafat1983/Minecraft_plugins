package com.ahmed.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Healcommand implements CommandExecutor{
	
	@Override 
	public boolean onCommand(CommandSender sender , Command cmd, String Label, String[] args) {
	Player player = (Player) sender;
	player.setHealth(20.0);
	player.sendMessage("Healed!!!");
		
	return false;
	
	}
	

}
