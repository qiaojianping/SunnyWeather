package com.android.sunnyweather.logic.model

/**
 *
 * @Author: jianping.qiao 253386581@qq.com
 * @Maintainer: jianping.qiao 253386581@qq.com
 * @Date: 2021/1/4
 * @Copyright: 2021 www.andriodtvdev.com Inc. All rights reserved.
 */
data class PlaceResponse(
    val places: List<Place>,
    val query: String,
    val status: String
)

data class Place(
    val formatted_address: String,
    val id: String,
    val location: Location,
    val name: String,
    val place_id: String
)

data class Location(
    val lat: Double,
    val lng: Double
)