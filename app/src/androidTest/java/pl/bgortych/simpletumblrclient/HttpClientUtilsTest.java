package pl.bgortych.simpletumblrclient;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import pl.bgortych.simpletumblrclient.utils.httpClientUtils;

import static org.junit.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class HttpClientUtilsTest {
    @Test
    public void urlMakingPositiveWayTest() throws Exception {
        assertEquals("http://user.tumblr.com/api/read/json", httpClientUtils.makeTumblrUrl("user"));
    }
    @Test
    public void urlNullTest() throws Exception {
        assertEquals(null, httpClientUtils.makeTumblrUrl(null));
    }
}
