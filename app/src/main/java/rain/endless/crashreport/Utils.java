package rain.endless.crashreport;

import android.os.Environment;

import java.io.File;

/**
 * Created by RAINY on 5/3/2017.
 */

public class Utils {
    private static String getAppDir() {
        return Environment.getExternalStorageDirectory() + "/CrashReport";
    }

    public static String getLog() {
        return mkdirs(getAppDir() + "/Log/");
    }

    private static String mkdirs(String dir) {
        File file = new File(dir);
        if (!file.exists()) {
            file.mkdirs();
        }
        return dir;
    }
}
