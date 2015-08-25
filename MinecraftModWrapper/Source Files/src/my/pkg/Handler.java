package my.pkg;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Handler implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		
		Player player = (Player) sender;
		
		if(cmd.getName().equals("hello"))
		{
			if(player.hasPermission("hello.true"))
			{
				Bukkit.broadcastMessage(player + " has said hello!");
			}
			else
				player.sendMessage("You don't have permission for this command");
			
			return true;
		}
		else
			player.sendMessage("Not a good command");
		
		return false;
	}

}
