package plugin.jvm;

import plugin.IPlugin;
import plugin.InterceptPoint;
import plugin.InterceptPointFactory;

public class JvmPlugin implements IPlugin {
    private String agentArgs;

    public JvmPlugin(String agentArgs) {
        this.agentArgs = agentArgs;
    }

    @Override
    public String name() {
        return "jvm";
    }


    @Override
    public InterceptPoint[] buildInterceptPoint() {
        return new InterceptPoint[]{
                InterceptPointFactory.create(agentArgs)
        };
    }

    @Override
    public Class adviceClass() {
        return JvmAdvice.class;
    }

}
