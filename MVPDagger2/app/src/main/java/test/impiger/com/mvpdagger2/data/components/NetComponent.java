package test.impiger.com.mvpdagger2.data.components;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;
import test.impiger.com.mvpdagger2.data.module.AppModule;
import test.impiger.com.mvpdagger2.data.module.NetModule;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    // downstream components need these exposed with the return type
    // method name does not really matter
    Retrofit retrofit();
}