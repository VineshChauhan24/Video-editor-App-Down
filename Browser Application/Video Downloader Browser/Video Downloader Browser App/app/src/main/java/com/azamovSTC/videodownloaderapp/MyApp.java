package com.azamovSTC.videodownloaderapp;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import com.onesignal.OneSignal;
import com.azamovSTC.videodownloaderapp.activities.MainActivity;
import com.azamovSTC.videodownloaderapp.data.Constants;
import com.azamovSTC.videodownloaderapp.helper.AdController;
import com.azamovSTC.videodownloaderapp.helper.AppOpenManager;
import com.azamovSTC.videodownloaderapp.helper.DownloadManager;
import com.azamovSTC.videodownloaderapp.utils.ThemeSettings;

public class MyApp extends Application {
    private static MyApp instance;
    private Intent downloadService;
    private MainActivity.OnBackPressedListener onBackPressedListener;

    private Context context;
    private AppOpenManager appOpenManager;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        context = getApplicationContext();
        downloadService = new Intent(getApplicationContext(), DownloadManager.class);

        // Enable verbose OneSignal logging to debug issues if needed.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);

        ThemeSettings.getInstance(this).refreshTheme();

        // OneSignal Initialization
        OneSignal.initWithContext(this);
        OneSignal.setAppId(Constants.ONESIGNAL_APP_ID);

        AdController.initAd(this);
        appOpenManager = new AppOpenManager(this);
    }

    public Intent getDownloadService() {
        return downloadService;
    }

    public static MyApp getInstance() {
        return instance;
    }

    public MainActivity.OnBackPressedListener getOnBackPressedListener() {
        return onBackPressedListener;
    }

    public void setOnBackPressedListener(MainActivity.OnBackPressedListener onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
    }

}
