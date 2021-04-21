package pl.haksiu.hat;

import org.bukkit.plugin.java.JavaPlugin;
import pl.haksiu.hat.commands.HatCommand;

public final class Hat extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("hat").setExecutor(new HatCommand());

        System.out.println("Hat plugin on");
    }

    @Override
    public void onDisable() {
        System.out.println("Hat plugin off");
    }
}
