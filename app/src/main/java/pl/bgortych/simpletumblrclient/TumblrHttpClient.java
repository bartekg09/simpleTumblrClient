package pl.bgortych.simpletumblrclient;

import android.os.AsyncTask;
import android.util.Log;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import pl.bgortych.simpletumblrclient.utils.httpClientUtils;

/**
 * Created by bgortych on 2017-02-26.
 */

public class TumblrHttpClient {

    public void requestPostData(String userName, Integer offset, int numberOfPosts) {
        String url = httpClientUtils.makeTumblrUrl(userName);
        HttpAsyncTask httpAsyncTask = new HttpAsyncTask();
        httpAsyncTask.execute();
    }

    private class HttpAsyncTask extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params) {
            try {
                String url = params[0];
                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
//                TumblrResponse response = restTemplate.getForObject(url, TumblrResponse.class);
                restTemplate.getMessageConverters().add(new StringHttpMessageConverter());

// Make the HTTP GET request, marshaling the response to a String
                String result = restTemplate.getForObject(url, String.class, "Android");
                return result;
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
