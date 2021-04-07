package com.hamedsafari.archapp.di

import com.hamedsafari.detail.di.featureDetailModule
import com.hamedsafari.domain.di.domainModule
import com.hamedsafari.home.di.featureHomeModule
import com.hamedsafari.local.di.localModule
import com.hamedsafari.remote.di.createRemoteModule
import com.hamedsafari.repository.di.repositoryModule

val appComponent= listOf(createRemoteModule("https://api.github.com/"), domainModule, repositoryModule, featureHomeModule, featureDetailModule, localModule)