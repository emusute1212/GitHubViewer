package com.yosuke.githubviewer.di

import com.yosuke.githubviewer.GitHubViewerApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class
    ]
)
interface ApplicationComponent : AndroidInjector<GitHubViewerApp> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun app(app: GitHubViewerApp): Builder

        fun build(): ApplicationComponent
    }
}