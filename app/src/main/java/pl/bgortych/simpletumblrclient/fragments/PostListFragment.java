package pl.bgortych.simpletumblrclient.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

import pl.bgortych.simpletumblrclient.R;
import pl.bgortych.simpletumblrclient.fragments.fragmentAdapters.PostRecyclerViewAdapter;
import pl.bgortych.simpletumblrclient.httpConnection.TumblrHttpClientTask;
import pl.bgortych.simpletumblrclient.model.Post;
import pl.bgortych.simpletumblrclient.model.TumblrResponse;


public class PostListFragment extends Fragment implements TumblrHttpClientTask.Listener {

    private ArrayList<Post> tumblrPostList;

    private PostRecyclerViewAdapter adapter;


    private View view;
    private View progressBarView;

    public PostListFragment() {
    }

    public static PostListFragment newInstance() {
        PostListFragment fragment = new PostListFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (tumblrPostList == null) {
            tumblrPostList = new ArrayList<>();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_post_list, container, false);
        progressBarView = view.findViewById(R.id.progress_bar);
        RecyclerView postListRecyclerView = (RecyclerView) view.findViewById(R.id.posts_recycler_view);

        adapter = new PostRecyclerViewAdapter(tumblrPostList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        postListRecyclerView.setLayoutManager(mLayoutManager);
        postListRecyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    private void bindData(ArrayList<Post> tumblrPostList) {
        adapter.setPostList(tumblrPostList);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onLoaded(TumblrResponse response) {
        this.tumblrPostList = new ArrayList<>(Arrays.asList(response.getPosts()));
        bindData(tumblrPostList);
        setInProgress(false);
    }

    @Override
    public void onError() {
        bindData(new ArrayList<Post>());
        setInProgress(false);
        Toast toast = Toast.makeText(getContext(), getString(R.string.no_user_found), Toast.LENGTH_LONG);
        toast.show();
    }

    public void setInProgress(boolean isInProgress) {
        showInProgressLaout(isInProgress);
    }

/**
 * This interface must be implemented by activities that contain this
 * fragment to allow an interaction in this fragment to be communicated
 * to the activity and potentially other fragments contained in that
 * activity.
 * <p>
 * See the Android Training lesson <a href=
 * "http://developer.android.com/training/basics/fragments/communicating.html"
 * >Communicating with Other Fragments</a> for more information.
 */

    private void showInProgressLaout(boolean doShow) {
        if (doShow) {
            progressBarView.setVisibility(View.VISIBLE);
        } else {
            progressBarView.setVisibility(View.GONE);
        }
    }

    public interface OnFragmentInteractionListener {
    }
}
