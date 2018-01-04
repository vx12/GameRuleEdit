package org.vx12.gre;

import org.bukkit.plugin.java.JavaPlugin;

public class GameRuleEdit extends JavaPlugin{

    public static GameRuleEdit pl;
    public static GameRuleEdit getPl(){
        return pl;
    }

    public static String prefix = "§8[§cGameRuleEdit§8] ";

    public static boolean commandBlockOutput = true;
    public static boolean doDaylightCircle = true;
    public static boolean doEntityDrops = true;
    public static boolean doFireTick = true;
    public static boolean doMobLoot = true;
    public static boolean doMobSpawning = true;
    public static boolean doTileDrops = true;
    public static boolean keepInventory = false;
    public static boolean logAdminCommands = true;
    public static boolean mobGriefing = true;
    public static boolean naturalRegeneration = true;
    public static int randomTickSpeed = 3;
    public static boolean reducedDebugInfo = true;
    public static boolean sendCommandFeedback = true;
    public static boolean showDeathMessages = true;



    @Override
    public void onEnable() {

        getLogger().info("GameRuleEdit has been enabled!");
    }

    @Override
    public void onDisable() {

    }
}
