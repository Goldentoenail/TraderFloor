package com.goldentoenail.outlook.Trader.Main;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.goldentoenail.outlook.Trader.Database.DataBaseManager;
import com.goldentoenail.outlook.Trader.Database.SQLite;

public class TradeFloor extends JavaPlugin implements Listener {
	
	private static TradeFloor instance;
    private DataBaseManager db;
    
	public void onEnable() {
		final TradeFloor plugin = this;
		this.db = new SQLite(this);
        this.db.load();
        
		this.saveDefaultConfig();
	}

	public static TradeFloor getInstance() {
		return instance;
	}

	public static void setInstance(TradeFloor instance) {
		TradeFloor.instance = instance;
	}
	
	@Override
    public DataBaseManager getDatabase() {
        return db;
    }

	@EventHandler
	public void onJoin(PlayerJoinEvent event) {
		for (int i = 1; i < 64; i++) {
			event.getPlayer().sendMessage("");
		}
	}
	
}
