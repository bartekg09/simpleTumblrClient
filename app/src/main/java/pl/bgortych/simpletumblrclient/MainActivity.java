package pl.bgortych.simpletumblrclient;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import java.util.ArrayList;
import java.util.List;

import pl.bgortych.simpletumblrclient.model.Post;
import pl.bgortych.simpletumblrclient.searcher.UserSearchFragment;

public class MainActivity extends FragmentActivity implements UserSearchFragment.OnFragmentInteractionListener{

    private List<Post> tumblrPostList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(isConnected()){
            TumblrHttpClient client = new TumblrHttpClient();
            client.requestPostData("user", 0, 0);
        }

        tumblrPostList = new ArrayList<>();
    }

    public boolean isConnected(){
        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Activity.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected())
            return true;
        else
            return false;
    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
