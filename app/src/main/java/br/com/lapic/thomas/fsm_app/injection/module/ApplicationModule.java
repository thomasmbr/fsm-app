package br.com.lapic.thomas.fsm_app.injection.module;

import android.app.Application;
import android.content.Context;

import br.com.lapic.thomas.fsm_app.injection.ApplicationContext;
import dagger.Module;
import dagger.Provides;

/**
 * Created by Thomas on 02/08/2017.
 **/
@Module
public class ApplicationModule {

    protected final Application mApplication;

    public ApplicationModule(Application application) {
        mApplication = application;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

}
