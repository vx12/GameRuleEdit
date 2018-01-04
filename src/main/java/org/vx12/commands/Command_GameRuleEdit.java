package org.vx12.commands;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.vx12.events.Event_InventoryClick;
import org.vx12.gre.GameRuleEdit;
import org.vx12.gre.ItemBuilder;

public class Command_GameRuleEdit implements CommandExecutor{

    private GameRuleEdit plugin;
    public Command_GameRuleEdit(GameRuleEdit plugin){
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command label, String string, String[] args) {

        //TODO finishing
        //TODO take a shower

        Player p = (Player) sender;

        ItemStack cmdOutput = new ItemBuilder(Material.COMMAND, 1).setName("§3commandBlockOutput").setLore("§7Decide whether command blocks ", "§7should notify admins ",  "§7when they perform commands ").toItemStack();
        ItemStack DLcircle = new ItemBuilder(Material.COMMAND, 1).setName("§3doDaylightCircle").setLore("§7Decide whether the day-night cycle " ,"§7and moon phases should progress ").toItemStack();
        ItemStack entityDrops = new ItemBuilder(Material.COMMAND, 1).setName("§3doEntityDrops").setLore("§7Decide whether entities that are §c§nnot " , "§7mobs should have drops ").toItemStack();
        ItemStack fireTicks = new ItemBuilder(Material.COMMAND, 1).setName("§3doFireTick").setLore("§7Decide whether §6fire ", "should spread and naturally " ,  "extinguish ").toItemStack();
        ItemStack mobLoot = new ItemBuilder(Material.COMMAND, 1).setName("§3doMobLoot").setLore("§7Decide whether mobs should drop items ").toItemStack();
        ItemStack tileDrops = new ItemBuilder(Material.COMMAND, 1).setName("§3doTileDrops").setLore("§7Decide whether blocks should have drops").toItemStack();
        ItemStack mobSpawning = new ItemBuilder(Material.COMMAND, 1).setName("§3doMobSpawning").setLore("§7Decide whether mobs should naturally spawn. ", "§7Does §c§nnot §7affect monster spawners. ").toItemStack();
        ItemStack keepInventory = new ItemBuilder(Material.COMMAND, 1).setName("§3keepInventory").setLore("§7Decide whether the player should keep items " , "§7in their inventory after death.").toItemStack();
        ItemStack logAdminCmd = new ItemBuilder(Material.COMMAND, 1).setName("§3logAdminCommands").setLore("§7Decide whether to log admin commands to server log ").toItemStack();
        ItemStack mobGriefing = new ItemBuilder(Material.COMMAND, 1).setName("§3MobGriefing").setLore("§7Deicde whether §acreepers§7, §2zombies§7, §5endermen§7, ", "§fghasts§7, §8withers§7, §5ender dragons§7, "," §6rabbits§7, §fsheep§7, and §6villagers ", "§7should be able to change blocks and whether §6villagers§7, ","§2zombies, §fskeletons§7, and §dzombie pigmen ","§7can pick up items ").toItemStack();
        ItemStack naturalReg = new ItemBuilder(Material.COMMAND, 1).setName("§3naturalRegeneration").setLore("§7Decide whether players regenerate ", "§7naturally if their hunger is ","§7full enough.").toItemStack();
        ItemStack randomTickSpeed = new ItemBuilder(Material.COMMAND, 1).setName("§3randomTickSpeed").setLore("§7Change the randomTickSpeed!" , " §7Remember: §320 ticks §7are §3one second§7. ").toItemStack();
        ItemStack reducedDebugInfo = new ItemBuilder(Material.COMMAND, 1).setName("§3dreducedDebugInfo").setLore("§7Decide whether the debug screen 'F3'", "shows all or reduced information").toItemStack();
        ItemStack sendCommandFeedback = new ItemBuilder(Material.COMMAND, 1).setName("§3sendCommandFeedback").setLore("§7Decide whether the feedback from commands ","§7executed by a player should show up in chat. ","§7Also affects the default behavior of ","§7whether command blocks store their output text ").toItemStack();
        ItemStack showDeathMessages = new ItemBuilder(Material.SKULL_ITEM, 1).setName("§3showDeathMessages").setLore("§7Whether death messages are put into chat ","§7when a player dies. ","§7Also affects whether a message is sent to the ","§7pet's owner when the pet dies. ").toItemStack();

        ItemStack enableFunc = new ItemStack(Material.INK_SACK, 1, (short) DyeColor.LIME.getData());
        ItemMeta eFm = enableFunc.getItemMeta();
        eFm.setDisplayName("§a§lEnable the gamerule above!");
        enableFunc.setItemMeta(eFm);

        ItemStack disableFunc = new ItemStack(Material.INK_SACK, 1, (short) DyeColor.RED.getData());
        ItemMeta dFm = disableFunc.getItemMeta();
        dFm.setDisplayName("§c§lDisable the function above!");
        disableFunc.setItemMeta(dFm);

        if(sender instanceof Player){

            if(p.hasPermission("gre.openGUI")){

                p.openInventory(Event_InventoryClick.gameRuleInventory);
            }else{

            }


        }else{
            sender.sendMessage("You are not allowed to execute that command!");
            return false;
        }





        return false;
    }
}
