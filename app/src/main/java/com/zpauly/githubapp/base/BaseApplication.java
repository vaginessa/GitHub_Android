package com.zpauly.githubapp.base;

import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.zpauly.githubapp.Constants;
import com.zpauly.githubapp.utils.LanguageUtil;
import com.zpauly.githubapp.utils.RetrofitUtil;
import com.zpauly.githubapp.utils.SPUtil;

/**
 * Created by zpauly on 16-6-10.
 */
public class BaseApplication extends Application {
    private static BaseApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();

        RetrofitUtil.setupContext(getApplicationContext());

        getLocalLanguageSetting();
    }

    public static BaseApplication getInstance() {
        if (instance == null) {
            synchronized (BaseApplication.class) {
                instance = new BaseApplication();
            }
        }
        return instance;
    }

    private void getLocalLanguageSetting() {
        int language = SPUtil.getField(getApplicationContext(), Constants.LOCAL_CONFIGURATION, Constants.LOCAL_LANGUAGE_CONFIG, -1);

        if (language == -1) {
            return;
        }
        Resources resources = getApplicationContext().getResources();
        DisplayMetrics dm = resources.getDisplayMetrics();
        Configuration config = resources.getConfiguration();
        config.locale = LanguageUtil.getLanguageSetting(language);
        resources.updateConfiguration(config, dm);
    }
}
