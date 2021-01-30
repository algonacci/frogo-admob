package com.frogobox.frogoadmobhelper.widget

import com.frogobox.frogoadmobhelper.boilerplate.shimmerrclass.FrogoSrvSingleton
import com.frogobox.frogoadmobhelper.boilerplate.shimmerrclass.FrogoSrvSingletonRecycler
import com.frogobox.frogoadmobhelper.boilerplate.shimmerrclass.FrogoSrvSingletonShimmer

/*
 * Created by Faisal Amir on 02/06/2020
 * FrogoRecyclerView Source Code
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2020 FrogoBox Inc.      
 * All rights reserved
 *
 */
 
interface IFrogoAdmobShimmerRecyclerView {

    // Setup SrvSingleton
    fun <T> injector(): FrogoSrvSingleton<T>

    // Setup SrvSingletonShimmer
    fun defineShimmerView(): FrogoSrvSingletonShimmer

    // Setup SrvSingletonRecycler
    fun <T> defineRecyclerView(): FrogoSrvSingletonRecycler<T>

    // Start Shimmer Animation
    fun startShimmer()

    // Stop Shimmer Animation
    fun stopShimmer()

}