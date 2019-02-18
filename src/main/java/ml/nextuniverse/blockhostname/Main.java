package ml.nextuniverse.blockhostname;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

/**
 * Created by TheDiamondPicks on 8/02/2017.
 */
public class Main extends Plugin {
    @Override
    public void onEnable() {
        ProxyServer.getInstance().getPluginManager().registerListener(this, new PingListener());
    }

}
