package pl.bgortych.simpletumblrclient;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

import pl.bgortych.simpletumblrclient.fragments.PostListFragment;
import pl.bgortych.simpletumblrclient.fragments.UserSearchFragment;
import pl.bgortych.simpletumblrclient.httpConnection.TumblrHttpClientTask;
import pl.bgortych.simpletumblrclient.model.Post;
import pl.bgortych.simpletumblrclient.model.TumblrResponse;
import pl.bgortych.simpletumblrclient.utils.httpClientUtils;

public class MainActivity extends FragmentActivity implements TumblrHttpClientTask.Listener,
        UserSearchFragment.OnFragmentInteractionListener,
        PostListFragment.OnFragmentInteractionListener {

    private ArrayList<Post> tumblrPostList;
    UserSearchFragment userSearchFragment;
    PostListFragment postListFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userSearchFragment = UserSearchFragment.newInstance();
        postListFragment = PostListFragment.newInstance();

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.user_search_frame_layout, userSearchFragment);
        fragmentTransaction.add(R.id.post_list_frame_layout, postListFragment);

        fragmentTransaction.commit();

//        if (httpClientUtils.isConnected(this)) {
//            String url = httpClientUtils.makeTumblrUrl("user");
//            TumblrHttpClientTask task = new TumblrHttpClientTask(this);
//            task.execute(url);
//        }

        tumblrPostList = new ArrayList<>();
    }

    @Override
    public void onLoaded(TumblrResponse response) {
        this.tumblrPostList = new ArrayList<>(Arrays.asList(response.getPosts()));
        postListFragment.bindData(tumblrPostList);
    }

    @Override
    public void onError() {
        Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.no_user_found), Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    public void searchOnFragmentInteraction() {

    }

    @Override
    public void postListOnFragmentInteraction(Uri uri) {

    }

    public void goOnclick(View view) {
        String userName = userSearchFragment.getUserNameEditText().getText().toString();
        tumblrPostList = new ArrayList<>();
        postListFragment.bindData(tumblrPostList);
        if (httpClientUtils.isConnected(this)) {
            String url = httpClientUtils.makeTumblrUrl(userName);
            TumblrHttpClientTask task = new TumblrHttpClientTask(this);
            task.execute(url);
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.connection_failure), Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
