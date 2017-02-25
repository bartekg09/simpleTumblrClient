package pl.bgortych.simpletumblrclient;

import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pl.bgortych.simpletumblrclient.searcher.UserSearchFragment;

public class MainActivity extends FragmentActivity implements UserSearchFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
