package test.impiger.com.mvpdagger2.data.components;

import dagger.Component;
import test.impiger.com.mvpdagger2.data.module.MainScreenModule;
import test.impiger.com.mvpdagger2.data.scope.CustomScope;
import test.impiger.com.mvpdagger2.mainscreen.MainActivity;

/**
 * Created by prasanth on 21/07/16.
 */
@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity activity);
}