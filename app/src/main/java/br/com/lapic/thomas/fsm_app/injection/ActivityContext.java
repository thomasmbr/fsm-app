package br.com.lapic.thomas.fsm_app.injection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by Thomas on 02/08/2017.
 **/
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityContext {
}
