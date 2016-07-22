package test.impiger.com.mvpdagger2.data.components;

import dagger.Component;
import test.impiger.com.mvpdagger2.data.module.TestModule;
import test.impiger.com.mvpdagger2.data.scope.TestScope;
import test.impiger.com.mvpdagger2.mainscreen.TestActivity;
import test.impiger.com.mvpdagger2.mainscreen.ThirdActivity;

/**
 * Created by prasanth on 22/07/16.
 */

@Component(modules = {TestModule.class})
@TestScope

public interface TestComponent {
    void inject(TestActivity activity);

    void inject(ThirdActivity activity);
}
