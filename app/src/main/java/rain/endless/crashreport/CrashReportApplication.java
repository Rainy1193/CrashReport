package rain.endless.crashreport;

import android.app.Application;

/**
 * Created by RAINY on 5/3/2017.
 */

public class CrashReportApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init();
    }
}
