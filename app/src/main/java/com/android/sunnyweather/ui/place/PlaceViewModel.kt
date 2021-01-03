package com.android.sunnyweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.android.sunnyweather.logic.Repository
import com.android.sunnyweather.logic.model.Place

/**
 *
 * @Author: jianping.qiao 253386581@qq.com
 * @Maintainer: jianping.qiao 253386581@qq.com
 * @Date: 2021/1/4
 * @Copyright: 2021 www.andriodtvdev.com Inc. All rights reserved.
 */
class PlaceViewModel : ViewModel(){

    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations.switchMap(searchLiveData) { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String){
        searchLiveData.value = query
    }
}