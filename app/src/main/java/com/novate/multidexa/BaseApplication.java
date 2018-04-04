package com.novate.multidexa;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Email: 2185134304@qq.com
 * Created by Novate 2018/4/4 14:55
 * Version 1.0
 * Params:
 * Description:
*/

public class BaseApplication extends Application {

    /**
     * 这个最先执行
     */
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // 把MultiDex 注入到项目中
        MultiDex.install(base);
    }


    /**
     * 程序启动的时候执行
     */
    @Override
    public void onCreate() {
        super.onCreate();
    }


}
