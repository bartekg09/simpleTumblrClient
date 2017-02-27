package pl.bgortych.simpletumblrclient;

import android.os.AsyncTask;
import android.util.Log;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

import pl.bgortych.simpletumblrclient.model.TumblrResponse;
import pl.bgortych.simpletumblrclient.utils.httpClientUtils;

/**
 * Created by bgortych on 2017-02-26.
 */

public class TumblrHttpClient {

    public void requestPostData(String userName, Integer offset, int numberOfPosts) {
        String url = httpClientUtils.makeTumblrUrl(userName);
        HttpAsyncTask httpAsyncTask = new HttpAsyncTask();
        httpAsyncTask.execute(url);
    }

    private class HttpAsyncTask extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            try {
                String url = params[0];
                RestTemplate restTemplate = new RestTemplate();
                GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
                List<MediaType> allowedMediaTypes = Arrays.asList(new MediaType("application", "json", GsonHttpMessageConverter.DEFAULT_CHARSET),
                        new MediaType("application", "javascript", GsonHttpMessageConverter.DEFAULT_CHARSET));
                converter.setSupportedMediaTypes(allowedMediaTypes);
                restTemplate.getMessageConverters().add(converter);
                String response = restTemplate.getForObject(url, String.class);
                return response;
            } catch (Exception e) {
                Log.e("MainActivity", e.getMessage(), e);
            }

            return null;
        }


        @Override
        protected void onPostExecute(String tumblrResponse) {
            //bindPostsToList(this.tumblrPostList, tumblrResponse);

            //ToDo fetch view()
        }

    }
}
