package test.impiger.com.mvpdagger2.data.module;

import dagger.Module;
import dagger.Provides;
import test.impiger.com.mvpdagger2.data.scope.CustomScope;
import test.impiger.com.mvpdagger2.mainscreen.MainScreenContract;

/**
 * Created by prasanth on 21/07/16.
 */

@Module
public class MainScreenModule {
    private final MainScreenContract.View mView;


    public MainScreenModule(MainScreenContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return mView;
    }
}