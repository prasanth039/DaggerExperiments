package test.impiger.com.mvpdagger2.data.module;

import dagger.Module;
import dagger.Provides;
import test.impiger.com.mvpdagger2.data.TestClass;
import test.impiger.com.mvpdagger2.data.scope.TestScope;

/**
 * Created by prasanth on 22/07/16.
 */

@Module
public class TestModule {

    @Provides
    @TestScope
    public TestClass getTestCLass() {
        return new TestClass();
    }
}
