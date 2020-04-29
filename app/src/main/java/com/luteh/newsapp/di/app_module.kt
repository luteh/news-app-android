package com.luteh.newsapp.di

import com.luteh.newsapp.common.utils.rx.ApplicationSchedulerProvider
import org.koin.dsl.module

/**
 * Created by Luthfan Maftuh on 4/27/2020.
 */

val rxModule = module {
    // provided components
    single { ApplicationSchedulerProvider() }
}

// Gather all app modules
val appModule = listOf(rxModule)