package pl.bgortych.simpletumblrclient.utils;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by bartl on 2017-02-27.
 */

public class httpClientUtils {
    /**
     * Method generates String url value for Thumblr service to
     * ask for user data. Username is paramether
     * @param userName
     * @return Tumblr url
     */
    public static String makeTumblrUrl(String userName) {
        final String protocolUrl = "http://";
        final String baseUrl = ".tumblr.com/api/read/json";
        if (userName != null && !userName.isEmpty()) {
            return protocolUrl + userName + baseUrl;
        } else {
            return null;
        }
    }

    /**
     * Method checs internet connection in context of passed activity
     * @param activity
     * @return true if activity has access to the Internet or false if there is no access
     */
    public static boolean isConnected(Activity activity){
        ConnectivityManager connMgr = (ConnectivityManager) activity.getSystemService(Activity.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnected();
    }
}
