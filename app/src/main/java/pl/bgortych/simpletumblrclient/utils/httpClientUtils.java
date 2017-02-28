package pl.bgortych.simpletumblrclient.utils;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by bartl on 2017-02-27.
 */

public class httpClientUtils {
    public static final String makeTumblrUrl(String userName) {
        final String protocolUrl = "http://";
        final String baseUrl = ".tumblr.com/api/read/json";
        if (userName != null && !userName.isEmpty()) {
            return protocolUrl + userName + baseUrl;
        } else {
            return null;
        }
    }

    public static boolean isConnected(Activity activity){
        ConnectivityManager connMgr = (ConnectivityManager) activity.getSystemService(Activity.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected())
            return true;
        else
            return false;
    }
}
