package test.impiger.com.mvpdagger2.data.scope;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by prasanth on 21/07/16.
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomScope {
}