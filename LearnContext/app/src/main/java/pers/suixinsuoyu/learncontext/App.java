package pers.suixinsuoyu.learncontext;

import android.app.Application;
import android.content.res.Configuration;

/**
 * Created by 24suixinsuoyu on 16/2/29. All rights reserved.
 * <p/>
 * stay hungry, stay foolish
 * ever youthful, ever weeping
 * think different, think independently
 * <p/>
 */
public class App extends Application {

    private String textData = "default";

    public void setTextData(String textData) {
        this.textData = textData;
    }

    public String getTextData() {
        return textData;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        System.out.println("App onCreate");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }


}
