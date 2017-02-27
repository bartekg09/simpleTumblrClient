package pl.bgortych.simpletumblrclient;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import pl.bgortych.simpletumblrclient.utils.httpClientUtils;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class HttpClientUtilsTest {
    @Test
    public void urlMakingPositiveWayTest() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("http://user.tumblr.com/api/read/json", httpClientUtils.makeTumblrUrl("user"));
    }
    @Test
    public void urlNullTest() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals(null, httpClientUtils.makeTumblrUrl(null));
    }
}
