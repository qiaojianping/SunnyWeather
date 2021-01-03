package com.android.sunnyweather

import android.app.Application
import android.content.Context

/**
 *
 * @Author: jianping.qiao 253386581@qq.com
 * @Maintainer: jianping.qiao 253386581@qq.com
 * @Date: 2021/1/4
 * @Copyright: 2021 www.andriodtvdev.com Inc. All rights reserved.
 */
class SunnyWeatherApplication : Application(){

    companion object{
        const val TOKEN = "OHvsQlALaTxIIQXT" // 填入你申请到的令牌值
        lateinit var mContext: Context
    }

    override fun onCreate() {
        super.onCreate()
        mContext = applicationContext
    }

}