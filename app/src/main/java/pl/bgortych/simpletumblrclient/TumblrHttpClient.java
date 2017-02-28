package pl.bgortych.simpletumblrclient;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.io.StringReader;
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

    private class HttpAsyncTask extends AsyncTask<String, Void, TumblrResponse> {

        @Override
        protected TumblrResponse doInBackground(String... params) {
            try {
                String url = params[0];
                RestTemplate restTemplate = new RestTemplate();
                GsonHttpMessageConverter converter = new GsonHttpMessageConverter();
                List<MediaType> allowedMediaTypes = Arrays.asList(new MediaType("application", "json", GsonHttpMessageConverter.DEFAULT_CHARSET),
                        new MediaType("application", "javascript", GsonHttpMessageConverter.DEFAULT_CHARSET));
                converter.setSupportedMediaTypes(allowedMediaTypes);
                restTemplate.getMessageConverters().add(converter);
                String response = restTemplate.getForObject(url, String.class);
                if (response.startsWith("var tumblr_api_read = "))
                    response = response.substring("var tumblr_api_read = ".length());
                Gson gson = new Gson();
                JsonReader reader = new JsonReader(new StringReader(response));
                reader.setLenient(true);
                TumblrResponse tumblrResponse = gson.fromJson(reader, TumblrResponse.class);
                return tumblrResponse;
            } catch (Exception e) {
                Log.e("MainActivity", e.getMessage(), e);
            }

            return null;
        }


        @Override
        protected void onPostExecute(TumblrResponse tumblrResponse) {
            //bindPostsToList(this.tumblrPostList, tumblrResponse);

            //ToDo fetch view()
        }

    }
}
