package controller.commands;

import com.enjin.es359.Inform;
import com.enjin.es359.SettingsManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by ES359 on 12/28/14.
 */
public class ControllerCommand extends Inform implements CommandExecutor {

    SettingsManager sm = SettingsManager.getControllerInstance();



    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String args[]) {

        if(cmd.getName().equalsIgnoreCase("controller")) {
            if(args.length == 0) {

                sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                        "&b&l████████ &6&l████████ &b&l████████\n"
                        +"&6Plugin &eController, &av2.1 &2by &b&oES359!\n"
                        +"&3Type /permissions &2for &6Info.\n"
                        +"&cQuestions? &6Comments? &a&oBug reports?\n &bSend them to: &e&oesj359@gmail.com"

                ));
            }else if(args.length == 1) {
                sender.sendMessage(ChatColor.BLUE  + "Hi. ");
            }
        }
        return true;
    }
}
