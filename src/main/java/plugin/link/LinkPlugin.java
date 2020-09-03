package plugin.link;

import plugin.IPlugin;
import plugin.InterceptPoint;
import plugin.InterceptPointFactory;

public class LinkPlugin implements IPlugin {
    private String agentArgs;


    public LinkPlugin(String agentArgs) {
        this.agentArgs = agentArgs;
    }


    @Override
    public String name() {
        return "link";
    }

    @Override
    public InterceptPoint[] buildInterceptPoint() {
        InterceptPoint[] points = new InterceptPoint[]{
                InterceptPointFactory.create(agentArgs)
        };
        return points;
    }

    @Override
    public Class adviceClass() {
        return LinkAdvice.class;
    }
}
