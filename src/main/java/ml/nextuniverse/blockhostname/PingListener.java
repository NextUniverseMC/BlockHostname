package ml.nextuniverse.blockhostname;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ServerPing;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

/**
 * Created by TheDiamondPicks on 8/02/2017.
 */
public class PingListener implements Listener {
    @EventHandler
    public void onPing(ProxyPingEvent e) {
        if (e.getConnection().getAddress().getHostName().equals("jerrysnetwork.com")) {
            ServerPing serverPing = e.getResponse();
            serverPing.setDescription(ChatColor.DARK_RED + "Can't connect to server.");
            serverPing.setPlayers(new ServerPing.Players());
        }
    }
}
