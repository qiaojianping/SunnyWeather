package com.android.sunnyweather.logic

import androidx.lifecycle.liveData
import com.android.sunnyweather.logic.model.Place
import com.android.sunnyweather.logic.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers
import java.lang.Exception
import java.lang.RuntimeException
import kotlin.Result.Companion

/**
 *
 * @Author: jianping.qiao 253386581@qq.com
 * @Maintainer: jianping.qiao 253386581@qq.com
 * @Date: 2021/1/4
 * @Copyright: 2021 www.andriodtvdev.com Inc. All rights reserved.
 */
object Repository {

    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok"){
                val place = placeResponse.places
                Result.success(place)
            }else{
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        }catch (e : Exception){
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}