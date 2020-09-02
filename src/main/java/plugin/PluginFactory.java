package plugin;

import plugin.jvm.JvmPlugin;
import plugin.link.LinkPlugin;

import java.util.ArrayList;
import java.util.List;

public class PluginFactory {

    private String agentArgs;

    private List<IPlugin> pluginGroup = new ArrayList<>();

    public PluginFactory(String agentArgs) {
        this.agentArgs = agentArgs;
        // JVM plugin
        addIPlugin(new JvmPlugin(this.agentArgs));
        // Link plugin
        addIPlugin(new LinkPlugin(this.agentArgs));
    }

    private void addIPlugin(IPlugin plugin) {
        pluginGroup.add(plugin);
    }

    public static List<IPlugin> create(String agentArgs) {
        return new PluginFactory(agentArgs).pluginGroup;
    }
}
