package com.maymeskul.cleanandroidcode.deps;

import com.maymeskul.cleanandroidcode.home.HomeActivity;
import com.maymeskul.cleanandroidcode.networking.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class,})
public interface Deps {
    void inject(HomeActivity homeActivity);
}