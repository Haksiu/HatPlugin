package pl.haksiu.hat.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class HatCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            sender.sendMessage("Only player can use that command");
            return true;
        }
        Player p = (Player)sender;
        ItemStack item = p.getInventory().getItemInMainHand();
        if (item == null || ((ItemStack) item).getType().isAir()) {
            p.sendMessage("§4Error! §7Your item in main hand is null");
        } else {
            p.getInventory().setHelmet(item);
            p.getInventory().removeItem(item);
            p.sendMessage("§aPomyślnie założono: §7" + item.getType().name().toLowerCase());
        }
        return true;
    }
}
