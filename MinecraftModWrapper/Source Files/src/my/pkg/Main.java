/*
 * Refer to http://wiki.bukkit.org/Plugin_Tutorial  for more information
 * 
 * 
 * 
 * Remember to add spigot.jar to your build path and make sure your plugin.yml
 * is up to date!
 * 
 * 
 */

package my.pkg;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() 
	{
	   getLogger().info("Hello has been Enabled");
	   getCommand("hello").setExecutor(new Handler());
	   
	   
	}
	
	@Override
	public void onDisable() 
	{
		getLogger().info("Hello has been Disabled");
	}

}
