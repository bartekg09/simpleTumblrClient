package pl.bgortych.simpletumblrclient.utils;

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
}
