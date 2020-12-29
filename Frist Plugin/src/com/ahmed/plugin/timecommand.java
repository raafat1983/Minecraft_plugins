package com.ahmed.plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class timecommand implements CommandExecutor{
	
	@Override 
	public boolean onCommand(CommandSender sender , Command cmd, String Label, String[] args) {
	
		Player player = (Player) sender;
		long playertime ;
		playertime = player.getPlayerTime();
		player.sendMessage("this is the time !!!" + playertime);
			
		return false;
		
		
	}
	

}