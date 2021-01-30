package com.frogobox.frogoadmobhelper.util

import android.content.Context
import android.view.LayoutInflater
import com.frogobox.frogodesignkit.databinding.FrogoEmptyViewBinding
import com.frogobox.frogodesignkit.databinding.FrogoRvListType1Binding
import com.frogobox.frogodesignkit.databinding.FrogoRvListType2Binding

/*
 * Created by Faisal Amir
 * =========================================
 * FrogoRecyclerViewAdapter
 * Copyright (C) 29/04/2020.      
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * FrogoBox Inc
 * com.frogobox.frogoadmobhelper.util
 * 
 */
object FrogoRvViewBinding : IFrogoRvViewBinding {

    override fun frogoLayoutInflater(context: Context): LayoutInflater = LayoutInflater.from(context)

    override fun frogoRvListType1(context: Context): FrogoRvListType1Binding =
        FrogoRvListType1Binding.inflate(LayoutInflater.from(context))

    override fun frogoRvListType2(context: Context): FrogoRvListType2Binding =
        FrogoRvListType2Binding.inflate(frogoLayoutInflater(context))

    override fun frogoRvEmptyView(context: Context): FrogoEmptyViewBinding =
        FrogoEmptyViewBinding.inflate(frogoLayoutInflater(context))

}