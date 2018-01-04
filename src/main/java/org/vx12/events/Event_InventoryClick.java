package org.vx12.events;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.vx12.gre.GameRuleEdit;

public class Event_InventoryClick implements Listener{

    private GameRuleEdit plugin;
    public Event_InventoryClick(GameRuleEdit plugin){
        this.plugin = plugin;
    }

    private String success = "§7You successfully §a§nedited §r§7a gamerule!";

    public static Inventory gameRuleInventory = Bukkit.createInventory(null, 9*4, "§8[§cGameRuleEdit§8]");

    @EventHandler
    public void onClick(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        World w = e.getWhoClicked().getWorld();

        if(e.getInventory().getTitle().equalsIgnoreCase("§8[§cGameRuleEdit§8]")){
            if(e.getSlot() == 9){
                if(GameRuleEdit.commandBlockOutput == true){
                    p.closeInventory();
                    GameRuleEdit.commandBlockOutput = false;
                    w.setGameRuleValue("commandBlockOutput", "false");
                    p.sendMessage(GameRuleEdit.prefix + success);
                }else {

                    GameRuleEdit.commandBlockOutput = true;
                    w.setGameRuleValue("commandBlockOutput", "true");
                    p.sendMessage(GameRuleEdit.prefix + success);
                }
            }else if(e.getSlot() == 10){
                p.closeInventory();
                p.sendMessage("");

            }else if(e.getSlot() == 11){
                p.closeInventory();
                p.sendMessage("");

            }else if(e.getSlot() == 12){
                p.closeInventory();
                p.sendMessage("");

            }else if(e.getSlot() == 13){
                p.closeInventory();
                p.sendMessage("");

            }else if(e.getSlot() == 14){
                p.closeInventory();
                p.sendMessage("");

            }else if(e.getSlot() == 15){
                p.closeInventory();
                p.sendMessage("");

            }else if(e.getSlot() == 16){
                p.closeInventory();
                p.sendMessage("");

            }else if(e.getSlot() == 17){
                p.closeInventory();
                p.sendMessage("");

            }else if(e.getSlot() == 28){
                p.closeInventory();
                p.sendMessage("");

            }else if(e.getSlot() == 29){
                p.closeInventory();
                p.sendMessage("");

            }else if(e.getSlot() == 30){
                p.closeInventory();
                p.sendMessage("");

            }else if(e.getSlot() == 32){
                p.closeInventory();
                p.sendMessage("");

            }else if(e.getSlot() == 33){
                p.closeInventory();
                p.sendMessage("");

            }else if(e.getSlot() == 34){
                p.closeInventory();
                p.sendMessage("");

            }
        }
    }
}
