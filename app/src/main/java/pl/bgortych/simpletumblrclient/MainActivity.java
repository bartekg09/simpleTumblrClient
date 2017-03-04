package pl.bgortych.simpletumblrclient;

import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ScrollView;
import android.widget.Toast;

import pl.bgortych.simpletumblrclient.fragments.PostListFragment;
import pl.bgortych.simpletumblrclient.fragments.UserSearchFragment;
import pl.bgortych.simpletumblrclient.httpConnection.TumblrHttpClientTask;
import pl.bgortych.simpletumblrclient.utils.httpClientUtils;

public class MainActivity extends FragmentActivity implements
        UserSearchFragment.OnFragmentInteractionListener,
        PostListFragment.OnFragmentInteractionListener {

    private UserSearchFragment userSearchFragment = null;
    private PostListFragment postListFragment = null;
    private FragmentManager fragmentManager = null;
    private FragmentTransaction fragmentTransaction = null;
    private ScrollView mainView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userSearchFragment = UserSearchFragment.newInstance();
        postListFragment = PostListFragment.newInstance();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.user_search_frame_layout, userSearchFragment);
        fragmentTransaction.add(R.id.post_list_frame_layout, postListFragment);

        fragmentTransaction.commit();

        mainView = (ScrollView)findViewById(R.id.activity_main);
        mainView.setSmoothScrollingEnabled(true);
    }

    @Override
    public void searchOnFragmentInteraction() {

    }

    @Override
    public void postListOnFragmentInteraction(Uri uri) {

    }

    public void goOnclick(View view) {
        postListFragment.setInProgress(true);
        String userName = userSearchFragment.getUserNameEditText().getText().toString();
        if (httpClientUtils.isConnected(this)) {
            String url = httpClientUtils.makeTumblrUrl(userName);
            TumblrHttpClientTask task = new TumblrHttpClientTask(postListFragment);
            task.execute(url);
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), getString(R.string.connection_failure), Toast.LENGTH_LONG);
            toast.show();
        }
    }
}
