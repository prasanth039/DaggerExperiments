package test.impiger.com.mvpdagger2;

import android.app.Application;

import test.impiger.com.mvpdagger2.data.components.DaggerNetComponent;
import test.impiger.com.mvpdagger2.data.components.DaggerTestComponent;
import test.impiger.com.mvpdagger2.data.components.NetComponent;
import test.impiger.com.mvpdagger2.data.components.TestComponent;
import test.impiger.com.mvpdagger2.data.module.AppModule;
import test.impiger.com.mvpdagger2.data.module.NetModule;

/**
 * Created by prasanth on 21/07/16.
 */

public class App extends Application {

    private NetComponent mNetComponent;

    private TestComponent testComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder()
            .appModule(new AppModule(this))
            .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
            .build();
        testComponent = DaggerTestComponent.builder().build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }

    public TestComponent getTestComponent() {
        return testComponent;
    }


}