package com.yosuke.githubviewer.di.modules

import androidx.lifecycle.ViewModelProvider
import com.yosuke.githubviewer.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {
    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}