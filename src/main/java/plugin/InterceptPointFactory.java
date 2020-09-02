package plugin;

import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.ElementMatcher;
import net.bytebuddy.matcher.ElementMatchers;

/**
 * @author Administrator
 */
public class InterceptPointFactory {
    private InterceptPointFactory() {

    }

    public static InterceptPoint create(String args) {
        return new InterceptPoint() {
            @Override
            public ElementMatcher<TypeDescription> buildTypesMatcher() {
                return ElementMatchers.nameStartsWith(args);
            }

            @Override
            public ElementMatcher<MethodDescription> buildMethodsMatcher() {
                return ElementMatchers.isMethod()
                        .and(ElementMatchers.any());
            }
        };
    }
}
