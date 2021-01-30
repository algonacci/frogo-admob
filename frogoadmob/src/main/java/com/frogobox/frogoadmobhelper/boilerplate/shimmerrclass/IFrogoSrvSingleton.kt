package com.frogobox.frogoadmobhelper.boilerplate.shimmerrclass

import com.frogobox.frogoadmobhelper.boilerplate.viewrclass.FrogoViewAdapterCallback
import com.frogobox.frogoadmobhelper.widget.FrogoAdmobRecyclerView

/*
 * Created by Faisal Amir on 03/06/2020
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

interface IFrogoSrvSingleton<T> {

    fun initSingleton(frogoAdmobRecyclerView: FrogoAdmobRecyclerView, frogoShimmerAdmobRecyclerView: FrogoAdmobRecyclerView): FrogoSrvSingleton<T>

    fun createLayoutLinearVertical(dividerItem: Boolean): FrogoSrvSingleton<T>

    fun createLayoutLinearHorizontal(dividerItem: Boolean): FrogoSrvSingleton<T>

    fun createLayoutStaggeredGrid(spanCount: Int): FrogoSrvSingleton<T>

    fun createLayoutGrid(spanCount: Int): FrogoSrvSingleton<T>

    fun addData(listData: List<T>): FrogoSrvSingleton<T>

    fun addCustomView(customViewInt: Int): FrogoSrvSingleton<T>

    fun addEmptyView(emptyViewInt: Int?): FrogoSrvSingleton<T>

    fun addCallback(frogoViewAdapterCallback: FrogoViewAdapterCallback<T>): FrogoSrvSingleton<T>

    fun addShimmerViewPlaceHolder(customViewInt: Int): FrogoSrvSingleton<T>

    fun addShimmerSumOfItemLoading(sumItem: Int): FrogoSrvSingleton<T>

    fun build(): FrogoSrvSingleton<T>
    
}