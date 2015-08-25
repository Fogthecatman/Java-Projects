package my.pkg;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() 
	{
	   getLogger().info("Disenchanter has been Enabled");
	   getCommand("disenchant").setExecutor(new Handler());
	   
	   
	}
	
	@Override
	public void onDisable() 
	{
		getLogger().info("Disenchanter has been Disabled");
	}

}
