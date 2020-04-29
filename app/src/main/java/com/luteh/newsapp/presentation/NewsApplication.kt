package com.luteh.newsapp.presentation

import android.app.Application
import com.luteh.newsapp.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.fragment.koin.fragmentFactory
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

/**
 * Created by Luthfan Maftuh on 4/27/2020.
 */
class NewsApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@NewsApplication)
            androidFileProperties()
            fragmentFactory()
            modules(appModule)
        }
    }
}