package com.goldentoenail.outlook.Trader.Database;

import java.util.logging.Level;

import com.goldentoenail.outlook.Trader.Main.TradeFloor;

public class Error {
    public static void execute(TradeFloor plugin, Exception ex){
        plugin.getLogger().log(Level.SEVERE, "Couldn't execute MySQL statement: ", ex);  
    }
    
    public static void close(TradeFloor plugin, Exception ex){
        plugin.getLogger().log(Level.SEVERE, "Failed to close MySQL connection: ", ex);
    }
}
